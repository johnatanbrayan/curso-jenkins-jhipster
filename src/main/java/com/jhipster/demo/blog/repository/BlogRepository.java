package com.jhipster.demo.blog.repository;

import com.jhipster.demo.blog.GeneratedByJHipster;
import com.jhipster.demo.blog.domain.Blog;
import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Blog entity.
 */
@SuppressWarnings("unused")
@Repository
@GeneratedByJHipster
public interface BlogRepository extends JpaRepository<Blog, Long> {
    @Query("select blog from Blog blog where blog.user.login = ?#{principal.username}")
    List<Blog> findByUserIsCurrentUser();
}
