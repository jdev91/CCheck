package game;

public class Main
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {        
        char[][] board = new char[18][26];
        
        //rows
        for (int i = 0; i < board.length; i++) {
            //cols
            for(int j = 0; j < board[i].length; j++) {
                
                //upper triangle
                if( (i > 14-j) && (i < 5) && (i > j-12) ) {
                    board[i][j] = '1';
                }
                //bottom triangle
                else if( (i > 13) && (i < j+4) && (i < 30-j) ) {
                    board[i][j] = '2';
                }
                //top left triangle
                else if ( (i > 4) && (i < j+4) && (i < 12-j) ) {
                    board[i][j] = '3';
                }
                //top right triangle
                else if ( (i > 4) && (i < j-14) && (i < 30-j) ) {
                    board[i][j] = '4';
                }
                //bottom left triangle
                else if( (i < 14) && (i > j+6) && (i > 14-j) ) {
                    board[i][j] = '5';
                }
                //bottom right triangle
                else if( (i < 14) && (i > j-12) && (i > 32-j) ) {
                    board[i][j] = '6';
                }                
                else {
                    board[i][j] = ' ';
                }
            }
        }       

        
        /**
         * Print board
         */
        //rows
        for(int i = 0; i < board.length; i++) {
            //cols
            for(int j = 0; j < board[i].length; j++) {
                System.out.print("" + board[i][j] + " ");
            }
            System.out.println("");
        }
        

    }
    
    

}
