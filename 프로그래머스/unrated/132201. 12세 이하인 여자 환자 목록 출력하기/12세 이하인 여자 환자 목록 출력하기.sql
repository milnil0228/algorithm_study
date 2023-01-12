SELECT PT_NAME,PT_NO,GEND_CD,AGE, coalesce(TLNO, 'NONE') from patient
where age <= 12 and gend_cd = 'W'
order by age desc, pt_name