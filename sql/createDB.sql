CREATE TABLE Type_Management(
    id                      int8        not null,
    code                    varchar     not null,
    value                   varchar     not null,
    constraint id_pk PRIMARY KEY (id)
);

CREATE TABLE Employee(
    employee_id             int8        not null,
    date                    date        not null,
    first_name              varchar     not null,
    last_name               varchar     not null,
    gender_id               int8        not null,
    register_type_id        int8        not null,
    business_location_id    int8        not null,
    constraint employee_pk PRIMARY KEY (employee_id),
    constraint employee_gender_fk FOREIGN KEY (gender_id) REFERENCES Type_Management (id),
    constraint employee_register_type_fk FOREIGN KEY (register_type_id)REFERENCES Type_Management (id),
    constraint employee_business_location_fk FOREIGN KEY (business_location_id) REFERENCES Type_Management (id)
);

INSERT INTO Type_Management VALUES ('1','gender','female');
INSERT INTO Type_Management VALUES ('2','gender','male');
INSERT INTO Type_Management VALUES ('3','register_type','income');
INSERT INTO Type_Management VALUES ('4','register_type','expenses');
INSERT INTO Type_Management VALUES ('5','business_location','Brasil');
INSERT INTO Type_Management VALUES ('6','business_location','Argentina');
INSERT INTO Type_Management VALUES ('7','business_location','España');

INSERT INTO Employee VALUES ('1','','Marta','Perez','15/4/2022','1','3','6');
INSERT INTO Employee VALUES ('2','','Marta','Perez','16/4/2022','1','4','6');
INSERT INTO Employee VALUES ('3','','Juan','Gomez','15/5/2022','2','3','7');
INSERT INTO Employee VALUES ('4','','Mario','Sosa','15/5/2022','2','3','7');
INSERT INTO Employee VALUES ('5','','Mario','Sosa','15/5/2022','2','4','7');
INSERT INTO Employee VALUES ('6','','Juan','Gomez','15/5/2022','2','4','7');
INSERT INTO Employee VALUES ('7','','Juana','Alaniz','15/6/2022','1','3','5');
INSERT INTO Employee VALUES ('8','','Juana','Alaniz','16/6/2022','1','4','5');
INSERT INTO Employee VALUES ('9','','Florencia','Pena','16/6/2022','1','3','5');
INSERT INTO Employee VALUES ('10','','Florencia','Pena','16/6/2022','1','4','5');
INSERT INTO Employee VALUES ('11','','Jose','Aguero','16/6/2022','2','3','5');
INSERT INTO Employee VALUES ('12','','Jose','Aguero','17/6/2022','2','4','5');






