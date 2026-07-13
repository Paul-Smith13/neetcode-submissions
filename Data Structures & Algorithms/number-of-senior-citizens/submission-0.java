class Solution {
    public static int countSeniors(String[] details) {
        int count = 0;
        for (String iDetails : details) {
            //0-9 = phone no.
            //10 = gender
            //11 & 12 = age
            //13 & 14 = seat
            
            int decade = (iDetails.charAt(11) - '0') * 10;
            //System.out.println("Decade = " + decade);
            int year = iDetails.charAt(12) - '0';
            //System.out.println("Year = " + year);
            int age = decade + year;
            //System.out.println("Age = " + age);
            if (age > 60) {count++;} 
        }
        return count;
    }
}