package com.company;

public class Transport<T extends  Number,S extends Number> implements Capacity<S>{
    private String name;
    S capacity;
    T cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public S getCapacity() {
        return capacity;
    }

    public void setCapacity(S capacity) {
        this.capacity = capacity;
    }

    public T getCost() {
        return cost;
    }

    public void setCost(T cost) {
        this.cost = cost;
    }

    public Transport(String name, S capacity, T cost) {
        this.name = name;
        this.capacity = capacity;
        this.cost = cost;
    }

    @Override
    public  void canSit(S s) {
        System.out.println("In this "+name+" can sit "+s+" peoples");
    }
}
