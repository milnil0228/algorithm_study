SELECT main.FOOD_TYPE,main.REST_ID,main.REST_NAME,main.FAVORITES
      FROM (select food_type, max(favorites) as max from REST_INFO group by food_type) sub
      inner join rest_info main on sub.food_type = main.food_type and sub.max = main.favorites
GROUP BY FOOD_TYPE
ORDER BY FOOD_TYPE DESC

# SELECT *
# FROM (SELECT FOOD_TYPE,REST_ID,REST_NAME,FAVORITES
#      FROM REST_INFO
#      ORDER BY FAVORITES DESC
#      LIMIT 112345) SUB
# GROUP BY FOOD_TYPE
# ORDER BY FOOD_TYPE DESC

# SELECT 
# r.FOOD_TYPE,
# r.REST_ID,
# r.REST_NAME,
# r.FAVORITES
# FROM (
#     select FOOD_TYPE, MAX(FAVORITES) AS maxfv
#     from REST_INFO group by FOOD_TYPE
# )  AS X
# inner join REST_INFO as r 
# ON r.FOOD_TYPE = x.FOOD_TYPE and r.FAVORITES = x.maxfv
# ORDER BY FOOD_TYPE DESC ;