package com.tfl.mobileappws.exceptions;

import java.io.Serial;

public class UserServiceException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 6612213419456933797L;

    public UserServiceException(String message) {
        super(message);
    }


}
