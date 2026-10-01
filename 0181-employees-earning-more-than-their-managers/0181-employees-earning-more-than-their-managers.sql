# Write your MySQL query statement below
select e.name as Employee
FROM Employee e JOIN Employee m 
ON e.managerID = m.id
WHERE e.salary > m.salary;