package mainCodes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    /** ������������������ʵ����ĿҪ��Ĺ��� **/
    /** ��Ȼ����Ҳ���Բ��������ģ����������ȫ�����Լ����뷨�� ^-^  **/
    public static void main(String[] args) {

        List<Integer> order = new ArrayList<Integer>();
        Map<String, List<Integer>> boms = new HashMap<String, List<Integer>>();

        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        Integer n = Integer.parseInt(line.split(",")[0]);
        Integer m = Integer.parseInt(line.split(",")[1]);

        line = in.nextLine();
        String[] itemCnt = line.split(",");
        for(int i = 0; i < n ; i++){
            order.add(Integer.parseInt(itemCnt[i]));
        }

        for(int i = 0; i < m; i++){
            line = in.nextLine();
            String[] bomInput = line.split(",");
            List<Integer> bomDetail = new ArrayList<Integer>();

            for(int j = 1; j <= n; j++ ){
                bomDetail.add(Integer.parseInt(bomInput[j]));
            }
            boms.put(bomInput[0], bomDetail);
        }
        in.close();

        Map<String, Integer> res = resolve(order, boms);

        System.out.println("match result:");
        for(String key : res.keySet()){
            System.out.println(key+"*"+res.get(key));
        }
    }

    // write your code here
    public static Map<String, Integer> resolve(List<Integer> order, Map<String, List<Integer>> boms) {
    	Map<String, Integer> res=new HashMap<String, Integer>();
    	//Ѱ�Ҷ���ÿ����Ʒ������bom����ܹ��������Ʒʣ��ֵΪ0
    	//����������Ʒ���Ա���������ڲ�ͬ��Ʒ��Ľ�����ѡ������������г��ִ���������ϣ�ĳЩ�����ڽ�������ϣ����жϣ������һ��������
    	//����ж������ѡ��bom�������ٵģ�����ڶ���������
    	
    	//Ѱ�Ҷ���ÿ����Ʒ������bom����ܹ��������Ʒʣ��ֵΪ0
    	for(Integer sum:order)
    	{
    		
    	}
    		
    	//
    	
    	
    	
    	return res;
    }
}