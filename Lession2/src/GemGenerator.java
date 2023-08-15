public class GemGenerator extends ItemFabric {
    @Override
    public  iGameItem createItem(){
        System.out.println("Создан новый сундук с драгоценным камнем");
        return new GemReward();
    }
}
