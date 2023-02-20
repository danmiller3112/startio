package io.start.server.model;


import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "listing")
@Getter
@Setter
@NoArgsConstructor
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "advertising_id")
    private String advertisingId;

    private String country;

    private Double price;

    @Column(name = "event_type_id")
    private Integer eventTypeId;

    private Integer gdpr;

    @Column(name = "min_cpm")
    private Double minCpm;

    private Double priority;

    @Column(name = "bid_price")
    private Double bidPrice;


}
