package ih.addressbook;

public class ProfessionalContact extends BaseContact{

    private String jobTitle;
    private String organization;

    public ProfessionalContact(String name, String phoneNumber, String email, String jobTitle, String organization) {
        super(name, phoneNumber, email);
        this.jobTitle = jobTitle;
        this.organization = organization;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getOrganization() {
        return organization;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
}
