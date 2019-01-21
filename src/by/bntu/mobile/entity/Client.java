package by.bntu.mobile.entity;

public class Client {
    int clientId;
    String firstName;
    String surname;
    Tariff tariff;

    public Client(int clientId, String firstName, String surname, Tariff tariff) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.surname = surname;
        this.tariff = tariff;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (clientId != client.clientId) return false;
        if (firstName != null ? !firstName.equals(client.firstName) : client.firstName != null) return false;
        if (surname != null ? !surname.equals(client.surname) : client.surname != null) return false;
        return tariff != null ? tariff.equals(client.tariff) : client.tariff == null;
    }

    @Override
    public int hashCode() {
        int result = clientId;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (tariff != null ? tariff.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", tariff=" + tariff +
                '}';
    }
}
