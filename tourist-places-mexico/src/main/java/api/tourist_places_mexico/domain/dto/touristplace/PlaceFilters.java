package api.tourist_places_mexico.domain.dto.touristplace;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PlaceFilters {
    @Min(value = 1)
    private int page;

    @Min(value = 10)
    private int size;

    private String state;
    private String category;
    private String activity;

    @DecimalMin(value = "1.0")
    private double minPrice;

    @DecimalMin(value = "1.0")
    private double maxPrice;
}
