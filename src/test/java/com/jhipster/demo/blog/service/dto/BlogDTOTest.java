package com.jhipster.demo.blog.service.dto;

import static org.assertj.core.api.Assertions.assertThat;

import com.jhipster.demo.blog.GeneratedByJHipster;
import com.jhipster.demo.blog.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

@GeneratedByJHipster
class BlogDTOTest {

    @Test
    void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(BlogDTO.class);
        BlogDTO blogDTO1 = new BlogDTO();
        blogDTO1.setId(1L);
        BlogDTO blogDTO2 = new BlogDTO();
        assertThat(blogDTO1).isNotEqualTo(blogDTO2);
        blogDTO2.setId(blogDTO1.getId());
        assertThat(blogDTO1).isEqualTo(blogDTO2);
        blogDTO2.setId(2L);
        assertThat(blogDTO1).isNotEqualTo(blogDTO2);
        blogDTO1.setId(null);
        assertThat(blogDTO1).isNotEqualTo(blogDTO2);
    }
}
