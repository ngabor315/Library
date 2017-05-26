package hu.webalk.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.webalk.entity.BorrowerEntity;
import hu.webalk.service.BorrowerService;

@RestController
@RequestMapping("/borrower")
public class BorrowerController {
	
	private BorrowerService borrowerService;

	@Autowired
	public BorrowerController(BorrowerService borrowerService) {
		super();
		this.borrowerService = borrowerService;
	}
	
	@RequestMapping(path="", produces=MediaType.APPLICATION_JSON_VALUE)
	Iterable<BorrowerEntity> list() {
		return borrowerService.listAllBorrower();
	}
	
	@PostMapping(path = "", consumes=MediaType.APPLICATION_JSON_VALUE)
	void createNew(@RequestBody BorrowerEntity newBorrower) {
		borrowerService.newBorrower(newBorrower);
	}
	
	void deleteExisting(@PathVariable("id")long id) {
		borrowerService.deleteBorrower(id);
	}
	

}
