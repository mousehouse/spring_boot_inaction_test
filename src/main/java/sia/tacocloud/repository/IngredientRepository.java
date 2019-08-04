package sia.tacocloud.repository;


import sia.tacocloud.domain.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient save(Ingredient ingredient);

    Ingredient findById(String id);
}
