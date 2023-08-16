public class EmptyChest implements iGameItem {
    @Override
    public void open() {
        System.out.println("Пустой сундук...");
    }
}