public class CustomCollection {
    private static final int DEFAULT_CAPACITY = 6;
    private Float [] datos = null;
    private int numeros = 0;

    public CustomCollection(int inicialCapacidad){
        datos = new Float[inicialCapacidad];
    }
    public CustomCollection(){
        datos = new Float[DEFAULT_CAPACITY];
    }
    public Float getElement(int position){
        return datos[position];
    }

    public int getNumeros() {
        return numeros;
    }

    public void insert(Float element, int position){
        if (numeros == datos.length){
            Float []aux = datos;
            datos = new Float[datos.length*2];
            for (int i = 0; i < aux.length; i++) {
                datos[i] = aux[i];
            }
            aux = null;
        }
        datos[position] = element;
        numeros++;
    }

    public void add(Float element){
        insert(element, numeros);
    }

    public int search(Float element){
        for (int i = 0; i < numeros; i++) {
            if (datos[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    public Float delete(int position){
        Float aux = datos[position];

        for(int i = position; i < numeros -1; i++){
            datos[i] = datos[i+1];
        }
        datos[numeros -1]= null;
        numeros--;
        return aux;
    }



    @Override
    public String toString() {
        if (numeros == 0){
            return "<empty>";
        }
        String out = "";
        for (int i = 0; i < numeros; i++) {
            out += i + "-["+datos[i].toString() +"]\n";
        }
        return out;
    }
}
