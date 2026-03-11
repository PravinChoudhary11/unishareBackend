package com.unishare.unishare.dto.response;

import com.unishare.unishare.enums.auth.AuthProvider;
import com.unishare.unishare.enums.user.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AuthResponse {

    private Long id;
    private String email;
    private Roles role;
    private boolean isActive;
    private AuthProvider provider;

}
