package fly.vuong.recipe.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNote;

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
