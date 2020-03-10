package io.github.libo.alg.sort;

import java.util.List;

/**
 * @author libo
 * @date 2020/3/10
 * 排序算法
 */
public interface SortAlgorithm<T extends Comparable> {
    void sort(List<T> list);
}
