package project.hrms.core.utilities.results;

import org.springframework.stereotype.Service;


public class ErrorResult extends Result {
    public ErrorResult() {
        super(false);
    }

    public ErrorResult(String message) {
        super(false,message);
    }
}
