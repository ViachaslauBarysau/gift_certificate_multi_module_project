package by.barysau.gift_certificates_service.service.impl;

import by.barysau.gift_certificates_repository.dto.CertificateDto;
import by.barysau.gift_certificates_service.service.CertificateService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CertificateServiceImpl implements CertificateService {

    @Override
    public List<CertificateDto> findAll() {
        return new ArrayList<>();
    }

    @Override
    public CertificateDto findById(Long certificateId) {
        return new CertificateDto();
    }

    @Override
    public CertificateDto create(CertificateDto certificateDto) {
        return new CertificateDto();
    }

    @Override
    public CertificateDto update(CertificateDto certificateDto) {
        return new CertificateDto();
    }

    @Override
    public Long delete(Long certificateId) {
        return 1L;
    }
}
