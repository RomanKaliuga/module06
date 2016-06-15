package nightglyuk.gojavaonline.module5upd;

/**
 * исполняющий класс
 */
public class Runner {
    public static void main(String[] args){
        // создание
        MyArray myArray= new MyArray();
        // инициализация
        myArray.initArray();

        /** вывод первоначального массива*/
        System.out.println("unsorted array " + myArray.outputArray());

        /** вывод максимального элемента*/
        System.out.println("max element " + myArray.searchMax());

        /** вывод минимального элемента*/
        System.out.println("min element " + myArray.searchMin());

        /** вывод отсортированного масива */
        myArray.sort();
        System.out.println("sorted array " + myArray.outputArray());


    }
}
