// Nama: Mochammad Febrian Maulana Hesda
// NIM: 21090060
// Kelas: 2D
// Tugas: Bubble Sort Nama Teman, 04-06-2022



public class Bubble_Sort_Nama {

    private String[] data;

    //constructor
    public Bubble_Sort_Nama(){
    }

    public String[] getData() {return data;}

    public void setData(String[] data){
        this.data = data;
    }

    public void sortData(){
        int lenData = this.data.length;
        for(int i=0; i<lenData;i++){
            for(int j=i+1;j<lenData;j++){
                if(this.data[j].compareToIgnoreCase(this.data[i])<0){
                    String temp = this.data[j];
                    this.data[j] = this.data[j];
                    this.data[j] = temp;
                }
            }
        }
    }
    public void printData(){
        for (String datum : this.data){
            System.out.println(datum+ " ");
        }
    }

    public static void main(String[] args) {
        String[] nama = {"Indra", "Sholih", "Jordy", "Adi", "Eva", "Rohman", "Naufal", "Beki", "Gading", "Dika", "Atta"};
        Bubble_Sort_Nama _mybuble2 = new Bubble_Sort_Nama();
        _mybuble2.setData(nama);
        _mybuble2.sortData();
        _mybuble2.printData();
    }
}