package org.example;

import java.time.LocalDate;

public class JuiceCoctel extends Coctel {

    private LocalDate fehaDevencimiento;

    public JuiceCoctel() {
    }

    public JuiceCoctel(String nombre, long precio, LocalDate fehaDevencimiento) {
        super(nombre, precio);
        this.fehaDevencimiento = fehaDevencimiento;
    }

    public LocalDate getFehaDevencimiento() {
        return fehaDevencimiento;
    }

    public void setFehaDevencimiento(LocalDate fehaDevencimiento) {
        this.fehaDevencimiento = fehaDevencimiento;
    }
}
