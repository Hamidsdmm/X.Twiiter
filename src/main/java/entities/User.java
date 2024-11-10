package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private long user_Id;
    private String name;
    private String username;
    private String email;
    private String bio;
    private String creatDate;
    private String password;

    public User(String name, String username, String password, String bio, String creatDate, String email) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.bio = bio;
        this.creatDate = creatDate;
        this.email = email;
    }
}

