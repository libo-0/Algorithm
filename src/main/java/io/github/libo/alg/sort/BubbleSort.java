package io.github.libo.alg.sort;

import io.github.libo.data.CommonData;
import io.github.libo.util.ArrayUtil;

import java.util.Arrays;

/**
 * @author libo
 * @date 2020/3/10
 * 冒泡排序，泛型，只要实现 Comparable 接口，就能够排序
 */
public class BubbleSort implements SortStrategy {

    @Override
    public Comparable[] sort(Comparable[] numbers) {
        int len = numbers.length;
        for(int i=0; i< len; i++){
            for(int j = 0; j < len -i - 1; j++){
                if(numbers[j].compareTo(numbers[j+1]) > 0){
                    ArrayUtil.swap(j, j+1, numbers);
                }
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        Integer[] numbers = Arrays.copyOf(CommonData.numbers, CommonData.numbers.length);
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(numbers);
    }
}
