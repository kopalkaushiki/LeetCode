# Write your MySQL query statement below
SELECT Name as Customers
FROM Customers as c LEFT JOIN Orders as o 
ON c.id=o.customerId
WHERE o.ID is NULL;
