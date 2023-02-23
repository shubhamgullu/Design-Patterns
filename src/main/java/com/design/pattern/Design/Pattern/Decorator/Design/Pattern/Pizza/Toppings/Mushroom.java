package com.design.pattern.Design.Pattern.Decorator.Design.Pattern.Pizza.Toppings;

import com.design.pattern.Design.Pattern.Decorator.Design.Pattern.Pizza.Type.Base.BasePizza;

public class Mushroom extends Toppings{


    BasePizza basePizza;


    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+25;
    }
}
