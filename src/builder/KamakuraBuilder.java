package builder;


class KamakuraBuilder implements BuildingBuilder {
	private Building building;

	KamakuraBuilder() {
		this.building = new Building();
	}

	public void buildBase() {
		this.building.setBase(Material.SNOW);
	}

	public void buildFrame() {
		this.building.setFrame(Material.SNOW);
	}

	public void buildWall() {
		this.building.setWall(Material.SNOW);
	}

	public Building getResult() {
		return this.building;
	}
}