/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Model;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    public ClienteTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGerarIdCliente() {
        System.out.println("gerarIdCliente");
        int id = Cliente.gerarIdCliente();
        // Verifica se o ID gerado está dentro do intervalo esperado
        assertTrue(id >= 10000 && id <= 89999, "O ID gerado deve estar entre 10000 e 89999");
    }

    @Test
    public void testGerarIdUnico() {
        System.out.println("gerarIdUnico");
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        // Adiciona um cliente com um ID específico para garantir que o novo ID gerado seja diferente
        Cliente clienteExistente = new Cliente("Cliente Existente", 12345);
        listaClientes.add(clienteExistente);

        // Gera um ID único para um novo cliente
        int newId = Cliente.gerarIdUnico(listaClientes);

        // Verifica se o ID gerado não é igual ao ID existente
        assertNotEquals(clienteExistente.getId(), newId, "O ID gerado deve ser único e não pode coincidir com IDs existentes");

        // Verifica se o ID gerado está dentro do intervalo esperado
        assertTrue(newId >= 10000 && newId <= 89999, "O ID gerado deve estar entre 10000 e 89999");

        // Adiciona o novo cliente à lista e verifica novamente se o próximo ID gerado é único
        Cliente novoCliente = new Cliente("Novo Cliente", newId);
        listaClientes.add(novoCliente);

        int anotherNewId = Cliente.gerarIdUnico(listaClientes);
        assertNotEquals(novoCliente.getId(), anotherNewId, "O próximo ID gerado deve ser único e não pode coincidir com IDs já existentes");
    }
}
