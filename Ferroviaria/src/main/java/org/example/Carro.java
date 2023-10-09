package org.example;

public abstract class Carro {
    protected Trem tremAlocado;
    protected int id;

    public Carro (int id){
        this.id = id;
    }

    public Trem getTremAlocado() {
        return tremAlocado;
    }

    public void setTremAlocado(Trem tremAlocado) {
        this.tremAlocado = tremAlocado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
