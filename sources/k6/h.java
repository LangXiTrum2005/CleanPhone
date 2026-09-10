package k6;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements e6.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f44349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URL f44350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f44352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public URL f44353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile byte[] f44354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44355h;

    public h(URL url) {
        l lVar = i.f44356a;
        a7.h.c(url, "Argument must not be null");
        this.f44350c = url;
        this.f44351d = null;
        a7.h.c(lVar, "Argument must not be null");
        this.f44349b = lVar;
    }

    @Override // e6.f
    public final void b(MessageDigest messageDigest) {
        if (this.f44354g == null) {
            this.f44354g = c().getBytes(e6.f.f39142a);
        }
        messageDigest.update(this.f44354g);
    }

    public final String c() {
        String str = this.f44351d;
        if (str != null) {
            return str;
        }
        URL url = this.f44350c;
        a7.h.c(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f44353f == null) {
            if (TextUtils.isEmpty(this.f44352e)) {
                String string = this.f44351d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f44350c;
                    a7.h.c(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f44352e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f44353f = new URL(this.f44352e);
        }
        return this.f44353f;
    }

    @Override // e6.f
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (c().equals(hVar.c()) && this.f44349b.equals(hVar.f44349b)) {
                return true;
            }
        }
        return false;
    }

    @Override // e6.f
    public final int hashCode() {
        if (this.f44355h == 0) {
            int iHashCode = c().hashCode();
            this.f44355h = iHashCode;
            this.f44355h = this.f44349b.hashCode() + (iHashCode * 31);
        }
        return this.f44355h;
    }

    public final String toString() {
        return c();
    }

    public h(String str) {
        l lVar = i.f44356a;
        this.f44350c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f44351d = str;
            a7.h.c(lVar, "Argument must not be null");
            this.f44349b = lVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
