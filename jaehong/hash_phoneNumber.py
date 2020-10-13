def solution(phone_book):
    phone_book = sorted(phone_book, key=len)

    strPre = {}

    for num in phone_book:
        if num[0] not in strPre:
            strPre[num[0]] = list()
        else:
            for i in strPre[num[0]]:
                if num[0:len(i)] == i:
                    return False
        strPre[num[0]].append(num)

    answer = True
    return answer

if __name__ == '__main__':
    Phone_book = ["1195524421","119", "97674223", "12425"]
    Phone_book = sorted(Phone_book, key=len)
    print(Phone_book)
    #print(solution(Phone_book))
