import javafx.scene.layout.StackPane;

public class Calculations extends StackPane
{
    public int grid_calculation(int [][] grid)
    {
        int total = 0;

        //Rows
        if((grid[0][0] == grid [0][1]) && (grid[0][0] == grid [0][2]))
        {
            total = total + (grid[0][0] * grid [0][1] * grid [0][2]);
        }
        else
        {
            total = total + (grid[0][0] + grid [0][1] + grid [0][2]);
        }

        if ((grid[1][0] == grid [1][1]) && (grid[1][0] == grid [1][2]))
        {
            total = total + (grid[1][0] * grid [1][1] * grid [1][2]);
        }
        else
        {
            total = total + (grid[1][0] + grid [1][1] + grid [1][2]);
        }

        if ((grid[2][0] == grid [2][1]) && (grid[2][0] == grid [2][2]))
        {
            total = total + (grid[2][0] * grid [2][1] * grid [2][2]);
        }
        else
        {
            total = total + (grid[2][0] + grid [2][1] + grid [2][2]);
        }

        //Columns
        if ((grid[0][0] == grid [1][0]) && (grid[0][0] == grid [2][0]))
        {
            total = total + (grid[0][0] * grid [1][0] * grid [2][0]);
        }
        else
        {
            total = total + (grid[0][0] + grid [1][0] + grid [2][0]);
        }

        if ((grid[0][1] == grid [1][1]) && (grid[0][1] == grid [2][1]))
        {
            total = total + (grid[0][1] * grid [1][1] * grid [2][1]);
        }
        else
        {
            total = total + (grid[0][1] + grid [1][1] + grid [2][1]);
        }

        if ((grid[0][2] == grid [1][2]) && (grid[0][2] == grid [2][2]))
        {
            total = total + (grid[0][2] * grid [1][2] * grid [2][2]);
        }
        else
        {
            total = total + (grid[0][2] + grid [1][2] + grid [2][2]);
        }

        return total;
    }
}
