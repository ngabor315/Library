package hu.webalk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.webalk.entity.BorrowerEntity;
import hu.webalk.repository.BorrowerRepository;
import hu.webalk.service.BorrowerService;

@Service
public class BorrowerSerciveImp implements BorrowerService {
	
	BorrowerRepository borrowerRepository;
	
	
	@Autowired
	public BorrowerSerciveImp(BorrowerRepository borrowerRepository) {
		super();
		this.borrowerRepository = borrowerRepository;
	}

	@Override
	public Iterable<BorrowerEntity> listAllBorrower() {
		return borrowerRepository.findAll();
	}

	@Override
	public void newBorrower(BorrowerEntity newBorrower) {
		borrowerRepository.save(newBorrower);

	}

	@Override
	public void deleteBorrower(long id) {
		borrowerRepository.delete(id);

	}

}
