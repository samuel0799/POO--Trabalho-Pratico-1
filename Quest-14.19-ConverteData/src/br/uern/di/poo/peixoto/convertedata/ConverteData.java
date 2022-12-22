package br.uern.di.poo.peixoto.convertedata;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;


public class ConverteData {
    public static void main(String[] args) throws ParseException {
       

        
        
            String dataEntra = JOptionPane.showInputDialog(null, "Insira a data no formato MM/dd/yyyy.");

            JOptionPane.showMessageDialog(null, dataEntra,  "Data inicial", 1);
            
            SimpleDateFormat formatovelho = new SimpleDateFormat("MM/dd/yyyy");
            Date Data = formatovelho.parse(dataEntra);
            formatovelho.applyPattern("MMMM dd, yyyy");
            String dataSai = formatovelho.format(Data);
            
            JOptionPane.showMessageDialog(null, dataSai, "Nova data",1);
       
            
        }
    }
