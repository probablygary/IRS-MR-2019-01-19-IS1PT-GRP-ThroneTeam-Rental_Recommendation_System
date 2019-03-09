package com.gameofthrones.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.gameofthrones.model.RentalListing;

public interface RentalListingRepo extends CrudRepository<RentalListing, Integer>{

	@Query("from RentalListing where zone=?1 and mrt=?2 and leaseType=?3 and busStop=?4 and numberOfRoomsRented=?5 and childCare=?6 and gym=?7 and price < ?8")
	List<RentalListing> findRental(String zone, String mrt, String leaseType, String busStop, int numberOfRoomsRented, String childCare, String gym, float budget);
	
	@Query("from RentalListing where zone=?1 and mrt=?2 and leaseType=?3 and busStop=?4 and gym=?5 and price < ?6")
	List<RentalListing> findRentalSingle(String zone, String mrt, String leaseType, String busStop, String gym, float budget);
	
}
