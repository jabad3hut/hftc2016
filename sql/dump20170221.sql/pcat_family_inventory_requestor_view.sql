create view family_inventory_requestor_view
as  
select "fi"."id" AS "id","fi"."family_id" AS "family_id","fi"."inventory_id" AS "inventory_id","fi"."quantity" AS "quantity",
"fi"."requested_date" AS "requested_date","fi"."status" AS "status","fi"."requestor_id" AS "requestor_id",
concat("us"."firstname",' ',"us"."lastname") AS "requestor","inv"."product_name" AS "product_name",
"inv"."location" AS "location" 
from family_inventory fi inner join "user_info" us on fi.requestor_id = us.id 
inner join inventory inv on fi.inventory_id = inv.id
where lower(fi.status) = 'pending';
