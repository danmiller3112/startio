package io.start.server.service;

import io.start.server.model.Listing;
import io.start.server.repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListingsServiceImpl implements ListingsService {

    @Autowired
    private ListingRepository listingRepository;

    @Override
    public List<Listing> findByFilters(Double minPrice, Double maxPrice, Double minMinCpm, Double maxMinCpm) {
        return listingRepository.findByPriceBetweenAndMinCpmBetween(minPrice, maxPrice, minMinCpm, maxMinCpm);
    }
}
