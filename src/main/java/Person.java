public abstract class Person { // класс-мама для всех пользователей
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private String address;
    private String phone;

    public Person(int id, String name, String surname, String patronymic, String address, String phone){ // создание персона
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.phone = phone;

    }

    /// *** НАЧАЛО ГЕТ-МЕТОДОВ ***
    public int getId(){
       return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getPatronymic(){
        return this.patronymic;
    }

    public String getAddress(){
        return this.address;
    }

    public String getPhone(){
        return this.phone;
    }

    public String getFullname(){
        return this.surname + this.name + this.patronymic;
    }

    /// *** КОНЕЦ ГЕТ-МЕТОДОВ ***
}
