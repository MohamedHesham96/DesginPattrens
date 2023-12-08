package structural_design_pattrens.proxy;

public class AndroidSystem implements SystemActions {

    @Override
    public void boot() {
        System.out.println("Boot the system");
    }

    @Override
    public void restart() {
        System.out.println("Restart the system");
    }

    @Override
    public void shoutDown() {
        System.out.println("ShoutDown the system");
    }
}
