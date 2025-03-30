class Solution{
    public static void main(String[] args){
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));

    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length==1)return (gas[0]>=cost[0])?0:-1;
        for(int i=0;i<gas.length;i++){
            //check for the gas>cost
            if(gas[i]>cost[i]){
                int sum=0;
                int temp=2;
                int flag=1;
                for(int j=i;;){
                    sum=sum+gas[j];
                    sum=sum-cost[j];
                    if(sum<0){
                        temp=1;
                        break;
                    }
                     if(flag==1&&i==j)
                     {
                         flag=2;
                         
                     }
                    else if(flag==2&&i==j)
                        break;
                            j++;
                    if(j==gas.length)
                        j=j%gas.length;   
                }
                if(temp==2)return i;
            }
        }
        return -1;
    }
}