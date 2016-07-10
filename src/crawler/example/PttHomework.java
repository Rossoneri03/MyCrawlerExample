package crawler.example;

import com.github.abola.crawler.CrawlerPack;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


/**
 * 簡易練習
 * 
 * 找出所有文章中按推的id
 * 
 * @author Abola Lee
 *
 */
public class PttHomework {
	
	public static void main(String[] args) {
		String uri = "https://www.ptt.cc/bbs/Gossiping/M.1467117389.A.62D.html";
		

//		System.out.println(
//			CrawlerPack.start()
//			    .addCookie("over18", "1")
//				.getFromHtml(uri)
//				.select(".push-tag:matchesOwn(噓) + .push-userid")
////				.select(".push-tag:matchesOwn(推) + span")
//				.toString()
//		);

		Document jsoup =CrawlerPack.start()
				.addCookie("over18", "1")
				.getFromHtml(uri);
		for(Element elm : jsoup.select("div.push")){
			System.out.print(elm.select(".push-tag").text());
			System.out.print(elm.select(".push-userid").text());
			System.out.print(elm.select(".push-content").text());
			System.out.println( );
		}


	}
}
