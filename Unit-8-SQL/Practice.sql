-- list all the Gamblers
select * from gambler;

-- list all the rows in the host table
select * from host;

--Show the name of each gambler and the casino name that hosts them
--
--gamble_name if in the gambler table
--casino_name is in the host table
--When you need data from more than one table you have to find out what connects them
-- the id of the gambler connects the gambler to the host table
select gambler_name, casino_name
from gambler, host --tables have the data you need
where gambler.id = host.id --rows wanted in result
;

--
--Modern syntax
--
select gambler_name, casino_name
from gambler
inner join
host
on gambler.id = host.id
;