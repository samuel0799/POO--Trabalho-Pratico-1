package br.uern.di.poo.unidade1.construcao;

public enum TipodePorta {
    PORTA_SIMPLES("madeira compensada","fechadura simples",50.00),
    PORTA_PADRAO("madeira andiroba","fechadura de encaixe",140.00),
    PORTA_LUXO("madeira ipê","fechadura tetra",350.00)
    ;

    private final String tipoDeMadeira, tipoDeFechadura;
    private final double custo;
    
    private TipodePorta(String tipoDeMadeira, String tipoDeFechadura, double custo) {
        this.tipoDeMadeira = tipoDeMadeira;
        this.tipoDeFechadura = tipoDeFechadura;
        this.custo = custo;
    }

    public String getTipoDeMadeira() {
        return tipoDeMadeira;
    }

    public String getTipoDeFechadura() {
        return tipoDeFechadura;
    }

    public double getCusto() {
        return custo;
    }

    
}
