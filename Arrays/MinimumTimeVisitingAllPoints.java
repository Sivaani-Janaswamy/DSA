public class MinimumTimeVisitingAllPoints {
   public int minimumTimeVisitingAllPoints(int[][] points) {
    int minTime = 0;
    int x1 = points[0][0];
    int y1 = points[0][1];

    for (int i = 1; i < points.length; i++) {
        int x2 = points[i][0];
        int y2 = points[i][1];
        minTime += Math.max(Math.abs(x2 - x1), Math.abs(y2 - y1)); 
        x1 = x2;
        y1 = y2;
    }
    return minTime;
   }
    public static void main(String[]args){
        MinimumTimeVisitingAllPoints mtvp = new MinimumTimeVisitingAllPoints();
        int[][] points = {{1,1},{3,4},{-1,0}};
        int minTime = mtvp.minimumTimeVisitingAllPoints(points);
        System.out.println("Minimum Time To Visit All Points: "+minTime);

    }
}
