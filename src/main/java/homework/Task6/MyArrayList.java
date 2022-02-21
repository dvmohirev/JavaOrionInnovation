package homework.Task6;

import java.util.Arrays;

public class MyArrayList<T> {
    private static final int MAX_CAPACITY = 10;
    private int count;
    private Object[] myArrayList;

    public MyArrayList() {
        myArrayList = new Object[MAX_CAPACITY];
        count = 0;
    }

    void add(T item) {
        if (count >= MAX_CAPACITY) {
            throw new MyArrayStoreException("Max count exceeded");
        } else {
            myArrayList[count] = item;
            count++;
        }
    }

    boolean remove(T item) {
        for (int i = 0; i < count; ++i) {
            if (myArrayList[i].equals(item)) {
                removeItem(myArrayList , i);
                return true;
            }
        }
        return false;
    }

    private void removeItem(Object[] massive, int index) {
        System.arraycopy(massive, index + 1, massive, index, count - index - 1);
        massive[--count] = null;
    }

    int size() {
        return count;
    }

    T[] toArray() {
        return (T[]) Arrays.copyOf(myArrayList, count);
    }

    T get(int index) {
        return (T) myArrayList[index];
    }

}
