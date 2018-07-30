package cources.data;

public class AddressTestPair {
    String address;
    String TextToSee;

    public AddressTestPair(String address, String textToSee) {
        this.address = address;
        TextToSee = textToSee;
    }

    @Override
    public String toString() {
        return "AddressTestPair{" +
                "address='" + address + '\'' +
                ", TextToSee='" + TextToSee + '\'' +
                '}';
    }
}
