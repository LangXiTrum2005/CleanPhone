package zc;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.X3;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f54883d = TimeUnit.DAYS.toMillis(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f54886c;

    public v(String str, String str2, long j10) {
        this.f54884a = str;
        this.f54885b = str2;
        this.f54886c = j10;
    }

    public static String a(long j10, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put(X3.j.W, str2);
            jSONObject.put("timestamp", j10);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
            return null;
        }
    }

    public static v b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new v(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new v(jSONObject.getString("token"), jSONObject.getString(X3.j.W), jSONObject.getLong("timestamp"));
        } catch (JSONException e10) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
            return null;
        }
    }
}
