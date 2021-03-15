
public class Point3d {
	private int xCoord, yCoord, zCoord;
	
	public Point3d(){
		xCoord = 0;
		yCoord = 0;
		zCoord = 0;
	}
	
	public Point3d(int x, int y, int z) {
		xCoord = x;
		yCoord = y;
		zCoord = z;
	}

	public int getxCoord() {
		return xCoord;
	}

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}

	public int getzCoord() {
		return zCoord;
	}

	public void setzCoord(int zCoord) {
		this.zCoord = zCoord;
	}

	@Override
	public String toString() {
		return "Point3d [xCoord=" + xCoord + ", yCoord=" + yCoord + ", zCoord=" + zCoord + "]";
	}
	
}
