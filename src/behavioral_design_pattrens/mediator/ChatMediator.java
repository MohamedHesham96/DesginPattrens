package behavioral_design_pattrens.mediator;

public interface ChatMediator {

    public void sendMessage(String msg, User user);

    void addUser(User user);
}