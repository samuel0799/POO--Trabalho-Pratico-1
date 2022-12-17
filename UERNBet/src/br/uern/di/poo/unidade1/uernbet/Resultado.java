package br.uern.di.poo.unidade1.uernbet;

public enum Resultado {
    TIME1(1),
    EMPATE(0),
    TIME2(2)
    
    
    ;
    
    private final int resultado;

    private Resultado(int resultado) {
     this.resultado = resultado;   
    }
    public int getVitoriaTime1() {
        return resultado;
    }

    public int getEmpate() {
        return resultado;
    }

    public int getVitoriaTime2() {
        return resultado;
    }

    
    
    
}
