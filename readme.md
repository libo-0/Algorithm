# 算法学习

1. 使用策略模式，来切换不同的排序算法。
2. 使用泛型，只要实现 Comparable 的数组都能排序
3. 使用 JUnit 进行测试
4. Maven 导入依赖

## 排序算法

* [冒泡排序][0] O(n^2)

一个整型数组 [10, 8, 7, 20, 55, 88, 0, 3]

冒泡排序通过多次遍历这个数组，每次遍历，将当前值 a 与下一个值 b 比较，如果 a > b, 则交换 a 和 b 的位置，否则不变，继续向后。

第一次遍历，该数组中的最大的 88 将在最后一个位置。

第二次遍历，该数组中第2大的 55 将在倒数第二的位置。

需要遍历数组长度的次数，最终数组将有序。

每次遍历，需要遍历的数组长度总是减 1， 因为每次遍历，数组就会多一个值是有序的。

* [插入排序][2] O(n^2)




* [选择排序][6] O(n^2)

* [希尔排序][5] O(n^1.5)
* [归并排序][3] O(n*logN)
* [快速排序][4] O(n*logN)
* [堆排序][1] O(N*logN)
* 计数排序
* 桶排序
* 基数排序 O(d(n+r))

[0]: src/io/github/libo/alg/sort/BubbleSort.java
[1]: src/io/github/libo/alg/sort/HeapSort.java
[2]: src/io/github/libo/alg/sort/InsertSert.java
[3]: src/io/github/libo/alg/sort/MergeSort.java
[4]: src/io/github/libo/alg/sort/QuickSort.java
[5]: src/io/github/libo/alg/sort/ShellSort.java
[6]: src/io/github/libo/alg/sort/SelectSort.java