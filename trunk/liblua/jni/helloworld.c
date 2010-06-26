#include <string.h>
#include <jni.h>
#include <lua/src/lua.h>

/*
 * Stolen from lauxlib.c for convenience.
 */
static void *l_alloc (void *ud, void *ptr, size_t osize, size_t nsize) {
  (void)ud;
  (void)osize;
  if (nsize == 0) {
    free(ptr);
    return NULL;
  }
  else
    return realloc(ptr, nsize);
}

/*
 * Allocates a new interpreter, and pushes a value into the global table.
 *
 * Returns a pointer to the iterator. Since no deallocation function has
 * been implemented, this will obviously leak memory.
 */
long Java_org_lua_HelloWorld_newInterp(JNIEnv *env, jobject thiz)
{
	lua_State *L;

	L = lua_newstate(l_alloc, NULL);
	lua_pushstring(L, "Hello from JNI!");
	lua_setglobal(L, "test_value");

	return (long)L;
}

/*
 * Returns the value stored in the global table.
 */
jstring Java_org_lua_HelloWorld_getWorld(JNIEnv *env, jobject thiz, long interp)
{
	lua_State *L = (lua_State *)interp;
	const char *val;

	lua_getglobal(L, "test_value");
	val = lua_tostring(L, -1);

	return (*env)->NewStringUTF(env, val);
}

/*
 * Needed to allow the .so to load properly.
 */
jint JNI_OnLoad(JavaVM *vm, void *reserved)
{
	return JNI_VERSION_1_4;
}
