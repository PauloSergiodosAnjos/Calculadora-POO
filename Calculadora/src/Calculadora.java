public class Calculadora {
    double hora;
    double salarioMensal;
    double valorDoContrato;
    
    public double regimeCLT(Double salarioMensal) {
        return salarioMensal;
    }

    public double regimeHorista(Double hora, double horasTrabalhadas) {
        return hora * horasTrabalhadas;
    }

    public double regimePJ(double valorDoContrato){
        return valorDoContrato;
    }
}
