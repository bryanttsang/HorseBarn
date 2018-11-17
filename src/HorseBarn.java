public class HorseBarn
{
    private Horse[] spaces;

    public HorseBarn(Horse[] spaces)
    {
        this.spaces = spaces;
    }

    public int findHorseSpace(String name)
    {
        for (int i = 0; i < spaces.length; i++)
        {
            if (spaces[i] != null && name.equals(spaces[i].getName()))
            {
                return i;
            }
        }
        return -1;
    }

    public void consolidate()
    {
        int index = 0;
        Horse[] adjacent = new Horse[spaces.length];
        for (int i = 0; i < spaces.length; i++)
        {
            if (spaces[i] != null)
            {
                adjacent[index] = spaces[i];
                index++;
            }
        }
        spaces = adjacent;
    }
}
