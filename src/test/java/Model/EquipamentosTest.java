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

public class EquipamentosTest {
    
      @Test
    public void testGerarIdProduto() {
        System.out.println("gerarIdProduto");
        int id = Equipamentos.gerarIdProduto();
        // Verifica se o ID gerado está dentro do intervalo esperado
        assertTrue(id >= 1000 && id <= 8999, "O ID gerado deve estar entre 1000 e 8999");
    }
}

