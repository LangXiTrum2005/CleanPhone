package sg.bigo.ads.common.u.a;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.ne;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.u.f;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final sg.bigo.ads.common.u.b.c<? extends sg.bigo.ads.common.u.a> f47446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    URL f47447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f47448c;
    private final b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f47449e;
    private final URL f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HttpURLConnection f47450h;

    private c(sg.bigo.ads.common.u.b.c cVar, URL url, URL url2, b bVar, g gVar) {
        this.f47448c = false;
        this.f47446a = cVar;
        this.f47447b = url;
        this.f = url2;
        this.d = bVar;
        this.f47449e = gVar;
        sg.bigo.ads.common.t.a.a(0, 3, "HttpRequest", "request, " + cVar + ", redirectURL= " + url2 + ", content=" + cVar.d());
    }

    public final HttpURLConnection a() throws IOException {
        String str;
        URL urlA = this.f;
        if (urlA == null) {
            this.f47446a.a("PreHost");
            T t = this.f47446a.j;
            String strA = t.a();
            String strF = t.f();
            String strD = t.d();
            if (!TextUtils.isEmpty(strF) && !TextUtils.isEmpty(strD) && !TextUtils.equals(strF, strD)) {
                this.f47446a.a("PreHost", strF);
            }
            if (t.e()) {
                this.f47446a.a("Host", strD);
            }
            this.f47446a.h();
            urlA = a(Uri.parse(strA));
            this.f47447b = urlA;
        } else if (urlA != null && this.f47449e != null && this.f47446a.f47473n) {
            urlA = a(Uri.parse(urlA.toString()));
        }
        boolean zEqualsIgnoreCase = "HTTPS".equalsIgnoreCase(urlA.getProtocol());
        URLConnection uRLConnectionOpenConnection = urlA.openConnection();
        this.f47450h = zEqualsIgnoreCase ? (HttpsURLConnection) uRLConnectionOpenConnection : (HttpURLConnection) uRLConnectionOpenConnection;
        this.f47450h.setInstanceFollowRedirects(false);
        this.f47450h.setDoInput(true);
        this.f47450h.setUseCaches(false);
        this.f47450h.setConnectTimeout((int) this.f47446a.f47472l);
        this.f47450h.setReadTimeout((int) this.f47446a.f47472l);
        this.f47450h.setRequestMethod(this.f47446a.a());
        Map<String, Set<String>> map = this.f47446a.m;
        if (!map.containsKey("Connection")) {
            map.put("Connection", new HashSet(Collections.singletonList(com.smartdigimkt.o0.b.f37292c)));
        }
        Set<String> set = map.get(Command.HTTP_HEADER_RANGE);
        Set<String> set2 = map.get("Accept-Encoding");
        if (k.a(set) && k.a(set2)) {
            this.f47448c = true;
            map.put("Accept-Encoding", new HashSet(Collections.singletonList(com.smartdigimkt.o0.b.d)));
        }
        if (!map.containsKey("Host")) {
            try {
                b bVar = this.d;
                String host = this.f47450h.getURL().getHost();
                str = TextUtils.isEmpty(host) ? "" : bVar.f47445a.get(host);
            } catch (Exception unused) {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                map.put("Host", new HashSet(Collections.singletonList(str)));
            }
        }
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            Set<String> value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !k.a(value)) {
                for (String str2 : value) {
                    if (!TextUtils.isEmpty(str2)) {
                        this.f47450h.addRequestProperty(key, str2);
                    }
                }
            }
        }
        byte[] bArrC = this.f47446a.c();
        if (bArrC != null && bArrC.length > 0) {
            f fVarB = this.f47446a.b();
            if (fVarB != null) {
                this.f47450h.setRequestProperty("Content-Type", fVarB.toString());
            }
            this.f47450h.setDoOutput(true);
            this.f47450h.setRequestProperty("Content-Length", Long.toString(this.f47446a.e()));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(this.f47450h.getOutputStream());
            bufferedOutputStream.write(bArrC);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        }
        return this.f47450h;
    }

    public final boolean b() {
        return this.f != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f != null) {
            sb.append("originUrl=");
            sb.append(this.f47446a.g());
            sb.append(", redirectURL=");
            sb.append(this.f);
            sb.append(", redirectCount=");
            sb.append(this.g);
        } else {
            sb.append("requestUrl=");
            sb.append(this.f47446a.g());
        }
        return sb.toString();
    }

    public c(sg.bigo.ads.common.u.b.c cVar, b bVar, g gVar) {
        this(cVar, null, null, bVar, gVar);
    }

    private URL a(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (this.f47449e == null || !this.f47446a.f47473n) {
            return new URL(uri.toString());
        }
        Uri.Builder builderBuildUpon = Uri.parse(uri.toString()).buildUpon();
        a(builderBuildUpon, "sdk_ver", this.f47449e.y());
        a(builderBuildUpon, "sdk_vc", "50501");
        a(builderBuildUpon, "country", this.f47449e.U());
        a(builderBuildUpon, "app_key", this.f47449e.a());
        a(builderBuildUpon, "pkg_ver", this.f47449e.c());
        StringBuilder sb = new StringBuilder();
        sb.append(this.f47449e.d());
        a(builderBuildUpon, "pkg_vc", sb.toString());
        a(builderBuildUpon, ne.f26256E, this.f47449e.i());
        a(builderBuildUpon, "os_ver", this.f47449e.j());
        a(builderBuildUpon, "os_lang", this.f47449e.k());
        a(builderBuildUpon, "vendor", this.f47449e.l());
        a(builderBuildUpon, "model", this.f47449e.m());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f47449e.p());
        a(builderBuildUpon, "dpi", sb2.toString());
        a(builderBuildUpon, "dpi_f", this.f47449e.q());
        a(builderBuildUpon, "resolution", this.f47449e.o());
        a(builderBuildUpon, "net", this.f47449e.r());
        a(builderBuildUpon, "tz", this.f47449e.s());
        if (this.f47446a.f()) {
            a(builderBuildUpon, "enc", "1");
        }
        return new URL(builderBuildUpon.build().toString());
    }

    public final c a(URL url) {
        c cVar = new c(this.f47446a, this.f47447b, url, this.d, this.f47449e);
        cVar.g = this.g + 1;
        return cVar;
    }

    private static void a(Uri.Builder builder, String str, String str2) {
        if (builder == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
