package com.pmm.papotecar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

    private ExampleRepository exampleRepository;

    public ExampleController(ExampleRepository exampleRepository) {
	super();
	this.exampleRepository = exampleRepository;
    }

    @GetMapping
    String example() {
	return exampleRepository.findOneByFirst("azer").getLast();
    }

    @GetMapping
    @RequestMapping("test")
    String test() {
	return "Test !";
    }

}
