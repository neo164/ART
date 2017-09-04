package org.kintsel.service.impl;

import org.kintsel.service.TaskService;

/**
 * Created by ipredybaylo on 26-Mar-17.
 */
public class TaskServiceImplSecond implements TaskService {
    /**
     * Отсортировать строки в порядке убывания количества их появления в файле
     * строка которая встречается чаще всего должна идти первая
     * при равном числе повторений строки могут идти в любом порядке
     * если массив пустой или null возвращается пустой массив
     *
     * @param data
     * @return массив отсортированных строк
     */
    @Override
    public String[] sortStrings(String[] data) {
        //if (data == null || data.length == 0) return new String[0];
        return new String[0];

    }

    /**
     * объединяет строки в одну по следующему формату:
     * [номер строки].[строка]символ конца строки (квадратные скобки также попадают в результат)
     * нумерация начинается с единицы
     * если массив пустой или null возвращается пустая строка
     *
     * @param data - строки для объединения
     * @return объединенная строка в соответствии с форматом
     */
    @Override
    public String addStrings(String[] data) {

        StringBuilder builderString = new StringBuilder();

        for (int i = 0; i < data.length; i++) {
            builderString.append("[")
                    .append(i + 1)
                    .append("]")
                    .append(".")
                    .append("[")
                    .append(data[i])
                    .append("]");
            if (i + 1 != data.length) {
                builderString.append("\n");
            }
        }
        return builderString.toString();
    }
        //return null;
    }

