package Task2;

public class Cinema {
    String[][] seats;

    public Cinema(int i) {
    }

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public int Cinema(int rows, int seats) {
        //this seats[0][0] = "X";
        //this seats = new String[rows][seats];

        this.seats = new String[rows][seats];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                this.seats[i][j] = "0"; // Jeg initialisere alle sæder til O
            }
        }
        this.seats[0][0] = "X"; //Canselrasevation er sat til at tjek X

        return seats;
    }

    public int getSeats() {
        return seats[0].length;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {
        if (seats[row][seat].equals("O")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("X")) { //her ændres lille X til stort
            seats[row][seat] = "0";
            return true;
        }
        return false;
    }

    public String toString() {
        String result = ""; //I stedet for null instasiere vi bare en tom string
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }

    public int getRows() {
        return 0;
    }
}

