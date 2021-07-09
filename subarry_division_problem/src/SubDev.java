import java.util.List;

public class SubDev {

    public static int birthday(List<Integer> s, int d, int m) {

        int count = 0;
        if(s.size() < m)
            return 0;

        if(s.size() == 1 && m == 1 && d == s.get(0))
            return 1;

        for (int i = 0; i < s.size() - m + 1; i++) {
                int sum = 0;
                for(int j = i; j < i + m; j++) {
                 sum += s.get(j);
            }
                if(sum == d)
                    count++;
        }
            return count;
    }
}