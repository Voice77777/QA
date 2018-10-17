CREATE TABLE `assign` (
  `p_id` int(11) NOT NULL,
  `e_id` int(11) NOT NULL,
  PRIMARY KEY (`p_id`,`e_id`),
  KEY `e_fk_idx` (`e_id`),
  CONSTRAINT `e_fk` FOREIGN KEY (`e_id`) REFERENCES `empl` (`e_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `p_fk` FOREIGN KEY (`p_id`) REFERENCES `project` (`p_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8