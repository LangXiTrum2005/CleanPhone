package sg.bigo.ads.common.h;

import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.f;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f47252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f47253c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47254e;
    public boolean f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f47255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f47256i;
    long m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f47259p;
    public final boolean q;
    private c s;
    public int j = 0;
    public int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f47257l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f47258n = false;
    public boolean o = false;
    private C0841a r = new C0841a();

    /* JADX INFO: renamed from: sg.bigo.ads.common.h.a$a, reason: collision with other inner class name */
    public static class C0841a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f47260a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f47261b = false;

        public final String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("support_pd_flag", Integer.valueOf(this.f47260a));
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }
    }

    public a(String str, String str2, String str3, boolean z2, boolean z3, boolean z4, c cVar) {
        this.f47252b = str;
        this.f47253c = str2;
        this.d = str3;
        this.f47254e = z2 ? 1 : 0;
        this.f = z4;
        this.q = z3;
        String strA = a();
        long jA = f.a(strA, 1);
        this.g = jA <= 0 ? f.a(f.d(strA), 1) : jA;
        String strValueOf = String.valueOf(str.hashCode());
        this.f47251a = strValueOf;
        this.s = cVar;
        StringBuilder sbY = android.support.v4.media.a.y("newInstance mId = ", strValueOf, ", savedSize = ");
        sbY.append(this.g);
        sbY.append(", mIsSupportFillTime = ");
        sbY.append(c());
        sg.bigo.ads.common.t.a.a(0, 3, "DownloadInfo", sbY.toString());
    }

    public final String a() {
        return this.f47253c + File.separator + this.d;
    }

    public final boolean b() {
        return this.j == 3;
    }

    public final boolean c() {
        c cVar = this.s;
        return cVar != null && cVar.f47297a;
    }

    public final boolean d() {
        c cVar = this.s;
        return cVar != null && cVar.f47298b;
    }

    public final int e() {
        c cVar = this.s;
        if (cVar != null) {
            return cVar.f47299c;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != a.class) {
            return false;
        }
        a aVar = (a) obj;
        return this.f47252b.equals(aVar.f47252b) && this.d.equals(aVar.d) && this.f47253c.equals(aVar.f47253c);
    }

    public final int f() {
        c cVar = this.s;
        if (cVar != null) {
            return cVar.d;
        }
        return 5;
    }

    public final int g() {
        c cVar = this.s;
        if (cVar != null) {
            return cVar.f47300e;
        }
        return 20;
    }

    public final boolean h() {
        if (this.f47252b.endsWith(".mp4") && this.r.f47260a == -1) {
            if (f.a(f.d(a()))) {
                this.r.f47260a = 1;
            } else {
                this.r.f47260a = 0;
            }
        }
        return this.r.f47260a == 1;
    }

    public String toString() {
        return " url = " + this.f47252b + ", fileName = " + this.d + ", filePath = " + this.f47253c + ", downloadCount = " + this.k + ", totalSize = " + this.f47256i + ", loadedSize = " + this.g + ", mState = " + this.j + ", mLastDownloadEndTime = " + this.f47257l + ", mExt = " + this.r.a() + ", contentType = " + this.f47259p + " isSupportFillTime = " + c() + " adFillTime = " + e() + " adCheckProcessTime = " + f() + " adCheckMinProcess = " + g();
    }
}
