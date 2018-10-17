SELECT COUNT(pi.Surname) AS result
FROM countryinfo AS ci 
JOIN peopleinfo AS pi
ON ci.city_id = pi.city_id AND ci.isCapital='0'
WHERE pi.isOccuped='1' 
AND ci.countryName IN ('Ukraine', 'Poland')
AND NOT ci.Population<10000 AND ci.Population>50000
OR ci.Population<500000 AND ci.Population>1000000
