package sort;

import java.util.List;

/**
 * description:
 *
 * @author zhun.huang 2018-11-12
 */
public interface Sort {

    /**
     *
     * @param list
     * @param <T>  list的类型 需要 实现 Comparable<? super T> 接口。
     */
    <T extends Comparable<? super T>> void sort(List<T> list);

}
