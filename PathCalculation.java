/**
 * <h1>Path Calculation</h1> 
 * Calculates the properties of a given pathT
 * @author Nikou Kalbali
 * @version 1
 */
public class PathCalculation {
	/**
	 * returns boolean true if valid segment
	 * @param p1,p2  -> points considered that make the segment
	 * @return boolean true if valid segment false if not valid segment
	 */
	public boolean is_validSegment(PointT p1, PointT p2) {
		for (int i = 0; i <= Map.get_obstacles().size(); i++) {
			return true;
		}
		return false;
	}
	/**
	 * returns boolean true if valid path
	 * @param p  -> path where distance considered
	 * @return boolean true if valid path false if not valid path
	 */
	public boolean is_validPath(PathT p) {

		try {
			PointT p1 = (PointT) p.getval(0);
			int psize = p.size() - 1;
			PointT p4;
			p4 = (PointT) p.getval(psize);
			PathT path = (PathT) Map.get_safeZone();
			RegionT p3;
			p3 = (RegionT) path.getval(0);
			if (p3.pointInRegion(p1) && p3.pointInRegion(p4))
				return true;
			
		
		} catch (InvalidPositionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * returns the total distance of the path
	 * @param p  -> path where distance is being measured
	 * @return totsum total distance
	 */
	public double totalDistance(PathT p) {
		double totsum=0;
		try {
		double sum = 0;
		PointT p1, p2;
		for (int i = 0; i <= p.size() - 1; i++) {
			p1 = (PointT) p.getval(i);
			p2 = (PointT) p.getval(i + 1);
			sum = sum + (p1).dist(p2);
		}
		totsum = sum;
		} catch (InvalidPositionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return totsum;
		

	}
}
