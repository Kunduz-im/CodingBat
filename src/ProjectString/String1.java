package ProjectString;

public class String1 {

    //1
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    //2
    public String makeAbba(String a, String b) {
        return a+b+b+a;
    }

    //3
    public String makeTags(String tag, String word) {
        return '<' + tag + '>' + word + "</" + tag +'>';
    }

    //4
    public String makeOutWord(String out, String word) {
        String start = out.substring(0,2);
        String end = out.substring(2);
        return start + word +end;
    }

    //5
    public String extraEnd(String str) {
        String extra = str.substring(str.length()-2);
        if (str.length() >= 2 ) {
            return extra+extra+extra;
        } else return "";
    }

    //6
    public String firstTwo(String str) {
        if (str.length()>=2){
            return str.substring(0,2);
        }else if (str.length()==1) {
            return str.substring(0,1);
        } else {
            return "";
        }
    }


    //7
    public String firstHalf(String str) {
        String str2 = str.substring(0,str.length()/2);
        return str2;
    }


    //8
    public String withoutEnd(String str) {
        if (str.length()>=2){
            return str.substring(1, str.length()-1);
        } else return "";
    }


    //9
    public String comboString(String a, String b) {
        if (a.length()>b.length()){
            return b+a+b;
        } else if (b.length()>a.length()) {
            return a+b+a;
        } else {
            return "";
        }
    }

    //10
    public String nonStart(String a, String b) {
        String str1 = a.substring(1);
        String str2 = b.substring(1);
        return str1.concat(str2);
    }

    //11
    public String left2(String str) {
        String ftwo = str.substring(0,2);
        if (str.length()>2){
            return str.replace(ftwo,"").concat(ftwo);
        } else if (str.length()==2 || str.length() ==1 ) {
            return str;
        }else return "";
    }

    //12
    public String right2(String str) {
        String ltwo = str.substring(str.length()-2);
        String start = str.substring(0, str.length()-2);
        if (str.length()>2){
            return ltwo.concat(start);
        } else if (str.length()==2) {
            return str;
        } else {
            return "";
        }
    }

    //13
    public String theEnd(String str, boolean front) {
        if (front){
            return str.substring(0,1);
        } else {
            return str.substring(str.length()-1);
        }
    }

    //14
    public String withoutEnd2(String str) {

        if (str.length()>2){
            return str.substring(1, str.length()-1);
        } else {
            return "";
        }
    }

    //15
    public String middleTwo(String str) {
        int mid = str.length()/2;
        if (str.length()>2){
            return str.substring(mid-1,mid+1);
        } else if (str.length() ==2 ) {
            return str;
        } else {
            return "";
        }
    }

    //16
    public boolean endsLy(String str) {
        if (str.endsWith("ly")){
            return true;
        } else {
            return false;
        }
    }

    //17
    public String nTwice(String str, int n) {
        if (str.length()>n){
            return str.substring( 0, n).concat(str.substring(str.length()-n));
        } else if (str.length()==n) {
            return str.concat(str);
        } else return "";
    }


    //18
    public String twoChar(String str, int index) {
        if (index>=0 && index +2 <= str.length()){
            return str.substring(index,index+2);
        } else {
            return str.substring(0,2);
        }
    }

    //19
    public String middleThree(String str) {
        int middle = str.length()/2;
        return str.substring(middle-1,middle+2);
    }

    //20
    public boolean hasBad(String str) {
        if (str.length() >= 3 && (str.substring(0,3).contains("bad")) || str.length() >= 4 && (str.substring(1,4).contains("bad"))){
            return true;
        } else if (str.length()<3){
            return false;
        }else{
            return false;
        }
    }


}
