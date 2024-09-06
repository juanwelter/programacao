package Aula31.exAbstrato;

public class Retangulo extends Figura{
    private double Base;
    private double Altura;

    public Retangulo(){
        super.setNomeFigura("Retangulo");
    }
    public double getBase() {
        return Base;
    }

    public void setBase(double base) {
        Base = base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    @Override
    public double calculaArea() {
        return Base*Altura;
    }

    @Override
    public double calculaPerimetro() {
        return Base*2 + Altura*2;
    }
}
