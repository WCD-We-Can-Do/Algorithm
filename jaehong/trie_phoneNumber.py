def solution(phone_book):
    strTrie = Trie()

    for num in phone_book:
        strTrie.add(num)

    for ckNum in phone_book:
        if not strTrie.search(ckNum):
            return False
    answer = True
    return answer


class Node():
    def __init__(self, key=None):
        self.key = key
        # self.data = data
        self.child = {}

    def addData(self, data):
        self.data = data


class Trie():

    def __init__(self):
        self.head = Node()

    def add(self, word):
        head = self.head

        for i in word:
            if i not in head.child:
                head.child[i] = Node(i)
            head = head.child[i]

        head.addData(word)

    def search(self, word):
        head = self.head
        for i in word:
            head = head.child[i]

        if len(head.child) == 0:
            return True

        return False


if __name__ == '__main__':
    Phone_book = ["119", "97674223", "1195524421"]
    print(solution(Phone_book))
    
    
