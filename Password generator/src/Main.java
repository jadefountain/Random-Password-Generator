public class Main {
static String password="";
static int passwordLength=12;
    public static void main(String[] args) {
        for(int a=0; a<passwordLength; a++) {
                String[] allLetters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "`", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "=", "_", "+", ",", ".", "/", "<", ">", "?", ":", ";", "{", "}", "[", "]", "|", "\\"};
                int max = allLetters.length;
                int min = 0;
                Double allLettersNum = (Math.random() * ((max - min) + 1)) + min;
                int value = allLettersNum.intValue();
                int maxCase = 1;
                int minCase = 0;
                Double letterCase = (Math.random() * ((maxCase - minCase) + 1)) + min;
                int letterCaseValue = letterCase.intValue();
                if(value==65){
                    value--;
                }
                if(letterCaseValue==0){
                    try {
                    password = password.concat(allLetters[value].toLowerCase());
                }catch (Exception notALetter){
                    password=password.concat(allLetters[value]);
                }
                }else if(letterCaseValue==1){
                    password=password.concat(allLetters[value]);
                }
            }
            System.out.println(password);
        }
    }

