public class EmptyChestGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        System.out.println("Создан новый пустой сундук");
        return new EmptyChest();
    }
}