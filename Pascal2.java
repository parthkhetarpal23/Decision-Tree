import java.util.ArrayList;
import java.util.List;
public class Pascal2 {
	public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal = new ArrayList<List<Integer>>();        
        pascal.add(new ArrayList<>());
        pascal.get(0).add(1);
        for(int rowNum=1;rowNum<rowIndex+1;rowNum++)
        {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = pascal.get(rowNum-1);
            row.add(1);
            for(int j=1;j<rowNum;j++)
                row.add(prevRow.get(j-1) + prevRow.get(j));
            row.add(1);
            pascal.add(row);
        }
        return pascal.get(rowIndex);
        
    }
 

public static void main(String args[])
{
	List<Integer> pascal=getRow(3);
	System.out.println(pascal);
	
}
}

