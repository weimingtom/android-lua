package org.lua;

public class LuaState {
	/* Lua_State interpreter pointer. */
	public long L;

	static public native long newstate();
	static public native long newthread(long L);
	static public native void close(long L);

	/* This is silly; create smart functions in C, and call them once,
 * instead of directly manipulating things from on high.
 */
	/*
	public native void call(long L, int nargs, int nresults);
	public native int checkstack(long L, int extra);
	public native void close(long L);
	public native void concat(long L, int n);
	public native void createtable(long L, int narr, int nrec);
	public native int equal(long L, int idx1, int idx2);
	public native int error(long L);
	public native int gc(long L, int what, int data);
	public native void getfenv(long L, int idx);
	public native void getfield(long L, int idx, String name);
	public native void getglobal(long L, String name);
	public native int getmetatable(long L, int idx);
	public native void gettable(long L, int idx);
	public native void gettop(long L);
	public native void insert(long L, int idx);
	public native int isboolean(long L, int idx);
	public native int iscfunction(long L, int idx);
	public native int isfunction(long L, int idx);
	public native int islightuserdata(long L, int idx);
	public native int isnil(long L, int idx);
	public native int isnone(long L, int idx);
	public native int isnoneornil(long L, int idx);
	public native int isnumber(long L, int idx);
	public native int isstring(long L, int idx);
	public native int istable(long L, int idx);
	public native int isthread(long L, int idx);
	public native int isuserdata(long L, int idx);
	public native int lessthan(long L, int idx1, int idx2);
	public native long newstate();
	public native void newtable(long L);
	public native long newthread(long L);
	public native int next(long L, int idx);
	public native int objlen(long L, int idx);
	public native void pushboolean(long L, boolean b);
	public native void pushinteger(long L, int i);
	public native void pushlightuserdata(long L, int i);
	public native void pushliteral(long L, String s);
	public native void pushnil(long L);
	public native void pushnumber(long L, int i);
	public native void pushstring(long L, String s);
	public native void pushthread(long L, long t);
	public native void pushvalue(long L, int idx);
	public native int rawequal(long L, int idx1, int idx2);
	public native void rawget(long L, int idx);
	public native void rawgeti(long L, int idx, int n);
	public native void rawset(long L, int idx);
	public native void rawseti(long L, int idx, int n);
	public native void remove(long L, int idx);
*/
	
	
}
