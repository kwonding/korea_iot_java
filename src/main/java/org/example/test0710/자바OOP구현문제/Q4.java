package org.example.test0710.자바OOP구현문제;

interface Playable {
    abstract void play();
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("피아노소리");
    }
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("기타소리");
    }
}
public class Q4 {
    public static void main(String[] args) {
        Playable[] playables = {
                new Piano(),
                new Guitar()
        };

        for (Playable inst : playables) {
            inst.play();
        }
    }
}
