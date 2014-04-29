package builder;

class Director {
	private BuildingBuilder builder;

	Director(BuildingBuilder builder) {
		this.builder = builder;
	}

	Building construct() {
		this.builder.buildBase();
		this.builder.buildFrame();
		this.builder.buildWall();
		return this.builder.getResult();
	}
}