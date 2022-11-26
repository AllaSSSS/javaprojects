import java.util.*;

public class DrunkenGame {

    public static void main(String[] args) {
        ArrayDeque<Integer> player1 = new ArrayDeque<>(10);
        ArrayDeque<Integer> player2 = new ArrayDeque<>(10);
        ArrayList<Integer> deck = new ArrayList<>(10);
        for (int i=0; i < 10; i++) deck.add(i);
        Collections.shuffle(deck);
        for (int i=0; i < 10;) {
            player1.add(deck.get(i++));
            player2.add(deck.get(i++));
        }

        int turn = 1;
        while (!player1.isEmpty() && !player2.isEmpty()) {
            if (turn == 100_000) break;
            System.out.println("Turn " + turn++);
            System.out.println(player1);
            System.out.println(player2);
            System.out.println();
            int c1 = player1.poll();
            int c2 = player2.poll();
            ArrayDeque<Integer> winner = greaterThan(c1, c2) ? player1 : player2;
            winner.add(c1);
            winner.add(c2);
        }

        System.out.println(
                switch (Integer.compare(player1.size(), player2.size())) {
                    case +1 -> "Player 1 won";
                    case -1 -> "Player 2 won";
                    default -> "Draw";
                } + " in " + turn + " turns");
    }


    static boolean greaterThan(int c1, int c2) {
        if (c1 == 0 && c2 == 9) return true;
        if (c2 == 0 && c1 == 9) return false;
        return c1 > c2;
    }
}