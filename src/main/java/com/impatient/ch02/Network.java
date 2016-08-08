package com.impatient.ch02;

import java.util.ArrayList;

/**
 * Created by sjchen on 8/7/16.
 */


public class Network {
    public class Member { // Member is an inner class of Network (drop static)
        private String name;
        private ArrayList<Member> friends = new ArrayList<>();

        public Member(String name) {
            this.name = name;
        }

        public void leave() {
            unenroll(this);
        }

        public void addFriend(Member newFriend) {
            friends.add(newFriend);
        }

        public boolean belongsTo(Network n) {
            return Network.this == n;
        }

        public String toString() {
            StringBuilder result = new StringBuilder(name);
            result.append(" with friends ");
            for (Member friend : friends) {
                result.append(friend.name);
                result.append(", ");
            }
            return result.subSequence(0, result.length() - 2).toString();
        }
    }

    private ArrayList<Member> members = new ArrayList<>();

    public Member enroll(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }

    public void unenroll(Member m) {
        members.remove(m);
    }

    public String toString() {
        return members.toString();
    }

}
