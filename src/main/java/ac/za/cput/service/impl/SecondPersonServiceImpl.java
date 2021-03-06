package ac.za.cput.service.impl;

import ac.za.cput.domain.SecondPerson;
import ac.za.cput.repository.SecondPersonRepository;
import ac.za.cput.service.SecondPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceImpl")
public class SecondPersonServiceImpl implements SecondPersonService {

    @Autowired
    @Qualifier("InMemory")

    private SecondPersonRepository repository;

    @Override
    public SecondPerson create(SecondPerson person)
    {
        return repository.create(person);
    }

    @Override
    public SecondPerson update(SecondPerson person)
    {
        return repository.update(person);
    }

    @Override
    public void delete(String p)
    {
        repository.delete(p);
    }

    @Override
    public SecondPerson read(String p)
    {
        return repository.read(p);
    }
    @Override
    public Set<SecondPerson> getAll() {
        return repository.getAll();
    }

}
