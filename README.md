# papoteCar

Create a file src/main/resources/application.properties with this properties :
spring.datasource.url=jdbc:mariadb://{ip}:{port}/papotecar
spring.datasource.username=
spring.datasource.password=
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver


SQL :
DROP TABLE IF EXISTS pool;
DROP TABLE IF EXISTS step;
DROP TABLE IF EXISTS own;
DROP TABLE IF EXISTS message;
DROP TABLE IF EXISTS car;
DROP TABLE IF EXISTS ride;
DROP TABLE IF EXISTS user;

CREATE TABLE User
(
        id_user Int NOT NULL
        AUTO_INCREMENT ,
        email     Varchar
        (50) NOT NULL ,
        password  Varchar
        (255) NOT NULL ,
        lastname  Varchar
        (50) NOT NULL ,
        firstname Varchar
        (50) NOT NULL ,
        birthdate Datetime NOT NULL ,
        gender    Varchar
        (50) NOT NULL
	,CONSTRAINT User_PK PRIMARY KEY
        (id_user)
);


        CREATE TABLE Ride
        (
                id_ride Int
                        NOT NULL
                AUTO_INCREMENT ,
        state       Varchar
                (50) NOT NULL ,
        description Blob NOT NULL ,
        place       Int NOT NULL ,
        price       Int NOT NULL ,
        id_user     Int NOT NULL
	,CONSTRAINT Ride_PK PRIMARY KEY
                (id_ride)

	,CONSTRAINT Ride_User_FK FOREIGN KEY
                (id_user) REFERENCES User
                (id_user)
);



                CREATE TABLE Step
                (
                        id_step Int
                                NOT NULL
                        AUTO_INCREMENT ,
        city     Varchar
                        (100) NOT NULL ,
        stepDate Datetime NOT NULL ,
        id_ride  Int NOT NULL
	,CONSTRAINT Step_PK PRIMARY KEY
                        (id_step)

	,CONSTRAINT Step_Ride_FK FOREIGN KEY
                        (id_ride) REFERENCES Ride
                        (id_ride)
);



                        CREATE TABLE Car
                        (
                                id_car Int
                                        NOT NULL
                                AUTO_INCREMENT,
        place      Int NOT NULL ,
        color      Varchar
                                (50) NOT NULL ,
        model      Varchar
                                (50) NOT NULL ,
        urlPicture Varchar
                                (50) NOT NULL ,
        id_user    Int NOT NULL
	,CONSTRAINT Car_PK PRIMARY KEY
                                (id_car)

	,CONSTRAINT Car_User_FK FOREIGN KEY
                                (id_user) REFERENCES User
                                (id_user)
);

                                CREATE TABLE Message
                                (
                                        id_message Int
                                                NOT NULL
                                        AUTO_INCREMENT,
        content     Blob NOT NULL ,
        dateMessage Datetime NOT NULL
	,CONSTRAINT Message_PK PRIMARY KEY
                                        (id_message)
);

                                        CREATE TABLE pool
                                        (
                                                id_ride Int NOT NULL ,
                                                id_user Int NOT NULL
	,
                                                CONSTRAINT pool_PK PRIMARY KEY (id_ride,id_user)

	,
                                                CONSTRAINT pool_Ride_FK FOREIGN KEY (id_ride) REFERENCES Ride(id_ride)
	,
                                                CONSTRAINT pool_User0_FK FOREIGN KEY (id_user) REFERENCES User(id_user)
                                        );

                                        CREATE TABLE own
                                        (
                                                id_message Int NOT NULL ,
                                                id_ride Int NOT NULL ,
                                                id_user Int NOT NULL
	,
                                                CONSTRAINT own_PK PRIMARY KEY (id_message,id_ride,id_user)

	,
                                                CONSTRAINT own_Message_FK FOREIGN KEY (id_message) REFERENCES Message(id_message)
	,
                                                CONSTRAINT own_Ride0_FK FOREIGN KEY (id_ride) REFERENCES Ride(id_ride)
	,
                                                CONSTRAINT own_User1_FK FOREIGN KEY (id_user) REFERENCES User(id_user)
                                        );

                                        INSERT INTO user
                                                (email, password, lastname, firstname, birthdate, gender)
                                        VALUES
                                                ("pierre@mail.com", SHA1('pass'), "conord", "pierre", "1990-11-26", "M"),
                                                ("azer@mail.com", SHA1('azer'), "azer", "azer", "1990-11-26", "M"),
                                                ("qsdf@mail.com", SHA1('qsdf'), "qsdf", "qsdf", "1990-11-26", "M");

                                        INSERT INTO ride
                                                (state, description, place, price, id_user)
                                        VALUES
                                                ("SEARCH", "Lot of fun", 3, 3500, 1),
                                                ("FULL", "Lot of fun", 2, 3400, 1),
                                                ("END", "Lot of fun", 4, 1500, 1);
