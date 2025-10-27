package api.tourist_places_mexico.domain.dto.state;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StateDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String capital;
}
