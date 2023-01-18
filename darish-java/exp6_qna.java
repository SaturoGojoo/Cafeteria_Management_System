class own extends Exception{
        own(String msg){
            super(msg);
        }
    }
    public class exp6_qna {
        public static void main(String args[]){
            try{
                int mark=99;
                if(mark>100){
                    throw new own("Marks greater than 100");
                }
                System.out.println(mark);
            }
            catch (own e){
                System.out.println("Exception caught: ");
                System.out.println(e.getMessage());
            }
            finally{
                System.out.println("Completed");
            }
        }
    }
