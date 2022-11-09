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

    public int row1_calculation(int [][] grid)
    {
        int row1 = 0;
        if((grid[0][0] == grid [0][1]) && (grid[0][0] == grid [0][2]))
        {
            row1 = row1 + (grid[0][0] * grid[0][1] * grid[0][2]);
        }
        else
        {
            row1 = row1 + (grid[0][0] + grid [0][1] + grid [0][2]);
        }
        return row1;
    }

    public int row2_calculation(int [][] grid)
    {
        int row2 = 0;
        if((grid[1][0] == grid [1][1]) && (grid[1][0] == grid [1][2]))
        {
            row2 = row2 + (grid[1][0] * grid [1][1] * grid [1][2]);
        }
        else
        {
            row2 = row2 + (grid[1][0] + grid [1][1] + grid [1][2]);
        }
        return row2;
    }

    public int row3_calculation(int [][] grid)
    {
        int row3 = 0;
        if((grid[2][0] == grid [2][1]) && (grid[2][0] == grid [2][2]))
        {
            row3 = row3 + (grid[2][0] * grid [2][1] * grid [2][2]);
        }
        else
        {
            row3 = row3 + (grid[2][0] + grid [2][1] + grid [2][2]);
        }
        return row3;
    }

    public int col1_calculation(int [][] grid)
    {
        int col1 = 0;
        if((grid[0][0] == grid [1][0]) && (grid[0][0] == grid [2][0]))
        {
            col1 = col1 + (grid[0][0] * grid [1][0] * grid [2][0]);
        }
        else
        {
            col1 = col1 + (grid[0][0] + grid [1][0] + grid [2][0]);
        }
        return col1;
    }

    public int col2_calculation(int [][] grid)
    {
        int col2 = 0;
        if((grid[0][1] == grid [1][1]) && (grid[0][1] == grid [2][1]))
        {
            col2 = col2 + (grid[0][1] * grid [1][1] * grid [2][1]);
        }
        else
        {
            col2 = col2 + (grid[0][1] + grid [1][1] + grid [2][1]);
        }
        return col2;
    }

    public int col3_calculation(int [][] grid)
    {
        int col3 = 0;
        if((grid[0][2] == grid [1][2]) && (grid[0][2] == grid [2][2]))
        {
            col3 = col3 + (grid[0][2] * grid [1][2] * grid [2][2]);
        }
        else
        {
            col3 = col3 + (grid[0][2] + grid [1][2] + grid [2][2]);
        }
        return col3;
    }

    public int left_diag_calculation(int [][] grid)
    {
        int left_diag = 0;
        if((grid[0][0] == grid [1][1]) && (grid[0][0] == grid [2][2]))
        {
            left_diag = left_diag + (grid[0][0] * grid [1][1] * grid [2][2]);
        }
        else
        {
            left_diag = left_diag + (grid[0][0] + grid [1][1] + grid [2][2]);
        }
        return left_diag;
    }

    public int right_diag_calculation(int [][] grid)
    {
        int right_diag = 0;
        if((grid[0][2] == grid [1][1]) && (grid[0][2] == grid [2][0]))
        {
            right_diag = right_diag + (grid[0][2] * grid [1][1] * grid [2][0]);
        }
        else
        {
            right_diag = right_diag + (grid[0][2] + grid [1][1] + grid [2][0]);
        }
        return right_diag;
    }


}
