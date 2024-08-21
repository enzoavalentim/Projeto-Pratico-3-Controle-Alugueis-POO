/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

/**
 *
 * @author enzov
 */

import Model.Alugueis;
import Model.Cliente;
import Model.Equipamentos;
import java.io.FileOutputStream;
import java.util.Date;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;


public class GerenciamentoRelatoriosPDF {
    
    private static String FILEALUGUEIS = "C:\\Users\\enzov\\Downloads\\Relatorio-de-Alugueis.pdf";
    private static String FILEATIVOS = "C:\\Users\\enzov\\Downloads\\Relatorio-de-Alugueis-Ativos.pdf";
    private static String FILEINATIVOS = "C:\\Users\\enzov\\Downloads\\Relatorio-de-Alugueis-Inativos.pdf";
    private static String FILECLIENTES = "C:\\Users\\enzov\\Downloads\\Relatorio-de-Clientes.pdf";
    private static String FILEEQUIPAMENTOS = "C:\\Users\\enzov\\Downloads\\Relatorio-de-Equipamentos.pdf";
    
    
    
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
            Font.BOLD);
    private static Font catFont1 = new Font(Font.FontFamily.TIMES_ROMAN, 15,
            Font.BOLD);
    private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.NORMAL, BaseColor.RED);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.BOLD);

    public static void pdfTodosAlugueis(ArrayList<Alugueis> listaAluguel, double valorTotal) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(FILEALUGUEIS));
            document.open();
            
        Paragraph preface = new Paragraph();
        // LINHA VAZIA
        addEmptyLine(preface, 1);
        // CABEÇALHO GRANDE (NOME DA EMPRESA 
        Paragraph titulo = new Paragraph("TÔ ALUGANDO - LOCAÇÃO DE EQUIPAMENTOS", catFont);
        titulo.setAlignment(Paragraph.ALIGN_CENTER);
        preface.add(titulo);
        
        preface.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
        Paragraph relatorionome = new Paragraph("RELATÓRIOS DE ALUGUEIS", catFont1);
        relatorionome.setAlignment(Paragraph.ALIGN_CENTER);
        preface.add(relatorionome);
        preface.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------")); 
        document.add(preface);
        
        document.add(new Paragraph("\n"));
        
            PdfPTable table = new PdfPTable(6);
            table.setWidthPercentage(110);
            
            PdfPCell cell = new PdfPCell(new Phrase("CLIENTE"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("EQUIPAMENTO"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("VALOR"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("LOCAÇÃO"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("DEVOLUÇÃO"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("STATUS"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);
            
          for (Alugueis aluguel : listaAluguel) {
                table.addCell(aluguel.getCliente().getNome());
                table.addCell(aluguel.getProduto().getNome());
                table.addCell(String.valueOf("R$" + aluguel.getVlTotalLocacao()));
                table.addCell(aluguel.getDataLocacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                table.addCell(aluguel.getDataDevolucao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                if(aluguel.isStatus() == true){
                    table.addCell("ATIVO");
                }else{
                table.addCell("INATIVO");
                } 
            }
            document.add(table);

            Paragraph totalParagraph = new Paragraph("Valor Total das Locações: R$" + valorTotal, smallBold);
            totalParagraph.setAlignment(Paragraph.ALIGN_RIGHT);
            document.add(totalParagraph);
            //addContent(document);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void pdfAlugueisAtivos(ArrayList<Alugueis> listaAluguel) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(FILEATIVOS));
            document.open();
            
        Paragraph preface = new Paragraph();
        // LINHA VAZIA
        addEmptyLine(preface, 1);
        // CABEÇALHO GRANDE (NOME DA EMPRESA 
        Paragraph titulo = new Paragraph("TÔ ALUGANDO - LOCAÇÃO DE EQUIPAMENTOS", catFont);
        titulo.setAlignment(Paragraph.ALIGN_CENTER);
        preface.add(titulo);
        
        preface.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
        Paragraph relatorionome = new Paragraph("RELATÓRIOS DE ALUGUEIS - ATIVOS", catFont1);
        relatorionome.setAlignment(Paragraph.ALIGN_CENTER);
        preface.add(relatorionome);
        preface.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------")); 
        document.add(preface);
        
        document.add(new Paragraph("\n"));
        
        PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(110);
            
            PdfPCell cell = new PdfPCell(new Phrase("CLIENTE"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("EQUIPAMENTO"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("VALOR"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("LOCAÇÃO"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("DEVOLUÇÃO"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);
            
          for (Alugueis aluguel : listaAluguel) {
              if(aluguel.isStatus() == true){
                table.addCell(aluguel.getCliente().getNome());
                table.addCell(aluguel.getProduto().getNome());
                table.addCell(String.valueOf("R$" + aluguel.getVlTotalLocacao()));
                table.addCell(aluguel.getDataLocacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                table.addCell(aluguel.getDataDevolucao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
              }
          }
           document.add(table);
           document.close();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    public static void pdfAlugueisInativos(ArrayList<Alugueis> listaAluguel) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(FILEINATIVOS));
            document.open();
              Paragraph preface = new Paragraph();
        // LINHA VAZIA
        addEmptyLine(preface, 1);
        // CABEÇALHO GRANDE (NOME DA EMPRESA 
        Paragraph titulo = new Paragraph("TÔ ALUGANDO - LOCAÇÃO DE EQUIPAMENTOS", catFont);
        titulo.setAlignment(Paragraph.ALIGN_CENTER);
        preface.add(titulo);
        
        preface.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
        Paragraph relatorionome = new Paragraph("RELATÓRIOS DE ALUGUEIS - INATIVOS", catFont1);
        relatorionome.setAlignment(Paragraph.ALIGN_CENTER);
        preface.add(relatorionome);
        preface.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------")); 
        document.add(preface);
        
        document.add(new Paragraph("\n"));
        
        PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(110);
            
            PdfPCell cell = new PdfPCell(new Phrase("CLIENTE"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("EQUIPAMENTO"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("VALOR"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("LOCAÇÃO"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("DEVOLUÇÃO"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);
            
          for (Alugueis aluguel : listaAluguel) {
              if(aluguel.isStatus() != true){
                table.addCell(aluguel.getCliente().getNome());
                table.addCell(aluguel.getProduto().getNome());
                table.addCell(String.valueOf("R$" + aluguel.getVlTotalLocacao()));
                table.addCell(aluguel.getDataLocacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                table.addCell(aluguel.getDataDevolucao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
              }
          }
           document.add(table);
           document.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void pdfClientes(ArrayList<Cliente> listaClientes) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(FILECLIENTES));
            document.open();
            
            Paragraph preface = new Paragraph();
        // LINHA VAZIA
        addEmptyLine(preface, 1);
        // CABEÇALHO GRANDE (NOME DA EMPRESA 
        Paragraph titulo = new Paragraph("TÔ ALUGANDO - LOCAÇÃO DE EQUIPAMENTOS", catFont);
        titulo.setAlignment(Paragraph.ALIGN_CENTER);
        preface.add(titulo);
        
        preface.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
        Paragraph relatorionome = new Paragraph("RELATÓRIO CLIENTES CADASTRADOS", catFont1);
        relatorionome.setAlignment(Paragraph.ALIGN_CENTER);
        preface.add(relatorionome);
        preface.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------")); 
        document.add(preface);
        
        document.add(new Paragraph("\n"));
        
        PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(110);
            
            PdfPCell cell = new PdfPCell(new Phrase("NOME"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("ID"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);
            
          for (Cliente cliente : listaClientes) {
              
                table.addCell(cliente.getNome());
                table.addCell(String.valueOf(cliente.getId()));
          }
           document.add(table);
           document.close();
      
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void pdfEquipamentos(ArrayList<Equipamentos> listaEquipamentos) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(FILEEQUIPAMENTOS));
            document.open();
            
        Paragraph preface = new Paragraph();
        // LINHA VAZIA
        addEmptyLine(preface, 1);
        // CABEÇALHO GRANDE (NOME DA EMPRESA 
        Paragraph titulo = new Paragraph("TÔ ALUGANDO - LOCAÇÃO DE EQUIPAMENTOS", catFont);
        titulo.setAlignment(Paragraph.ALIGN_CENTER);
        preface.add(titulo);
        
        preface.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
        Paragraph relatorionome = new Paragraph("RELATÓRIO EQUIPAMENTOS CADASTRADOS", catFont1);
        relatorionome.setAlignment(Paragraph.ALIGN_CENTER);
        preface.add(relatorionome);
        preface.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------")); 
        document.add(preface);
        
        document.add(new Paragraph("\n"));
        
        PdfPTable table = new PdfPTable(3);
            table.setWidthPercentage(100);
            
            PdfPCell cell = new PdfPCell(new Phrase("NOME"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("ID"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase("VALOR DA DIARIA"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);
            
          for (Equipamentos equipamento : listaEquipamentos) {
              
                table.addCell(equipamento.getNome());
                table.addCell(String.valueOf(equipamento.getId())); 
                table.addCell(String.valueOf("R$" + equipamento.getVlLoc()));
          }
           document.add(table);
           document.close();
      
        } catch (Exception e) {
            e.printStackTrace();
        }
    }        



    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }
}
