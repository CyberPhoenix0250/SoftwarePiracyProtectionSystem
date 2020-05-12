<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Software Piracy Protection System</title>
  <h1><center>Software Piracy Protection System</center></h1>
</head>
<body>
<h3><u>Introduction</u></h3>
<p>
  The project is intended to stop the piracy of software application. A methodology is embedded in
  the software application, which can protects any software from piracy. This methodology includes
  using of authentication server for license key authorization and registration of license key with
  corresponding MAC address. The methodology utilizes authentication server checks and
  registers the MAC address of the user. This methodology works well even in the offline mode and does not
  allow any counterfeit(fake) copy of the software application to run on any other computer. Authentication
  and registration of software application is done only during the installation of software
  application. Once the installation is successful then the MAC address is used for offline authentication,
  so its copy cannot run on any other computer.
</p>
<h3><u>How it Works</u></h3>
<p>
The proposed methodology can be embedded into any software application in order to prevent it from
piracy, it works in the following way:-<br>
  
During the installation, setup requires an active internet connection for successful completion of
installation of software.
When the genuine license key is entered into software application. The license
key is feeded to the authentication program and subsequently the key is again fed to the MD5 hash function for the
encryption of key to protect license key over the internet. After encryption the encrypted hash is returned to Software application and then the application transmits the hash to authentication server and from there it goes to the API and
API looks for the Hash (received from the client) in database. The Server consist of a
database which keeps the list of all valid license Keys and their corresponding MD5 hash, moreover
these License keys are associated with a MAC address of user, who wants to register their
genuine copy of the software application, therefore there are 2 Scenario :-
</p>
<p>
<b>Scenario 1</b>: The license key received by API from Client PC is present in the database, but
there is a MAC address already registered with it. This means that the license key has already been
registered to a PC and the MAC address belongs to that PC in which it is registered. Therefore, the
API will not allow client’s application to register. Hence if the registration fails, the installation also fails.
<center><img alt="Scenario 1" src="res/TypeA.jpg"></center>
</p>


<p>
<b>Scenario 2</b>: The license key received by the API from the client PC is not present in database
and it means that the license key is fake.<br> <b>Note :</b> The genuine and valid license key are present in the server.
<center><img alt="Scenario 2" src="res/TypeB.jpg"></center>
</p>

<p>
  <b>General Working</b>: The license key received by the API from the client PC is present in the database and
  there is no MAC address associated with it. It means the license key received has never been
  registered and it’s a genuine registration which should be allowed, and API asks the client
  application to send its MAC address to register in the database to avoid duplicate registration.
  <center><img alt="Scenario 3" src="res/Online.jpg"></center>
</p>

<p>
  <b>Offline Mode</b>: Now the software application is successfully installed, now internet connection is not required for the
  software to start, here the question arises that if anybody copied the installed software application
  and tried to run it on any other computer, then technically it should run on that pc because it has already
  been registered on the server, and now there is no restrictions left. Still the software application will run
  only on that system in which it was registered because every time the software boots up, the MAC
  address registered into the software application at the time of installation is checked with the current
  system’s MAC address. Therefore running that application on any other system will not work since
  every system have a unique MAC address.
  <center><img alt="Scenario 3" src="res/Offline.jpg"></center>
</p>

<h3><u>Quick Glance</u></h3>
<center>
<video width="1024" height="720" controls preload> 
  <source src="res/Softwarepiracy-1.webm"></source> 
</video>
</center>
</body>
</html>
