package ExtendTest;

/**
 * Created by Administrator on 2016/8/5.
 */
public class Parent {
    private String shareString;
    private String parentString;
    private String someString;

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    public String getShareString() {
        return shareString;
    }

    public void setShareString(String shareString) {
        this.parentString = "shared";
        this.shareString = shareString;
    }

    public String getParentString() {
        return parentString;
    }

    public void setParentString(String parentString) {
        this.parentString = parentString;
    }
}
