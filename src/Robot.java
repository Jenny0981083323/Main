//封裝
public class Robot {
    private  String name;
    private  int madeYear;
    public  Robot (String name,int madeYear){
        this.name=name;
        this.madeYear=madeYear;

    }
    public  String getName(){//讀取
        return name;
    }

    public void setName(String name) {//更改
        this.name = name;
    }

    public int getMadeYear() {
        return madeYear;
    }

    public void setMadeYear(int madeYear) {
        this.madeYear = madeYear;
    }
}
