package s7;

import android.os.Build;
import cc.a2;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f50203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f50204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONArray f50205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f50206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f50207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f50208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f50209g;

    public final boolean a() {
        String str = this.f50208f;
        Long l = this.f50209g;
        a aVar = this.f50204b;
        int i10 = aVar == null ? -1 : b.f50202a[aVar.ordinal()];
        if (i10 == 1) {
            return (this.f50205c == null || l == null) ? false : true;
        }
        if (i10 != 2) {
            return ((i10 != 3 && i10 != 4 && i10 != 5) || str == null || l == null) ? false : true;
        }
        return (str == null || this.f50207e == null || l == null) ? false : true;
    }

    public final void b() {
        if (a()) {
            a2.P(this.f50203a, toString());
        }
    }

    public final String toString() {
        Long l = this.f50209g;
        a aVar = this.f50204b;
        int i10 = aVar == null ? -1 : b.f50202a[aVar.ordinal()];
        JSONObject jSONObject = null;
        try {
            if (i10 == 1) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = this.f50205c;
                if (jSONArray != null) {
                    jSONObject2.put("feature_names", jSONArray);
                }
                if (l != null) {
                    jSONObject2.put("timestamp", l);
                }
                jSONObject = jSONObject2;
            } else if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("device_os_version", Build.VERSION.RELEASE);
                jSONObject3.put("device_model", Build.MODEL);
                String str = this.f50206d;
                if (str != null) {
                    jSONObject3.put("app_version", str);
                }
                if (l != null) {
                    jSONObject3.put("timestamp", l);
                }
                String str2 = this.f50207e;
                if (str2 != null) {
                    jSONObject3.put("reason", str2);
                }
                String str3 = this.f50208f;
                if (str3 != null) {
                    jSONObject3.put("callstack", str3);
                }
                if (aVar != null) {
                    jSONObject3.put("type", aVar);
                }
                jSONObject = jSONObject3;
            }
        } catch (JSONException unused) {
        }
        if (jSONObject == null) {
            String string = new JSONObject().toString();
            n.e(string, "JSONObject().toString()");
            return string;
        }
        String string2 = jSONObject.toString();
        n.e(string2, "params.toString()");
        return string2;
    }
}
