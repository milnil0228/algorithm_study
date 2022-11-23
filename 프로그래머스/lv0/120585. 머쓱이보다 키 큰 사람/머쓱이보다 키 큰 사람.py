def solution(array, height):
    count = 0
    for t in array:
        if height < t:
            count += 1
    return count