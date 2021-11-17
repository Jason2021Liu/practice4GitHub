package com.avanade.learningService.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class BenefitControllerTest {

	@InjectMocks
	private BenefitController benefitController;
	
	@Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
    public void test_getBenefit() {
		String result = benefitController.getBenefit();
		Assert.assertEquals("just a test for get Benefit", result);
    }
}
