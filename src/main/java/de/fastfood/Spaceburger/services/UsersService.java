package de.fastfood.Spaceburger.services;

import de.fastfood.Spaceburger.models.User;

import java.util.List;

public interface UsersService {
    User addUser(String email, String password);

    List<User> getAllUsers();

    void updateUser(Long id, String newEmail, String newPassword);
}
