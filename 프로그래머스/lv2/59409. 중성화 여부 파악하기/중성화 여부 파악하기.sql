SELECT animal_id,
       name,
       case sex_upon_intake
            when 'Neutered Male' then 'O'
            when 'Spayed Female' then 'O'
        else 'X'
        end
       from animal_ins
order by animal_id