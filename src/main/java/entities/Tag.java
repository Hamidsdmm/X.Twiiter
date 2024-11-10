package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Tag {
    private int tag_id;
    private String title;

    public Tag(String title) {
        this.title = title;
    }
}
