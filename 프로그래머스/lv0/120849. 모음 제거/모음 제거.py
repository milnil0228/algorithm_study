def solution(my_string):
    vowels = "aeiou"
    for vow in vowels:
        my_string = my_string.replace(vow, "")
            
    return my_string