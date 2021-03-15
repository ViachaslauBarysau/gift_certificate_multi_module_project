package by.barysau.gift_certificates_repository.repository;

import by.barysau.gift_certificates_repository.entity.Certificate;
import by.barysau.gift_certificates_repository.entity.Tag;

import java.util.List;

public interface CertificateRepository {
    List<Certificate> findAll();

    Certificate findById(Long id);

    Certificate create(Certificate certificate);

    Certificate update(Certificate certificate);

    Long delete(Long id);
}
