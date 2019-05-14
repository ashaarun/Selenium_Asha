package JavaExercise;
class Test
{   int count = 0;
 
    void A() throws Exception
    {
        try
        {
            count++;
             
            try
            {
                count++;
 
                try
                {
                    count++;
                    System.out.println(count);
                    throw new Exception();
                    
                }
                 
                catch(Exception ex)
                {
                    count++;
                    System.out.println("1st"+count);
                    throw new Exception();
                }
            }
             
            catch(Exception ex)
            {
                count++;
                System.out.println("2nd"+count);
            }
        }
         
        catch(Exception ex)
        {
            count++;
            System.out.println("3rd"+count);
        }
 
    }
 
    void display()
    {
        System.out.println(count);
    }
 
    public static void main(String[] args) throws Exception
    {
        Test obj = new Test();
        obj.A();
        obj.display();
    }
}