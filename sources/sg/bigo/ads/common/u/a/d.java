package sg.bigo.ads.common.u.a;

import android.text.TextUtils;
import com.p004ironsource.ko;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.sdk.basead.ui.BaseATView;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import sg.bigo.ads.common.utils.h;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final HttpURLConnection f47451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f47452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final h<List<String>> f47453c;
    private final c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f47454e;
    private final boolean f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URL f47455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f47456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f47457c;
        public final String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f47458e;

        private a(URL url, String str, int i2, String str2, int i3) {
            this.f47455a = url;
            this.f47456b = str;
            this.f47457c = i2;
            this.d = str2;
            this.f47458e = i3;
        }

        public /* synthetic */ a(URL url, String str, int i2, String str2, int i3, byte b2) {
            this(url, str, i2, str2, i3);
        }
    }

    public d(c cVar) throws IOException {
        this.d = cVar;
        HttpURLConnection httpURLConnectionA = cVar.a();
        this.f47451a = httpURLConnectionA;
        this.f47452b = httpURLConnectionA.getResponseCode();
        this.f47454e = httpURLConnectionA.getRequestMethod();
        h<List<String>> hVar = new h<>();
        this.f47453c = hVar;
        Map<String, List<String>> headerFields = httpURLConnectionA.getHeaderFields();
        if (headerFields != null) {
            hVar.a(headerFields);
        }
        boolean zEqualsIgnoreCase = com.smartdigimkt.o0.b.d.equalsIgnoreCase(httpURLConnectionA.getContentEncoding());
        this.f = zEqualsIgnoreCase;
        if (zEqualsIgnoreCase && cVar.f47448c) {
            hVar.b("Content-Encoding");
            hVar.b("Content-Length");
        }
    }

    public final InputStream a() throws IOException {
        InputStream inputStream = this.f47451a.getInputStream();
        return (this.f && this.d.f47448c) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public final a b() {
        int i2 = this.f47452b;
        if (i2 == 307 || i2 == 308) {
            String strA = a("Location");
            if (this.f47454e.equalsIgnoreCase(ko.f25534a) || this.f47454e.equalsIgnoreCase("HEAD")) {
                return new a(null, strA, 0, "", this.f47452b, (byte) 0);
            }
            return new a(null, strA, IronSourceError.ERROR_NT_LOAD_NO_FILL, "redirect code(" + this.f47452b + ") is only available for GET or HEAD method, current request method is " + this.f47454e, this.f47452b, (byte) 0);
        }
        switch (i2) {
            case 300:
            case 301:
            case 302:
            case BaseATView.g.f38290N /* 303 */:
                String strA2 = a("Location");
                if (TextUtils.isEmpty(strA2)) {
                    return new a(null, strA2, IronSourceError.ERROR_NT_INSTANCE_INIT_TIMEOUT, "empty location.", this.f47452b, (byte) 0);
                }
                try {
                    URL url = new URL(this.f47451a.getURL(), strA2);
                    String string = url.toString();
                    if (TextUtils.equals(string, this.f47451a.getURL().toString())) {
                        return new a(url, strA2, IronSourceError.ERROR_NT_LOAD_EXCEPTION, android.support.v4.media.a.o("redirect to the same url, location is ", strA2, ", redirectURL is ", string), this.f47452b, (byte) 0);
                    }
                    URL url2 = this.d.f47447b;
                    if (url2 != null && TextUtils.equals(string, url2.toString())) {
                        return new a(url, strA2, 704, android.support.v4.media.a.o("redirect to origin url, location is ", strA2, ", redirectURL is ", string), this.f47452b, (byte) 0);
                    }
                    return new a(url, strA2, 0, "", this.f47452b, (byte) 0);
                } catch (Exception unused) {
                    return new a(null, strA2, IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT, android.support.v4.media.a.n("location->\"", strA2, "\" is not a network url."), this.f47452b, (byte) 0);
                }
            default:
                return null;
        }
    }

    private String a(String str) {
        List<String> listA = this.f47453c.a(str);
        int size = listA != null ? listA.size() : 0;
        String str2 = "";
        while (TextUtils.isEmpty(str2) && size > 0) {
            str2 = listA.get(0);
        }
        return str2;
    }
}
