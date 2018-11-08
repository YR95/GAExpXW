package Exp3;

public class TimeSeria {
	private Integer t;
	private Double Yt;

	public TimeSeria(Integer t, Double yt) {
		this.t = t;
		Yt = yt;
	}

	@Override
	public String toString() {
		return "Exp3.TimeSeria{" +
				"t=" + t +
				", Yt=" + Yt +
				'}'+'\n';
	}

	public Integer getT() {
		return t;
	}

	public void setT(Integer t) {
		this.t = t;
	}

	public Double getYt() {
		return Yt;
	}

	public void setYt(Double yt) {
		Yt = yt;
	}
}