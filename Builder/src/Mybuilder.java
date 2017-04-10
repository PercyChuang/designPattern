
public class Mybuilder implements HouseBuilder{

    private House house = new House();
    
    @Override
    public void makeFloor() {
        house.setFloor("ľ�ذ�");
    }

    @Override
    public void makeWall() {
        house.setWall("ʯͷWall");
    }

    @Override
    public void makeHousetop() {
        house.setHousetop("ľ����");
    }

    @Override
    public House getHouse() {
        return house;
    }

}
