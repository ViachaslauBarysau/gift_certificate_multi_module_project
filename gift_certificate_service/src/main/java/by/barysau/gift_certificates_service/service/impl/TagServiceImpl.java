package by.barysau.gift_certificates_service.service.impl;

import by.barysau.gift_certificates_repository.converter.TagConverter;
import by.barysau.gift_certificates_repository.dto.TagDto;
import by.barysau.gift_certificates_repository.repository.TagRepository;
import by.barysau.gift_certificates_service.service.TagService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    private final TagConverter tagConverter;
    private final TagRepository tagRepository;

    public TagServiceImpl(TagConverter tagConverter, TagRepository tagRepository) {
        this.tagConverter = tagConverter;
        this.tagRepository = tagRepository;
    }

    @Override
    public List<TagDto> findAll() {
        return tagConverter.entityToDto(tagRepository.findAll());
    }

    @Override
    public TagDto findById(Long tagId) {
        return tagConverter.entityToDto(tagRepository.findById(tagId));
    }

    @Override
    public TagDto create(TagDto tagDto) {
        return tagConverter.entityToDto(tagRepository.create(tagConverter.dtoToEntity(tagDto)));
    }

    @Override
    public TagDto update(TagDto tagDto) {
        return tagConverter.entityToDto(tagRepository.update(tagConverter.dtoToEntity(tagDto)));
    }

    @Override
    public Long delete(Long tagId) {
        return tagRepository.delete(tagId);
    }
}
