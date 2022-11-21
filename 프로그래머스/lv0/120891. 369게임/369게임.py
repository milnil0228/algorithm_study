def solution(order):
    count = 0
    order_list = list(map(int, str(order)))
    for i in order_list:
        if i != 0 and i % 3 == 0:
            count += 1
    return count