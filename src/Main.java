import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // 네이버 랭킹 뉴스 URL
            String naverNewsUrl = "https://news.naver.com/main/ranking/popularDay.naver";

            // Jsoup을 사용하여 웹 페이지를 가져오기
            Document doc = Jsoup.connect(naverNewsUrl).get();

            // 웹 페이지에서 기사 제목을 가져오기
            Elements newsHeadlines = doc.select(".list_content a");

            // 가져온 기사 제목 출력
            for (Element headline : newsHeadlines) {
                System.out.println(headline.text());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}