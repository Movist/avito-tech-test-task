package movist.advertising.domain;

import javax.persistence.*;

@Entity
public class Advert {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    //не больше 200 символов
    @Column(nullable = false, length = 200)
    private String advertName;

    @Column(nullable = false, length = 1000)
    private String description;

    @Column(nullable = false)
    private String linkToPhoto;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private String dateOfCreation;

    public Advert(String advertName, String description, String linkToPhoto, int price, String dateOfCreation) {
        super();
        this.advertName = advertName;
        this.description = description;
        this.linkToPhoto = linkToPhoto;
        this.price = price;
        this.dateOfCreation = dateOfCreation;
    }

    public Advert() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdvertName() {
        return advertName;
    }

    public void setAdvertName(String advertName) {
        this.advertName = advertName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLinkToPhoto() {
        return linkToPhoto;
    }

    public void setLinkToPhoto(String linkToPhoto) {
        this.linkToPhoto = linkToPhoto;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    @Override
    public String toString() {
        return "Advert{" +
                "id=" + id +
                ", advertName='" + advertName + '\'' +
                ", description='" + description + '\'' +
                ", linkToPhoto='" + linkToPhoto + '\'' +
                ", price=" + price +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                '}';
    }
}
