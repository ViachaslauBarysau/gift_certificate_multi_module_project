package by.barysau.gift_certificates_repository.repository;

import by.barysau.gift_certificates_repository.entity.Tag;

import java.util.List;

public interface TagRepository {
    List<Tag> findAll();

    Tag findById(Long id);

    Tag create(Tag tag);

    Tag update(Tag tag);

    Long delete(Long id);
}
