# Write your MySQL query statement below
UPDATE Salary
SET sex  = case sex
when 'f' then 'm'
else 'f'
end;
