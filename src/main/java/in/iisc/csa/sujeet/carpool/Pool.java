package in.iisc.csa.sujeet.carpool;

public class Pool {
	String origin;
	String destination;
	String startTime;
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	@Override
	public String toString() {
		return "Pool [origin=" + origin + ", destination=" + destination + ", startTime=" + startTime + "]";
	}
}
