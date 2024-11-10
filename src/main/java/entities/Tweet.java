package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Tweet {

    private int tweet_Id;
    private String text;

    public Tweet(String text) {
        this.text = text;
    }
}
