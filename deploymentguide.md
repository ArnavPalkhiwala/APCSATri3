# P2-Weasles DEPLOYMENT GUIDE

***

# Frequency
- Every Friday at 9 pm, The Deployment manager will git pull all the commits from the teammates.

- The only exception is right before a presentation or team grading day so the teacher and class will be able to access our latest version of our project from our website link.

# updating the rpi and deployment

- cd p1-DataPirates

- Sudo git pull

- If sudo git pull doesn't work, type in sudo git stash and then perform sudo git pull

- sudo mvn package

- java -jar nighthawk_csa/target/csa-0.0.1-SNAPSHOT.jar



## Setting Up the Java Web Application

***

<details>
<summary>Set up the Java Web Application</summary>
- make sure to type these commands in the pi terminal

    + Java is two pieces (JDK and JRE), both parts are needed in order to run and build
        + $ sudo apt update
        + $ sudo apt upgrade
    + Commands below will install java runtime environment
        + $ sudo apt install default-jre
        + $ java -version
    + These commands install the java development kit
        + $ sudo apt install default-jdk
        + $ javac -version
    + Commands bellow install maven
        + $ sudo apt update
        + $ sudo apt upgrade
        + $ sudo apt install maven
        + $ mvn -version
</details>

<details>
<summary>This is where we clone, build, and test our project in the pi terminal</summary>

    + Commands bellow install maven
        + $ sudo apt update
        + $ sudo apt upgrade
        + $ sudo apt install maven
        + $ mvn -version

    + Clone, build and test Java Web Application
        + $ cd
        + $ git https://github.com/ChiefGuap/p1-DataPirates.git
        + $ cd p1-DataPirates
        + $ sudo mvn package

- Test on localhost browser
+ $ sudo java -jar /home/pi/p1-DataPirates/target/p1-DataPirates-0.0.1-SNAPSHOT.jar
- localhost:8081
</details>

## Prepare Java Web Application for Internet access
<details>
<summary>Enable Nginx to retrieve Java Web Application on external request (Reverse Proxy)!</summary>

<code>
server { listen 80;
server_name csa.nighthawkcoders.cf; 
location / {proxy_pass http://localhost:8080;
}
}
</code>


## Port Forwarding/ Freedom Domain 

***
[more in-depth Port Forwarding/ Freenom Domain guide](https://docs.google.com/document/d/1V5rNx6chMuxRJuQa1g-LQkTK6S5RILFmSkFnxf5jhcc/edit?usp=sharing)

<details>
<summary>accessing and configuring your router</summary>

    + HOW to access router
        + Log into Router by searching up 192.168.1.1
        + enter username of router
        + enter password of router

    + How find port forwarding settings on router
        + Port forwarding page is found under:  Advanced>advanced setup> port forwarding/ port forwarding trigger
        +(May vary depending whether which Router you have)

    + HOW to configure your router
        + Set Service type/name to HTTP
        + External Port to 80
        + Internal port to 80
        + Internal IP address to raspberry pi address

           + (Hover over WiFi top right to get ip address or type command in terminal in pi for your Pi and set the home router to your pi)
</details>

<details>
<summary>Creating your freenom domain and configuring it</summary>

    + Make an Account on Freenom.com
        + (Picture)
    + Make sure to put .tk,  .ml, .ga, or .cf after your preferred Domain name for this to work
        + (picure)
    +  After choosing the domain, Purchase the domain for free for 12 months unless you want to pay for it
        + (Picture)
    + Configuring the Domain
        + Name= blank
        + Type = A
        + TTL = 300
        + Target = your public ip address
        + (Picture)

</details>



