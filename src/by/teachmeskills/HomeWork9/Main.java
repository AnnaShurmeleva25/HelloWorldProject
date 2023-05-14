package by.teachmeskills.HomeWork9;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Voter voter = new Voter();
            voter.vote();
        }
        System.out.println("count Voter " + Voter.count);
        System.out.println("count OfficialCandidate " + OfficialCandidate.count);
        System.out.println("count IllegalCandidate " + IllegalCandidate.count);
        System.out.println("count RandomCandidate " + RandomCandidate.count);

    }
}

