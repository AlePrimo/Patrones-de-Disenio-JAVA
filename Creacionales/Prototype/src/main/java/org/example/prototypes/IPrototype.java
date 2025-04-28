package org.example.prototypes;

public interface IPrototype<T extends IPrototype> extends Cloneable{

    //Clonacion simple
    public T clone();

    //Clonacion Profunda
    public T deepClone();



}
