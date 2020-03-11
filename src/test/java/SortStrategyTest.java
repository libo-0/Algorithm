import io.github.libo.SortAlgorithmCompare;
import io.github.libo.alg.sort.BubbleSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author libo
 * @date 2020/3/11
 */
public class SortStrategyTest {

    public static final Integer[] numbers = {55, 88, 1, 30, 5, 38, 22, 0, 100, 15};
    public static final Integer[] result = {0, 1, 5, 15, 22, 30, 38, 55, 88, 100};

    @Test
    public void bubbleSortTest(){
        // 策略者模式：冒泡排序策略
        SortAlgorithmCompare sortAlgorithmCompare = new SortAlgorithmCompare(new BubbleSort());
        Integer[] numbers = Arrays.copyOf(SortStrategyTest.numbers, SortStrategyTest.numbers.length);
        Integer[] result = (Integer [])sortAlgorithmCompare.executeSortAlgorithm(numbers);

        Assert.assertArrayEquals(SortStrategyTest.result, result);
    }
}
