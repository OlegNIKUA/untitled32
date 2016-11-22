import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PhonesList {
    private List<Phone> phoneList = new ArrayList<>();

    public void addPhoneList(Phone phone) {
        this.phoneList.add(phone);
    }

    public void printPhonelist() {
        for (Phone phone : phoneList) {
            System.out.println(phone);
        }
    }

    public void showCityTimeUnderValue(long second) {
        System.out.println("Phones with citytime > " + second + " sec.:");
        for (Phone phone : phoneList) {
            if (phone.getCityTIme() > second) {
                System.out.println(phone);
            }
        }
    }

    public void showPhonesUseIntercity() {
        System.out.println("Phone, which used intercity call:");
        for (Phone phone : phoneList) {
            if (phone.getIntercityTime() > 0) {
                System.out.println(phone);
            }
        }
    }

    public PhonesList sortPhoneList() {
        List<Phone> custlist = new ArrayList<>(phoneList);
        Collections.sort(custlist, new Comparator<Phone>() {
            @Override
            public int compare(Phone cust1, Phone cust2) {
                return cust1.getSurname().compareToIgnoreCase(cust2.getSurname());
            }
        });

        PhonesList sortPhoneList = new PhonesList();
        for (Phone phone : custlist) {
            sortPhoneList.addPhoneList(phone);
        }
        return sortPhoneList;
    }

}