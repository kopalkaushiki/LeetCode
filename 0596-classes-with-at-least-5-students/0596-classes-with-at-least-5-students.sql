# Write your MySQL query statement below
SELECT class
from courses
GROUP BY class 
HAVING COUNT(class)>=5;
