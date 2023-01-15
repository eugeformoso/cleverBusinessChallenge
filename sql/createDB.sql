DROP TABLE Registration;
DROP TABLE Employee;

CREATE TABLE Employee(
                         employee_id                     int8        not null,
                         first_name                      varchar     not null,
                         last_name                       varchar     not null,
                         gender                          varchar     not null,
                         constraint employee_pk PRIMARY KEY (employee_id)
);

CREATE TABLE Registration(
                             registration_id         serial      not null,
                             employee_id             int8        not null,
                             date                    date        not null,
                             register_type           varchar     not null,
                             business_location       varchar     not null,
                             constraint registration_pk PRIMARY KEY (registration_id),
                             constraint employee_fk FOREIGN KEY (employee_id) REFERENCES Employee(employee_id)
);

INSERT INTO Employee VALUES (1,'Marta','Perez','femenino');
INSERT INTO Employee VALUES (2,'Juan','Gomez','masculino');
INSERT INTO Employee VALUES (3,'Mario','Sosa','masculino');
INSERT INTO Employee VALUES (4,'Juana','Alaniz','femenino');
INSERT INTO Employee VALUES (5,'Florencia','Pena','femenino');
INSERT INTO Employee VALUES (6,'Jose','Aguero','masculino');
INSERT INTO Employee VALUES (7,'Pablo','Alaniz','masculino');
INSERT INTO Employee VALUES (8,'Matias','Vallejos','masculino');
INSERT INTO Employee VALUES (9,'Andrea','Gonzalez','femenino');
INSERT INTO Employee VALUES (10,'Josefina','Campos','femenino');

INSERT INTO Registration VALUES (1,1,'2022-4-15','ingreso','Argentina');
INSERT INTO Registration VALUES (2,1,'2022-4-16','egreso','Argentina');
INSERT INTO Registration VALUES (3,2,'2022-4-15','ingreso','Argentina');
INSERT INTO Registration VALUES (4,2,'2022-4-15','egreso','Argentina');
INSERT INTO Registration VALUES (5,2,'2022-5-15','ingreso','Argentina');
INSERT INTO Registration VALUES (6,2,'2022-5-15','egreso','Argentina');
INSERT INTO Registration VALUES (7,3,'2022-5-15','ingreso','Brasil');
INSERT INTO Registration VALUES (8,3,'2022-5-15','egreso','Brasil');
INSERT INTO Registration VALUES (9,4,'2022-5-16','ingreso','Brasil');
INSERT INTO Registration VALUES (10,4,'2022-5-17','egreso','Brasil');
INSERT INTO Registration VALUES (11,4,'2022-6-15','ingreso','Brasil');
INSERT INTO Registration VALUES (12,4,'2022-6-15','egreso','Brasil');
INSERT INTO Registration VALUES (13,5,'2022-5-15','ingreso','España');
INSERT INTO Registration VALUES (14,5,'2022-5-15','egreso','España');
INSERT INTO Registration VALUES (15,5,'2022-5-16','ingreso','España');
INSERT INTO Registration VALUES (16,5,'2022-5-17','egreso','España');
INSERT INTO Registration VALUES (17,6,'2022-6-16','ingreso','España');
INSERT INTO Registration VALUES (18,6,'2022-6-15','egreso','España');
INSERT INTO Registration VALUES (19,6,'2022-7-15','ingreso','España');
INSERT INTO Registration VALUES (20,6,'2022-7-15','egreso','España');
INSERT INTO Registration VALUES (21,7,'2022-6-15','ingreso','Argentina');
INSERT INTO Registration VALUES (22,7,'2022-6-15','egreso','Argentina');
INSERT INTO Registration VALUES (23,8,'2022-5-15','ingreso','Brasil');
INSERT INTO Registration VALUES (24,8,'2022-5-15','egreso','Brasil');
INSERT INTO Registration VALUES (25,9,'2022-5-16','ingreso','España');
INSERT INTO Registration VALUES (27,9,'2022-5-17','egreso','España');
INSERT INTO Registration VALUES (28,10,'2022-5-17','ingreso','España');
INSERT INTO Registration VALUES (29,10,'2022-5-17','egreso','España');
INSERT INTO Registration VALUES (30,10,'2022-5-18','ingreso','España');






























