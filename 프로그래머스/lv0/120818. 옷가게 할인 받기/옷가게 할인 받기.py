def solution(price):
    discount = 1
    if 100000 <= price < 300000:
        discount = 0.95
    elif 300000 <= price < 500000:
        discount = 0.9
    elif 500000 <= price <= 1000000:
        discount = 0.8
    answer = price * discount
    answer = answer // 1
    return answer