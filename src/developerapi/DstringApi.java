package developerapi;

//import userapi.StringApi;

public class DstringApi {

    public int strlen(String string)
    {
        return string.length();
    }
    public String strupper(String string)
    {
        return  string.toUpperCase();
    }
    public String strlower(String string)
    {
        return  string.toLowerCase();
    }
    public String strsubstring(String string)
    {
        int start=2,end=4;
        return  string.substring(start,end);
    }



    public static void main(String[] args) {
        DstringApi dd = new DstringApi();
        //        StringApi stringApi=new StringApi();

        System.out.println(dd.strlen("Mimoh solanki"));
        System.out.println(dd.strupper("ami"));
        System.out.println(dd.strlower("ami"));
        System.out.println(dd.strsubstring("adksdd"));

    }

}
