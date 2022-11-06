public class Queque {
    private final static int INITIAL_CAPACITY = 6;

    private CustomCollection collection = new CustomCollection(INITIAL_CAPACITY);

    public  void enquque(Float valor){
        collection.add(valor);
    }

    public Float dequque(){
        return collection.delete(0);
    }
    public int getCantidad(){
        return collection.getNumeros();
    }
}
