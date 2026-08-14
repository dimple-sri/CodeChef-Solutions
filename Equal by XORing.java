import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        String line = br.readLine();
        if (line == null) return;
        
        int T = Integer.parseInt(line.trim());
        StringBuilder sb = new StringBuilder();
        
        while (T-- > 0) {
            line = br.readLine();
            while (line == null || line.trim().isEmpty()) {
                line = br.readLine();
            }
            st = new StringTokenizer(line);
            
            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());
            long N = Long.parseLong(st.nextToken());
            
            long D = A ^ B;
            
            if (D == 0) {
                sb.append(0).append("\n");
            } else if (D < N) {
                sb.append(1).append("\n");
            } else {
                // Find the position of the highest set bit in D
                // Long.highestOneBit(D) gives 2^p
                long highestPowerOf2 = Long.highestOneBit(D);
                
                if (N > highestPowerOf2) {
                    sb.append(2).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
        }
        
        System.out.print(sb);
    }
}
