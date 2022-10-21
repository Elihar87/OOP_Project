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

    public int return_dice_value(int number)
    {
        value = number;
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
