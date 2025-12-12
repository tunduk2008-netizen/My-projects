package enums;

public enum UserTypes {
    CUSTOMER("Покупатель"),
    SALESMAN("Продавец"),
    PROVIDER("Поставщик");

    private String description;
    UserTypes(String description) {this.description = description;}
    public String getDescription() {return description;}
}
