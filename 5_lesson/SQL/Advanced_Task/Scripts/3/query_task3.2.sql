select * from empl
right join assign
using (e_id)
where Salary<1000;