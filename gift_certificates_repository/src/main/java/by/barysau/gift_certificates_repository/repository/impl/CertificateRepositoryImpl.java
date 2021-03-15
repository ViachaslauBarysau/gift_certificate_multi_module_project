package by.barysau.gift_certificates_repository.repository.impl;

import by.barysau.gift_certificates_repository.entity.Certificate;
import by.barysau.gift_certificates_repository.entity.Tag;
import by.barysau.gift_certificates_repository.repository.CertificateRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CertificateRepositoryImpl implements CertificateRepository {
    @Override
    public List<Certificate> findAll() {
        return new ArrayList<>();
    }

    @Override
    public Certificate findById(Long id) {
        return new Certificate();
    }

    @Override
    public Certificate create(Certificate certificate) {
        return new Certificate();
    }

    @Override
    public Certificate update(Certificate certificate) {
        return new Certificate();
    }

    @Override
    public Long delete(Long id) {
        return null;
    }
}
