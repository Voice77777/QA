select d.DeptName, count(em.EmpID) as NumberOfEmployees
from empa as em
join deptb as d
using(DeptID)
order by NumberOfEmployees;