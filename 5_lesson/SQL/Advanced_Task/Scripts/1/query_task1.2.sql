SELECT SUM(Price) AS TotalPrice, Status
FROM orders
GROUP BY Status
HAVING COUNT(Status)>1