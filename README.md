# DemoLib
 


How to
To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}


Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.talhaasif1992:DemoLib:1.5'
	}
 
 
 
 Use: 
 
 CarViewModel carViewModel;
 
 How to intialize:
 
 carViewModel = DaggerCarViewModelInjector.create().getCarViewModel().getCar();
 
 
 For Open AC App:
 
 DemoActivity.OpenAc(getApplicationContext());
   
