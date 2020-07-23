/**
 * 
 */

//import static java.lang.Math.sqrt;


/**
 * @author Nikou K
 *
 */
public class PointT {
	/**
	 * 
	 */
	double xc, yc;
	public PointT(double x, double y){//throws InvalidPointException{
		xc = x;
		yc = y;
		if ((!((xc >= 0) && (xc <= Constants.MAX_X))) || 
				(!((yc >= 0) && (yc <= Constants.MAX_Y))))
			try {
				throw new InvalidPointException("Invalid point");
			} catch (InvalidPointException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		// TODO Auto-generated constructor stub
	}

	public double xcrd() {
		return xc;
	}
	/**
	 * @param xc the xc to set
	 */
	
	public double ycrd() {
		return yc;
	}
	/**
	 * @param yc the yc to set
	 */

	public double dist(PointT p) {
		double dn = Math.sqrt(Math.pow(this.xc-p.xc,2)+Math.pow(this.yc-p.yc,2));
		return dn;
	}
	/**
	 * @param yc the yc to set
	 */
}
