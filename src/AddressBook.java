import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    List<BuddyInfo> buddyInfos = new ArrayList<BuddyInfo>();


    public void addBuddy(BuddyInfo buddy) {
        buddyInfos.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddyInfos.remove(buddy);
    }

    public List<BuddyInfo> infoBuddy(BuddyInfo buddy){
        return buddyInfos;
    }


    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);




    }
}