hello-scaloid-android-annotations-maven-proguard
================================================

A combo project combining: scaloid, android annotations, maven and proguard.

Proguard configuration file: /proguard.cfg

In order to run the project correctly you need to configure the project to run scaloid.

1. Run mvn clean; mvn package -Prelease
2. Configure IntelliJ 13 to run with SCALA
3. Configure IntelliJ to compile Android Annotations

Configure IDE:

http://kosiara87.blogspot.com/2014/02/intellij-13-scaloid-maven-3.html
http://kosiara87.blogspot.com/2014/02/intellij-13-proguard-android.html

To compile from maven use:
mvn clean
mvn package -Prelease -f pom_javaOnly.xml
mvn package -Prelease
