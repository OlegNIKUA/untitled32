class Phone {
    private static int idCount = 0;

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private long cardNo;
    private double debit;
    private double credit;
    private long cityTime;
    private long intercityTime;

    public Phone(String surname, String name, String patronymic, long cardNo, double debit, double credit, long cityTime, long intercityTime) {
        setId();
        setSurname(surname);
        setName(name);
        setPatronymic(patronymic);
        setCardNo(cardNo);
        setDebit(debit);
        setCredit(credit);
        setCityTime(cityTime);
        setIntercityTime(intercityTime);
    }

    public Phone(int id, String surname, String name, String patronymic, long cardNo, double debit, double credit, long cityTime, long intercityTime) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.cardNo = cardNo;
        this.debit = debit;
        this.credit = credit;
        this.cityTime = cityTime;
        this.intercityTime = intercityTime;
    }

    public int getId() {
        return id;
    }

    private void setId() {
        this.id = ++idCount;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        checkString(surname);
        this.surname = surname;
    }

    private void checkString(String string) {
        if (string == null || string.equals("")) {
            throw new IllegalArgumentException("Value is empty!!!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkString(name);
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        checkString(patronymic);
        this.patronymic = patronymic;
    }

    public long getCardNo() {
        return cardNo;
    }

    public void setCardNo(long cardNo) {
        checkLong(cardNo);
        this.cardNo = cardNo;
    }

    private void checkLong(long number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Wrong Number!!!");
        }
    }

    private void checkTime(long seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException("Wrong Number!!!");
        }
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        checkDouble(debit);
        this.debit = debit;
    }

    private void checkDouble(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Wrong amount!!!");
        }
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        checkDouble(credit);
        this.credit = credit;
    }

    public long getCityTIme() {
        return cityTime;
    }

    public void setCityTime(long cityTIme) {
        checkTime(cityTIme);
        this.cityTime = cityTIme;
    }

    public long getIntercityTime() {
        return intercityTime;
    }

    public void setIntercityTime(long intercityTime) {
        checkTime(intercityTime);
        this.intercityTime = intercityTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Phone{");
        sb.append("id=").append(id);
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", patronymic='").append(patronymic).append('\'');
        sb.append(", cardNo=").append(cardNo);
        sb.append(", debit=").append(debit);
        sb.append(", credit=").append(credit);
        sb.append(", cityTime=").append(cityTime);
        sb.append(", intercityTime=").append(intercityTime);
        sb.append('}');
        return sb.toString();
    }
}