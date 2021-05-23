import java.util.Scanner;


public class O_an_quan {

    int[] board = {10, 5, 5, 5, 5, 5, 10, 5, 5, 5, 5, 5};
    static int pointer;
    static int turn = 0;

    class player {
        int score = 0;
    }

    player player1 = new player();
    player player2 = new player();

    public void move(int position, String direction) {

        pointer = position%12 + 12;

        int cell_rocks = board[pointer%12];

        board[pointer%12] = 0;

        int k = (direction.equals("clockwise")) ? 1 : -1;

        for(int i=0;i<cell_rocks;i++) {
            pointer +=k;
            board[pointer%12] +=1;
            printBoard();
        }
       
        if(!((pointer+k)%12==0||(pointer+k)%12==6)) {
            if(board[(pointer+k)%12] != 0) {
                move(pointer+k, direction);
            }
        }

        if(board[(pointer+k)%12] == 0 && board[(pointer+k*2)%12] != 0) {
            addScore(board[(pointer+k*2)%12]);
            board[(pointer+k*2)%12] = 0;
            if(board[(pointer+k*3)%12] == 0 && board[(pointer+k*4)%12] != 0) {
                addScore(board[(pointer+k*4)%12]);
                board[(pointer+k*4)%12] = 0;
                if(board[(pointer+k*5)%12] == 0 && board[(pointer+k*6)%12] != 0) {
                    addScore(board[(pointer+k*6)%12]);
                    board[(pointer+k*6)%12] = 0;
                    if(board[(pointer+k*7)%12] == 0 && board[(pointer+k*8)%12] != 0) {
                        addScore(board[(pointer+k*8)%12]);
                        board[(pointer+k*8)%12] = 0;
                        if(board[(pointer+k*9)%12] == 0 && board[(pointer+k*8)%10] != 0) {
                            addScore(board[(pointer+k*10)%12]);
                            board[(pointer+k*10)%12] = 0;
                            if(board[(pointer+k*11)%12] == 0) {
                                addScore(board[pointer]);
                                board[pointer] = 0;
                            }
                        }
                    }
                }
            }
        }

    }


    public void printBoard() {
        System.out.print("   ");
        for(int i=1;i<=5;i++) {
            System.out.print(board[i]+" ");
        }
        System.out.println();
        System.out.println(board[0]+"-----------"+board[6]);
        System.out.print("   ");
        for(int i=11;i>=7;i--) {
            System.out.print(board[i]+" ");
        }
        System.out.println();
    }

    public void addScore(int score) {
        if (turn%2==0) {
            this.player1.score += score;
        }
        else {
            this.player2.score += score;
        }
    }
    public void start() {
        while (true) {
            this.printBoard();
            System.out.println("player "+ ((turn%2)+1) + " turn: ");
            System.out.println("Choose position");
            int position;
            while (true) {
                Scanner sc = new Scanner(System.in);
                position = sc.nextInt();
                if (turn%2==0) {
                    if(!(position%12==11||position%12==10||position%12==9||position%12==8||position%12==7)) {
                        System.out.println("Wrong position input");
                    }
                    else {
                        if(board[position] == 0) {
                            System.out.println("empty cell. please choose another cell");
                        }
                        else {
                            break;
                        }
                    }
                }
                else {
                    if(!(position%12==1||position%12==2||position%12==3||position%12==4||position%12==5)) {
                        System.out.println("Wrong position input");
                    }
                    else {
                        if(board[position] == 0) {
                            System.out.println("empty cell. please choose another cell");
                        }
                        else {
                            break;
                        }
                    }
                }
            }
            String direction;
            while(true) {
                System.out.println("Choose direction: clockwise or counter_clockwise");
                Scanner sc = new Scanner(System.in);
                direction = sc.nextLine();
                if(direction.equals("clockwise")||direction.equals("counter_clockwise")) {
                    break;
                }
            }
            move(position, direction);
            System.out.println("Player1 score: "+this.player1.score);
            System.out.println("Player2 score: "+this.player2.score);
            if(checkWinning() == true) {
                break;
            }
            turn +=1;
        }
        for(int i=1;i<=5;i++) {
            this.player2.score += board[i];
        }
        for(int i=11;i>=7;i--) {
            this.player1.score += board[i];
        }
        System.out.println("Player1 score:" + this.player1.score);
        System.out.println("Player2 score:" + this.player2.score);

    }
    public boolean checkWinning() {
        if (board[0] == 0 && board[6] == 0) {
            return true;
        }
        return false;
    }
    public boolean checkHavePiece() {
        if(turn%2==0) {
            if(board[7]+board[8]+board[9]+board[10]+board[11]==0) {
                board[7]=1;
                board[8]=1;
                board[9]=1;
                board[10]=1;
                board[11]=1;
                this.player1.score -=5;
                return false;
            }
        }
        else {
            if(board[1]+board[2]+board[3]+board[4]+board[5]==0) {
                board[1]=1;
                board[2]=1;
                board[3]=1;
                board[4]=1;
                board[5]=1;
                this.player2.score -=5;
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        O_an_quan a = new O_an_quan();
        a.start();
    }
}