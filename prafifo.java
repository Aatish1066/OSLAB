class prafifo{


    public static void main(String[] args) {
        int []rec=new int[10];
        int []q=new int[4];
        int noframe=4;
        int []data={1,2,3,4,2,3,4,2};
        for (int i = 0; i < noframe; i++) {
            if(q.length<noframe){
             q[i]=data[i];
            }
            else{
                for (int j = 0; j < data.length; j++) {
                    if(q[i]==data[j]){
                        rec[j]=1;
                        System.out.println("hk");
                    }
                    else{
                        q[i]=data[j];
                        rec[j]=0;

                    }
                }
            }
        }
        System.out.print(q);
        for (int i = 0; i < rec.length; i++) {
            
        
            System.out.print(rec[i]);

        }
    }
}
