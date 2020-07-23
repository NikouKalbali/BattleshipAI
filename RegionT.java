/**
 * 
 */
import static java.lang.Math.sqrt;
/**
 * <h1>Region</h1> 
 * creates a region
 * @author Nikou Kalabali
 * @version 1
 */
public class RegionT {
	/**
	 * 
	 */
	/**
	 * creates a regionT with given arguements
	 * @param p - the lower left point of the region
	 * @param w - the width of the region
	 * @param h - the height of the region
	 */
	double width, height;
	PointT lower_left;

	public RegionT(PointT p, double w, double h) throws InvalidRegionException {
		width = w;
		height = h;
		lower_left = p;
		if (!((w > 0) && (h > 0) && ((p.xcrd() + w) <= Constants.MAX_X) && ((p
				.ycrd() + h) <= Constants.MAX_Y)))
			throw new InvalidRegionException("Not in the region");	
	}
	/**
	 * evaluates whether point in region or within tolerance 
	 * @param p - the point
	 * @return boolean - boolean value true if in region or in tolerance
	 */
	public boolean pointInRegion(PointT p){
		PointT a = new PointT(lower_left.xcrd(), lower_left.ycrd());
		PointT b = new PointT(lower_left.xcrd(), lower_left.ycrd()+height);
		PointT c = new PointT(lower_left.xcrd()+ width, lower_left.ycrd());
		PointT d = new PointT(lower_left.xcrd()+ width, lower_left.ycrd()+height);
		PointT e = new PointT(lower_left.xcrd()+ width/2, lower_left.ycrd()+height);
		PointT f = new PointT(lower_left.xcrd()+ width, lower_left.ycrd()+height/2);
		PointT g = new PointT(lower_left.xcrd(), lower_left.ycrd()+height/2);
		PointT h = new PointT(lower_left.xcrd()+ width/2, lower_left.ycrd());
		if (Region(p))
			return true;
		else if (p.dist(a) <= Constants.TOLERANCE)
			return true;
		else if (p.dist(b) <= Constants.TOLERANCE)
				return true;
		else if (p.dist(c) <= Constants.TOLERANCE)
			return true;
		else if (p.dist(d) <= Constants.TOLERANCE)
			return true;
		else if (p.dist(e) <= Constants.TOLERANCE)
			return true;
		else if (p.dist(f) <= Constants.TOLERANCE)
			return true;
		else if (p.dist(g) <= Constants.TOLERANCE)
			return true;
		else if (p.dist(h) <= Constants.TOLERANCE)
			return true;
		else
			return false;
	}

	private boolean Region(PointT q) {
		double qxcrd = q.xcrd();
		double qycrd = q.ycrd();
		double tempxcrd = lower_left.xcrd();
		double tempycrd = lower_left.ycrd();
		if (((qxcrd >= tempxcrd) && (qxcrd <= (tempxcrd + width)))
				&& ((qycrd >= tempycrd) && (qycrd <= (tempycrd + height))))
			return true;
		else
			return false;
	}

}
