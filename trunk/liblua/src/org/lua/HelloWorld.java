package org.lua;

public class HelloWorld {
	public native long newInterp();
	public native String getWorld(long L);
}
