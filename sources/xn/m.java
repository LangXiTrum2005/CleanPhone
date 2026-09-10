package xn;

import com.applovin.shadow.okhttp3.HttpUrl;
import com.google.android.gms.internal.ads.ws;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final char[] f53988j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f53991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f53992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f53993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f53994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f53995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f53996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f53997i;

    public m(String scheme, String str, String str2, String host, int i10, ArrayList arrayList, ArrayList arrayList2, String str3, String str4) {
        kotlin.jvm.internal.n.f(scheme, "scheme");
        kotlin.jvm.internal.n.f(host, "host");
        this.f53989a = scheme;
        this.f53990b = str;
        this.f53991c = str2;
        this.f53992d = host;
        this.f53993e = i10;
        this.f53994f = arrayList2;
        this.f53995g = str3;
        this.f53996h = str4;
        this.f53997i = scheme.equals("https");
    }

    public final String a() {
        if (this.f53991c.length() == 0) {
            return "";
        }
        int length = this.f53989a.length() + 3;
        String str = this.f53996h;
        String strSubstring = str.substring(an.h.v0(str, ':', length, 4) + 1, an.h.v0(str, '@', 0, 6));
        kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f53989a.length() + 3;
        String str = this.f53996h;
        int iV0 = an.h.v0(str, '/', length, 4);
        String strSubstring = str.substring(iV0, yn.a.g(str, "?#", iV0, str.length()));
        kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f53989a.length() + 3;
        String str = this.f53996h;
        int iV0 = an.h.v0(str, '/', length, 4);
        int iG = yn.a.g(str, "?#", iV0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iV0 < iG) {
            int i10 = iV0 + 1;
            int iF = yn.a.f(str, '/', i10, iG);
            String strSubstring = str.substring(i10, iF);
            kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iV0 = iF;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f53994f == null) {
            return null;
        }
        String str = this.f53996h;
        int iV0 = an.h.v0(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iV0, yn.a.f(str, '#', iV0, str.length()));
        kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.f53990b.length() == 0) {
            return "";
        }
        int length = this.f53989a.length() + 3;
        String str = this.f53996h;
        String strSubstring = str.substring(length, yn.a.g(str, ":@", length, str.length()));
        kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m) && kotlin.jvm.internal.n.a(((m) obj).f53996h, this.f53996h);
    }

    public final ws f() {
        int i10;
        ws wsVar = new ws();
        ArrayList arrayList = (ArrayList) wsVar.f21599g;
        String scheme = this.f53989a;
        wsVar.f21594b = scheme;
        wsVar.f21596d = e();
        wsVar.f21597e = a();
        wsVar.f21598f = this.f53992d;
        kotlin.jvm.internal.n.f(scheme, "scheme");
        if (scheme.equals("http")) {
            i10 = 80;
        } else {
            i10 = scheme.equals("https") ? 443 : -1;
        }
        int i11 = this.f53993e;
        wsVar.f21595c = i11 != i10 ? i11 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        wsVar.f21600h = strD != null ? b.f(b.b(strD, 0, 0, 211, HttpUrl.QUERY_ENCODE_SET)) : null;
        if (this.f53995g != null) {
            String str = this.f53996h;
            strSubstring = str.substring(an.h.v0(str, '#', 0, 6) + 1);
            kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        wsVar.f21601i = strSubstring;
        return wsVar;
    }

    public final URI g() {
        String strReplaceAll;
        ws wsVarF = f();
        ArrayList arrayList = (ArrayList) wsVarF.f21599g;
        String str = (String) wsVarF.f21598f;
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            kotlin.jvm.internal.n.e(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str).replaceAll("");
            kotlin.jvm.internal.n.e(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        wsVarF.f21598f = strReplaceAll;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.set(i10, b.b((String) arrayList.get(i10), 0, 0, 227, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
        }
        ArrayList arrayList2 = (ArrayList) wsVarF.f21600h;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String str2 = (String) arrayList2.get(i11);
                arrayList2.set(i11, str2 != null ? b.b(str2, 0, 0, 195, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI) : null);
            }
        }
        String str3 = (String) wsVarF.f21601i;
        wsVarF.f21601i = str3 != null ? b.b(str3, 0, 0, 163, HttpUrl.FRAGMENT_ENCODE_SET_URI) : null;
        String string = wsVarF.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                kotlin.jvm.internal.n.e(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                kotlin.jvm.internal.n.e(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                kotlin.jvm.internal.n.e(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL h() {
        try {
            return new URL(this.f53996h);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final int hashCode() {
        return this.f53996h.hashCode();
    }

    public final String toString() {
        return this.f53996h;
    }
}
