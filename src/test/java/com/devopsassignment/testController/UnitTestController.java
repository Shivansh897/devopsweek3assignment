package com.devopsassignment.testController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.devopsassignment.controller.TestController;

@WebMvcTest(TestController.class)
public class UnitTestController {
	
	@Autowired
    private MockMvc mockMvc;
 
    @Test
    public void test_controller() throws Exception
    {
        mockMvc.perform(get("/hello"))
            .andExpect(status().isOk());
    }

}
