# Write your MySQL query statement below
UPDATE Salary
SET sex  = case sex
when 'f' then 'm'
when 'm' then 'f'
end
WHERE sex in ('m' , 'f');
