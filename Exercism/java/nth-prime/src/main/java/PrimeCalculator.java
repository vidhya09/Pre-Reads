class PrimeCalculator {

    int nth(int nth) {
        int res=0,ctr=0,flag;
        for(int i=2; ctr<nth; i++){
            flag=1;
            for(int j=2; j<=i/2; j++){
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                ctr++;
                res=i;
            }
        }
        if(res==0){
            throw new IllegalArgumentException();
        }
        return res;
    }

}