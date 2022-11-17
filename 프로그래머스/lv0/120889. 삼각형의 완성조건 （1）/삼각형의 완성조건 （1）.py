def solution(sides):
    sides.sort()
    if sides[0] + sides[1] > sides[2]:
        return 1     # s
    return 2