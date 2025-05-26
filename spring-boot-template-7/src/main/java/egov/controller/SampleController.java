package egov.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import egov.repository.Sample;
import egov.service.SampleService;

@RestController
public class SampleController {
	@Autowired
    private SampleService sampleService;

    @GetMapping("/sample/findAll")
    public List<Sample> getSamples() {
        return sampleService.getSample();
    }
}