package framework;

public abstract class ItemCreator {
    public Item create() {

        // template method
        requestItemsInfo();
        Item item = createItem();
        createItemLog();

        return item;
    }

    // 아이템을 생성하기 전에 데이터 베이스에서 아이템 정보를 요청합니다.
    abstract protected void requestItemsInfo();

    // 아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위해서 데이터 베이스에 아이템 생성 정보를 남깁니다.
    abstract protected void createItemLog();

    // 아이템 생성
    abstract protected Item createItem();



}