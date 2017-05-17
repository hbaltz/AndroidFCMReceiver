# AndroidFCMReceiver

The minimal application to receive messages from a FCM server

## How make it works

All you have to do is : 
* Open the project on AndroidStudio
* Go in Tools/FireBase/Connect your app to Firebase 
* Follow the instructions

## Specification

* By default the application subscribes to the topic general (send message to /topics/general with your FCM server)
* His token is log in Android Monitor/logs if you want to send just a message to this application
* Display a notification with the title and the body defined using the Firebase's Notification
