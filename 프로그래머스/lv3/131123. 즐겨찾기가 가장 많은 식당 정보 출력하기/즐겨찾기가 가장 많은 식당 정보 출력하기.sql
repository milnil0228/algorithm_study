SELECT ri.FOOD_TYPE,ri.REST_ID,ri.REST_NAME,ri.FAVORITES
FROM (select food_type, max(favorites) as max -- 음식 종류별 가장 높은 좋아요 수
     from REST_INFO
     group by food_type) sub
inner join rest_info ri
     on sub.food_type = ri.food_type -- 음식 종류 매칭
     and sub.max = ri.favorites -- subquery에서 찾은 가장 높은 좋아요 매칭
GROUP BY ri.FOOD_TYPE
ORDER BY ri.FOOD_TYPE DESC

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