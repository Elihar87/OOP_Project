import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Tile extends StackPane
{

    private boolean isOccupied = false;
    private int [][] grid_1 = new int[3][3];
    private int [][] grid_2 = new int [3][3];
    private int value;
    private ImageView Dice_1 = new ImageView();
    private ImageView Dice_2 = new ImageView();
    private ImageView Dice_3 = new ImageView();
   private ImageView Dice_4 = new ImageView();
    private ImageView Dice_5 = new ImageView();
    private ImageView Dice_6 = new ImageView();
    private Label label = new Label();
    public Tile()
    {
        Rectangle border = new Rectangle(100,100);
        border.setFill(null);
        border.setStroke(Color.BLACK);
        getChildren().addAll(border, label);
    }

    public void num_1()
    {
        label.setGraphic(Dice_1 = new ImageView(new Image(getClass().getResourceAsStream("Images/Dice-1.png"))));
        Dice_1.setFitHeight(100);
        Dice_1.setFitWidth(100);
    }
    public void num_2()
    {
        label.setGraphic(Dice_2 = new ImageView(new Image(getClass().getResourceAsStream("Images/Dice-2.png"))));
        Dice_2.setFitHeight(100);
        Dice_2.setFitWidth(100);

    }
    public void num_3()
    {
        label.setGraphic(Dice_3 = new ImageView(new Image(getClass().getResourceAsStream("Images/Dice-3.png"))));
        Dice_3.setFitHeight(100);
        Dice_3.setFitWidth(100);
    }
    public void num_4()
    {
        label.setGraphic(Dice_4 = new ImageView(new Image(getClass().getResourceAsStream("Images/Dice-4.png"))));
        Dice_4.setFitHeight(100);
        Dice_4.setFitWidth(100);
    }
    public void num_5()
    {
        label.setGraphic(Dice_5 = new ImageView(new Image(getClass().getResourceAsStream("Images/Dice-5.png"))));
        Dice_5.setFitHeight(100);
        Dice_5.setFitWidth(100);
    }
    public void num_6()
    {
        label.setGraphic(Dice_6 = new ImageView(new Image(getClass().getResourceAsStream("Images/Dice-6.png"))));
        Dice_6.setFitHeight(100);
        Dice_6.setFitWidth(100);
    }

    public void insert_to_grid_1(int number, int i, int j)
    {
        grid_1[i][j] = number;

    }

    public int[][] update_grid_1(int [][] grid)
    {
        grid[0][0] = grid_1[0][0];
        grid[0][1] = grid_1[0][1];
        grid[0][2] = grid_1[0][2];
        grid[1][0] = grid_1[1][0];
        grid[1][1] = grid_1[1][1];
        grid[1][2] = grid_1[1][2];
        grid[2][0] = grid_1[2][0];
        grid[2][1] = grid_1[2][1];
        grid[2][2] = grid_1[2][2];

        return grid;
    }

    public void display_grid_1()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.println(grid_1[i][j]);
            }
        }
        System.out.println("\n");
    }

    public int return_dice_value()
    {
        return value;
    }

    public boolean set_occupied(boolean b)
    {
        isOccupied = b;
        return isOccupied;
    }

    public boolean check_occupied()
    {
    return isOccupied;
    }
}
