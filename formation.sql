select * from contact where date_de_naissance::text like '%08%' and age >= 16 and sexe = 'M'

select
('2019-04-10'::date, '2019-02-19'::date)
overlaps
('2019-04-15'::date, '2019-02-14'::date)

select *from generate_series(5,1,-2)
--fonction d'aggregat MIN MAX AVG COUNT SUM

select max(nom) from contact 

select count(*) from contact where date_de_naissance is not null

select count(distinct prenom) from contact

select sum(age) from contact where sexe = 'F'

select count(*) as Total, sexe, date_de_naissance as Total from contact
where date_de_naissance::text like '%08%' and age >= 16 and sexe = 'F'
group by sexe, date_de_naissance

create table commande (NumeroDeCommand int, IDClient int)
create table client(nom varchar(50), prenom varchar(50), IDCLient int, adresse varchar(200), ville varchar(200))

insert into commande values
('3712',1),
('4567', 2),
('8868',3),
('3564', 4)

insert into client values
('Truillier','olivier', 1, '7 Rue poirier', 'Dreux'),
('Truillier','luc', 2, '78 avenue de paris ', 'Paris'),
('Truillier','theodore', 3, '15 rue amsterdam', 'Amsterdam'),
('Truillier','zinedine', 4, '7 Rue lavasier', 'Montreuil')

select * from commande

select * from client

select A.IDClient, B.nom, B.prenom from commande A
inner join client B
on A.IDClient = B.IDClient

select A.IDClient, B.nom, B.prenom from commande A
left join client B
on A.IDClient = B.IDClient

select * from client A
cross join commande B
