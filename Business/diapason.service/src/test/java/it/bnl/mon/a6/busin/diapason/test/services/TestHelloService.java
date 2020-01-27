package it.bnl.mon.a6.busin.diapason.test.services;

import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import it.bnl.fwk.common.lognext.logger.INxtLogger;
import it.bnl.fwk.common.lognext.NxtLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import it.bnl.fwk.jrfcore.core.test.JRFCoreTestRunner;

@RunWith(JRFCoreTestRunner.class)
@SpringBootTest()
@DirtiesContext
public class TestHelloService {
	
	private final static INxtLogger logger = NxtLoggerFactory.getLogger(TestHelloService.class);
	
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setup() throws Exception {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void testHelloMethod() {
		String name = "No Name";
		
		try {
			MvcResult result = mockMvc.perform(get("/helloservice/hello/" + name))
			.andExpect(status().isOk())
			.andReturn();
			
			String content = result.getResponse().getContentAsString();
			Assert.assertNotNull(content);
			
			Assert.assertTrue(content.contains(name));
		} 
		catch (Exception e) {
			logger.error("", e);
			fail(e.getMessage());
		}

	}

}
