#!/usr/bin/env groovy

node {
    stage('checkout') {
        checkout scm
    }

    gitlabCommitStatus('build') {
        stage('check java') {
            sh "java -version"
        }

        stage('clean') {
            sh "chmod +x mvnw"
            sh "./mvnw -ntp clean -P-webapp"
        }
        stage('nohttp') {
            sh "./mvnw -ntp checkstyle:check"
        }

        stage('install tools') {
            sh "./mvnw -ntp com.github.eirslett:frontend-maven-plugin:install-node-and-npm -DnodeVersion=v14.16.0 -DnpmVersion=7.8.0"
        }

        stage('npm install') {
            sh "./mvnw -ntp com.github.eirslett:frontend-maven-plugin:npm"
        }
        stage('backend tests') {
            try {
                sh "./mvnw -ntp verify -P-webapp"
            } catch(err) {
                throw err
            } finally {
                junit '**/target/surefire-reports/TEST-*.xml,**/target/failsafe-reports/TEST-*.xml'
            }
        }

        stage('packaging') {
            sh "./mvnw -ntp verify -P-webapp -Pprod -DskipTests"
            archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
        }

        stage('deploy') {
            if(scm.branches[0].name ==~ /(\*\/develop/) {
                echo 'Branch Developer'
                sh "cp ./target/*.jar /opt/jh/johnatan-dev/johnatan-dev.jar"
                sh "sudo systemctl restart johnatan-dev"
            } else {
                echo 'Branch Master'
                sh "cp ./target/*.jar /opt/jh/johnatan-prod/johnatan-prod.jar"
                sh "sudo systemctl restart johnatan-prod"
            }
        }
    }
}