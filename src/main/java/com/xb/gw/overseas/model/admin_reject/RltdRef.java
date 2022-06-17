
package com.xb.gw.overseas.model.admin_reject;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Ref"
})
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RltdRef {

    @JsonProperty("Ref")
    private String ref;
}
