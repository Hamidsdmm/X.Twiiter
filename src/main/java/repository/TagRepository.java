package repository;

import entities.Tag;
import java.sql.SQLException;

public interface TagRepository {
    Tag create(Tag tag) throws SQLException;
}
