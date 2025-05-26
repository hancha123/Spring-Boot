package egov.service;

import java.util.List;

import org.springframework.stereotype.Service;

import egov.repository.Sample;
import egov.repository.SampleRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SampleService {

	
    private final SampleRepository sampleRepository;

    public List<Sample> getSample() {
        return sampleRepository.findAll();
    }

}