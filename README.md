hello-scaloid-android-annotations-maven-proguard
================================================

A combo project combining: <b>scaloid, android annotations, maven and proguard. </b>

<b>Proguard</b> configuration file: /proguard.cfg

In order to <b>run</b> the project correctly you need to: 

1. Configure IntelliJ 13 to run with SCALA
2. Configure IntelliJ to compile Android Annotations
3. How-to on compiling from maven is attached below

<b>IDE configuration: </b>

http://kosiara87.blogspot.com/2014/02/intellij-13-scaloid-maven-3.html
http://kosiara87.blogspot.com/2014/02/intellij-13-proguard-android.html

To compile <b>from maven</b> use: <br/>
mvn clean <br/>
mvn package -f pom_javaOnly.xml <br/>
mvn package 


To compile from maven with apk signing with certificate use: <br/>
mvn clean <br/>
mvn package -Prelease -f pom_javaOnly.xml <br/>
mvn package -Prelease <br/><br/>
Remember to add your keys in ".keystore" directory inside the root directory of the project.

Project contains:
- main start Activity written in SCALA
- second activity written in SCALA which uses Java classes (example of JAVA & SCALA integration)
- third activity is written in Java and uses Android Annotations
- all in obsfuscated & profiled with ProGuard
- project compiles from maven
