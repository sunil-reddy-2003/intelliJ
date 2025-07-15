package BasicPrograms;
class Area{
    int length;
    int breadth;
    int height;

    public Area() {
        System.out.println("in constructor");
    }

    public Area(int length, int height, int breadth) {
        this.length = length;
        this.height = height;
        this.breadth = breadth;
    }

    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public Area(Area old) {
        this.length = old.length;
        this.breadth = old.breadth;
    }
}
public class Basic {
    public static void main(String[] args) {
    Area area=new Area(22,3);
        System.out.println("length :"+area.length+" breadth: "+area.breadth);
        Area area2=new Area(area);
        System.out.println("length :"+area.length+" breadth: "+area.breadth);
    }
}
