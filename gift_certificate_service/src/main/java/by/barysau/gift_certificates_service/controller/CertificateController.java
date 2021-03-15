package by.barysau.gift_certificates_service.controller;

import by.barysau.gift_certificates_repository.dto.CertificateDto;
import by.barysau.gift_certificates_service.service.CertificateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/certificates")
public class CertificateController {
    private final CertificateService certificateService;

    public CertificateController(CertificateService certificateService) {
        this.certificateService = certificateService;
    }

    @GetMapping
    public ResponseEntity<List<CertificateDto>> findAll() {
        return new ResponseEntity<>(certificateService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{certificateId}")
    public ResponseEntity<CertificateDto> findById(@PathVariable(name = "certificateId") Long certificateId) {
        return new ResponseEntity<>(certificateService.findById(certificateId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CertificateDto> create(@RequestBody CertificateDto certificateDto) {
        return new ResponseEntity<>(certificateService.create(certificateDto), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<CertificateDto> update(@RequestBody CertificateDto certificateDto) {
        return new ResponseEntity<>(certificateService.update(certificateDto), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Long> delete(@RequestBody Long certificateId) {
        return new ResponseEntity<>(certificateService.delete(certificateId), HttpStatus.OK);
    }
}
