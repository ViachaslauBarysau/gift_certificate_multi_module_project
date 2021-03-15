package by.barysau.gift_certificates_repository.converter;


import by.barysau.gift_certificates_repository.dto.CertificateDto;
import by.barysau.gift_certificates_repository.entity.Certificate;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CertificateConverter {
    public CertificateDto entityToDto(Certificate certificate) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(certificate, CertificateDto.class);
    }

    public Certificate dtoToEntity(CertificateDto certificateDto) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(certificateDto, Certificate.class);
    }

    public List<CertificateDto> entityToDto(List<Certificate> certificates) {
        return certificates.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }

    public List<Certificate> dtoToEntity(List<CertificateDto> certificateDtoList) {
        return certificateDtoList.stream()
                .map(this::dtoToEntity)
                .collect(Collectors.toList());
    }
}
