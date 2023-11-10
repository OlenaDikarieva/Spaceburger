package de.fastfood.Spaceburger.repositories;

import java.util.List;
import java.util.Optional;

// CRUD - Create, Read, Update, Delete (создать, прочитать, обновить, удалить)
public interface CrudRepository<T,I> {
    Optional<T> findById(Long id); // поиск по идентификатору

    List<T> findAll(); // получение всех данных

    T save(T entity); // сохранение объекта в хранилище

    void deleteById(I id); // удаление по id

    void update(T model); // обновление данных в хранилище

}
