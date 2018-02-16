package rettangolo;

public class Rect {
    int base,altezza;
    
    public int getArea(){
        return base*altezza;
    }
    public int getPerimetro(){
        return (base+altezza)*2;
    }
    public void setBase(int b){
        base=b;
    }
    public void setAltezza(int h){
        altezza=h;
    }
}
