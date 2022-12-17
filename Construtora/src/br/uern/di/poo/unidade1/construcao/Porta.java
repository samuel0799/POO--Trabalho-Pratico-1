package br.uern.di.poo.unidade1.construcao;

public class Porta {
    
    TipodePorta tipoPorta;
    double altura,largura;
    private static final double alturaPadrao = 1.8, larguraPadrao = 0.7 ;
    boolean pivotante; /* SE FOR TRUE É PIVOTANTE, SE FALSE NÃO É. */

    private static final double TAXA_PIVOTANTE = 350.00;
    
    public Porta() {
        
        this.tipoPorta = TipodePorta.PORTA_SIMPLES;
        this.altura = alturaPadrao;
        this.largura = larguraPadrao;
        this.pivotante = false;
       
    }

    public Porta(TipodePorta tipoPorta, double altura, double largura, boolean pivotante) {
        this.tipoPorta = tipoPorta;
        this.altura = altura;
        this.largura = largura;
        this.pivotante = pivotante;
    }

    public TipodePorta getTipoPorta() {
        return tipoPorta;
    }

    public void setTipoPorta(TipodePorta tipoPorta) {
        this.tipoPorta = tipoPorta;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public static double getAlturapadrao() {
        return alturaPadrao;
    }

    public static double getLargurapadrao() {
        return larguraPadrao;
    }

    public boolean isPivotante() {
        return pivotante;
    }

    public void setPivotante(boolean pivotante) {
        this.pivotante = pivotante;
    }

    public static double getTaxaPivotante() {
        return TAXA_PIVOTANTE;
    }
    

    public double calculaPreco(Porta Porta) {
        double preco = 0.0;
        if(Porta.tipoPorta == TipodePorta.PORTA_SIMPLES&&Porta.pivotante==false){
            preco = TipodePorta.PORTA_SIMPLES.getCusto();
            return preco;
        }
        else if(Porta.tipoPorta == TipodePorta.PORTA_PADRAO&&Porta.pivotante==false){
            preco = TipodePorta.PORTA_PADRAO.getCusto();
            return preco;
        }
        else if(Porta.tipoPorta == TipodePorta.PORTA_LUXO&&Porta.pivotante==false){
            preco = TipodePorta.PORTA_LUXO.getCusto();
            return preco;
        }
        else if(Porta.tipoPorta == TipodePorta.PORTA_SIMPLES&&Porta.pivotante==true){
            preco = TipodePorta.PORTA_SIMPLES.getCusto()+TAXA_PIVOTANTE;
            return preco;
        }
        else if(Porta.tipoPorta == TipodePorta.PORTA_PADRAO&&Porta.pivotante==true){
            preco = TipodePorta.PORTA_PADRAO.getCusto()+TAXA_PIVOTANTE;
            return preco;
        }
        else if(Porta.tipoPorta == TipodePorta.PORTA_LUXO&&Porta.pivotante==true){
            preco = TipodePorta.PORTA_LUXO.getCusto()+TAXA_PIVOTANTE;
            return preco;
        }
        return 0;
    }
    public void exibePorta(Porta Porta) {
        System.out.println("Tipo de madeira da porta: "+Porta.tipoPorta.getTipoDeMadeira());
        System.out.println("Tipo de fechadura da porta: "+Porta.tipoPorta.getTipoDeFechadura());
        System.out.printf("Altura da porta: %.1f metros %n",Porta.getAltura());
        System.out.printf("Largura da porta: %.1f metros %n",Porta.getLargura());
        if(Porta.pivotante==true){
            System.out.println("PIVOTANTE: SIM");

        }
        else{
            System.out.println("PIVOTANTE: NÃO");
        }
       
    }

}
