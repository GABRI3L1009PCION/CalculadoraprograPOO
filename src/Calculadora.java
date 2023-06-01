public class Calculadora {
    // Atributos de Clase, pueden ser Publicos, Privados y Protegidos (en herencia)
    protected String tipoCalculadora;
    protected String color;
    protected int dimensionPantalla;
    private String numeroDeSerie;
    private String nombrePropietario;

    // Constructor de la clase
    public Calculadora(String propietario) {
        this.tipoCalculadora = "Calculadora";
        this.dimensionPantalla = 10;
        this.numeroDeSerie = "12345abc";
        this.color = "Azul";
        this.nombrePropietario = propietario;
    }

    
    public Calculadora() {
        this.tipoCalculadora = "Calculadora";
        this.dimensionPantalla = 10;
        this.numeroDeSerie = "12345abc";
        this.color = "Azul";
        this.nombrePropietario = "";
    }

    public double sumar(double primerNumero, double segundoNumero) {
        return primerNumero + segundoNumero;
    }

    public double restar(double primerNumero, double segundoNumero) {
        return primerNumero - segundoNumero;
    }

    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora("Juan");

       
        double resultadoSuma = calculadora.sumar(5.2, 3.8);
        double resultadoResta = calculadora.restar(10, 4);

        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la resta: " + resultadoResta);

        
        CalculadoraBasica calculadoraBasica = new CalculadoraBasica("María");

        
        double resultadoMultiplicacion = calculadoraBasica.multiplicar(2, 5);
        double resultadoDivision = calculadoraBasica.dividir(8, 2);

        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
        System.out.println("Resultado de la división: " + resultadoDivision);

       
        CalculadoraEspecial calculadoraEspecial = new CalculadoraEspecial("Pedro");

       
        double resultadoRaiz = calculadoraEspecial.raizCuadrada(16);
        boolean esPrimo = calculadoraEspecial.esPrimo(7);

        System.out.println("Raíz cuadrada: " + resultadoRaiz);
        System.out.println("Es primo: " + esPrimo);
        
        
        int numero = 7;
        System.out.println("El número " + numero + " es par: " + calculadoraEspecial.esNumeroPar(numero));
        System.out.println("El número " + numero + " es impar: " + calculadoraEspecial.esNumeroImpar(numero));
        System.out.println("El factorial de " + numero + " es: " + calculadoraEspecial.factorial(numero));
        double angulo = Math.PI / 4; // 45 grados en radianes
        System.out.println("Seno de " + angulo + ": " + calculadoraEspecial.seno(angulo));
        System.out.println("Coseno de " + angulo + ": " + calculadoraEspecial.coseno(angulo));
        System.out.println("Tangente de " + angulo + ": " + calculadoraEspecial.tangente(angulo));
        
        double numeroAbsoluto = -3.5;
        System.out.println("Valor absoluto de " + numeroAbsoluto + ": " + calculadoraEspecial.valorAbsoluto(numeroAbsoluto));
        
        double numeroRedondeo = 3.7;
        System.out.println("Redondeo de " + numeroRedondeo + ": " + calculadoraEspecial.redondeo(numeroRedondeo));
        
        double numeroCambioSigno = 5.2;
        System.out.println("Cambio de signo de " + numeroCambioSigno + ": " + calculadoraEspecial.cambioSigno(numeroCambioSigno));
        
        double base = 2;
        double exponente = 3;
        System.out.println(base + " elevado a " + exponente + ": " + calculadoraEspecial.exponencial(base, exponente));
        
        double a = 8.5;
        double b = 3.2;
        System.out.println("El valor máximo entre " + a + " y " + b + " es: " + calculadoraEspecial.valorMaximo(a, b));
        System.out.println("El valor mínimo entre " + a + " y " + b + " es: " + calculadoraEspecial.valorMinimo(a, b));
    }
}

class CalculadoraBasica extends Calculadora {
    public CalculadoraBasica(String propietario) {
        super(propietario);
    }

    public double multiplicar(double primerNumero, double segundoNumero) {
        return primerNumero * segundoNumero;
    }

    public double dividir(double primerNumero, double segundoNumero) {
        return primerNumero / segundoNumero;
    }
}

class CalculadoraEspecial extends Calculadora {
    public CalculadoraEspecial(String propietario) {
        super(propietario);
    }

    public double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

    public boolean esPrimo(int numeroBuscado) {
        boolean primo = false;
        int contador = 0;
        for (int i = numeroBuscado; i > 0; i--) {
            if (numeroBuscado % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean esNumeroPar(int numero) {
        return numero % 2 == 0;
    }

    public boolean esNumeroImpar(int numero) {
        return numero % 2 != 0;
    }

    public int factorial(int numero) {
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public double seno(double angulo) {
        return Math.sin(angulo);
    }

    public double coseno(double angulo) {
        return Math.cos(angulo);
    }

    public double tangente(double angulo) {
        return Math.tan(angulo);
    }

    public double valorAbsoluto(double numero) {
        return Math.abs(numero);
    }

    public int redondeo(double numero) {
        return (int) Math.round(numero);
    }

    public double cambioSigno(double numero) {
        return -numero;
    }

    public double exponencial(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double valorMaximo(double a, double b) {
        return Math.max(a, b);
    }

    public double valorMinimo(double a, double b) {
        return Math.min(a, b);
    }
}
