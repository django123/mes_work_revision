--Modifier la requête pour selectionner uniquement les noms et prénoms des clients (customer) 
-- dont le nom commence par la lettre 'W', triés par ordre alphabétique de noms puis de prénoms.
--N'afficher que les colonnes LASTNAME et FIRSTNAME dans cet ordre.
SELECT LASTNAME,FIRSTNAME
FROM customer
WHERE LASTNAME LIKE 'W%'
GROUP BY LASTNAME,FIRSTNAME;


--Modifier la requête pour fournir la liste du nombre de clients (customer) par ville (city). 
-- Seules les villes qui comptent deux clients ou plus doivent être sélectionnées.
--N'afficher que les colonnes CITY et CUSTOMER_COUNT dans cet ordre.

SELECT city,COUNT(customer.customer_id) AS CUSTOMER_COUNT
FROM customer
GROUP BY city
HAVING COUNT(customer.customer_id) > = 2;

-- Modifier la requête pour lister tous les produits (product) et leur catégorie associée (product_category)s'ils en ont une. 
--Dans le cas contraire, ne pas afficher de valeur (null) pour la catégorie.
--N'afficher que les colonnes PRODUCT_NAME et CATEGORY_NAME dans cet ordre.
1 -- SQL request(s) below
SELECT product.name as product_name, product_category.name as category_name
FROM product left join PRODUCT_CATEGORY on PRODUCT.product_category_id = PRODUCT_CATEGORY.product_category_id;

--Modifier la requête pour selectionner uniquement les clients ayant un code postal (zipcode) égal à
--75000 ou 34000 et ayant une date de naissance (birth_date) définie.
--N'afficher que colonnes LASTNAME et FIRSTNAME dans cet ordre.

SELECT LASTNAME, FIRSTNAME
FROM customer
WHERE zipcode = 75000 OR zipcode = 34000 AND birth_date IS NOT NULL

--On vous donne une table, Employees , dans laquelle chaque ligne représente un employé. Elle contient
--les champs suivants : ID (int) FirstName (varchar) LastName (varchar) NumYears (int)
--Satisfaction (float) Rédigez une requête qui renvoie les trois employés ayant le niveau de satisfaction le plus élevé.
--Votre requête doit afficher FirstName comme première colonne, LastName comme deuxième colonne et Satisfaction comme troisième colonne. 
--Retournez les lignes dutableau triées par ordre décroissant de satisfaction, avec les égalités triées par la deuxième colonne

SELECT FirstName, LastName,satisfaction
FROM Employees
ORDER BY FirstName,LastName,satisfaction
 
 --Modifier la requête pour selectionner uniquement les véhicules (vehicle) n'ayant aucune pièce(vehicle_part) associée.

 SELECT vehicle_id
 FROM vehicle
 INNER JOIN vehicle_part ON vehicle.vehicle_id = vehicle_part.rfid

--Modifier la requête ci-contre pour lister le nombre de produits (product) disponibles par catégorie de produits (product_category).
--On ne listera pas les catégories de produits ne contenant pas de produit.
--N'afficher que les colonnes CATEGORY_NAME (product_category.name) et PRODUCT_COUNT dans cet ordre.

select product_category.nom as category_name, count(product_category.product_category_id) as product_count
from product
inner join product_category
on product.product_category_id = product_category.product_category_id
group by category_name
having count(product_category.product_category_id) is not null 
--Modifier la requête pour fournir la liste du nombre de clients (customer) par ville (city). Seules les villes
--qui comptent deux clients ou plus doivent être sélectionnées.N'afficher que les colonnes CITY et CUSTOMER_COUNT dans cet ordre.
select  city, count(customer.customer_id) as customer_count
from customer
group by city
having count(customer.customer_id) >= 2
--Modifier la requête pour lister tous les produits (product) et leur catégorie associée (product_category)
--s'ils en ont une. Dans le cas contraire, ne pas afficher de valeur (null) pour la catégorie.
--N'afficher que les colonnes PRODUCT_NAME et CATEGORY_NAME dans cet ordre.
select product.nom as product_name, product_category.nom as category_name
from product
left join product_category on product.product_category_id = product_category.product_category_id

--Modifier la requête pour sélectionner uniquement les ids des clients (customer) ayant acheté au moins
--un produit dans la catégorie "Books" ou "Garden" (product_category). La sortie ne doit contenir aucun doublon et doit être triée par ordre croissant.

