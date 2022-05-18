package Entity;

import javax.persistence.*;

@Entity
public class Catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    String catalog_Name;

    String status;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatalog_Name() {
        return catalog_Name;
    }

    public void setCatalog_Name(String catalog_Name) {
        this.catalog_Name = catalog_Name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


}
