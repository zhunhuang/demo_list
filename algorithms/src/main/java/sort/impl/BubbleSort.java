package sort.impl;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

/**
 * description:
 *
 * @author zhun.huang 2018-11-12
 */
public class BubbleSort {
    public <T extends Comparable<? super T>> void sort(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size()-1; j > i; j--) {
                if (list.get(j).compareTo(list.get(i))>0) {
                    swap(list,i,j);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(4);
        integers.add(3);
        integers.add(9);
        integers.add(2);
        BubbleSort sort = new BubbleSort();
        sort.sort(integers);
        System.out.println(integers);
    }

    public static class User implements Comparable<User>{
        private int age;
        private int money;

        public User() {
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getMoney() {
            return money;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        @Override
        public String toString() {
            return "{\"User\":{"
                    + "\"age\":\"" + age + "\""
                    + ", \"money\":\"" + money + "\""
                    + "}}";
        }

        public int compareTo(User o) {
            return Integer.valueOf(o.getAge()).compareTo(this.getAge());
        }
    }
}
