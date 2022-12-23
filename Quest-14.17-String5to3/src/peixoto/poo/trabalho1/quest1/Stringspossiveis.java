package peixoto.poo.trabalho1.quest1;

import java.util.HashSet;
import java.util.LinkedHashSet;


import javax.swing.JOptionPane;

public class Stringspossiveis {
    
    public static void main(String[] args) {
        HashSet<String> Lista_combinacoes = new LinkedHashSet<String>();
        String Str_5 = "";

        while (Str_5.length() != 5) {
            Str_5 = JOptionPane.showInputDialog("Digite a palavra de 5 letras que deseja testar: ");
            if (Str_5.length() != 5) {
                JOptionPane.showMessageDialog(null,
                        "Tamanho inválido da palavra, a palavra precisa ter 5 letras, insira novamente.", "Erro", 2);
            }

            else {
            Combinacao(Lista_combinacoes, Str_5, "", 5, 3);
            for (String Str_3 : Lista_combinacoes) {
                System.out.println(Str_3);
            }
            }
            

        }

    }

    public static void Combinacao(HashSet<String> combinacoes, String Str_5, String Str_control, int n_elementos,
            int n_arranjo) {

        if (n_arranjo == 0) {

            combinacoes.add(Str_control);
            return;

        }

        for (int i = 0; i < n_elementos; i++) {

            String nova_str = Str_control + Str_5.charAt(i);

            Combinacao(combinacoes, Str_5, nova_str, n_elementos, n_arranjo - 1);

        }

    }

}
