package com.hsbc.superBank.execulting.modules.hello.controller;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.hsbc.superBank.execulting.modules.hello.service.GreetingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @Author: xiaoxie
 * @Description: 测试GreetingController的GET，POST，DELETE，PUT方法
 * @Date:Create in 16:06 2018/7/30
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = GreetingController.class)
@AutoConfigureMockMvc
public class GreetingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GreetingService service;

    /**
     * @MethodName:greetingShouldReturnMessageFromServiceWithGET
     * @Description:测试GET请求
     */
    @Test
    public void greetingShouldReturnMessageFromServiceWithGET() throws Exception {
        when(service.greet()).thenReturn("Hello Mock");
        this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("GET Hello Mock")));
    }
    /**
     * @MethodName:greetingShouldReturnMessageFromServiceWithPOST
     * @Description:测试PSOT请求
     */
    @Test
    public void greetingShouldReturnMessageFromServiceWithPOST() throws Exception {
        when(service.greet()).thenReturn("Hello Mock");
        this.mockMvc.perform(post("/greeting")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("POST Hello Mock")));
    }
    /**
     * @MethodName:greetingShouldReturnMessageFromServiceWithDELETE
     * @Description:测试DELETE请求
     */
    @Test
    public void greetingShouldReturnMessageFromServiceWithDELETE() throws Exception {
        when(service.greet()).thenReturn("Hello Mock");
        this.mockMvc.perform(delete("/greeting")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("DELETE Hello Mock")));
    }
    /**
     * @MethodName:greetingShouldReturnMessageFromServiceWithPUT
     * @Description:测试PUT请求
     */
    @Test
    public void greetingShouldReturnMessageFromServiceWithPUT() throws Exception {
        when(service.greet()).thenReturn("Hello Mock");
        this.mockMvc.perform(put("/greeting")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("PUT Hello Mock")));
    }
}
