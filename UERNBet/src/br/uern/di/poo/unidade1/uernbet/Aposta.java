package br.uern.di.poo.unidade1.uernbet;

public class Aposta {
    private Evento fase ;
    Resultado resultado;
    private double valorAposta;
    public Aposta(Evento fase, Resultado resultado, int valorAposta) {
        this.fase = fase;
        this.resultado = resultado;
        this.valorAposta = valorAposta;
    }
    public Evento getFase() {
        return fase;
    }
    public Resultado getResultado() {
        return resultado;
    }
    public double getValorAposta() {
        return valorAposta;
    }
    
    public double calculaLucro(Evento fase){
        double lucro = 0.0;
        if (fase.getResultado() == Resultado.TIME1){
            lucro = (valorAposta*(double)fase.getODDTime1()) - valorAposta;
            return lucro;
        }
        else if (fase.getResultado() == Resultado.EMPATE){
            lucro = (valorAposta*(double)fase.getODDEmpate()) - valorAposta;
            return lucro;
        }
        else{
            lucro = (valorAposta*(double)fase.getODDTime2()) - valorAposta;
            return lucro;
        }
            
            
    }

}
