SELECT cu.Name, o.OrderID, c.Name
FROM country AS c, customers AS cu, orders AS o
WHERE cu.CountryID=c.ID AND cu.CustomerID=o.CustomerID