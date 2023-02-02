package movist.advertising.controller;

import movist.advertising.domain.Advert;
import movist.advertising.service.AdvertService;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/adverts")
public class AdvertController {

    private final AdvertService service;

    public AdvertController(AdvertService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Optional<Advert> getOneAdvert(@PathVariable("id") long id) {
        return service.findById(id);
    }

    @GetMapping()
    public List<Advert> getAdverts(
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false, defaultValue = "10") int size
    ) {
        return service.findAll(PageRequest.of(page, size));
    }

    @PostMapping
    public Advert createAdvert(@RequestBody Advert advert) {
        return service.save(advert);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteAdvert(@PathVariable("id") long id) {
        service.deleteById(id);
    }
}
