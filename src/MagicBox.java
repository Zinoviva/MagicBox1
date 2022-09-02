import java.util.Random;

public class MagicBox<T> {
    protected T[] items;

    public MagicBox(int SIZE) {
        this.items = (T[]) new Object[SIZE];  //создание массива с ячейками в конструкторе условие возможно и рандом
    }

    public boolean add(T item) {   //метод добавления объекта  в теории <T> T
        for (int t = 0; t < items.length; t++) {
            if (items[t] == null) {  //Если коробка ещё не полна, то элемент должен в ней сохраниться
                items[t] = item;
                return true;
            }
        }
        System.out.println("Коробка полна");
        return false;
    }

    public T pick() throws RuntimeException {
        int cell = 0;  //завести переменную до цикла

        for (int i = 0; i < items.length; i++) {  //пробегаюсь по длинне массива чтобу узнать где ячейка нал
            if (items[i] == null) {
                cell++;
            }
        }
        if (cell != 0) {  //пробегаюсь чтобы узнать где яейка не равна 0 чтобы выдать оишбку
            throw new RuntimeException("Коробка не полна и осталось" + cell + "ячеек заполнить"); //выкинуть RuntimeException
        }
        //выбирает случайным образом один из сохранённых элементов
        Random random = new Random();  //// ЧИСЛО джава подберёт случайное число от 0 до ЧИСЛО невключительно
        int randomInt = random.nextInt(items.length);  //вывожу рандом из массива случайное значение
        //  int randomInt = (int) Math.floor(Math.random() * items.length);  //так тоже работает
        return items[randomInt];  // выберите случайное число-индекс массива и верните его содержимое.
    }
}
