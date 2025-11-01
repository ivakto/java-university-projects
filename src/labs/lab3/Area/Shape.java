package labs.lab3.Area;

public abstract class Shape implements Area {
    protected float area;

    protected void setArea() {
        area = calculate(); 
    }
    
}
