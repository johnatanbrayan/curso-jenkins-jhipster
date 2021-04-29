package com.jhipster.demo.blog.service.mapper;

import com.jhipster.demo.blog.GeneratedByJHipster;
import com.jhipster.demo.blog.domain.*;
import com.jhipster.demo.blog.service.dto.TagDTO;
import java.util.Set;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Tag} and its DTO {@link TagDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
@GeneratedByJHipster
public interface TagMapper extends EntityMapper<TagDTO, Tag> {
    @Named("nameSet")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    Set<TagDTO> toDtoNameSet(Set<Tag> tag);
}
