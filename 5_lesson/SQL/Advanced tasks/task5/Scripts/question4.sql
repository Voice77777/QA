select EmpName, DOB as Age, DeptName
from empa
join deptb
using (DeptID)
order by Age DESC;