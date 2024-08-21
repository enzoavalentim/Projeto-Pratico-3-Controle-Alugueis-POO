/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author enzov
 */
import Controler.Gerenciamento;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cliente extends Pessoa {

    private int id;

    public Cliente(String nome, int id) {
        super(nome);
        this.id = id;
    }

    // METODOS //
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int gerarIdCliente() {
        Random rand = new Random();
        return rand.nextInt(80000) + 10000;
    }

    public static int gerarIdUnico(ArrayList<Cliente> listaClientes) {
        int newId;
        boolean idUnico = false;

        do {
            newId = Cliente.gerarIdCliente(); // Gera um ID aleatório para o cliente
            idUnico = true;
            for (Cliente cliente : listaClientes) {
                if (cliente.getId() == newId) {
                    idUnico = false; // O ID não é único, então precisamos gerar um novo
                    break;
                }
            }
        } while (!idUnico);

        return newId;
    }

}
