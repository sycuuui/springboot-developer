//package org.example.springbootdeveloper;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.AutoConfiguration;
//import org.springframework.web.context.WebApplicationContext;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//class TestControllerTest {
//    @Autowired
//    protected MockMvc mockMvc;
//
//    @Autowired
//    private WebApplicationContext context;
//
//    @Autowired
//    private MemberRepository memberRepository;
//
//    @BeforeEach
//    public void mockMvcSetup(){
//        this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
//    }
//    @AfterEach
//    public void cleanUp(){
//        memberRepository.deleteAll();;
//    }
//}