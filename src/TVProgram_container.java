import java.util.ArrayList;

public class TVProgram_container {
    private ArrayList<TVProgram> programs;

    public TVProgram_container() {
        this.programs = new ArrayList<>();
    }

    public TVProgram_container(ArrayList<TVProgram> programs) {
        this.programs = programs;
    }

    public ArrayList<TVProgram> getPrograms() {
        return programs;
    }

    public void setPrograms(ArrayList<TVProgram> programs) {
        this.programs = programs;
    }

    public void addProgram(TVProgram program) {
        programs.add(program);
    }

    public void deleteProgram(TVProgram program) {
        programs.remove(program);
    }
}

