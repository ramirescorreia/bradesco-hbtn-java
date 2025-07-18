public class Gerente extends Empregado {

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()) {
            double salarioGerente = getSalarioFixo() * 0.2;
            salarioGerente = salarioGerente + (departamento.getValorAtingidoMeta() - departamento.getValorMeta()) * 0.01;
            return salarioGerente;
        }
        return 0;
    }
    
}
