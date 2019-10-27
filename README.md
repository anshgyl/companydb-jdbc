# Accessing companydb using JDBC

## Running the project:
* ``` git clone https://github.com/anshgyl/companydb-jdbc.git ```
* Import to your IDE
* Update the file ``` resources/config.properties ``` with your MySQL username and password

## You laptop should have the following installed:
   
* JDK (Preferably JDK 8, but any newer version would also do)
* Maven
* MySQL Server (must work without sudo) with CompanyDB imported
* An IDE (Preferably IntelliJ IDEA, but Eclipse EE or any other IDE would also do)

## Installation Guide for Ubuntu:
```
$ sudo apt update
$ sudo apt install openjdk-8-jdk
$ sudo apt install maven
```

IntelliJ Ultimate Student Licence can be procured using your college email ids from https://www.jetbrains.com/student/
After creating and verifying the id, you'll get a download link.

Eclipse Installer can be downloaded from https://www.eclipse.org/downloads/packages/installer
After extracting the zip file run eclipse-inst and select Eclipse IDE for Enterprise Java Developers

## Importing companydb
```
$ mysql -u <username> -p
mysql> source resources/companydb.sql
```