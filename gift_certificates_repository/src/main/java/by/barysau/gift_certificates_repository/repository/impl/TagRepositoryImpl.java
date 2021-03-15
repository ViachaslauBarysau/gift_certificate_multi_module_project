package by.barysau.gift_certificates_repository.repository.impl;

import by.barysau.gift_certificates_repository.entity.Tag;
import by.barysau.gift_certificates_repository.repository.TagRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TagRepositoryImpl implements TagRepository {
    @Override
    public List<Tag> findAll() {
        return new ArrayList<>();
    }

    @Override
    public Tag findById(Long id) {
        return new Tag();
    }

    @Override
    public Tag create(Tag tag) {
        return new Tag();
    }

    @Override
    public Tag update(Tag tag) {
        return new Tag();
    }

    @Override
    public Long delete(Long id) {
        return null;
    }
}
