// Ascending order

public class Parallelsortasc {
    public static void main(String[] args) {
        String[] names = {"Amit", "Neha", "Ravi"};
        int[] marks = {85, 92, 78};

        for(int i=0; i<marks.length-1; i++){
            for(int j = 0; j<marks.length-1-i; j++){
                if(marks[j]>marks[j+1]){
                    int tempMarks = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = tempMarks;

                    String tempName = names[j];
                    names[j] = names[j+1];
                    names[j+1] = tempName;

                }
            }
        }
        for(int i = 0; i<marks.length;i++){
            System.out.println(names[i]+ "-" + marks[i]);
        }

    }
}


// Descending order
/*public class Parallelsortasc {
    public static void main(String[] args) {
        String[] names = {"Amit", "Neha", "Ravi"};
        int[] marks = {85, 92, 78};

        for(int i=0; i<marks.length-1; i++){
            for(int j = 0; j<marks.length-1-i; j++){
                if(marks[j]<marks[j+1]){
                    int tempMarks = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = tempMarks;

                    String tempName = names[j];
                    names[j] = names[j+1];
                    names[j+1] = tempName;

                }
            }
        }
        for(int i = 0; i<marks.length;i++){
            System.out.println(names[i]+ "-" + marks[i]);
        }

    }
}*/

