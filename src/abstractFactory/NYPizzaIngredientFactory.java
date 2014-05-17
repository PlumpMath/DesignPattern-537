package abstractFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Cheeze createCheeze() {
        return new ReggianoCheeze();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

}
