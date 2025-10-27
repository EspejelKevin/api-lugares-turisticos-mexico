package api.tourist_places_mexico.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PlaceFilters {
    private int page;
    private int size;
    private String state;
    private String category;
    private String activity;
    private double minPrice;
    private double maxPrice;
}
