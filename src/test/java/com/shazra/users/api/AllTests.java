package com.shazra.users.api;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.shazra.users.api.domain.SubscriberTest;
import com.shazra.users.api.domain.UserTest;
import com.shazra.users.api.service.SessionServiceTest;
import com.shazra.users.api.service.SubscriberServiceTest;
import com.shazra.users.api.service.UserServiceTest;

/**
 * Test Suite. 
 * Tests cover all layers of the application Domain Controllers and Services.
 * @author pangio
 */
@RunWith(Suite.class)
@SuiteClasses({ 
	UserTest.class, 
	SubscriberTest.class, 
	SessionServiceTest.class,
	UserServiceTest.class,
	SubscriberServiceTest.class })
public class AllTests {

}
