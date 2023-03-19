public class ExceptionHandling {
    public static void main(String[] args) {
        // Checked vs un-checked exception
        // When have throws in the method signature
        // Handle checked exception with try/catch
        try {
            testCheckedException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Exception handling start!!!");

        try {
            System.out.println("Try block here!!!");
            int i = 1 / 0;
//            throw new Exception("Sample Exception");
        } catch (Exception e) {
            System.out.println("Catch Block here!!!");
            System.out.println("Exception message: " + e.getMessage());
        } finally {
            System.out.println("Finally block here!!!");
        }
        System.out.println("Exception Handling end!!!");
    }

    private static void testCheckedException() throws Exception {
        throw new Exception("tét checked");
    }
}
