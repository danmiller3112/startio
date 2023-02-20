package io.start.server.service;

import io.start.server.model.Listing;

import java.util.List;

public interface ListingsService {

    List<Listing> findByFilters(Double minPrice, Double maxPrice, Double minMinCpm, Double maxMinCpm);
}
