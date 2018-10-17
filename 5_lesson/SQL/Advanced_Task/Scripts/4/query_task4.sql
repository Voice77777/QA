select t.ClientID
from (select distinct ClientID, RegionID from task4) as t
group by t.ClientID
having count(t.ClientID)=1