package model;
 
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
 
/**
 *
 * @author TUNGDUONG
 */
@Entity(name = "category")
public class Category {
 
    @Id
    private long categoryID;
    private String categoryName;
    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "categoryID")
    private List<Product> listProduct;
 
    public Category() {
    }
 
    public Category(long categoryID, String categoryName) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
    }
 
    public long getCategoryID() {
        return categoryID;
    }
 
    public void setCategoryID(long categoryID) {
        this.categoryID = categoryID;
    }
 
    public String getCategoryName() {
        return categoryName;
    }
 
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
 
    public List<Product> getListProduct() {
        return listProduct;
    }
 
    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }
 
}