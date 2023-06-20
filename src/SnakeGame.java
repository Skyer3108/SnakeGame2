import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SnakeGame extends JFrame
{
    Board board;
    SnakeGame(){
       board=new Board();
       setVisible(true);
       add(board);
       pack();
       setResizable(false);

    }
    public static void main(String[] args) {
             SnakeGame snakeGame=new SnakeGame();
        }
    }
