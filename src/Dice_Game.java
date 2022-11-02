import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Parent;


public class Dice_Game extends Application
{
    private int num;
    private int total_1;
    private int total_2;

    private int P1_row1;
    private int P1_row2;
    private int P1_row3;
    private int P1_col1;
    private int P1_col2;
    private int P1_col3;

    private int P2_row1;
    private int P2_row2;
    private int P2_row3;
    private int P2_col1;
    private int P2_col2;
    private int P2_col3;
    private final int MAX_TURNS = 18;
    private int num_turns = 1;
    Calculations calculate = new Calculations();
    private Label turn_display = new Label("Left Player's Turn");
    private Label winner_text = new Label("Player 1 Wins!");
    private Label total_1_text = new Label ("Player 1 Total: " + total_1);
    private Label P1_row1_text = new Label (""+P1_row1);
    private Label P1_row2_text = new Label (""+P1_row2);
    private Label P1_row3_text = new Label (""+P1_row3);
    private Label P1_col1_text = new Label (""+P1_col1);
    private Label P1_col2_text = new Label (""+P1_col2);
    private Label P1_col3_text = new Label (""+P1_col3);

    private Label total_2_text = new Label ("Player 2 Total: " + total_2);

    private Label P2_row1_text = new Label (""+P2_row1);
    private Label P2_row2_text = new Label (""+P2_row2);
    private Label P2_row3_text = new Label (""+P2_row3);
    private Label P2_col1_text = new Label (""+P2_col1);
    private Label P2_col2_text = new Label (""+P2_col2);
    private Label P2_col3_text = new Label (""+P2_col3);
    private boolean player1_turn = true;
    private boolean player2_turn = false;
    private int[][] grid_1 = new int [3][3];
    private int[][] grid_2 = new int [3][3];
    public static void main(String [] args)
    {
        launch(args);
    }

