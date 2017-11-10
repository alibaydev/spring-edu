package edu.springmvc.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * @author ibraim
 */
@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource("classpath:ews.properties")
@ContextConfiguration(locations = {"classpath:spring/spring-config.xml", "classpath:spring/ews-config.xml"})
@WebAppConfiguration
public class ProductControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private ProductController productController;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(productController).build();
    }

    @Test
    public void shouldReturnString() throws Exception {
        MvcResult result = mockMvc.perform(get("/products/1"))
                .andExpect(status().isOk())
                .andReturn();
    }
}