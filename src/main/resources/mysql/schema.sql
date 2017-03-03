CREATE DATABASE if NOT EXISTS databasemua;

INSERT INTO `grupa_uzytkownikow`(`id_grupy_uzytkownika`, `nazwa`) VALUES (1,'nazwaGrupy pierwszej');
INSERT INTO `grupa_uzytkownikow`(`id_grupy_uzytkownika`, `nazwa`) VALUES (2,'nazwaGrupy drugiej');
INSERT INTO `uzytkownik`(`id_uzytkownika`, `data_urodzenia`, `imie`, `nazwisko`, `nazwa`, `id_grupy_uzytkownika`) VALUES (1,'2017-02-16 11:13:06','imieWartosc','nazwiskoWartosc','Login', '1');
INSERT INTO `uzytkownik`(`id_uzytkownika`, `data_urodzenia`, `imie`, `nazwisko`, `nazwa`, `id_grupy_uzytkownika`) VALUES (2,'2017-02-16 11:13:06','dddd','fd','Logissn', '1');
INSERT INTO `uzytkownik`(`id_uzytkownika`, `data_urodzenia`, `imie`, `nazwisko`, `nazwa`, `id_grupy_uzytkownika`) VALUES (3,'2017-02-16 11:13:06','asasdfdasdfd','fdadsasd','Logiasdasdssn', '2');