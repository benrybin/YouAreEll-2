package models;

/* 
 * POJO for an Id object
 */
public class Id {
    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getGithubId() {
        return this.githubId;
    }

    public void setGithubId(final String githubId) {
        this.githubId = githubId;
    }

    String name;
    String githubId;
    
    public Id (String name, String githubId) {}

}