package RegularExpress;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jiatieying on 2017/1/3.
 */
public class RETest {
    public static void main( String args[] ){
//        test1();
//        test2();
        test3();
//        String a = "<test>";
//        a.replaceAll("<","&lt;");
//        System.out.println(a.replaceAll("<","&lt;"));
    }


    public static void test3(){
        String str ="<!DOCTYPE html><html><head><title></title><meta name=\"referrer\" content=\"never\"/></head><body><script type=\"text/javascript\">function qs(n,m,v,u){u=u||D.URL;var t=u.match(eval('/(\\\\?|#|&)('+n+')=([^&]*)(&|$)/i'));if(t){m=m||t[2];v=t[3]||v}return m&&v?'&'+m+'='+v:''}function fc(){var h=location.host,x='=;expires='+new Date(0).toUTCString(),y=x+';path=',z=y+'/;domain=',l=[x,y,y+'/',z+h,z+h.substr(h.indexOf('.'))],o=D.cookie.match(/[^ =;]+(?=\\=)/g);if(o&&S)for(var i=o.length;i--;)for(var j=5;j--;)D.cookie=o[i]+l[j];if(window.localStorage)localStorage.clear();if(window.sessionStorage)sessionStorage.clear();setTimeout(fc,500)}function fj(){var u=('https://m.baidu.com/?'+(D.URL.match(/pu=sz(%|@)\\d+_\\d+/i)||[''])[0]+'&from=\\x31\\x30\\x30\\x30\\x39\\x35\\x30\\x70').replace(/(\\?|#)&/g,'$1');if(navigator.userAgent.match(/webkit/i))D.body.appendChild(D.createElement('iframe')).src='javascript:parent.location.replace(\\''+encodeURI(u)+'\\')';else D.write('<meta http-equiv=\\'Refresh\\'content=\\'0;Url='+u+'\\'/>');D.close()}var D=document,d=D,S=!D.cookie.match(/home=s/i);D.body.style.visibility='hidden';D.oncontextmenu=function(){return false};fc();fj()</script></body></html>\n";
        String regex = "/ip:*.kk/";
        String regex1 = "<title>.*?</title>";
        String newStr = "xxx";
        String str2 = str.replaceAll(regex1, newStr);
        System.out.println(str2);
    }

    public static void test2() {
        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
//        String pattern = "(\\D*)(\\d+)(.*)";
        String pattern = "(\\D*)";
        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println(m.groupCount());
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
//            System.out.println("Found value: " + m.group(2) );
            System.out.println(m.matches());
        } else {
            System.out.println("NO MATCH");
        }
    }

    public static void test1(){
        // 生成 Pattern 对象并且编译一个简单的正则表达式"Kelvin"
        Pattern p = Pattern.compile("Kevin");
        // 用 Pattern 类的 matcher() 方法生成一个 Matcher 对象
        Matcher m = p.matcher("Kelvin Li and Kelvin Chan are both working in " +
                "Kelvin Chen's KelvinSoftShop company");
        StringBuffer sb = new StringBuffer();
        int i=0;
        // 使用 find() 方法查找第一个匹配的对象
        boolean result = m.find();
        // 使用循环将句子里所有的 kelvin 找出并替换再将内容加到 sb 里
        while(result) {
            i++;
            m.appendReplacement(sb, "Kevin");
            System.out.println("第"+i+"次匹配后 sb 的内容是："+sb);
            // 继续查找下一个匹配对象
            result = m.find();
        }
        // 最后调用 appendTail() 方法将最后一次匹配后的剩余字符串加到 sb 里；
        m.appendTail(sb);
        System.out.println("调用 m.appendTail(sb) 后 sb 的最终内容是 :"+
                sb.toString());
    }
}
