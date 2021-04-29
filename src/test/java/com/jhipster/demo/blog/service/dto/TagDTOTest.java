package com.jhipster.demo.blog.service.dto;

import static org.assertj.core.api.Assertions.assertThat;

import com.jhipster.demo.blog.GeneratedByJHipster;
import com.jhipster.demo.blog.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

@GeneratedByJHipster
class TagDTOTest {

    @Test
    void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(TagDTO.class);
        TagDTO tagDTO1 = new TagDTO();
        tagDTO1.setId(1L);
        TagDTO tagDTO2 = new TagDTO();
        assertThat(tagDTO1).isNotEqualTo(tagDTO2);
        tagDTO2.setId(tagDTO1.getId());
        assertThat(tagDTO1).isEqualTo(tagDTO2);
        tagDTO2.setId(2L);
        assertThat(tagDTO1).isNotEqualTo(tagDTO2);
        tagDTO1.setId(null);
        assertThat(tagDTO1).isNotEqualTo(tagDTO2);
    }
}
