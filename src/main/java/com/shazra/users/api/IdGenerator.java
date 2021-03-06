package com.shazra.users.api;

import com.shazra.users.api.domain.Subscriber;
import com.shazra.users.api.domain.User;

/**
 * Helper class that provides consistent ID for {@link Subscriber}, and
 * {@link User} which includes Admin/Super.
 * 
 * @author pangio
 */
public class IdGenerator {

	/**
	 * ID
	 */
	private static Long ID = 0L;

	/**
	 * Generates a sequential ID
	 * @return id
	 */
	public static Long generateId() {
		return ++ID;
	}

}
