package com.jhipster.demo.blog.repository;

import com.jhipster.demo.blog.GeneratedByJHipster;
import com.jhipster.demo.blog.domain.Tag;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Tag entity.
 */
@SuppressWarnings("unused")
@Repository
@GeneratedByJHipster
public interface TagRepository extends JpaRepository<Tag, Long> {}
