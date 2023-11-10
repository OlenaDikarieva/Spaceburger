package de.fastfood.Spaceburger.repositories;

import de.fastfood.Spaceburger.models.User;
import de.fastfood.Spaceburger.repositories.CrudRepository;

public interface UsersRepository extends CrudRepository<User,Long> {

    User findOneByEmail(String email); // добавили метод, который специфичен именно для User-ов
}
