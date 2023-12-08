package structural_design_pattrens.proxy;

public class SystemProxy implements SystemActions {


    private boolean isAdmin;
    private AndroidSystem androidSystem;

    public SystemProxy(String user, String pwd) {
        if ("medo".equals(user) && "pass".equals(pwd)) {
            isAdmin = true;
        }
        this.androidSystem = new AndroidSystem();
    }

    @Override
    public void boot() {
        if (isAdmin) {
            androidSystem.boot();
        } else {
            System.out.println("Can't boot: You are not admin !");
        }
    }

    @Override
    public void restart() {
        if (isAdmin) {
            androidSystem.restart();
        } else {
            System.out.println("Can't restart: You are not admin !");
        }
    }

    @Override
    public void shoutDown() {
        if (isAdmin) {
            androidSystem.shoutDown();
        } else {
            System.out.println("Can't shoutDown: You are not admin !");
        }
    }
}
