package io.github.libo;

import io.github.libo.alg.sort.SortStrategy;

/**
 * @author libo
 * @date 2020/3/11
 *  算法实现比较
 *  策略者模式：选择不同的排序算法策略
 */
public class SortAlgorithmCompare<T extends Comparable> {
    private SortStrategy sortStrategy;

    public SortAlgorithmCompare(SortStrategy sortStrategy){
        this.sortStrategy = sortStrategy;
    }

    public T[] executeSortAlgorithm(T[] data){
        return (T[])sortStrategy.sort(data);
    }
}
