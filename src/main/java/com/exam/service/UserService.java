package com.exam.service;

import com.exam.model.User;
import com.exam.model.UserRole;

import java.util.*;

public interface UserService {
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;
    public User getUser(String username);
    public void deleteUser(Long userId);
}
