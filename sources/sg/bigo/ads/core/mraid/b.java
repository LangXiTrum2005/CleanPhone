package sg.bigo.ads.core.mraid;

import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final float f48623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Rect f48624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<Rect> f48625c;

    public b(float f, Rect rect, List<Rect> list) {
        this.f48623a = f;
        this.f48624b = rect;
        this.f48625c = list;
    }

    public static JSONArray a(List<Rect> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<Rect> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(a(it.next()));
        }
        return jSONArray;
    }

    public static JSONObject a(Rect rect) {
        if (rect == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", rect.left);
            jSONObject.put("y", rect.top);
            jSONObject.put("width", rect.width());
            jSONObject.put("height", rect.height());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
