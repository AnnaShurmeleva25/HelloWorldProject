package by.teachmeskills.HomeWork9;

public class RandomCandidate {
        private int id;
        private String name;
        static int count;

        static {
            count = 0;
        }

        public RandomCandidate() {
            count++;
        }
    }
