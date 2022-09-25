

public class BuddyInfo {

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo(){
        name = "Addy";
        address = "012";
        phoneNumber = "3438889999";

    }
    public String getName() {
        return name;
    }

    private String name;

    public String getAddress() {
        return address;
    }

    private String address;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private String phoneNumber;

    public static void main(String[] args) {
        BuddyInfo info = new BuddyInfo();

    }
}
