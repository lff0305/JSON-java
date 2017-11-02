import org.json.JSONObject;
import org.junit.Test;

/**
 * @author Feifei Liu
 * @datetime 2017-11-02  17:48
 */

public class TestJSONObject {
    @Test
    public void testValue() {
        JSONObject o = new JSONObject();
        System.out.println(o.optJSONObject("a").optJSONObject("b"));
    }

    @Test
    public void testArray() {
        JSONObject o = new JSONObject();
        System.out.println(o.optJSONArray("a").optJSONObject(123));
    }
}
