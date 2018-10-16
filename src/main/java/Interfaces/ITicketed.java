package Interfaces;

import Main.Visitor;

public interface ITicketed {
    double defaultPrice();
    double priceFor(Visitor visitor);
}
