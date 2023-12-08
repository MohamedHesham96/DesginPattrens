package structural_design_pattrens.proxy;

public class ProxyPatternTest {

    public static void main(String[] args) {
        System.out.println("Login as admin");
        SystemProxy systemProxyAdmin = new SystemProxy("medo", "pass");
        systemProxyAdmin.boot();
        systemProxyAdmin.restart();
        systemProxyAdmin.shoutDown();

        System.out.println("Login as user");
        SystemProxy systemProxyUser = new SystemProxy("ahmed", "pass");
        systemProxyUser.boot();
        systemProxyUser.restart();
        systemProxyUser.shoutDown();
    }
}
