def solution(emergency):
    emergency_list = [0] * len(emergency)
    for i in range(len(emergency)):
        
        emergency_list[emergency.index(max(emergency))] = i + 1
        emergency[emergency.index(max(emergency))] = 0
            
    return emergency_list