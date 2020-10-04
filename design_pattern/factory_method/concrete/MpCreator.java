package concrete;

import java.util.Date;

import framework.Item;
import framework.ItemCreator;

public class MpCreator extends ItemCreator {

    @Override
    protected void requestItemsInfo() {
        // TODO Auto-generated method stub
        System.out.println("get mp potion info from database");

    }

    @Override
    protected void createItemLog() {
        // TODO Auto-generated method stub
        System.out.println("create mp potion time : " + new Date());
    }

    @Override
    protected Item createItem() {
        // TODO Auto-generated method stub
        return new HpPotion();
    }
    
}
