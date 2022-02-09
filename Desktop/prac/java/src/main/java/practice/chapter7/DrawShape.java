package practice.chapter7;

class DrawShape {
    public static void main(String[] args) {

        Point [] p = {
                new Point(100,100),
                new Point(140, 50),
                new Point(200,100)
        };

        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150,250),10);

        t.draw();
        c.draw();
    }
}

class Shape{
    String color = "black";
    void draw(){
        System.out.println("color = " + color);
    }
}

class Point{
    int x;
    int y;

    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    Point(){
        this(0,0);
    }

    String getXY(){
        return x+","+y;
    }
}

class Circle extends Shape{
    Point center;
    int r;

    Circle(){
        this(new Point(0,0), 100);
    }

    Circle(Point center, int r){
        this.center = center;
        this.r = r;
    }

    void draw(){
        System.out.println("center = " + center.getXY());
        System.out.println("r = " + r);
        System.out.println("color = " + color);
    }
}

class Triangle extends Shape{
    Point [] p = new Point[3];

    Triangle(Point [] p){
        this.p = p;
    }

    void draw(){
        System.out.println("p[0].getXY() = " + p[0].getXY());
        System.out.println("p[1].getXY() = " + p[1].getXY());
        System.out.println("p[2].getXY() = " + p[2].getXY());
    }
}
