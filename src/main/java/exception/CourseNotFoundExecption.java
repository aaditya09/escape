package exception;

import lombok.Data;

/**
 * Created by Aaditya.t on 18/7/19.
 */

@Data
public class CourseNotFoundExecption extends ObjectNotFoundException{
    public CourseNotFoundExecption(String message) {
        super(message);
    }
}
