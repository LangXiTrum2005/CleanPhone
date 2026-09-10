package e8;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.MediaStore;
import com.applovin.impl.ca;
import d5.u;
import g8.e;
import g8.f;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f39154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f39156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f39157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f39158h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f39159i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f39160j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f39161k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f39162m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f39163n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f39164o;

    public a(long j10, String str, long j11, long j12, int i10, int i11, int i12, String str2, long j13, int i13, boolean z10, boolean z11, String str3, String str4) {
        this.f39151a = j10;
        this.f39152b = str;
        this.f39153c = j11;
        this.f39154d = j12;
        this.f39155e = i10;
        this.f39156f = i11;
        this.f39157g = i12;
        this.f39158h = str2;
        this.f39159i = j13;
        this.f39160j = i13;
        this.f39161k = z10;
        this.l = z11;
        this.f39162m = str3;
        this.f39163n = str4;
        f.f41737a.getClass();
        this.f39164o = str3;
    }

    public final Uri a() {
        char c4;
        Uri EXTERNAL_CONTENT_URI;
        int i10 = this.f39157g;
        if (i10 == 1) {
            c4 = 1;
        } else if (i10 != 2) {
            c4 = i10 != 3 ? (char) 0 : (char) 2;
        } else {
            c4 = 3;
        }
        if (c4 == 1) {
            EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            n.e(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        } else if (c4 == 2) {
            EXTERNAL_CONTENT_URI = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            n.e(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        } else if (c4 != 3) {
            f.f41737a.getClass();
            EXTERNAL_CONTENT_URI = e.a();
        } else {
            EXTERNAL_CONTENT_URI = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            n.e(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        }
        Uri uriWithAppendedId = ContentUris.withAppendedId(EXTERNAL_CONTENT_URI, this.f39151a);
        n.e(uriWithAppendedId, "withAppendedId(...)");
        return uriWithAppendedId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f39151a == aVar.f39151a && this.f39152b.equals(aVar.f39152b) && this.f39153c == aVar.f39153c && this.f39154d == aVar.f39154d && this.f39155e == aVar.f39155e && this.f39156f == aVar.f39156f && this.f39157g == aVar.f39157g && this.f39158h.equals(aVar.f39158h) && this.f39159i == aVar.f39159i && this.f39160j == aVar.f39160j && this.f39161k == aVar.f39161k && this.l == aVar.l && this.f39162m.equals(aVar.f39162m) && this.f39163n.equals(aVar.f39163n);
    }

    public final int hashCode() {
        return this.f39163n.hashCode() + u.e((Boolean.hashCode(this.l) + ((Boolean.hashCode(this.f39161k) + wi.d.f(this.f39160j, ca.j(this.f39159i, u.e(wi.d.f(this.f39157g, wi.d.f(this.f39156f, wi.d.f(this.f39155e, ca.j(this.f39154d, ca.j(this.f39153c, u.e(Long.hashCode(this.f39151a) * 31, 31, this.f39152b), 31), 31), 31), 31), 31), 31, this.f39158h), 31), 31)) * 31)) * 29791, 31, this.f39162m);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssetEntity(id=");
        sb2.append(this.f39151a);
        sb2.append(", path=");
        sb2.append(this.f39152b);
        q4.a.r(sb2, ", duration=", this.f39153c, ", createDt=");
        sb2.append(this.f39154d);
        sb2.append(", width=");
        sb2.append(this.f39155e);
        l1.d.p(sb2, ", height=", this.f39156f, ", type=", this.f39157g);
        wi.d.m(sb2, ", displayName=", this.f39158h, ", modifiedDate=");
        sb2.append(this.f39159i);
        sb2.append(", orientation=");
        sb2.append(this.f39160j);
        sb2.append(", isFavorite=");
        sb2.append(this.f39161k);
        sb2.append(", isTrashed=");
        sb2.append(this.l);
        u.r(sb2, ", lat=null, lng=null, androidQRelativePath=", this.f39162m, ", mimeType=", this.f39163n);
        sb2.append(")");
        return sb2.toString();
    }
}
