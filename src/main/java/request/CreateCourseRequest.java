package request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

/**
 * Created by Aaditya.t on 18/7/19.
 */


@Data
@Builder
public class CreateCourseRequest {

    private Integer id;

    @JsonProperty("course_name")
    private String courseName;

}
