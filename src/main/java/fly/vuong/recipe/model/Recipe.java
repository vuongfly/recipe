package fly.vuong.recipe.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private String source;
    private String url;
    private String direction;
    private Long prepTime;
    private Long cookTime;
    private Long serving;

    @Lob
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL)
    private Note note;
}