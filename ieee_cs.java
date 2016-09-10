// set classpath=jsoup-1.8.1.jar;.;%CLASSPATH%

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

class ieee_cs
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine(); //assuming input is in the format "filename classname"
    String filename=str.substring(0,str.indexOf(" "));
    String classname=str.substring(str.indexOf(" ")+1);
    File input=null;
    Document doc=null;
    try
    {
      input=new File(filename);
      doc=Jsoup.parse(input,"UTF-8");
    }
    catch(IOException ioe)
    {
      ioe.printStackTrace();
    }
    Elements ele=doc.getElementsByClass(classname);
    for(Element e:ele)
    {
      System.out.println(e.text());
    }
  }
}
