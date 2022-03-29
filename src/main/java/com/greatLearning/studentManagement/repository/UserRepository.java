package com.greatLearning.studentManagement.repository;

import com.greatLearning.studentManagement.entity.User;

public interface UserRepository {

	public User getUserByUsername(String username);
}
