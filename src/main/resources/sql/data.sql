INSERT INTO christiansoe.tourguide (id, username, password)
values ('1', 'Hans Ole', '1234'),
('2', 'Charlotte', '1234'),
('3', 'Louise', '1234');

INSERT INTO christiansoe.tour_type (id, type, season)
values ('1', 'History', 'Any'), 
('2', 'Plants', 'Spring'),
('3', 'Birds', 'Summer'),
('4', 'Seal & Sea', 'Any');

INSERT INTO christiansoe.exercise (id, name, description, duration)
values ('1', 'History Quiz', 'A quiz about history of the island', '10'),
('2', 'Plant Quiz', 'A quiz about the plants seen the island', '20'),
('3', 'Birds Quiz', 'A quiz about history of the island', '30'),
('4', 'Seal & Sea Quiz', 'A quiz about the wildlife in the sea around the island', '60');

INSERT INTO christiansoe.file (id, name, timestamp, type)
values ('1','file1','2021-12-09','4');

INSERT INTO christiansoe.tour (id, name, type_id, duration, exercise_id, tourguide_id, file_id)
values ('1','Bombs, gunpowder and bullets','1','120','1','1','1'),
 ('2','Life on Christiansø','1','45','1','1','1'),
 ('3','The Natural tour','2','60','2','2','1'),
 ('4','The breeding birds','3','60','3','3','1'),
 ('5','Seal & Sea','4','120','4','2','1'),
 ('6','Tours tailored to your specific interests','1','240','1','1','1');