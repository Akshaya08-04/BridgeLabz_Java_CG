package linkedlist;
/*
This program represents social media users using a singly linked list.
Each user stores a list of friend IDs.
*/

class userNode {

    int userId;
    String userName;
    int[] friendIds;

    userNode next;

    userNode(int userId, String userName, int[] friendIds) {
        this.userId = userId;
        this.userName = userName;
        this.friendIds = friendIds;
    }
}
