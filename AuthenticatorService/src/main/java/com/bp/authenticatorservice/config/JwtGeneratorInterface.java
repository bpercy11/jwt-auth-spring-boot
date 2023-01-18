package com.bp.authenticatorservice.config;

import com.bp.authenticatorservice.model.User;

import java.util.Map;

public interface JwtGeneratorInterface {

    Map<String, String> generateToken(User user);
}
