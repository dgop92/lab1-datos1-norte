package logic;

import java.io.IOException;
import java.util.HashMap;

import pseudofiles.PseudoFile;
import pseudofiles.PseudoFileReader;

public class PseudoSearch {

    public static String findValueByKey(PseudoFile pseudoFile, 
        String fieldToRetrieve, String keyField, String key) 
        throws IOException{
        
        PseudoFileReader pseudoReader = new PseudoFileReader(pseudoFile);

        pseudoReader.readRegister();
        while (!pseudoReader.EFO()){

            if(pseudoReader.getField(keyField).equals(key)){
                return pseudoReader.getField(fieldToRetrieve);
            }

            pseudoReader.readRegister();
        }
        pseudoReader.close();
        
        return null;
    }

    public static HashMap<String, String> findRegisterByKey(
        PseudoFile pseudoFile, 
        String keyField, 
        String key) throws IOException{
        
        PseudoFileReader pseudoReader = new PseudoFileReader(pseudoFile);

        pseudoReader.readRegister();
        while (!pseudoReader.EFO()){

            if(pseudoReader.getField(keyField).equals(key)){
                return pseudoReader.getCurrRegister();
            }

            pseudoReader.readRegister();
        }
        pseudoReader.close();
        
        return null;
    }
}
