/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import View.CadClientesFrame;
import Model.Alugueis;
import Model.Cliente;
import Model.Equipamentos;
import java.awt.List;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author enzov
 */
public class Gerenciamento {

    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    private static ArrayList<Equipamentos> listaEquipamentos = new ArrayList<>();
    private static ArrayList<Alugueis> listaAluguel = new ArrayList<>();

    public Cliente cadastrarCliente(String nome) {
        Cliente novoCliente = new Cliente(nome, 0); // Inicialmente com ID 0
        int idUnico = Cliente.gerarIdUnico(listaClientes); // Gera o ID único
        novoCliente.setId(idUnico); // Atribui o ID único ao cliente
        listaClientes.add(novoCliente); // Adiciona o cliente à lista
        return novoCliente;
    }

    public Equipamentos cadastrarProduto(String nome, int Id, double valorLocacao, boolean disponibilidade) {
        Equipamentos novoEquipamento = new Equipamentos(nome, Id, valorLocacao, disponibilidade);
        int idUnico = Equipamentos.gerarIdUnico(listaEquipamentos);
        novoEquipamento.setId(idUnico);
        listaEquipamentos.add(novoEquipamento);
        return novoEquipamento;
    }

    public ArrayList<Cliente> listaCLientesComboBox() {
        return listaClientes;
    }

    public ArrayList<Equipamentos> listaEquipamentosComboBox() {
        return listaEquipamentos;
    }

    public ArrayList<Alugueis> listaAluguelComboBox() {
        return listaAluguel;
    }

    public Alugueis cadastrarNovoAluguel(int idCliente, int idEquipamento, int diasDeAluguel, LocalDate inicioLocacao) {
        Alugueis novoAluguel = new Alugueis(null, null, null, null, 0, true);
        novoAluguel.locacaoDeEquipamentos(listaAluguel, listaClientes, listaEquipamentos, idCliente, idEquipamento, diasDeAluguel, inicioLocacao);
        listaAluguel.add(novoAluguel);
        return novoAluguel;
    }

    public void devolucaoProdutos(int idClienteDevolucao, int idProdutoDevolucao) {

        for (Alugueis aluguel : listaAluguel) {
            if (aluguel.getCliente().getId() == idClienteDevolucao && aluguel.getProduto().getId() == idProdutoDevolucao) {
                aluguel.getProduto().setStatus(true);
                aluguel.setStatus(false);
            }
        }
        return;
    }

    public ArrayList<Alugueis> consultaAluguelNome(int idClienteConsulta) {
        ArrayList<Alugueis> aluguelsDoCliente = new ArrayList<>();

        for (Alugueis aluguel : listaAluguel) {
            if (aluguel.getCliente().getId() == idClienteConsulta) {
                aluguelsDoCliente.add(aluguel);
            }
        }

        return aluguelsDoCliente;
    }

    public ArrayList<Alugueis> consultaAluguelEquipamento(int idEquipamentoConsulta) {
        ArrayList<Alugueis> aluguelsDoEquipamento = new ArrayList<>();

        for (Alugueis aluguel : listaAluguel) {
            if (aluguel.getProduto().getId() == idEquipamentoConsulta) {
                aluguelsDoEquipamento.add(aluguel);
            }
        }

        return aluguelsDoEquipamento;
    }
    
    public void relatorioTodosAlugueis(){
        
        double valorTotal = 0;
        for(Alugueis aluguel:listaAluguel){
             
         valorTotal += aluguel.getVlTotalLocacao();
        }
        
        GerenciamentoRelatoriosPDF.pdfTodosAlugueis(listaAluguel, valorTotal);  
    }
    public void relatorioAluguelAtivo(){
        GerenciamentoRelatoriosPDF.pdfAlugueisAtivos(listaAluguel);
    }
    public void  relatorioAluguelInativo(){
        GerenciamentoRelatoriosPDF.pdfAlugueisInativos(listaAluguel);
    }
    public void relatorioClientesCadastrados(){
        GerenciamentoRelatoriosPDF.pdfClientes(listaClientes);
    }
    public void relatorioEquipamentosCadastrados(){
        GerenciamentoRelatoriosPDF.pdfEquipamentos(listaEquipamentos);
    }

 
}
