package br.uern.di.poo.unidade1.construcao;

public class TestePorta {

    public static void exibeDadosPorta(Porta porta) {
        System.out.println("DADOS DA PORTA : ");
        porta.exibePorta(porta);
        System.out.printf("PREÇO : %.2f R$%n",porta.calculaPreco(porta));
        System.out.printf("VALOR DA INSTALAÇÃO : %.2f%n" , Servicos.calculaInstalacao(porta));
        System.out.println("----------------------------------------------------------------");
    }
    public static void main(String[] args) {
        Porta portaSimples = new Porta();
        Porta portaPadrao = new Porta(TipodePorta.PORTA_PADRAO, 1.6, 0.5, false);
        Porta portaLuxo = new Porta(TipodePorta.PORTA_LUXO, 2.0, 0.9, false);
        Porta portaLuxoPivotante = new Porta(TipodePorta.PORTA_LUXO, 2.2, 1.2, true);

        exibeDadosPorta(portaSimples);
        exibeDadosPorta(portaPadrao);
        exibeDadosPorta(portaLuxo);
        exibeDadosPorta(portaLuxoPivotante);
    }

}
