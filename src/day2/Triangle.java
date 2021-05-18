package day2;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    Triangle(){}
    Triangle(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    int getSideA(){
        return sideA;
    }

    int getSideB(){
        return sideB;
    }

    int getSideC(){
        return sideC;
    }

    void setSideA(int sideA){
        if (sideA >= 1 && sideA <= 20){
            this.sideA = sideA;
        } else {
            System.out.println("invalid sideA");
        }
    }

    void setSideB(int sideB){
        if (sideB >= 1 && sideB <= 20){
            this.sideB = sideB;
        } else {
            System.out.println("invalid sideB");
        }
    }

    void setSideC(int sideC){
        if (sideC >= 1 && sideC <= 20){
            this.sideC = sideC;
        } else {
            System.out.println("invalid sideC");
        }
    }

    private boolean isTriangleValid(){
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA){
            return true;
        } else {
            return false;
        }
    }

    public void check(Triangle triangle){
        if(triangle.isTriangleValid()){
            System.out.println("valid triangle");
        } else {
            System.out.println("invalid triangle");
        }
    }

    public void check(){
        if (isTriangleValid()){
            System.out.println("valid triangle");
        } else {
            System.out.println("invalid triangle");
        }
    }

    public void getPerimeterSquare(){
        if (isTriangleValid()){
            int perimeter = sideA + sideB + sideC;
            double square = Math.sqrt((perimeter / 2 - sideA) * (perimeter / 2 - sideB) * (perimeter / 2 - sideC));
            System.out.println("perimeter is " + perimeter);
            System.out.println("square is " + square);
        }
    }


}
