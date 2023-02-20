package io.start.server.config;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import io.start.server.dto.CsvListing;
import io.start.server.model.Listing;
import io.start.server.repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CsvDataLoader implements ApplicationRunner {

    @Autowired
    private ListingRepository listingRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        ClassPathResource resource = new ClassPathResource("listing-details.csv");
        try (Reader reader = new InputStreamReader(resource.getInputStream())) {
            CsvToBean<CsvListing> csvToBean = new CsvToBeanBuilder<CsvListing>(reader)
                    .withType(CsvListing.class)
                    .withSeparator(',')
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            List<CsvListing> csvListings = csvToBean.parse();

            List<Listing> listings = csvListings.stream()
                    .map(CsvListingMapper::map)
                    .collect(Collectors.toList());

            listingRepository.saveAll(listings);
        }

    }
}
