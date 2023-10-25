import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public abstract class Personne {
    private String name;
    private String prenom;
    private GregorianCalendar dateNaissance;
    private String email;
    private String phoneNumber;

    // Constructors
    public Personne(String name, String prenom, String email, String phoneNumber, int j, int m, int a) {
        this.name = name;
        this.prenom = prenom;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateNaissance = new GregorianCalendar(a, m - 1, j);
    }
    
    // getter
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPrenom() {
        return prenom;
    }

    public GregorianCalendar getDateNaissance() {
        return dateNaissance;
    }

    // setter
    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaissance(int j, int m, int a) {
        this.dateNaissance = new GregorianCalendar(a, m - 1, j);
    }

    public String toString() {
        String result = "\nNom : " + name + "\n"
                + "Pr�nom : " + prenom + "\n" +
                "N�(e) le : " + dateNaissance.get(Calendar.DAY_OF_MONTH) +
                "-" + dateNaissance.get(Calendar.MONTH) +
                "-" + dateNaissance.get(Calendar.YEAR) + "\n" +

                "email" + email + "\n" +
                "tele" + phoneNumber + "\n";
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (getClass() != obj.getClass())
            return false;

        Personne other = (Personne) obj;

        return Objects.equals(other.getName(), this.getName()) &&
                Objects.equals(other.getPrenom(), this.getPrenom()) &&
                Objects.equals(other.getDateNaissance(), this.getDateNaissance());
    }

}
