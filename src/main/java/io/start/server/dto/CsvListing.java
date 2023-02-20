package io.start.server.dto;

import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CsvListing {
    @CsvBindByName(column = "session_id")
    private String sessionId;
    @CsvBindByName(column = "advertiser_id")
    private String advertisingId;
    @CsvBindByName(column = "country")
    private String country;
    @CsvBindByName(column = "price")
    private String price;
    @CsvBindByName(column = "event_type_id")
    private String eventTypeId;
    @CsvBindByName(column = "gdpr")
    private String gdpr;
    @CsvBindByName(column = "min_cpm")
    private String minCpm;
    @CsvBindByName(column = "priority")
    private String priority;
    @CsvBindByName(column = "bid_price")
    private String bidPrice;
}
