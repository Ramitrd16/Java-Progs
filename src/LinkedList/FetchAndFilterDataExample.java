package LinkedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class FetchAndFilterDataExample {
    public static void main(String[] args) {
        try {
            // Define the URL
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
            
            // Open a connection to the URL
            URLConnection connection = url.openConnection();
            
            // Get the input stream from the connection
            InputStream inputStream = connection.getInputStream();
            
            // Wrap the input stream with a BufferedReader to read the data
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            
            // StringBuilder to store the entire JSON response
            StringBuilder result = new StringBuilder();
            
            // Variable to store each line of data
            String line;
            
            // Read each line from the BufferedReader and append it to the result
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            
            // Close the reader
            reader.close();
            
            // Extract the data string from the JSON response
            String response = result.toString();
            String data = response.split("\"data\":")[1].replaceAll("[{}\"]", "").trim();
            
            // Split the data into key-value pairs
            String[] pairs = data.split(", ");
            int count = 0;
            
            // Iterate over the pairs to find keys where age > 50
            for (int i = 0; i < pairs.length; i += 2) {
                // Extract key and age
                String key = pairs[i].split("=")[1];
                int age = Integer.parseInt(pairs[i + 1].split("=")[1]);
                
                // Check if the age is greater than 50
                if (age > 50) {
                    System.out.println("Key: " + key + ", Age: " + age);
                    count++;
                }
            }
            
            // Print the total count of keys where age > 50
            System.out.println("Total count where age > 50: " + count);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
