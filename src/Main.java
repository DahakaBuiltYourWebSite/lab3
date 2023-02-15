public class Main {
    public static void main(String[] args) {
        TVProgramDirector director = new TVProgramDirector();

        director.addProgram(new TVProgram("News", 30, false));
        director.addProgram(new TVProgram("Movie", 120, false));
        director.addProgram(new TVProgram("Cartoon", 60, true));
        director.addProgram(new TVProgram("Advertisement", 15, false));
        System.out.println("Programs: " + director.getPrograms());
        System.out.println("Longest Program: " + director.getLongestProgram());
        System.out.println("Hypersensitive Programs: " + director.getHypersensitivePrograms());
        System.out.println("Total Duration: " + director.getTotalDuration());

        System.out.println("Programs sorted by duration: ");
        director.sortProgramsByDuration();
        System.out.println(director.getPrograms());

        System.out.println("Programs sorted by hypersensitivity: ");
        director.sortProgramsByHypersensitivity();
        System.out.println(director.getPrograms());
    }
}