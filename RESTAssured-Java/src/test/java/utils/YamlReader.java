package utils;

import org.apache.commons.io.IOUtils;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;

public class YamlReader {

    String yamlString;

    public YamlReader(String filePath) {
        try {
            yamlString = IOUtils.toString(new FileInputStream(new File(filePath)));
        }
        catch (Exception e){
            System.out.println("File not found");
        }
    }


    @Override
    public String toString(){
        return yamlString;
    }

    public String get(String nodePath){
        try {
            Object value = mapOfYamlString();
            for (String node : nodePath.split("\\.")) {
                value = ((Map) value).get(node);
            }
            return value.toString();
        }
        catch (Exception e){
            return null;
        }
    }


    private Map<String, Object> mapOfYamlString(){
        return (Map<String,Object>)(new Yaml()).load(yamlString);
    }
}