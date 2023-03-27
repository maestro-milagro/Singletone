import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter (int threshold){
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        int rightElements = 0;
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> result = new ArrayList<>();
        for(int element : source){
            if(element > threshold){
                logger.log(" Элемент \""+element+"\" проходит\n");
                result.add(element);
                rightElements++;
            }else {
                logger.log(" Элемент \""+element+"\" не проходит\n");
            }
        }
        logger.log("Прошло фильтр " + rightElements + " элемента из "+source.size());
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: "+result);
        return result;
    }
}
