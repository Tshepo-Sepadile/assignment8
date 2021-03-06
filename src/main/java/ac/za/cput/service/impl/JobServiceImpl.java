package ac.za.cput.service.impl;

import ac.za.cput.domain.Job;
import ac.za.cput.repository.JobRepository;
import ac.za.cput.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceImpl")
public class JobServiceImpl implements JobService {

    @Autowired
    @Qualifier("InMemory")

    private JobRepository repository;

    @Override
    public Job create(Job job)
    {
        return repository.create(job);
    }

    @Override
    public Job update(Job job)
    {
        return repository.update(job);
    }

    @Override
    public void delete(String p)
    {
        repository.delete(p);
    }

    @Override
    public Job read(String p)
    {
        return repository.read(p);
    }
    @Override
    public Set<Job> getAll() {
        return repository.getAll();
    }

}
