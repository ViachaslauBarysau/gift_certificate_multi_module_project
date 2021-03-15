package by.barysau.gift_certificates_service.controller;

import by.barysau.gift_certificates_repository.dto.TagDto;
import by.barysau.gift_certificates_service.service.TagService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tags")
public class TagController {

    private final TagService tagService;

    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @GetMapping
    public ResponseEntity<List<TagDto>> findAll() {
        return new ResponseEntity<>(tagService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{tagId}")
    public ResponseEntity<TagDto> findById(@PathVariable(name = "tagId") Long tagId) {
        return new ResponseEntity<>(tagService.findById(tagId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TagDto> create(@RequestBody  TagDto tagDto) {
        return new ResponseEntity<>(tagService.create(tagDto), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<TagDto> update(@RequestBody TagDto tagDto) {
        return new ResponseEntity<>(tagService.update(tagDto), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Long> delete(@RequestBody Long tagId) {
        return new ResponseEntity<>(tagService.delete(tagId), HttpStatus.OK);
    }
}
