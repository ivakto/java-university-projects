package labs.lab3.Area;

public class Circle implements Area{

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float calculate() {
        return (float) (Math.PI * this.radius * this.radius);
    }
}
