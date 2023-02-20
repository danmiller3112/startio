package io.start.server.repository;

import io.start.server.model.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListingRepository extends JpaRepository<Listing, String> {
    List<Listing> findByPriceBetweenAndMinCpmBetween(Double minPrice, Double maxPrice, Double minMinCpm, Double maxMinCpm);
}
