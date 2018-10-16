package Interfaces;

import Main.Visitor;

public interface ISecurity {
    boolean isAllowedTo(Visitor visitor);
}
