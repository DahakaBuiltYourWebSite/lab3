import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;
import java.net.http.HttpRequest;

class ObjectManager{
    String filepath = "C:\\XboxGames\\lab3_1\\files\\info.xml";
    public Document readXMLFile(String filePath) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File(filePath));
        return document;
    }
    public Object generateObject(Node node) {
        // your object generation logic here
        return null;
    }
    public HttpRequest generateRequest(Node node) {
        // your request generation logic here
        return null;
    }
}