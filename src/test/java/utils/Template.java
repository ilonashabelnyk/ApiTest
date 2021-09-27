package utils;

import org.apache.commons.text.StringSubstitutor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class Template {

    public static String getTemplate(String path, Map<String, Object> valueMap) {
        String template = getTemplateAsString("src/test/resources/postCart.txt");
        StringSubstitutor stringSubstitutor = new StringSubstitutor(valueMap, "[", "]");
        return stringSubstitutor.replace(template);
    }

    private static String getTemplateAsString(String path) {
        String content = null;
        try {
            content = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}