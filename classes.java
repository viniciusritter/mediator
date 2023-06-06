import java.util.Date;

interface ChatRoom {
    void showMessage(User user, String message);
}

class ChatRoomImpl implements ChatRoom {
    @Override
    public void showMessage(User user, String message) {
        System.out.println(new Date().toString() + "[" + user.getName() +"] : " + message);
    }
}

class User {
    private String name;
    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        chatRoom.showMessage(this, message);
    }
}