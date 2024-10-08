package hanium.dtc.openai.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.util.List;

@Builder
public record TravelListFixResponse(
        @JsonProperty("step")
        Integer step,

        @JsonProperty("fixed_message")
        String message,

        @JsonProperty("fixed_recommends")
        List<TravelEachRecommend> travelEachRecommends
) {
}
