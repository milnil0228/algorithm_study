SELECT MEMBER_ID,MEMBER_NAME,GENDER, date_format(DATE_OF_BIRTH, '%Y-%m-%d') from member_profile
where month(date_of_birth) = 3 and gender = 'W' and tlno is not null
order by MEMBER_ID