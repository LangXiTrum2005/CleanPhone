package w1;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import oa.j0;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f52794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f52795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f52796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f52797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f52798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f52799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f52800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f52801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f52802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f52803k;
    public final j0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j0 f52804m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n1 f52805n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f52806o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f52807p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f52808q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f52809r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f52810s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f52811t;

    public g(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        go.k.i((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f52793a = str;
        this.f52794b = uri;
        this.f52795c = uri2;
        this.f52796d = j10;
        this.f52797e = j11;
        this.f52798f = j12;
        this.f52799g = j13;
        this.f52800h = arrayList;
        this.f52801i = z10;
        this.f52802j = j14;
        this.f52803k = j15;
        this.l = j0.x(arrayList2);
        this.f52804m = j0.x(arrayList3);
        this.f52805n = j0.F(new b2.j(21), arrayList4);
        this.f52806o = z11;
        this.f52807p = str2;
        this.f52808q = str3;
        this.f52809r = j16;
        this.f52810s = j17;
        this.f52811t = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f52796d == gVar.f52796d && this.f52797e == gVar.f52797e && this.f52798f == gVar.f52798f && this.f52799g == gVar.f52799g && this.f52801i == gVar.f52801i && this.f52802j == gVar.f52802j && this.f52803k == gVar.f52803k && this.f52806o == gVar.f52806o && this.f52809r == gVar.f52809r && this.f52810s == gVar.f52810s && Objects.equals(this.f52793a, gVar.f52793a) && Objects.equals(this.f52794b, gVar.f52794b) && Objects.equals(this.f52795c, gVar.f52795c) && Objects.equals(this.f52800h, gVar.f52800h) && Objects.equals(this.l, gVar.l) && Objects.equals(this.f52804m, gVar.f52804m) && Objects.equals(this.f52805n, gVar.f52805n) && Objects.equals(this.f52807p, gVar.f52807p) && Objects.equals(this.f52808q, gVar.f52808q) && Objects.equals(this.f52811t, gVar.f52811t);
    }

    public final int hashCode() {
        return Objects.hash(this.f52793a, this.f52794b, this.f52795c, Long.valueOf(this.f52796d), Long.valueOf(this.f52797e), Long.valueOf(this.f52798f), Long.valueOf(this.f52799g), this.f52800h, Boolean.valueOf(this.f52801i), Long.valueOf(this.f52802j), Long.valueOf(this.f52803k), this.l, this.f52804m, this.f52805n, Boolean.valueOf(this.f52806o), this.f52807p, this.f52808q, Long.valueOf(this.f52809r), Long.valueOf(this.f52810s), this.f52811t);
    }
}
