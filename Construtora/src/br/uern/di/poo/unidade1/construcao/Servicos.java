package br.uern.di.poo.unidade1.construcao;

public class Servicos {
    private static final double PERCENTUAL_LUXO = 0.1;
    private static final double custoMetro = 70.00;
    private static final double TAXA_PIVOTANTE = 250;

    public static double getPercentualLuxo() {
        return PERCENTUAL_LUXO;
    }

    public static double getCustometro() {
        return custoMetro;
    }

    public static double getTaxaPivotante() {
        return TAXA_PIVOTANTE;
    }

    public static double calculaInstalacao(Porta Porta) {
        double custo= 0.0;
        double metroQuad = (Porta.getAltura()*Porta.getAltura());
        if (Porta.tipoPorta==TipodePorta.PORTA_LUXO&&Porta.pivotante==true) {
            custo = (custoMetro*metroQuad)+TAXA_PIVOTANTE;
            custo = custo+(custo*0.1)/100;
            return custo;
        }
        else if (Porta.tipoPorta==TipodePorta.PORTA_LUXO&&Porta.pivotante==false) {
                custo = (custoMetro*metroQuad);
                custo = custo+(custo*0.1)/100;
                return custo;
        } 
        else if (Porta.tipoPorta!=TipodePorta.PORTA_LUXO&&Porta.pivotante==true) {
                custo = custo+(custoMetro*metroQuad)+TAXA_PIVOTANTE;
                return custo;
        }
        else if (Porta.tipoPorta!=TipodePorta.PORTA_LUXO&&Porta.pivotante==false) {
                custo = custo+(custoMetro*metroQuad);
                return custo;
        }
        return 0;
    }

}
