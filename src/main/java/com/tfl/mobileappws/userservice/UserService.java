package com.tfl.mobileappws.userservice;

import com.tfl.mobileappws.ui.model.request.UserDetailsRequestModel;
import com.tfl.mobileappws.ui.model.response.UserRest;

public interface UserService {
    UserRest createUser(UserDetailsRequestModel userDetails);
}
