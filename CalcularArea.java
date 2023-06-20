class CalcularArea {
private double lado1;
private double lado2;
private double lado3;

public CalcularArea(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        }

public double calcularArea() {
    double semiperimetro = (lado1 + lado2 + lado3) / 2;
    double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    return area;
}
}