package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Trem {

    private int id;
    private double capacidadeDeVagoes; // soma da capacidade de vagoes de cada locomotiva
    // private List<Locomotiva> listaLocomotivas = new ArrayList<>();
    // private List<Vagao> listaVagoes = new ArrayList<>();
    private List<Carro> listaCarro = new ArrayList<>();

    protected Trem(int id) {
        this.id = id;
    }

    protected void addLocomotiva(Locomotiva locomotiva) {
        listaCarro.add(locomotiva);
        capacidadeDeVagoes = getCapacidadeDeVagoes();
    }

    public double getCapacidadeDeVagoes() {
        for(Carro l : listaCarro){
            if (listaCarro instanceof Locomotiva){
                Locomotiva l.getLimiteVagoes();
            }
        }

            if (listaCarro.size() == 1) {
                return listaLocomotivas.get(0).getLimiteVagoes();
            } else {
                int capacidade = 0;
                for (Locomotiva l : listaLocomotivas) {
                    capacidade += l.getLimiteVagoes();
                }
                return capacidadeDeVagoes = Math.ceil(capacidade * 0.9);
            }
    }

    protected void addVagao(Vagao vagao) throws ArrayIndexOutOfBoundsException {
        if (listaVagoes.size() < capacidadeDeVagoes) {
            this.listaVagoes.add(vagao);
        } else {
            throw new ArrayIndexOutOfBoundsException("O limite de vagões deste trem já foi atingido");
        }
    }

    protected int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "[ID: T" + id + " Locomotivas: " + listaLocomotivas + " Vagoõs:" + listaVagoes + " Capacidade de Vagoes:"
                + getCapacidadeDeVagoes() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Trem trem = (Trem) o;
        return id == trem.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
