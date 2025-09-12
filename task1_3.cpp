//Запись массива данных типа список на C++
list<dataType> list_name


//Создание структуры данных типа стэк на C++
struct stack {
    int a[1000];
    int head = -1; //Индекс крайнего элемента
    void push(int x) {
        head++;
        a[head] = x;
    }
    int pop() {
        if (head != -1) {
            head--;
            return a[head + 1];
        } else {
            // Ошибка, попытка извлечь элемент из пустого стека
        }
    }
    bool is_empty() {
        return head == -1;
    }
};


