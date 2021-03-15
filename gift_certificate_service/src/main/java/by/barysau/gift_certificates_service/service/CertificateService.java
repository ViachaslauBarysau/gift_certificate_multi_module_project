package by.barysau.gift_certificates_service.service;

import by.barysau.gift_certificates_repository.dto.CertificateDto;

import java.util.List;

public interface CertificateService {
    CertificateDto findById(Long certificateId);

    List<CertificateDto> findAll();

    CertificateDto create(CertificateDto certificateDto);

    CertificateDto update(CertificateDto certificateDto);

    Long delete(Long certificateId);
}
