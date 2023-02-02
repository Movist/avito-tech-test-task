package movist.advertising.service;

import movist.advertising.domain.Advert;
import movist.advertising.domain.AdvertRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdvertService {

    private final AdvertRepository repository;

    public AdvertService(AdvertRepository repository) {
        this.repository = repository;
    }

    public List<Advert> findAll(PageRequest pageRequest) {
        Page<Advert> page = repository.findAll(pageRequest);
        
        return page.getContent();
    }

    public Optional<Advert> findById(long id) {
        return repository.findById(id);
    }

    public Advert save(Advert advert) {
        return repository.save(advert);
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
