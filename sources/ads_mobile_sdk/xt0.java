package ads_mobile_sdk;

import java.net.URL;
import java.util.Map;
import okhttp3.cord;
import okhttp3.preprohormone;

/* JADX INFO: loaded from: classes.dex */
public final class xt0 {
    public final URL a;
    public final String b;
    public final Map c;
    public final byte[] d;

    public xt0(URL url, String str, Map map, byte[] bArr) {
        this.a = url;
        this.b = str;
        this.c = map;
        this.d = bArr;
    }

    public final byte[] a() {
        return this.d;
    }

    public final Map b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final URL d() {
        return this.a;
    }

    public final preprohormone e() {
        preprohormone.attabal attabalVarAdultoid = new preprohormone.attabal().adultoid(this.a);
        String str = this.b;
        byte[] bArr = this.d;
        preprohormone.attabal attabalVarCutely = attabalVarAdultoid.cutely(str, bArr != null ? cord.Companion.kowloon(cord.INSTANCE, bArr, null, 0, 0, 7, null) : null);
        for (Map.Entry entry : this.c.entrySet()) {
            attabalVarCutely.attabal((String) entry.getKey(), (String) entry.getValue());
        }
        return attabalVarCutely.saneness();
    }

    public final String toString() {
        return "HttpRequest{method=" + this.b + ", url=" + this.a + ", headers=" + this.c + "}";
    }
}
