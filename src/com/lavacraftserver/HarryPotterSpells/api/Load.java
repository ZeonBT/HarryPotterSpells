/**
 * 
 */
package com.lavacraftserver.HarryPotterSpells.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Load {
	public boolean value();
	
}
