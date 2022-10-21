import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.Parent;

import java.io.FileInputStream;
import java.io.InputStream;


public class TicTacToe extends Application
{
    private int num;
    private final int MAX_TURNS = 18;
    private int num_turns = 1;
    private Label turn_display = new Label("Left Player's Turn");
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
        num = die.rollDie();
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


//Grid 1
for (int i=0; i<3; i++)
{

    for (int j=0; j<3; j++)
    {
        Tile tile = new Tile();
        tile.setTranslateX(150+(j*100));
        tile.setTranslateY(150+(i*100));

        tile.setOnMouseClicked(event -> {
            if(event.getButton() == MouseButton.PRIMARY && tile.check_occupied() == false)
            {
                if (!player1_turn)
                {
                    return;
                }

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

                num = die.rollDie();
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
                tile2.setOnMouseClicked(event -> {
                    if(event.getButton() == MouseButton.PRIMARY && tile2.check_occupied() == false)
                    {
                        if (!player2_turn)
                        {
                            return;
                        }

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

                        num = die.rollDie();
                        die.set_diceFace();

                        if(num_turns < MAX_TURNS)
                        {
                            num_turns = num_turns + 1;
                            left_arrow.setVisible(true);
                            right_arrow.setVisible(false);
                            turn_display.setText("Left Player's Turn");
                        }
                        else if(num_turns == MAX_TURNS)
                        {
                            left_arrow.setVisible(false);
                            right_arrow.setVisible(false);
                            turn_display.setText("GAME OVER");
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

        System.out.println(grid_1[0][0]);
        System.out.println(grid_1[0][1]);
        System.out.println(grid_1[0][2]);
        System.out.println(grid_1[1][0]);
        System.out.println(grid_1[1][1]);
        System.out.println(grid_1[1][2]);
        System.out.println(grid_1[2][0]);
        System.out.println(grid_1[2][1]);
        System.out.println(grid_1[2][2]);
    }



    }


