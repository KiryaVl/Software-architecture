public class GoldGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        System.out.println("Создал новый сундук с золотом");
        return new GoldReward();
    }
}