insert into moeiwast_eiwatest_DB01.TEST01(INT_NUM,NAME_STR,DBL_NUM,CREATE_DATE)
 values(12345,'moriy@-morizo-kouichi',174.7,'2087/12/31');

select INT_NUM,NAME_STR,DBL_NUM,CREATE_DATE from moeiwast_eiwatest_DB01.TEST01 
order by CREATE_DATE;

update moeiwast_eiwatest_DB01.TEST01 set NAME_STR = 'moriy@-morizo-kou_1'
 where INT_NUM = 12345;

select INT_NUM,NAME_STR,DBL_NUM,CREATE_DATE from moeiwast_eiwatest_DB01.TEST01
 order by CREATE_DATE;