    private Parent createContent()
    {
//Window
Pane root = new Pane();
root.setPrefSize(600,600);

//Dice
        Dice die = new Dice();
        die.setTranslateX(575);
        die.setTranslateY(150);
        die.rollDie();
        num = die.return_dice_value();
        die.set_diceFace();
        root.getChildren().add(die);

//Player Turn Text
        turn_display.setTranslateX(575);
        turn_display.setTranslateY(300);
        turn_display.setAlignment(Pos.CENTER);
        turn_display.setFont(Font.font(15));
        root.getChildren().add(turn_display);

//Left Arrow
ImageView left_arrow = new ImageView(new Image(getClass().getResourceAsStream("Images/Left Arrow.png")));
left_arrow.setFitHeight(50);
left_arrow.setFitWidth(50);
left_arrow.setTranslateX(600);
left_arrow.setTranslateY(350);
left_arrow.setVisible(true);
root.getChildren().add(left_arrow);

//Right Arrow
        ImageView right_arrow = new ImageView(new Image(getClass().getResourceAsStream("Images/Right Arrow.png")));
        right_arrow.setFitHeight(50);
        right_arrow.setFitWidth(50);
        right_arrow.setTranslateX(600);
        right_arrow.setTranslateY(350);
        right_arrow.setVisible(false);
        root.getChildren().add(right_arrow);

//Winner Text
        winner_text.setVisible(false);
        winner_text.setTranslateX(515);
        winner_text.setTranslateY(150);
        winner_text.setAlignment(Pos.CENTER);
        winner_text.setFont(Font.font(35));
        root.getChildren().add(winner_text);

//Total 1 Text
         total_1_text.setTranslateX(143);
         total_1_text.setTranslateY(500);
         total_1_text.setAlignment(Pos.CENTER);
         total_1_text.setFont(Font.font(20));
         root.getChildren().add(total_1_text);

//Total 2 Text
        total_2_text.setTranslateX(800);
        total_2_text.setTranslateY(500);
        total_2_text.setAlignment(Pos.CENTER);
        total_2_text.setFont(Font.font(20));
        root.getChildren().add(total_2_text);

//P1_row1_text
        P1_row1_text.setTranslateX(100);
        P1_row1_text.setTranslateY(180);
        P1_row1_text.setAlignment(Pos.CENTER);
        P1_row1_text.setFont(Font.font(20));
        root.getChildren().add(P1_row1_text);

        //P1_row2_text
        P1_row2_text.setTranslateX(100);
        P1_row2_text.setTranslateY(270);
        P1_row2_text.setAlignment(Pos.CENTER);
        P1_row2_text.setFont(Font.font(20));
        root.getChildren().add(P1_row2_text);

        //P1_row3_text
        P1_row3_text.setTranslateX(100);
        P1_row3_text.setTranslateY(360);
        P1_row3_text.setAlignment(Pos.CENTER);
        P1_row3_text.setFont(Font.font(20));
        root.getChildren().add(P1_row3_text);

        //P1_col1_text
        P1_col1_text.setTranslateX(200);
        P1_col1_text.setTranslateY(100);
        P1_col1_text.setAlignment(Pos.CENTER);
        P1_col1_text.setFont(Font.font(20));
        root.getChildren().add(P1_col1_text);

        //P1_col2_text
        P1_col2_text.setTranslateX(300);
        P1_col2_text.setTranslateY(100);
        P1_col2_text.setAlignment(Pos.CENTER);
        P1_col2_text.setFont(Font.font(20));
        root.getChildren().add(P1_col2_text);

        //P1_col3_text
        P1_col3_text.setTranslateX(400);
        P1_col3_text.setTranslateY(100);
        P1_col3_text.setAlignment(Pos.CENTER);
        P1_col3_text.setFont(Font.font(20));
        root.getChildren().add(P1_col3_text);

//HEREDBHWDWAIHDYUW
        //P2_row1_text
        P2_row1_text.setTranslateX(1150);
        P2_row1_text.setTranslateY(180);
        P2_row1_text.setAlignment(Pos.CENTER);
        P2_row1_text.setFont(Font.font(20));
        root.getChildren().add(P2_row1_text);

        //P2_row2_text
        P2_row2_text.setTranslateX(1150);
        P2_row2_text.setTranslateY(270);
        P2_row2_text.setAlignment(Pos.CENTER);
        P2_row2_text.setFont(Font.font(20));
        root.getChildren().add(P2_row2_text);

        //P2_row3_text
        P2_row3_text.setTranslateX(1150);
        P2_row3_text.setTranslateY(360);
        P2_row3_text.setAlignment(Pos.CENTER);
        P2_row3_text.setFont(Font.font(20));
      root.getChildren().add(P2_row3_text);

        //P2_col1_text
        P2_col1_text.setTranslateX(850);
        P2_col1_text.setTranslateY(100);
        P2_col1_text.setAlignment(Pos.CENTER);
        P2_col1_text.setFont(Font.font(20));
        root.getChildren().add(P2_col1_text);

        //P2_col2_text
        P2_col2_text.setTranslateX(950);
        P2_col2_text.setTranslateY(100);
        P2_col2_text.setAlignment(Pos.CENTER);
        P2_col2_text.setFont(Font.font(20));
         root.getChildren().add(P2_col2_text);

        //P2_col3_text
        P2_col3_text.setTranslateX(1050);
        P2_col3_text.setTranslateY(100);
        P2_col3_text.setAlignment(Pos.CENTER);
        P2_col3_text.setFont(Font.font(20));
        root.getChildren().add(P2_col3_text);


//Grid 1
for (int i=0; i<3; i++)
{

    for (int j=0; j<3; j++)
    {
        Tile tile = new Tile();
        tile.setTranslateX(150+(j*100));
        tile.setTranslateY(150+(i*100));



        int finalI = i;
        int finalJ = j;
        tile.setOnMouseClicked(event -> {
            if(event.getButton() == MouseButton.PRIMARY && tile.check_occupied() == false)
            {
                if (!player1_turn)
                {
                    return;
                }
            grid_1[finalI][finalJ] = num;
                total_1 = calculate.grid_calculation(grid_1);
                P1_row1 = calculate.row1_calculation(grid_1);
                P1_row2 = calculate.row2_calculation(grid_1);
                P1_row3 = calculate.row3_calculation(grid_1);
                P1_col1 = calculate.col1_calculation(grid_1);
                P1_col2 = calculate.col2_calculation(grid_1);
                P1_col3 = calculate.col3_calculation(grid_1);
                total_1_text.setText("Player 1 Total: " + total_1 );
                P1_row1_text.setText("" + P1_row1);
                P1_row2_text.setText("" + P1_row2);
                P1_row3_text.setText("" + P1_row3);
                P1_col1_text.setText("" + P1_col1);
                P1_col2_text.setText("" + P1_col2);
                P1_col3_text.setText("" + P1_col3);


                if (num == 1)
                {
                    tile.num_1();
                }
                else if (num == 2)
                {
                    tile.num_2();
                }
                else if (num == 3)
                {
                    tile.num_3();
                }
                else if (num == 4)
                {
                    tile.num_4();
                }
                else if (num == 5)
                {
                    tile.num_5();
                }
                else if (num == 6)
                {
                   tile.num_6();
                }

                tile.set_occupied(true);

                player1_turn = false;
                player2_turn = true;


                die.rollDie();
                num = die.return_dice_value();
                 die.set_diceFace();


                if(num_turns < MAX_TURNS) {
                    num_turns= num_turns + 1;
                    left_arrow.setVisible(false);
                    right_arrow.setVisible(true);
                    turn_display.setText("Right Player's Turn");
                }


            }
        });

        root.getChildren().add(tile);

    }
}
//Grid 2
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                Tile tile2 = new Tile();
                tile2.setTranslateX(800 +(j * 100));
                tile2.setTranslateY(150+(i * 100));


                int finalI = i;
                int finalJ = j;
                tile2.setOnMouseClicked(event -> {
                    if(event.getButton() == MouseButton.PRIMARY && tile2.check_occupied() == false)
                    {
                        if (!player2_turn)
                        {
                            return;
                        }

                        grid_2[finalI][finalJ] = num;
                        total_2 = calculate.grid_calculation(grid_2);
                        P2_row1 = calculate.row1_calculation(grid_2);
                        P2_row2 = calculate.row2_calculation(grid_2);
                        P2_row3 = calculate.row3_calculation(grid_2);
                        P2_col1 = calculate.col1_calculation(grid_2);
                        P2_col2 = calculate.col2_calculation(grid_2);
                        P2_col3 = calculate.col3_calculation(grid_2);
                        P2_row1_text.setText("" + P2_row1);
                        P2_row2_text.setText("" + P2_row2);
                        P2_row3_text.setText("" + P2_row3);
                        P2_col1_text.setText("" + P2_col1);
                        P2_col2_text.setText("" + P2_col2);
                        P2_col3_text.setText("" + P2_col3);
                        total_2_text.setText("Player 2 Total: " + total_2);

                        if (num == 1)
                        {
                            tile2.num_1();
                        }
                        else if (num == 2)
                        {
                            tile2.num_2();
                        }
                        else if (num == 3)
                        {
                            tile2.num_3();
                        }
                        else if (num == 4)
                        {
                            tile2.num_4();
                        }
                        else if (num == 5)
                        {
                            tile2.num_5();
                        }
                        else if (num == 6)
                        {
                            tile2.num_6();
                        }

                        tile2.set_occupied(true);
                        player1_turn = true;
                        player2_turn = false;


                        die.rollDie();
                        num = die.return_dice_value();
                        die.set_diceFace();

                        if(num_turns < MAX_TURNS)
                        {
                            num_turns = num_turns + 1;
                            left_arrow.setVisible(true);
                            right_arrow.setVisible(false);
                            turn_display.setText("Left Player's Turn");
                        }
                        //End of Game
                        else if(num_turns == MAX_TURNS)
                        {

                            die.hide_dice();
                            left_arrow.setVisible(false);
                            right_arrow.setVisible(false);
                            turn_display.setText("GAME OVER");


                        total_1 = calculate.grid_calculation(grid_1);
                        total_2 = calculate.grid_calculation(grid_2);
                        System.out.println("Total 1: " + total_1);
                        System.out.println("Total 2: " + total_2);

                        if(total_1 > total_2)
                        {
                        winner_text.setVisible(true);
                        }
                        else if(total_2 > total_1)
                        {
                            winner_text.setText("Player 2 Wins!");
                            winner_text.setVisible(true);
                        }

                        }


                    }
                });

                root.getChildren().add(tile2);
            }
        }
return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
primaryStage.setScene(new Scene(createContent()));
primaryStage.show();


    }



    }


