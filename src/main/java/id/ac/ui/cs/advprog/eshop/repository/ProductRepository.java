package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();

    public Product create(Product product) {
        productData.add(product);
        return product;
    }

    public Iterator<Product> findAll() {
        return productData.iterator();
    }

    public Product findbyId(String productId) {
        Iterator<Product> productIterator = this.findAll();
        while (productIterator.hasNext()) {
            Product productMetadata = productIterator.next();
            if (productMetadata.getProductId().equals(productId)) {
                return productMetadata;
            }
        }
        return null;
    }

    public Product edit(Product editedProduct) {
        String editedProductId = editedProduct.getProductId();
        Product foundProductInRepo = this.findbyId(editedProductId);

        boolean isProductExist = true;

        if (foundProductInRepo == null) {
            isProductExist = false;;
        }

        if (!isProductExist) {
            return null;
        }

        int editedProductIndex = productData.indexOf(foundProductInRepo);
        productData.set(editedProductIndex, editedProduct);
        return editedProduct;
    }

    public void delete(String productId) {
        Product deletedProduct = this.findbyId(productId);
        productData.remove(deletedProduct);
    }
}
