package ih.addressbook;

public class PersonalContact extends BaseContact{

    private String relationship;
    private String birthday;

    public PersonalContact(String name, String phoneNumber, String email, String relationship, String birthday) {
        super(name, phoneNumber, email);
        this.relationship = relationship;
        this.birthday = birthday;
    }

    public String getRelationship() {
        return relationship;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
