package Transport;

public class Truck extends EngineTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }


    @Override
    public void service() {
        super.service();
        checkTrailer();
    }
}
