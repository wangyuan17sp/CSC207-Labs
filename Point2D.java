/**

/**
 * @author Yuan Wang
 *
 */
public class Point2D {
    
    public int x;
    public int y;
    
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }
    
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Point2D add(int dx, int dy) {
        Point2D newpoint = new Point2D();
        
        newpoint.x += dx;
        newpoint.y += dy;
        
        return newpoint;
    }
    
    
    public void translatePoint(Point2D point) {
        this.x += point.x;
        this.y += point.y;        
    }
    
    public double distance (int x, int y) {
        return (Math.sqrt(x * x + y * y));
    }
    
    public String toString(int x, int y) {
        String xStr = String.valueOf(x);
        String yStr = String.valueOf(y);
        
        String point = "(" + xStr + "," + yStr + ")";
        
        return point;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}

