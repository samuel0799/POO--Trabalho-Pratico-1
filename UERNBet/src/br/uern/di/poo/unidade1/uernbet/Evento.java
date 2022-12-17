package br.uern.di.poo.unidade1.uernbet;

public class Evento {
    
    private String faseDoEvento, time1,time2;
    private double ODDTime1, ODDEmpate, ODDTime2 ;
    private br.uern.di.poo.unidade1.uernbet.Resultado Resultado;
    
    public Evento(String faseDoEvento, String time1, String time2, double ODDTime1, double ODDEmpate, double ODDTime2) {
        this.faseDoEvento = faseDoEvento;
        this.time1 = time1;
        this.time2 = time2;
        this.ODDTime1 = ODDTime1;
        this.ODDEmpate = ODDEmpate;
        this.ODDTime2 = ODDTime2;
    }

    public br.uern.di.poo.unidade1.uernbet.Resultado getResultado() {
        return Resultado;
    }

    public void setResultado(br.uern.di.poo.unidade1.uernbet.Resultado empate) {
        this.Resultado = empate;
    }

    public String getFaseDoEvento() {
        return faseDoEvento;
    }

    public void setFaseDoEvento(String faseDoEvento) {
        this.faseDoEvento = faseDoEvento;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public double getODDTime1() {
        return ODDTime1;
    }

    public void setODDTime1(double oDDTime1) {
        ODDTime1 = oDDTime1;
    }

    public double getODDEmpate() {
        return ODDEmpate;
    }

    public void setODDEmpate(double oDDEmpate) {
        ODDEmpate = oDDEmpate;
    }

    public double getODDTime2() {
        return ODDTime2;
    }

    public void setODDTime2(double oDDTime2) {
        ODDTime2 = oDDTime2;
    }


    
    


}
