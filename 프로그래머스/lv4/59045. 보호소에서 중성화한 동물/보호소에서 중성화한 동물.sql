SELECT animal_id, animal_type, name
from animal_ins i
where sex_upon_intake like 'intact%' and
      animal_id in (select animal_id
                    from animal_outs
                    where sex_upon_outcome like 'Spayed%'
                       or sex_upon_outcome like 'Neutered%')
order by animal_id