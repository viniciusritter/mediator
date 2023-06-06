class MediatorExample {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoomImpl();

        User user1 = new User("Daniele", chatRoom);
        User user2 = new User("Thiago", chatRoom);
        User user3 = new User("Vinicius", chatRoom);

        user1.sendMessage("Oi, pessoal");
        user2.sendMessage("Oi, Dani");
        user3.sendMessage("Oi, Dani e Vini");
    }
}
    
