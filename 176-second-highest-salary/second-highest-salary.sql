# Write your MySQL query statement below
Select Max(salary) as SecondHighestSalary from Employee where salary not in(Select Max(salary) from Employee)