# fight-corona-app
try to fight corona with technology

# setup
you need some local.properties file with following content (not in version control):

sdk.dir=/path/to/Android/Sdk

## german description

Die Idee ist relativ einfach (1. Ausbaustufe):

### Vorbereitung

* Jeder Nutzer bekommt eine eindeutige ID (UUID).
* Für geschlossene Räume (Lokal, U-Bahn-Wagen, etc) kann eine eindeutige ID erstellt
werden und als QR-Code im Raum ausgehangen werden. Beim erstellen kann für diese ID
eine Beschreibung hinterlegt werden.

### Erfassung

* Die eigene ID wird als QR-Code auf dem Handy angezeigt.
* Hat man Kontakt mit einer anderen Person, scannt man den QR-Code des anderen und
ein Datensatz den IDs der Nutzer + Zeitstempel wird in eine Datenbank geschrieben.
* Betritt man einen Raum, scannt man den QR-Code des Raums und ein Datensatz mit
Nutzer-ID und Raum-ID wird in eine Datenbank geschrieben.
* Bei einem Kontakt (Raum oder Person) kann man Namen/Beschreibungen vergeben, die
NICHT in der Datenbank abgelegt werden.

### Anwendung:
* Wird der Nutzer krank oder zum Verdachtsfall, meldet er das über die App.
* Nach noch festzulegenden Regeln können nun andere Nutzer darüber informiert werden,
welcher Kontakt krank oder zum Verdachtsfall wurde und sich um einen Test bemühen.

### 2. Ausbaustufe:
* Wenn zum Nutzer noch die Telefonnummer erfasst wird (Datenschutz?) ist es möglich,
die neuen Verdachtsfälle/Krankheitsfälle an das Gesundheitsamt oder andere geeignete
Stellen zu melden.

### 3. Ausbaustufe:
* Rückmeldung an den Nutzer, wenn er zu viele Sozialkontakte / zu häufige Sozialkontakte
pflegt.
