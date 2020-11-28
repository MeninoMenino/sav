INSERT INTO state VALUES(1, "Pernambuco", "PE"); #ID 1 = PE
INSERT INTO state VALUES(2, "São Paulo", "SP"); #ID 2 = SP
INSERT INTO state VALUES(3, "Rio de Janeiro", "RJ"); #ID 3 = RJ

INSERT INTO county VALUES(1, 1, "Recife"); #ID 1
INSERT INTO county VALUES(2, 1, "Olinda"); #ID 2
INSERT INTO county VALUES(3, 2, "São Paulo"); #ID 3
INSERT INTO county VALUES(4, 2, "Guarulhos"); #ID 4
INSERT INTO county VALUES(5, 3, "Rio de Janeiro"); #ID 5
INSERT INTO county VALUES(6, 3, "Niterói"); #ID 6

INSERT INTO ballot_box_quantity VALUES(1, 100, 1); #Recife
INSERT INTO ballot_box_quantity VALUES(2, 100, 2); #Olinda
INSERT INTO ballot_box_quantity VALUES(3, 100, 3); #São Paulo
INSERT INTO ballot_box_quantity VALUES(4, 100, 4); #Guarulhos
INSERT INTO ballot_box_quantity VALUES(5, 100, 5); #Rio de Janeiro
INSERT INTO ballot_box_quantity VALUES(6, 100, 6); #Niterói

INSERT INTO role VALUES(1, 1); #ID 1 = Prefeito
INSERT INTO role VALUES(2, 2); #ID 2 = Vereador

#_-------------------------------------------------------

#Prefeitos e vereadores de Recife
INSERT INTO candidate VALUES(1, 1, 1, "João Campos"); #ID 1
INSERT INTO candidate VALUES(2, 1, 1, "Marília Arraes"); #ID 2
INSERT INTO candidate VALUES(3, 2, 1, "Fulano Vereador Recife"); #ID 3
INSERT INTO candidate VALUES(4, 2, 1, "Ciclano Vereador Recife"); #ID 4

#Prefeitos e vereadores de Olinda
INSERT INTO candidate VALUES(5, 1, 2, "Professor Lupércio"); #ID 5
INSERT INTO candidate VALUES(6, 1, 2, "João Paulo"); #ID 6
INSERT INTO candidate VALUES(7, 2, 2, "Fulano Vereador Olinda"); #ID 7
INSERT INTO candidate VALUES(8, 2, 2, "Ciclano Vereador Olinda");  #ID 8

#Prefeitos e vereadores de São Paulo
INSERT INTO candidate VALUES(9, 1, 3, "Bruno Covas");  #ID 9
INSERT INTO candidate VALUES(10, 1, 3, "Guilherme Boulos"); #ID 10
INSERT INTO candidate VALUES(11, 2, 3, "Fulano Vereador SP"); #ID 11
INSERT INTO candidate VALUES(12, 2, 3, "Ciclano Vereador SP"); #ID 12

#Prefeitos e vereadores de Guarulhos
INSERT INTO candidate VALUES(13, 1, 4, "Guti"); #ID 13
INSERT INTO candidate VALUES(14, 1, 4, "Elói Pietá"); #ID 14
INSERT INTO candidate VALUES(15, 2, 4, "Fulano Vereador Guarulhos"); #ID 15
INSERT INTO candidate VALUES(16, 2, 4, "Ciclano Vereador Guarulhos"); #ID 16

#Prefeitos e vereadores do Rio de Janeiro
INSERT INTO candidate VALUES(17, 1, 5, "Eduardo Paes"); #ID 17
INSERT INTO candidate VALUES(18, 1, 5, "Marcelo Crivella"); #ID 18
INSERT INTO candidate VALUES(19, 2, 5, "Fulano Vereador RJ"); #ID 19
INSERT INTO candidate VALUES(20, 2, 5, "Ciclano Vereador RJ"); #ID 20

#Prefeitos e vereadores de Niterói
INSERT INTO candidate VALUES(21, 1, 6, "Axel Grael"); #ID 21
INSERT INTO candidate VALUES(22, 1, 6, "Flávio Serafini"); #ID 22
INSERT INTO candidate VALUES(23, 2, 6, "Fulano Vereador Niterói"); #ID 23
INSERT INTO candidate VALUES(24, 2, 6, "Ciclano Vereador Niterói"); #ID 24