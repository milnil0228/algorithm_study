SELECT p.PRODUCT_CODE, sum(p.price * s.sales_amount) as SALES
       from product p
 inner join offline_sale s
         on p.product_id = s.product_id
group by p.product_code
order by sales desc, 1