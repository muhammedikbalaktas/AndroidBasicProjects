package com.example.fileio;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileIOManager {

    public String readFromFile(Context context)  {
        String ret = "";

        try {
            InputStream inputStream = context.openFileInput("Data.txt");

            if ( inputStream != null ) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString = "";
                StringBuilder stringBuilder = new StringBuilder();

                while ( (receiveString = bufferedReader.readLine()) != null ) {
                    stringBuilder.append("\n").append(receiveString);
                }

                inputStream.close();
                ret = stringBuilder.toString();
            }
        } catch (IOException e) {



        }
        return ret;


    }
    public void writeToFile(Context context,String input){
        try {



            OutputStreamWriter outputStreamWriter =
                    new OutputStreamWriter(context.openFileOutput("Data.txt", Context.MODE_PRIVATE));

            outputStreamWriter.write(input);
            outputStreamWriter.close();
        }
        catch (IOException e) {



        }

    }
}
