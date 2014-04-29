package builder;


class JapaneseHouseBuilder implements BuildingBuilder {
	private Building building;

	JapaneseHouseBuilder() {
		this.building = new Building();
	}

	public void buildBase() {
		this.building.setBase(Material.CONCRETE);
	}

	public void buildFrame() {
		this.building.setFrame(Material.WOOD);
	}

	public void buildWall() {
		this.building.setWall(Material.CLAY);
	}

	public Building getResult() {
		return this.building;
	}
}
