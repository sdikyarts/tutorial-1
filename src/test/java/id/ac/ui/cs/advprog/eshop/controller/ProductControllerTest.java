package id.ac.ui.cs.advprog.eshop.controller;

import id.ac.ui.cs.advprog.eshop.model.Product;
import id.ac.ui.cs.advprog.eshop.service.ProductServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class ProductControllerTest {
    @Mock
    private ProductServiceImpl productService;

    @Mock
    private Model model;

    @InjectMocks
    private ProductController productController;

    @Test
    void testCreateProductPage() {
        Model model = mock(Model.class);
        String result = productController.createProductPage(model);
        assertEquals("createProduct", result);
    }

    @Test
    void testCreateProductPost() {
        Model model = mock(Model.class);
        Product product = new Product();
        Mockito.when(productService.create(product)).thenReturn(product);
        String result = productController.createProductPost(product);
        assertEquals("redirect:list", result);
    }

    @Test
    void testProductListPage() {
        Model model = mock(Model.class);
        Mockito.when(productService.findAll()).thenReturn(null);
        String result = productController.productListPage(model);
        assertEquals("ProductList", result);
    }

    @Test
    void testEditProductPage() {
        Model model = mock(Model.class);
        Product product = new Product();
        Mockito.when(productService.findById("1")).thenReturn(product);
        String result = productController.editProductPage("1", model);
        assertEquals("EditProduct", result);
    }

    @Test
    void testEditProductPost() {
        Product product = new Product();
        Mockito.when(productService.edit(product)).thenReturn(product);
        String result = productController.editProductPost(product);
        assertEquals("redirect:list", result);
    }

    @Test
    void testDeleteProduct() {
        Mockito.doNothing().when(productService).delete("1");
        String result = productController.deleteProduct("1");
        assertEquals("redirect:../list", result);
    }
}
