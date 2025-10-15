class Program
{
    public static void main(String[] args)
    {
        var ob = new OutputBuilder();
        ob.PrintPyromid(10);
        ob.PrintMatrix(5, 7);
    }
}

class OutputBuilder
{
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

    public void PrintMatrix(int m, int n)
    {
        var sb = new StringBuilder();

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                sb.append(String.format("%4d ", (i + j) * 3));
            }

            sb.append('\n');
        }

        IO.print(sb);
    }
}