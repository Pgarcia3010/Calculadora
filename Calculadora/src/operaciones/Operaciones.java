package operaciones;
public class Operaciones{
	/**
         * suma.
         * @valor1 se suma con valor2
         * @valor2 se suma con valor1
         * @return devuelve la suma entre valor 1 y 2
         */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
        /**
         * resta.
         * @valor1 se resta con valor2
         * @valor2 se resta con valor1
         * @return devuelve la resta entre valor 1 y 2
         */
    }
    
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
        /**
         * multiplicar.
         * @valor1 se multiplica con valor2
         * @valor2 se multiplica con valor1
         * @return devuelve la multiplicacion entre valor 1 y 2
         */
    }
    
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
        /**
         * division.
         * @valor1 se divide con valor2
         * @valor2 es dividido con calor1
         * @return devuelve la division entre valor 1 y 2
         */
    }
    
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    	/**
         * resto.
         * @valor1 calcula el resto con valor2
         * @valor2 calcula el resto con valor1
         * @resultado devuelve el resto entre valor 1 y 2
         */
    }
    
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
 
    }
}