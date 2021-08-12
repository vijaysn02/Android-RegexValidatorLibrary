# Android Library Framework

## Introduction

* An Android library is structurally the same as an Android app module. It can include everything 
needed to build an app, including source code, resource files, and an Android manifest.
 
* However, instead of compiling into an APK that runs on a device, an Android library compiles into 
an Android Archive (AAR) file that you can use as a dependency for an Android app module.


---------------------------------------------------------------------------------------------------

## Creating the Android Library

* Inside your Android Studio, click File\New\NewModule… Select Android Library and hit Next.
  
* You will be at the Configure the new module step of the wizard. At this point, you are required 
 to provide a name for your library , module name, package name and minimum SDK. 
 

---------------------------------------------------------------------------------------------------

## Setup Android Library

* Add ext variables to the project’s(root) build.gradle file inside the already defined ext block, 
below the Project variables

```
    ext {
      // Project
      ..
    
      // ValidateTor Library Info
      libVersionCode = 1
      libVersionName = '1.0.0'
    }
```

Next, update your validatetor/build.gradle file to use the ext variables from 
project’s build.gradle file.

* Update compileSdkVersion and buildToolsVersion:

```
   compileSdkVersion rootProject.ext.compileSdkVersion
   buildToolsVersion rootProject.ext.buildToolsVersion
```

* Update minSdkVersion, targetSdkVersion, versionCode and versionName:

```
    minSdkVersion rootProject.ext.minSdkVersion
    targetSdkVersion rootProject.ext.targetSdkVersion
    versionCode rootProject.ext.libVersionCode
    versionName rootProject.ext.libVersionName
```

* Update the version field for the support library dependency:

```
    testImplementation "com.android.support:appcompat-v7:$supportLibVersion"
```

* Update version field for the junit dependency:

```
    testImplementation "junit:junit:$rootProject.ext.junitVersion"
```

---------------------------------------------------------------------------------------------------

## Include the Files for the Library

* Include all the files needed for the library by pasting the files or drag and dropping the files.

---------------------------------------------------------------------------------------------------

## Integrating the Android Library in your App

Open your app’s build.gradle file and add the following inside dependencies

```
    // added validatetor Android library module as a dependency
    implementation project(':validatetor')
```
Since the Gradle once and Start to use the Library features

---------------------------------------------------------------------------------------------------

Read the blog explaining the process of creating and integrating Android Library through here: https://vijaysn02.medium.com/creating-and-integrating-android-library-77d570ab65a5
