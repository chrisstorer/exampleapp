package exampleapp.controllers;

import exampleapp.ExampleappApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by Chris on 20/07/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ExampleappApplication.class)
@WebAppConfiguration
public class HelloWorldControllerTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;


    @Before
    public void setUp() throws Exception {

        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testHelloworld() throws Exception {
        mockMvc.perform(get("/helloworld")).andExpect(status().isOk()).andExpect(view().name("helloworld"));
    }

    @Test
    public void testGoodbyeworld() throws Exception {
        mockMvc.perform(get("/goodbyeworld")).andExpect(status().isOk()).andExpect(view().name("goodbyeworld"));
    }
}