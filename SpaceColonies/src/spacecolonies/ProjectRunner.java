package spacecolonies;

import bsh.ParseException;

public class ProjectRunner {
    public static void main(String... args)
        throws ParseException, SpaceColonyDataException {
        if (args.length == 2) {
            new ColonyReader(args[0], args[1]);
        }
        else {
            new ColonyReader("input.txt", "planets.txt");
        }
    }
}
