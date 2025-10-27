package api.tourist_places_mexico.domain.dto.touristplace;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TouristPlaceDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @NotBlank
    private String category;

    @NotBlank
    private String address;

    @NotBlank
    private String mapUrl;

    @NotNull
    @Min(value = 1)
    private Long stateId;
}
