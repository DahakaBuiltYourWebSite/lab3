import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TVProgramDirector {
    private List<TVProgram> programs = new ArrayList<>();

    public void addProgram(TVProgram program) {
        programs.add(program);
    }

    public void removeProgram(TVProgram program) {
        programs.remove(program);
    }

    public List<TVProgram> getPrograms() {
        return programs;
    }
    public TVProgram getLongestProgram() {
        TVProgram longestProgram = programs.get(0);
        for (TVProgram program : programs) {
            if (program.getDuration() > longestProgram.getDuration()) {
                longestProgram = program;
            }
        }
        return longestProgram;
    }
    public List<TVProgram> getHypersensitivePrograms() {
        List<TVProgram> hypersensitivePrograms = new ArrayList<>();
        for (TVProgram program : programs) {
            if (program.isHypersensitive()) {
                hypersensitivePrograms.add(program);
            }
        }
        return hypersensitivePrograms;
    }
    public int getTotalDuration() {
        int totalDuration = 0;
        for (TVProgram program : programs) {
            totalDuration += program.getDuration();
        }
        return totalDuration;
    }

    public void sortProgramsByDuration() {
        Collections.sort(programs, (o1, o2) -> o2.getDuration() - o1.getDuration());
    }

    public void sortProgramsByHypersensitivity() {
        Collections.sort(programs, (o1, o2) -> {
            if (o1.isHypersensitive() == o2.isHypersensitive()) {
                return 0;
            }
            return o1.isHypersensitive() ? -1 : 1;
        });
    }
}

