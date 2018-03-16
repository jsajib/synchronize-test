package com.example.demo.model;

public class DemoModel {

    private int id;
    private String name;
    private double amount;
    private boolean isActive;

    public DemoModel(){}

    public DemoModel(int id, String name, double amount, boolean isActive) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "DemoModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", isActive=" + isActive +
                '}';
    }
}