DROP TABLE IF EXISTS pool;
DROP TABLE IF EXISTS step;
DROP TABLE IF EXISTS own;
DROP TABLE IF EXISTS message;
DROP TABLE IF EXISTS car;
DROP TABLE IF EXISTS ride;
DROP TABLE IF EXISTS user;

CREATE TABLE User
(
        id_user Int NOT NULL
        AUTO_INCREMENT ,
        email     Varchar
        (50) NOT NULL ,
        password  Varchar
        (255) NOT NULL ,
        lastname  Varchar
        (50) NOT NULL ,
        firstname Varchar
        (50) NOT NULL ,
        birthdate Datetime NOT NULL ,
        gender    Varchar
        (50) NOT NULL
	,CONSTRAINT User_PK PRIMARY KEY
        (id_user)
);


        CREATE TABLE Ride
        (
                id_ride Int
                        NOT NULL
                AUTO_INCREMENT ,
        state       Varchar
                (50) NOT NULL ,
        description Blob NOT NULL ,
        place       Int NOT NULL ,
        price       Int NOT NULL ,
        id_user     Int NOT NULL
	,CONSTRAINT Ride_PK PRIMARY KEY
                (id_ride)

	,CONSTRAINT Ride_User_FK FOREIGN KEY
                (id_user) REFERENCES User
                (id_user)
);



                CREATE TABLE Step
                (
                        id_step Int
                                NOT NULL
                        AUTO_INCREMENT ,
        city     Varchar
                        (100) NOT NULL ,
        stepDate Datetime NOT NULL ,
        id_ride  Int NOT NULL
	,CONSTRAINT Step_PK PRIMARY KEY
                        (id_step)

	,CONSTRAINT Step_Ride_FK FOREIGN KEY
                        (id_ride) REFERENCES Ride
                        (id_ride)
);



                        CREATE TABLE Car
                        (
                                id_car Int
                                        NOT NULL
                                AUTO_INCREMENT,
        place      Int NOT NULL ,
        color      Varchar
                                (50) NOT NULL ,
        model      Varchar
                                (50) NOT NULL ,
        urlPicture Varchar
                                (50) NOT NULL ,
        id_user    Int NOT NULL
	,CONSTRAINT Car_PK PRIMARY KEY
                                (id_car)

	,CONSTRAINT Car_User_FK FOREIGN KEY
                                (id_user) REFERENCES User
                                (id_user)
);

                                CREATE TABLE Message
                                (
                                        id_message Int
                                                NOT NULL
                                        AUTO_INCREMENT,
        content     Blob NOT NULL ,
        dateMessage Datetime NOT NULL
	,CONSTRAINT Message_PK PRIMARY KEY
                                        (id_message)
);

                                        CREATE TABLE pool
                                        (
                                                id_ride Int NOT NULL ,
                                                id_user Int NOT NULL
	,
                                                CONSTRAINT pool_PK PRIMARY KEY (id_ride,id_user)

	,
                                                CONSTRAINT pool_Ride_FK FOREIGN KEY (id_ride) REFERENCES Ride(id_ride)
	,
                                                CONSTRAINT pool_User0_FK FOREIGN KEY (id_user) REFERENCES User(id_user)
                                        );

                                        CREATE TABLE own
                                        (
                                                id_message Int NOT NULL ,
                                                id_ride Int NOT NULL ,
                                                id_user Int NOT NULL
	,
                                                CONSTRAINT own_PK PRIMARY KEY (id_message,id_ride,id_user)

	,
                                                CONSTRAINT own_Message_FK FOREIGN KEY (id_message) REFERENCES Message(id_message)
	,
                                                CONSTRAINT own_Ride0_FK FOREIGN KEY (id_ride) REFERENCES Ride(id_ride)
	,
                                                CONSTRAINT own_User1_FK FOREIGN KEY (id_user) REFERENCES User(id_user)
                                        );

                                        INSERT INTO user
                                                (email, password, lastname, firstname, birthdate, gender)
                                        VALUES
                                                ("pierre@mail.com", SHA1('pass'), "conord", "pierre", "1990-11-26", "M"),
                                                ("azer@mail.com", SHA1('azer'), "azer", "azer", "1990-11-26", "M"),
                                                ("qsdf@mail.com", SHA1('qsdf'), "qsdf", "qsdf", "1990-11-26", "M");

                                        INSERT INTO ride
                                                (state, description, place, price, id_user)
                                        VALUES
                                                ("SEARCH", "Lot of fun", 3, 3500, 1),
                                                ("FULL", "Lot of fun", 2, 3400, 1),
                                                ("END", "Lot of fun", 4, 1500, 1);

