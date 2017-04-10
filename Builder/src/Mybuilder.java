
public class Mybuilder implements HouseBuilder{

    private House house = new House();
    
    @Override
    public void makeFloor() {
        house.setFloor("木地板");
    }

    @Override
    public void makeWall() {
        house.setWall("石头Wall");
    }

    @Override
    public void makeHousetop() {
        house.setHousetop("木房顶");
    }

    @Override
    public House getHouse() {
        return house;
    }

}
