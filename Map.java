public class Map {
	static GenericList Obstacles;
	static GenericList Destinations;
	static GenericList SafeZone;
	
	public Map(GenericList o, GenericList d, GenericList sz){
	init(o, d, sz);
	}
	public void init(GenericList o, GenericList d, GenericList sz) {
		Obstacles = o;
		Destinations = d;
		SafeZone = sz;
	}
	
	static public GenericList get_obstacles(){
		return Obstacles;
	}
	static public GenericList get_destinations(){
		return Destinations;
	}
	static public GenericList get_safeZone(){
		return SafeZone;
	}

}
