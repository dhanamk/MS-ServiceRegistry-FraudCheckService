package com.app.fiegn;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "DUPCHECK-SERVICE")
public interface DupcheckFeign {

	@GetMapping("/dupcheck")
	public String communicateAbstractMethodDupcheck();
	
	@GetMapping("/two")
	public String communicateAbstractMethodDupcheckTwo();
}
