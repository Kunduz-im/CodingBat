package ProjectString;

public class String2 {

    //1
    public String doubleChar(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 += str.charAt(i);
            str2 += str.charAt(i);
        }
        return str2;
    }

    //2
    public int countHi(String str) {
        int count =0;
        if (str.length()>=2) {
            for (int i = 0; i < str.length()-1; i++) {
                if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                    count++;
                }
            }
        }
        return count;
    }

    //3
    public boolean catDog(String str) {
        int countCat=0;
        int countDog=0;

        char [] strArr = str.toCharArray();

        for (int i = 0; i < strArr.length-2; i++) {
            if (strArr[i] == 'c' && strArr[i+1] == 'a' && strArr[i+2] == 't'){
                countCat++;
            }
        }

        for (int i = 0; i < strArr.length-2; i++) {
            if (strArr[i] == 'd' && strArr[i+1] == 'o' && strArr[i+2] == 'g'){
                countDog++;
            }
        }

        return countDog==countCat;
    }

    //4
    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e'){
                count++;
            }
        }
        return count;
    }

    //5
    public boolean endOther(String a, String b) {
        String str1= a.toLowerCase();
        String str2 = b.toLowerCase();
        if (str1.endsWith(str2) || str2.endsWith(str1)){
            return true;
        } else {
            return false;
        }
    }

    //6
    public boolean xyzThere(String str) {
        if (str.length() >= 3 && str.substring(0,3).equals("xyz")){
            return true;
        }

        for (int i = 1; i <= str.length()-3; i++) {
            if (str.substring(i,i+3).equals("xyz")){
                if (str.charAt(i-1) != '.'){
                    return true;
                }
            }
        }
        return false;
    }

    //7
    public boolean bobThere(String str) {
        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i)=='b' && str.charAt(i+2) == 'b'){
                return true;
            }
        }
        return false;
    }

    //8
    public boolean xyBalance(String str) {
        int lastX = str.lastIndexOf("x");

        if (!(str.contains("x"))){
            return true;
        } else if (str.substring(lastX+1).contains("y")) {
            return true;
        } else {
            return false;
        }
    }

    //9
    public String mixString(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int maxLeb = Math.max(a.length(),b.length());

        for (int i = 0; i < maxLeb; i++) {
            if (i < a.length()){
                sb.append(a.charAt(i));
            }
            if (i < b.length()){
                sb.append(b.charAt(i));
            }
        }

        return sb.toString();
    }

    //10
    public String repeatEnd(String str, int n) {
        String substring = str.substring(str.length()-(n), str.length());
        String result ="";
        if(str.length() >= n){
            for(int i=0; i<n; i++){
                result+=substring;
            }
        }
        return result;
    }

    //11
    public String repeatFront(String str, int n) {
        String res = "";
        if (n>=0 && n<= str.length()){
            for (int i = 0; i < n; i++) {
                res += str.substring(0,n-i);
            }

        }
        return res;
    }

    //12
    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder sb = new StringBuilder();
        if (count == 0){
            return "";
        }

        sb.append(word);

        for (int i = 1; i < count; i++) {
            sb.append(sep);
            sb.append(word);
        }

        return sb.toString();
    }


    //13
    public boolean prefixAgain(String str, int n) {
        String pre = str.substring(0, n);
        if (str.substring(n).contains(pre)) {
            return true;
        } else {
            return false;
        }
    }

    //14
    public boolean sameStarChar(String str) {
        boolean found = true;
        for (int i = 0; i < str.length(); i++) {
            if (i - 1 >= 0 && i +1 <= str.length()-1) {
                if (str.charAt(i) == '*') {
                    if (str.charAt(i-1) != str.charAt(i+1)){
                        found = false;
                        break;
                    }
                }
            }
        }
        return found;
    }

    //15
    public String starOut(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            boolean remove = (str.charAt(i) == '*' ||
                    (i > 0 && str.charAt(i - 1) == '*' || i < str.length()-1 && str.charAt(i + 1) == '*'));
            if (!remove){
                result += str.charAt(i);
            }
        }
        return result;
    }

    //16
    public boolean xyzMiddle(String str) {
        if (str.length()<3){
            return false;
        }

        int center = str.length()/2;
        int bestDistance = Integer.MAX_VALUE;
        int bestIndex = -1;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {

                int distance = Math.abs( i + 1 - center);
                if (distance < bestDistance){
                    bestDistance = distance;
                    bestIndex = i;
                }
            }
        }

        if (bestIndex == -1){
            return false;
        }

        String left = str.substring(0, bestIndex);
        String right = str.substring(bestIndex + 3);

        int diff = Math.abs(left.length()-right.length());

        return diff<=1;

    }

    //17
    public String oneTwo(String str) {
        String result = "";
        for (int i = 0; i + 3 <= str.length(); i+=3) {
            String first = str.substring(i,i+1);
            String nexttwo = str.substring(i+1,i+3);
            String newgroup = nexttwo+first;
            result += newgroup;
        }
        return result;
    }

}
