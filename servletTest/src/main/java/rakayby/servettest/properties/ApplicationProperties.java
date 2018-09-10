package rakayby.servettest.properties;

/**
 *
 * @author Mohammed Rakayby
 */
public class ApplicationProperties {
    private String applicationTitle;
    private String author;

    //add array for nav bar
    public ApplicationProperties() {
    }

    
    public ApplicationProperties(String applicationTitle, String author) {
        this.applicationTitle = applicationTitle;
        this.author = author;
    }

    
    public String getApplicationTitle() {
        return applicationTitle;
    }

    public void setApplicationTitle(String applicationTitle) {
        this.applicationTitle = applicationTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    
}
