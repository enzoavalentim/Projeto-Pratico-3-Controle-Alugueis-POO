/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author enzov
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.function.BooleanSupplier;

public class Equipamentos {

    private String name;
    private int id;
    private double vlLoc;
    private boolean status;

    // METODO CONSTRUTOR //
    public Equipamentos(String name, int id, double vlLoc, boolean status) {
        super();
        this.name = name;
        this.id = id;
        this.vlLoc = vlLoc;
        this.status = status;
    }

    // GETS E SETS
    public String getNome() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getVlLoc() {
        return vlLoc;
    }

    public void setVlLoc(double vlLoc) {
        this.vlLoc = vlLoc;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // METODOS //
    public static int gerarIdProduto() {
        Random rand = new Random();
        return rand.nextInt(8000) + 1000;
    }

    public static int gerarIdUnico(ArrayList<Equipamentos> listaEquipamentos) {
        int newId;
        boolean idUnico = false;

        do {
            newId = Cliente.gerarIdCliente(); // Gera um ID aleatório para o cliente
            idUnico = true;
            for (Equipamentos equipamento : listaEquipamentos) {
                if (equipamento.getId() == newId) {
                    idUnico = false; // O ID não é único, então precisamos gerar um novo
                    break;
                }
            }
        } while (!idUnico);

        return newId;
    }

    public BooleanSupplier getStatus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
