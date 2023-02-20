package io.start.server.config;

import io.start.server.dto.CsvListing;
import io.start.server.model.Listing;

public class CsvListingMapper {
    public static Listing map(CsvListing csvListing) {
        Listing listing = new Listing();
        listing.setAdvertisingId(csvListing.getAdvertisingId());
        listing.setCountry(csvListing.getCountry());
        listing.setPrice(Double.valueOf(csvListing.getPrice()));
        listing.setEventTypeId(Integer.valueOf(csvListing.getEventTypeId()));
        listing.setGdpr(Integer.valueOf(csvListing.getGdpr()));
        listing.setMinCpm(Double.valueOf(csvListing.getMinCpm()));
        listing.setPriority(Double.valueOf(csvListing.getPriority()));
        listing.setBidPrice(Double.valueOf(csvListing.getBidPrice()));
        return listing;
    }
}
