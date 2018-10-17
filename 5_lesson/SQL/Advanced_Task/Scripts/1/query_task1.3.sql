SELECT c.Name, o.Status
FROM customers AS c
JOIN orders AS o
ON c.CustomerID=o.CustomerID