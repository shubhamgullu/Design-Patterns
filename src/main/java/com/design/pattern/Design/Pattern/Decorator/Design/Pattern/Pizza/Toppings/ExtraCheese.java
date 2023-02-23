package com.design.pattern.Design.Pattern.Decorator.Design.Pattern.Pizza.Toppings;

import com.design.pattern.Design.Pattern.Decorator.Design.Pattern.Pizza.Type.Base.BasePizza;

public class ExtraCheese extends Toppings{

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}
