# Write your MySQL query statement below
#used inner join as self join
WITH my_cte as(
    SELECT email, min(id) as id_to_keep
    FROM Person
    GROUP BY email
)
DELETE FROM Person
WHERE id not in(SELECT id_to_keep FROM my_cte);