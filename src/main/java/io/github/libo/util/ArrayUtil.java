package io.github.libo.util;

/**
 * @author libo
 * @date 2020/3/11
 */
public class ArrayUtil {
    private ArrayUtil() {
    }

    /**
     * 交换列表的两个值顺序
     *
     * @param one
     * @param anotherOne
     * @param data
     * @param <T>
     */
    public static <T> void swap(Integer one, Integer anotherOne, T[] data) {
        T valueAtOne = data[one];
        T valueAtAnotherOne = data[anotherOne];
        data[one] = valueAtAnotherOne;
        data[anotherOne] = valueAtOne;

        return;
    }
}
