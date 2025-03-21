public class Rectangle {


    private Point topleft;
    private int sideA, sideB;

    public Rectangle(Point topleft, int sideA, int sideB) {
        this.topleft = topleft;
        setSideA(sideA);
        setSideB(sideB);
    }

    public Rectangle(Point topleft, int sideA) {
        this.topleft = topleft;
        setSideA(sideA);
        setSideB(sideB);
    }

    public Point getTopleft() {
        return topleft;
    }

    public void setTopleft(Point topleft) {
        this.topleft = topleft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 0){
            this.sideA = 0;
            System.out.println("Side A can't be negative");
        }else{
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0){
            sideB = 0;
            System.out.println("Side B can't be negative");
        }else{
            this.sideB = sideB;
        }
    }

    public int perimeter(){
        return (2*this.sideA) + (2*this.sideB);
    }
    public int area(){
        return this.sideA * this.sideB;
    }

}