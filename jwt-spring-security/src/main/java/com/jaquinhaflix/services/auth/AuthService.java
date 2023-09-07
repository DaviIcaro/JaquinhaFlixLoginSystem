package com.jaquinhaflix.services.auth;

import com.jaquinhaflix.dtos.SignupDTO;
import com.jaquinhaflix.dtos.UserDTO;

public interface AuthService {
    UserDTO createUser(SignupDTO signupDTO);
}