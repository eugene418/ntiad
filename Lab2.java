class Program
{
    public static void main(String[] args)
    {
        var ob = new OutputBuilder(5, 7);
        ob.PrintPyromid(10);
        ob.PrintMatrix();
    }
}

class OutputBuilder
{
    private int[][] _matrix;

    public OutputBuilder(int m, int n)
    {
        _matrix = new int[m][n];

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                _matrix[i][j] = (i + j) * 3;
            }
        }
    }

    public void PrintPyromid(int height)
    {
        var sb = new StringBuilder();

        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < height - i; j++)
            {
                sb.append(' ');
            }

            for (int j = 0; j < i * 2 + 1; j++)
            {
                sb.append('*');
            }

            sb.append('\n');
        }

        IO.print(sb);
    }

    public void PrintMatrix()
    {
        var sb = new StringBuilder();

        for (int i = 0; i < _matrix.length; i++)
        {
            for (int j = 0; j < _matrix[i].length; j++)
            {
                sb.append(String.format("%4d ", _matrix[i][j]));
            }

            sb.append('\n');
        }

        IO.print(sb);
    }
}