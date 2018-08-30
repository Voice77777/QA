SELECT ci.countryName, ci.cityName,
pi.Name, pi.Surname, pi.isOccuped
FROM countryinfo AS ci 
JOIN peopleinfo AS pi
ON ci.city_id = pi.city_id AND pi.isOccuped='0'
WHERE ci.isCapital='1'
AND ci.countryName IN ('England', 'Spain');