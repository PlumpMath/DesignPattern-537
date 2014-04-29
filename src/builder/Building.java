package builder;

public class Building {
	private Material base;
	private Material frame;
	private Material wall;

	void setBase(Material m) {
		this.base = m;
	}

	void setFrame(Material m) {
		this.frame = m;
	}

	void setWall(Material m) {
		this.wall = m;
	}

	public String toString() {
		return "[Base:" + this.base + ", Frame:" + this.frame + ", Wall:"
				+ this.wall + "]";
	}
}
