SELECT DR_NAME,DR_ID,MCDP_CD,left(HIRE_YMD, 10) from DOCTOR
where MCDP_CD in ('CS', 'GS')
order by HIRE_YMD desc, DR_NAME