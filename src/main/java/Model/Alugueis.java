/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author enzov
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Alugueis {

    private Cliente cliente;
    private Equipamentos produto;
    private LocalDate dataLocacao;
    private LocalDate dataDevolucao;
    private double vlTotalLocacao;
    private boolean status;

    public Alugueis(Cliente cliente, Equipamentos produto, LocalDate dataLocacao, LocalDate dataDevolucao, double vlTotalLocacao, boolean status) {

        this.cliente = cliente;
        this.produto = produto;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.vlTotalLocacao = vlTotalLocacao;
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Equipamentos getProduto() {
        return produto;
    }

    public void setProduto(Equipamentos produto) {
        this.produto = produto;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getVlTotalLocacao() {
        return vlTotalLocacao;
    }

    public void setVlTotalLocacao(double vlTotalLocacao) {
        this.vlTotalLocacao = vlTotalLocacao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void locacaoDeEquipamentos(ArrayList<Alugueis> listaAluguel, ArrayList<Cliente> listaClientes, ArrayList<Equipamentos> listaEquipamentos, int idCliente, int idEquipamento, int diasDeAluguel, LocalDate inicioLocacao) {

        if (!listaClientes.isEmpty()) {

            if (!listaEquipamentos.isEmpty()) {

                for (Cliente cliente : listaClientes) { // seta o cliente correto para o aluguel
                    if (cliente.getId() == idCliente) {
                        this.setCliente(cliente);
                        break;
                    }
                }

                for (Equipamentos equipamento : listaEquipamentos) { // seta o equipamento correto para o aluguel
                    if (equipamento.getId() == idEquipamento) {
                        this.setProduto(equipamento);
                        this.getProduto().setStatus(false);
                        break;
                    }
                }

                this.setDataLocacao(inicioLocacao); // seta o inicio da locacao
                this.setDataDevolucao(inicioLocacao.plusDays(diasDeAluguel)); // seta a data de decolucao
                this.setVlTotalLocacao(this.getProduto().getVlLoc() * diasDeAluguel); // seta o valor total da devolucao
            }
        }

    }

    public boolean getStatus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
