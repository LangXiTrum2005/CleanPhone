package w7;

import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f52991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f52992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f52993c;

    public a(String str) {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f52993c = lValueOf;
        this.f52992b = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        stringBuffer.append(lValueOf.longValue());
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        n.e(string, "StringBuffer()\n         …)\n            .toString()");
        this.f52991a = string;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.f52993c;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            jSONObject.put("error_message", this.f52992b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return super.toString();
        }
        String string = jSONObject.toString();
        n.e(string, "params.toString()");
        return string;
    }
}
