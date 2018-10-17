select e.EmpName, m.EmpName as MgrName, d.DeptName
from empa as e
left join empa as m
on e.MgrID=m.EmpID
join deptb as d
on d.DeptID=e.DeptID and d.DeptID=dev.DeptID
and d.DeptID=it.DeptID
order by 2;