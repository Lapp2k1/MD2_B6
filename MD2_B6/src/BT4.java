

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BT4 {
    public static void main(String[] args)
    {
        try {
            Document doc
                    = Jsoup
                    .connect("https://dantri.com.vn/tin-moi-nhat.htm")
                    .get();
            Elements links = doc.select("a[href]");
            Elements images = doc.select("img[src]");
            System.out.println("Links: ");
            for (Element link : links) {
                System.out.println(link.attr("href"));
            }
            System.out.println("\n-----\n");
            System.out.println("Images:");
            for (Element image : images) {
                System.out.println(image.attr("src"));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}