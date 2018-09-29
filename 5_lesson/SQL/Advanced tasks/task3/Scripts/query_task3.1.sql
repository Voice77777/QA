select * from project
left join assign
using (p_id)
where e_id is null;