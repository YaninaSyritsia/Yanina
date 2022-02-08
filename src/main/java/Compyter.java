public class Compyter {
    private int memory;
    private int cpu;
    String name;

    Compyter () {};

    Compyter (int Memory, int Cpu, String Name){
        this.memory = Memory;
        this.cpu = Cpu;
        this.name = Name;
    }

    void getCpu() {
        System.out.println(cpu);
    }
    void getMemory() {
        System.out.println(memory);
    }

    void setMemory (int m) {
        memory = m;
    }


}
