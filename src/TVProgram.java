public class TVProgram {
    private String name;
    private int duration;
    private boolean isHypersensitive;

    public TVProgram(String name, int duration, boolean isHypersensitive) {
        this.name = name;
        this.duration = duration;
        this.isHypersensitive = isHypersensitive;
    }
    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public boolean isHypersensitive() {
        return isHypersensitive;
    }
    @Override
    public String toString() {
        return "TVProgram{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", isHypersensitive=" + isHypersensitive +
                '}';
    }
}

