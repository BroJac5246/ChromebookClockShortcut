This is a simple app that shows up as Google Clock in a Chromebook's launcher and, when opened, launches Google Clock. Google Clock is otherwise only accessible via Google Assistant, the Play Store (clicking the "Open" button), Settings, an activity launcher app, etc. — in other words, this is the most convenient way to open Google Clock.

![Screenshot 2024-04-21 19 55 00](https://github.com/BroJac5246/ChromebookClockShortcut/assets/104146239/64f80151-ef16-444d-81f5-a76bf677edc3)

> A Chromebook launcher with this app installed`

# Installing
I don't have a Google Developer Profile, and even if I did, I don't know if this would be accepted to the Play Store. As such, it will need to be sideloaded.

## Acquiring the APK
There are two ways to get the .apk file needed for installing the app
1. Download the unsigned debug APK it from the Releases tab
2. Import this code to Android Studio and manually build it. I won't provide instructions for this but it's not too hard if you know what you're doing.

## Installing the APK
There are two ways to install the APK:
1. Use the package installer to install it the same way as you would on a regular Android device. This is not recommended because it requires Developer Mode.
2. Sideload it using ADB. Check out XDA's guide [here](https://www.xda-developers.com/how-sideload-apps-chromebook/#:~:text=How%20to%20sideload%20apps%20to%20a%20Chromebook%20via%20ADB). However, be warned that it will show a warning on your lock screen that reads "This device may contain apps that haven't been verified by Google." You can absolutely ignore it, and it will go away with a powerwash (factory reset). There are no ill effects to using this method (I do this one, too)

# Contributing
If you want to contribute, feel free to make a pull request. However, be aware that I am new to Kotlin so you'll have to stick with me 😂

# Supporting
If you like this, the best way you can help is by starring it (you'll make my day!). You can also contribute if you know Kotlin, or you create an issue to file a suggestion!
