
public class Stud{
    int id_stud;
    String first_nm;
    String last_nm;
    String Dept;
    

    //Method -1
    public String getinfo(){
        return("id_stud   :"+id_stud+" first_nm    :"+first_nm+ "last_nm  :"+last_nm +"Dept   :"+Dept);;
    }
    class Determine{
    public static void MCA(String []args) {
        Students st = new Student();
        st.id_stud=2001;
        st.first_nm="Nitin";
        st.last_nm="Yadav";
        st.Dept="Master of Computer Application";
    }

  } 
 }
