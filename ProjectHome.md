From the readme:

# liblua demonstration projects #

This is a very basic demonstration of how to hook Lua into the JNI
interfaces, and thus into your Android application.  There's no
rocket science here, but it should be a nice bootstrap for anyone
who needs to do the same thing.

There's also a sample implementation of [an automatic Eclipse NDK Builder](http://mobilepearls.com/labs/ndk-builder-in-eclipse/).

# Setup #

In Properties->Builders->NDK Builder:
  1. Modify the NDK Builder in the 'liblua' project to point to the android-ndk/build/core/build-local.mk, wherever that may be.  Look for the obviously wrong path in the NDK Builder's configuration.
  1. Modify the 'Working Directory' if you changed the name of the project, or copied the files around.

There's three projects as part of this demonstration:

### liblua ###
This is a Android library project.  It contains the necessary JNI code to build a .so, and an automatic External Builder tool in the project settings to rebuild the Lua code whenever it's been changed.

### Demo liblua ###
This is a shim Android 'application' that does nothing and has no code of interest.  It's only purpose is to serve as a baseline for the next project.

### Demo libluaTest ###
This project contains a basic test that creates a new interpreter, and then retrieves a value out of it, demonstrating that it was correctly configured.

# What Next? #

For me:

I don't expect to need to change this, unless someone points out something particularly interesting to add, or a problem that other people run into.

For you:

Modify the code in 'helloworld.c' (well, really you should make your own file) to do whatever Lua operations you need. You can keep the same model, though modifying the include path to be more 'standard' (the extra lua at the top is sorta silly) might not be a bad idea.

Good luck, and happy coding!