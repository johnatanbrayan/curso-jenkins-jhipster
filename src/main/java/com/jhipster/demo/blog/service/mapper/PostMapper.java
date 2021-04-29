package com.jhipster.demo.blog.service.mapper;

import com.jhipster.demo.blog.GeneratedByJHipster;
import com.jhipster.demo.blog.domain.*;
import com.jhipster.demo.blog.service.dto.PostDTO;
import java.util.Set;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Post} and its DTO {@link PostDTO}.
 */
@Mapper(componentModel = "spring", uses = { BlogMapper.class, TagMapper.class })
@GeneratedByJHipster
public interface PostMapper extends EntityMapper<PostDTO, Post> {
    @Mapping(target = "blog", source = "blog", qualifiedByName = "name")
    @Mapping(target = "tags", source = "tags", qualifiedByName = "nameSet")
    PostDTO toDto(Post s);

    @Mapping(target = "removeTag", ignore = true)
    Post toEntity(PostDTO postDTO);
}
