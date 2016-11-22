

public class Phones {
    public static void main(String[] args) {

        PhonesList phoneList = new PhonesList();
        addPhoneList(phoneList);
        System.out.println("Create phone list:");
        phoneList.printPhonelist();

        phoneList.showCityTimeUnderValue(10000);

        phoneList.showPhonesUseIntercity();
        PhonesList sortPhoneList;
        sortPhoneList=phoneList.sortPhoneList();
        System.out.println("Sort Phone:");
        sortPhoneList.printPhonelist();

    }

    public static void addPhoneList(PhonesList phoneList) {
        phoneList.addPhoneList(new Phone("Ivanov", "Ivan", "Ivanovich", 4123365412365236L, 523, 100, 10800, 0));
        phoneList.addPhoneList(new Phone("Petrov", "Petr", "Petrovich", 4123986535678765L, 3.2, 4100, 652, 85230));
        phoneList.addPhoneList(new Phone("Sidorov", "Ivan", "Sidorovich", 4123795874858689L, 1.0, 70.35, 43324, 0));
        phoneList.addPhoneList(new Phone("Kulyavlob", "Arsen", "Petrovich", 4123000544004550L, 7.56, 54.7, 832, 50));
        phoneList.addPhoneList(new Phone("Ligitimniy", "Viktor", "Viktorovich", 4123000060006005L, 1233., 25, 0, 0));
        phoneList.addPhoneList(new Phone("Boyko", "Dmitriy", "Aleksandrovich", 4123000400044443L, 854.56, 156.2, 0, 0));
        phoneList.addPhoneList(new Phone("Ivanov", "Pavel", "Petrovich", 4123004444005552L, 356.41, 843.5, 0, 532));
    }

}