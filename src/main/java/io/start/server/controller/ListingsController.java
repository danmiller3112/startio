package io.start.server.controller;

import io.start.server.model.Listing;
import io.start.server.service.ListingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class ListingsController {

    @Autowired
    private ListingsService listingsService;

    @GetMapping("listings")
    public List<Listing> getListings(@RequestParam("min_price") Double minPrice,
                                     @RequestParam("max_price") Double maxPrice,
                                     @RequestParam("min_min_cpm") Double minMinCpm,
                                     @RequestParam("max_min_cpm") Double maxMinCpm) {
        return listingsService.findByFilters(minPrice, maxPrice, minMinCpm, maxMinCpm);
    }

}
