package abstractFactory;


public class CheezePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    
    public CheezePizza(PizzaIngredientFactory factory) {
        this.ingredientFactory = factory;
    }
    
    @Override 
    void prepare() {
        sauce = ingredientFactory.createSauce();
        cheeze = ingredientFactory.createCheeze();
    }
    
}
