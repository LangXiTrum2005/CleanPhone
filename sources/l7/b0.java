package l7;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.adjust.sdk.Constants;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f45085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f45086k;
    public static volatile String l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f45087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f45089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f45090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f45091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f45092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w f45093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f0 f45094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f45095i;

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        kotlin.jvm.internal.n.e(charArray, "this as java.lang.String).toCharArray()");
        StringBuilder sb2 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        for (int i10 = 0; i10 < iNextInt; i10++) {
            sb2.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "buffer.toString()");
        f45085j = string;
        f45086k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public b0(a aVar, String str, Bundle bundle, f0 f0Var, w wVar) {
        this.f45087a = aVar;
        this.f45088b = str;
        this.f45092f = null;
        j(wVar);
        this.f45094h = f0Var == null ? f0.f45120a : f0Var;
        if (bundle != null) {
            this.f45090d = new Bundle(bundle);
        } else {
            this.f45090d = new Bundle();
        }
        this.f45092f = s.e();
    }

    public static String f() {
        String strC = s.c();
        q7.f.o();
        String str = s.f45217f;
        if (str == null) {
            throw new n("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        if (strC.length() <= 0 || str.length() <= 0) {
            q7.e0.B("b0", "Warning: Request without access token missing application ID or client token.");
            return null;
        }
        return strC + '|' + str;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    public final void a() {
        Bundle bundle = this.f45090d;
        String strE = e();
        boolean zQ0 = strE != null ? an.h.q0(strE, "|", false) : false;
        if (strE == null || !an.p.p0(strE, "IG", false) || zQ0 || !i()) {
            if ((kotlin.jvm.internal.n.a(s.f(), "instagram.com") ? true ^ i() : true) || zQ0) {
                String strE2 = e();
                if (strE2 != null) {
                    bundle.putString("access_token", strE2);
                }
            } else {
                bundle.putString("access_token", f());
            }
        } else {
            bundle.putString("access_token", f());
        }
        if (!bundle.containsKey("access_token")) {
            s sVar = s.f45212a;
            q7.f.o();
            String str = s.f45217f;
            if (str == null) {
                throw new n("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
            }
            if (q7.e0.w(str)) {
                Log.w("b0", "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
            }
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        if (s.i(g0.f45139g)) {
            bundle.putString("debug", Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH);
        } else if (s.i(g0.f45138f)) {
            bundle.putString("debug", "warning");
        }
    }

    public final String b(String str, boolean z10) {
        if (!z10 && this.f45094h == f0.f45121b) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f45090d.keySet()) {
            Object obj = this.f45090d.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (j2.n.y(obj)) {
                builderBuildUpon.appendQueryParameter(str2, j2.n.j(obj).toString());
            } else if (this.f45094h != f0.f45120a) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1)));
            }
        }
        String string = builderBuildUpon.toString();
        kotlin.jvm.internal.n.e(string, "uriBuilder.toString()");
        return string;
    }

    public final e0 c() {
        ArrayList arrayListN = j2.n.n(new d0(xj.k.C0(new b0[]{this})));
        if (arrayListN.size() == 1) {
            return (e0) arrayListN.get(0);
        }
        throw new n("invalid state: expected a single response");
    }

    public final c0 d() {
        d0 d0Var = new d0(xj.k.C0(new b0[]{this}));
        q7.f.m(d0Var);
        c0 c0Var = new c0(d0Var);
        c0Var.executeOnExecutor(s.d(), new Void[0]);
        return c0Var;
    }

    public final String e() {
        a aVar = this.f45087a;
        if (aVar != null) {
            if (!this.f45090d.containsKey("access_token")) {
                String str = aVar.f45075e;
                q7.x.f48792c.u(str);
                return str;
            }
        } else if (!this.f45090d.containsKey("access_token")) {
            return f();
        }
        return this.f45090d.getString("access_token");
    }

    public final String g() {
        String str;
        String str2;
        if (this.f45094h == f0.f45121b && (str2 = this.f45088b) != null && an.p.h0(str2, "/videos", false)) {
            str = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{s.f()}, 1));
        } else {
            String subdomain = s.f();
            kotlin.jvm.internal.n.f(subdomain, "subdomain");
            str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{subdomain}, 1));
        }
        String strH = h(str);
        a();
        return b(strH, false);
    }

    public final String h(String str) {
        if (!(!kotlin.jvm.internal.n.a(s.f(), "instagram.com") ? true : !i())) {
            str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{s.f45228r}, 1));
        }
        Pattern pattern = f45086k;
        String str2 = this.f45088b;
        if (!pattern.matcher(str2).matches()) {
            str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f45092f, str2}, 2));
        }
        return String.format("%s/%s", Arrays.copyOf(new Object[]{str, str2}, 2));
    }

    public final boolean i() {
        String str = this.f45088b;
        if (str == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder("^/?");
        sb2.append(s.c());
        sb2.append("/?.*");
        return this.f45095i || Pattern.matches(sb2.toString(), str) || Pattern.matches("^/?app/?.*", str);
    }

    public final void j(w wVar) {
        if (s.i(g0.f45139g) || s.i(g0.f45138f)) {
            this.f45093g = new b(wVar, 1);
        } else {
            this.f45093g = wVar;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.f45087a;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.f45088b);
        sb2.append(", graphObject: ");
        sb2.append(this.f45089c);
        sb2.append(", httpMethod: ");
        sb2.append(this.f45094h);
        sb2.append(", parameters: ");
        sb2.append(this.f45090d);
        sb2.append("}");
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return string;
    }
}
