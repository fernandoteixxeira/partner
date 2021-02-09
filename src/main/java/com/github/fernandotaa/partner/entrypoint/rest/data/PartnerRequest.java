package com.github.fernandotaa.partner.entrypoint.rest.data;

import com.github.fernandotaa.partner.core.usecase.entity.Partner;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * Representation of a unique Partner in requests.
 */
@Getter
@Setter
@ToString
public class PartnerRequest {
    @NotBlank
    private String tradingName;
    @NotBlank
    private String ownerName;
    @NotBlank
    private String document;

    /**
     * Convert {@link PartnerRequest} to {@link Partner}.
     *
     * @return - {@link Partner}
     */
    public Partner toEntity() {
        return Partner.builder()
                .tradingName(tradingName)
                .ownerName(ownerName)
                .document(document)
                .build();
    }
}
