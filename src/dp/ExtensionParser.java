package dp;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ExtensionParser {
    private Extension extension;
    private final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//    private final DocumentBuilder builder = factory.newDocumentBuilder();

//    public ExtensionParser(String extensionPath) throws ParserConfigurationException, SAXException, IOException, EmptyExtensionException {
//        this.extension = new Extension(parse(builder, extensionPath));
//    }
//
//    static List<Action> parse(DocumentBuilder builder, String extensionPath) throws IOException, SAXException, EmptyExtensionException {
//        Document document = builder.parse(new File(extensionPath));
//        document.getDocumentElement().normalize();
//
//        NodeList nList = document.getElementsByTagName("action");
//
//        List<Action> actions = new ArrayList();
//
//        if (nList.getLength() < 1) {
//            throw new EmptyExtensionException();
//        } else {
//            for (int temp = 0; temp < nList.getLength(); temp++) {
//                Node node = nList.item(temp);
//                if (node.getNodeType() == Node.ELEMENT_NODE) {
//                    Element eElement = (Element) node;
//                    actions.add(new Action(
//                            eElement.getElementsByTagName("command").item(0).getTextContent(),
//                            eElement.getElementsByTagName("title").item(0).getTextContent(),
//                            eElement.getElementsByTagName("description").item(0).getTextContent(),
//                            eElement.getElementsByTagName("color").item(0).getTextContent(),
//                            eElement.getElementsByTagName("icon").item(0).getTextContent()
//                    ));
//                }
//            }
//        }
//        return actions;
//    }

    public void setExtension(Extension extension) {
        this.extension = extension;
    }

    public Extension getExtension() {
        return extension;
    }
}
