import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.lang.reflect.Type;

public class ConvertJson {
    public static String ObjectToJson(Object object){
        Gson gson;
        gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(object);
    }
    public static Object JsonFileToObject(FileReader fileReader, Type type){
        // For type when calling do: "ClassName.class" where ClassName is the type of class the json is.
        // For fileReader when calling use "new FileReader("DIRECTORY")"
        Gson gson = new Gson();
        Object object = new Object();
        return gson.fromJson(fileReader,type);
    }
}
