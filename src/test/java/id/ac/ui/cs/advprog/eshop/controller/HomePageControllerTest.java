package id.ac.ui.cs.advprog.eshop.controller;

import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


@ExtendWith(MockitoExtension.class)
class HomepageControllerTest {

    @BeforeEach
    void setUp() {
    }

    @InjectMocks
    HomeController homePageController;

    @Test
    void homePageReturnString() {
        String result = homePageController.homePage();
        assertEquals("HomePage", result);
    }
}
