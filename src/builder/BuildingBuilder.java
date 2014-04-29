package builder;


public interface BuildingBuilder {
	void buildBase();

	void buildFrame();

	void buildWall();

	Building getResult();
}
