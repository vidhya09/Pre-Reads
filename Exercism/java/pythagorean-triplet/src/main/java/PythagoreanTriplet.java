import java.util.*;
public class PythagoreanTriplet{
    int a;
    int b;
    int c;
    public PythagoreanTriplet(int a,int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PythagoreanTriplet other = (PythagoreanTriplet) obj;
        return a == other.a && b == other.b && c == other.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
    
    public static PythagoreanBuilder makeTripletsList(){
        return new PythagoreanBuilder();
    }
    public static class PythagoreanBuilder{
        private List<PythagoreanTriplet> triplets;
        private int maxFactor = 10000000;
        public PythagoreanBuilder(){
            this.triplets = new ArrayList<>();
        }

        public PythagoreanBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }
        
        public PythagoreanBuilder thatSumTo(int sum){
            for(int i=1;i<sum-1;i++){
                for(int j=i+1;j<sum;j++){
                    int z= sum-i-j;
                    if((i*i)+(j*j)==(z*z)){
                        triplets.add(new PythagoreanTriplet(i,j,z));
                    }
                }
            }
            return this;
        }
        public List<PythagoreanTriplet> build(){
            List<PythagoreanTriplet> filteredTriplets = new ArrayList<>();
            for (PythagoreanTriplet triplet : triplets) {
                if (triplet.a <= this.maxFactor && triplet.b <= this.maxFactor && triplet.c <= this.maxFactor) {
                    System.out.println(triplet.a+" "+triplet.b+" "+triplet.c);
                    filteredTriplets.add(triplet);
                }
            }
            return filteredTriplets;
        }
    }
}