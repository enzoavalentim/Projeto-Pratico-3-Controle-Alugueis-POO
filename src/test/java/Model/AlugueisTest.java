/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlugueisTest {

    private Cliente cliente;
    private Equipamentos equipamento;
    private Alugueis aluguel;
    private ArrayList<Alugueis> listaAluguel;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Equipamentos> listaEquipamentos;

    @Test
    public void testAluguelConstructorAndGetters() {
        // Criação dos objetos Cliente e Equipamento com a ordem correta dos parâmetros
        Cliente cliente = new Cliente("Cliente Teste", 1);
        Equipamentos equipamento = new Equipamentos("Equipamento Teste", 1, 100.0, true);

        LocalDate dataLocacao = LocalDate.of(2024, 8, 19);
        LocalDate dataDevolucao = dataLocacao.plusDays(5);
        double vlTotalLocacao = 500.0;
        boolean status = true;

        // Criação do objeto Alugueis
        Alugueis aluguel = new Alugueis(cliente, equipamento, dataLocacao, dataDevolucao, vlTotalLocacao, status);

        // Verificação dos valores esperados
        assertEquals(cliente, aluguel.getCliente());
        assertEquals(equipamento, aluguel.getProduto());
        assertEquals(dataLocacao, aluguel.getDataLocacao());
        assertEquals(dataDevolucao, aluguel.getDataDevolucao());
        assertEquals(vlTotalLocacao, aluguel.getVlTotalLocacao(), 0.01);
        assertTrue(aluguel.isStatus());
    }

    @Test
    public void testLocacaoDeEquipamentos() {
        // Preparação dos dados de teste
        Cliente cliente = new Cliente("Cliente Teste", 1);
        Equipamentos equipamento = new Equipamentos("Equipamento Teste", 1, 100.0, true);

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(cliente);

        ArrayList<Equipamentos> listaEquipamentos = new ArrayList<>();
        listaEquipamentos.add(equipamento);

        ArrayList<Alugueis> listaAluguel = new ArrayList<>();

        LocalDate dataLocacao = LocalDate.of(2024, 8, 19);
        int diasDeAluguel = 5;

        Alugueis aluguel = new Alugueis(null, null, null, null, 0.0, false);

        // Execução do método
        aluguel.locacaoDeEquipamentos(listaAluguel, listaClientes, listaEquipamentos, 1, 1, diasDeAluguel, dataLocacao);

        // Verificação dos resultados
        assertEquals(cliente, aluguel.getCliente());
        assertEquals(equipamento, aluguel.getProduto());
        assertEquals(dataLocacao, aluguel.getDataLocacao());
        assertEquals(dataLocacao.plusDays(diasDeAluguel), aluguel.getDataDevolucao());
        assertEquals(100.0 * diasDeAluguel, aluguel.getVlTotalLocacao(), 0.01);
        assertFalse(equipamento.isStatus());
    }

}
