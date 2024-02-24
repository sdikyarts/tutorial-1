package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Product;
import id.ac.ui.cs.advprog.eshop.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Iterator;
import java.util.List;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductServiceImplTest {
    @InjectMocks
    ProductServiceImpl productService;

    @Mock
    ProductRepository productRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testCreateProduct() {
        Product product = new Product();
        product.setProductId("127");
        product.setProductName("TosTos");
        product.setProductQuantity(100);

        when(productRepository.create(product)).thenReturn(product);
        productService.create(product);
    }

    @Test
    void testFindAll() {
        Product product = new Product();
        product.setProductId("143");
        product.setProductName("Ultra Milk");
        product.setProductQuantity(100);

        when(productRepository.findAll()).thenReturn(List.of(product).iterator());
        Iterator<Product> productIterator = productService.findAll().iterator();

        assertTrue(productIterator.hasNext());
        Product savedProduct = productIterator.next();
        assertEquals(product.getProductId(), savedProduct.getProductId());
        assertEquals(product.getProductName(), savedProduct.getProductName());
        assertEquals(product.getProductQuantity(), savedProduct.getProductQuantity());
    }

    @Test
    void testFindById() {
        Product product = new Product();
        product.setProductId("143");
        product.setProductName("Ultra Milk");
        product.setProductQuantity(100);

        when(productRepository.findbyId("143")).thenReturn(product);
        Product retrievedProduct = productService.findById("143");

        assertEquals(product, retrievedProduct);
    }

    @Test
    void testEditProduct() {
        Product product = new Product();
        product.setProductId("143");
        product.setProductName("Ultra Milk");
        product.setProductQuantity(100);

        Product editedProduct = new Product();
        product.setProductId("143");
        product.setProductName("SKZ");
        product.setProductQuantity(325);
        productService.edit(editedProduct);

        verify(productRepository, times(1)).edit(editedProduct);
    }

    @Test
    void testDeleteProduct() {
        Product product = new Product();
        product.setProductId("143");

        productService.delete("143");
        verify(productRepository, times(1)).delete("143");
    }
}
