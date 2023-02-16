import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Main {
    static{
        new DOMConfigurator().doConfigure("log/log4j.xml",
                LogManager.getLoggerRepository());
    }
    private static final Logger LOG = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        LOG.info("Starting program_");
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