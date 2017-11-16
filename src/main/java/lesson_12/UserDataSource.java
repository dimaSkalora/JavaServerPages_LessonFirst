package lesson_12;

import java.io.*;

public class UserDataSource {
    public User getByUserNamesAndPassword(String userName, String password){
        FileReader fileReader;
        try {
            fileReader = new FileReader(new File("c://Eclip/user.txt"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line=null;
            while((line=bufferedReader.readLine()) != null){
                String[] cols = line.split(",");

                if(cols[0].equals(userName) && cols[1].equals(password)){
                    User user = new User();
                    user.setUserName(cols[0]);
                    user.setPassword(cols[1]);
                    user.setFirstName(cols[2]);
                    user.setLastName(cols[3]);
                    user.setAge(Integer.parseInt(cols[4]));

                     return user;
                }
            }

            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
