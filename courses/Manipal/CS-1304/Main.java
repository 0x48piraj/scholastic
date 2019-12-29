import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;


private static String patternMatcher(String content, String patternText, int groupIndex) {
    Pattern pattern = Pattern.compile(patternText);
    Matcher matcher = pattern.matcher(content);

    if (matcher.find()) {
        return matcher.group(groupIndex);
    } else {
        return "";
    }
}

public static String getPackageName(String content) {
    return patternMatcher(content, ".*package\\s+(.*)\\s*\\;", 1);
}

public static String getClassName(String content) {
    return patternMatcher(content, ".*class\\s+(\\w+)[\\w\\s]+\\{", 1);
}

public static String getClassCode(String content) {
    return patternMatcher(content, ".*class.*\\{((.*\\s*)*)\\}", 1);
}

public static String getMethodName(String code) {
    String uncommentedCode = removeComments(code).trim();

    return patternMatcher(uncommentedCode,
            "(public|private|static|protected|abstract|native|synchronized) *([\\w<>.?, \\[\\]]*)\\s+(\\w+)\\s*\\([\\w<>\\[\\]._?, \\n]*\\)\\s*([\\w ,\\n]*)\\s*\\{",
            3);
}

public static String removeComments(String content) {
    return content.replaceAll("\\/\\*[\\s\\S]*?\\*\\/|([^:]|^)\\/\\/.*$", "$1 ").trim();
}

public class Main {
	public final static String _main = "public static void main";
	public final static String _class = "public class <ClassName> {";
	public final static String _implements = "implements <InterfaceName>";
	public final static String _extends = "extends <ClassName>";
	public final static String _function = "<AccessModName> static void <FuncName>";

    public static void main(String[] args) throws IOException {
        String fileName = "source.txt";
        System.out.println(_main);
        //read using FileReader, no encoding support, not efficient
        readUsingFileReader(fileName);
    }

    private static void readUsingFileReader(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        System.out.println("Reading text file using FileReader"); 
        while((line = br.readLine()) != null){
            //process the line
            System.out.println(line);
        }
        br.close();
        fr.close();
        
    }
}

/*public class Patterns {


}*/