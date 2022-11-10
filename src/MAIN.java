

public class MAIN {

    public static void main (String[] args){
        int resultado;
        resultado = suma(10, 20, 90);
        System.out.println(resultado);


        COCHE miCOCHE = new COCHE();
        miCOCHE.AñadirPuerta();
        System.out.println(miCOCHE.puertas);
    }


    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    static class COCHE{
        public int puertas = 4;
        public void AñadirPuerta(){
            this.puertas++;
        }
    }
}