package zadaca3;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        XmlCreator xml = new XmlCreator();
        List<Student> s = new ArrayList<Student>();
        s.add(new Student("Ivan", "Trajkovski", 100));
        s.add(new Student("Nikola", "Stojanovski", 105));
        xml.createXMLFile("xml.xml", s);
    }
}

