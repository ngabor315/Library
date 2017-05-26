package hu.webalk.service;

import hu.webalk.entity.BorrowerEntity;

public interface BorrowerService {
	Iterable<BorrowerEntity> listAllBorrower();
	void newBorrower(BorrowerEntity newBorrower);
	void deleteBorrower (long id);
}
