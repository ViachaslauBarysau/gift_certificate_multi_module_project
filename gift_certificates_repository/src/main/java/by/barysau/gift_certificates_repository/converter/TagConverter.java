package by.barysau.gift_certificates_repository.converter;


import by.barysau.gift_certificates_repository.dto.TagDto;
import by.barysau.gift_certificates_repository.entity.Tag;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TagConverter {
    public TagDto entityToDto(Tag tag) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(tag, TagDto.class);
    }

    public Tag dtoToEntity(TagDto tagDto) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(tagDto, Tag.class);
    }

    public List<TagDto> entityToDto(List<Tag> tags) {
        return tags.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }

    public List<Tag> dtoToEntity(List<TagDto> tagDtoList) {
        return tagDtoList.stream()
                .map(this::dtoToEntity)
                .collect(Collectors.toList());
    }
}
