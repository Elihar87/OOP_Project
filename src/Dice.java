import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import java.io.File;
import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

//HELLO
public class Dice extends StackPane
{
Random random = new Random();
private ImageView Dice_1 = new ImageView();
  private ImageView Dice_2 = new ImageView();
  private ImageView Dice_3 = new ImageView();
  private ImageView Dice_4 = new ImageView();
  private ImageView Dice_5 = new ImageView();
  private ImageView Dice_6 = new ImageView();
  private Label label = new Label();
  private int dice_value;

  public Dice()
  {
    Rectangle display = new Rectangle(100, 100);
    display.setFill(null);
    display.setStroke(Color.BLACK);
    getChildren().addAll(display, label);
  }

public int rollDie()
{
  int number = random.nextInt(6)+1;
  dice_value = number;
  return number;
}

  public void set_diceFace()
  {
    if (dice_value == 1)
    {
      label.setGraphic(Dice_1 = new ImageView(new Image(getClass().getResourceAsStream("Images/Dice-1.png"))));
      Dice_1.setFitHeight(100);
      Dice_1.setFitWidth(100);
    }
    else if (dice_value == 2)
    {
      label.setGraphic(Dice_2 = new ImageView(new Image(getClass().getResourceAsStream("Images/Dice-2.png"))));
      Dice_2.setFitHeight(100);
      Dice_2.setFitWidth(100);
    }
    else if (dice_value == 3)
    {
      label.setGraphic(Dice_3 = new ImageView(new Image(getClass().getResourceAsStream("Images/Dice-3.png"))));
      Dice_3.setFitHeight(100);
      Dice_3.setFitWidth(100);
    }
    else if (dice_value == 4)
    {
      label.setGraphic(Dice_4 = new ImageView(new Image(getClass().getResourceAsStream("Images/Dice-4.png"))));
      Dice_4.setFitHeight(100);
      Dice_4.setFitWidth(100);
    }
   else if (dice_value == 5)
    {
      label.setGraphic(Dice_5 = new ImageView(new Image(getClass().getResourceAsStream("Images/Dice-5.png"))));
      Dice_5.setFitHeight(100);
      Dice_5.setFitWidth(100);
    }
   else if (dice_value == 6)
    {
      label.setGraphic(Dice_6 = new ImageView(new Image(getClass().getResourceAsStream("Images/Dice-6.png"))));
      Dice_6.setFitHeight(100);
      Dice_6.setFitWidth(100);
    }
  }


}
