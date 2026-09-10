package l7;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f45108e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f45109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f45110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f45111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f45112d;

    public e0(b0 request, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, q qVar) {
        kotlin.jvm.internal.n.f(request, "request");
        this.f45109a = httpURLConnection;
        this.f45110b = jSONObject;
        this.f45111c = qVar;
        this.f45112d = jSONObject;
    }

    public final String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.f45109a;
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200)}, 1));
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder sbK = d5.u.k("{Response:  responseCode: ", str, ", graphObject: ");
        sbK.append(this.f45110b);
        sbK.append(", error: ");
        sbK.append(this.f45111c);
        sbK.append("}");
        String string = sbK.toString();
        kotlin.jvm.internal.n.e(string, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(b0 request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, jSONObject, null, null);
        kotlin.jvm.internal.n.f(request, "request");
        kotlin.jvm.internal.n.f(rawResponse, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(b0 request, HttpURLConnection httpURLConnection, q qVar) {
        this(request, httpURLConnection, null, null, qVar);
        kotlin.jvm.internal.n.f(request, "request");
    }
}
