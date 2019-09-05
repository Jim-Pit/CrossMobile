# CrossMobile

CrossMobile is a framework that facilitates the development of mobile applications.

The goal of CrossMobile is to be able to write **native** mobile applications, using Java as the 
main language and fully recycle the written code. Using a rich iOS API it is possible to write once 
not only GUI applications, but applications that cover most of mobile aspects, like push notifications, 
geo location, maps, camera etc. There is no need to write specific code for Android, just follow the
iOS API and all will be handled by this framework, with zero manual target fine tuning.


CrossMobile is **not** a hybrid solution. It doesn't run code under an invisible web view. What it does is:

* **iOS** : transpile code from JVM to Objective C, using an up-to-date version of the [XMLVM](https://github.com/teras/xmlvm) tool.
* **Android** : have a thin compatibility library for the iOS API and pass through all system calls to Android subsystem, removing the 
Android implementation details from the developer.
* **Desktop** : with technologies similar to the Android backend, reuse as much Java code as possible, provide the same experience
to the Desktop as a stand-alone Java (JAR based) application.
* **UWP** : with the help of the [WinObjC](https://github.com/crossmob/WinObjC) tool, it is also possible to create native UWP applications, 
transpiled to Objective C with the XMLVM tool.

CrossMobile is a mature project, it is developed for more than 5 years up to now and proved its stability through various 
commercially published applications.



Requirements:

|   | macOS | Windows | Linux |
|---|-------|---------|--------|
| Required | macOS Sierra 10.12.6 <br/> Xcode 9.2 <br/> Android command line tools 3.5 | Windows 7 <br/> Android command line tools 3.5 | x64 distribution <br/> Android command line tools 3.5
| Recommended | macOS Mojave 10.14.6 <br/> Xcode 10.3 <br/> Android Studio 3.5 | Windows 10 <br/> Android Studio 3.5 | x64 distribution <br/> Android Studio 3.5

For more information about CrossMobile, please visit its dedicated site [crossmobile.tech](https://crossmobile.tech).
