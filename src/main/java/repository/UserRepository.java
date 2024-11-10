package repository;

import entities.User;

import java.sql.SQLException;

public interface UserRepository {
    User create(User user) throws SQLException;
    User read(long id)  throws SQLException;
}
