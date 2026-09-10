package xn;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f53930n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f53931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f53932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f53934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f53935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f53936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f53937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f53938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f53939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f53940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f53941k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f53942m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        kotlin.jvm.internal.n.f(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f53931a = z10;
        this.f53932b = z11;
        this.f53933c = i10;
        this.f53934d = i11;
        this.f53935e = z12;
        this.f53936f = z13;
        this.f53937g = z14;
        this.f53938h = i12;
        this.f53939i = i13;
        this.f53940j = z15;
        this.f53941k = z16;
        this.l = z17;
        this.f53942m = str;
    }

    public final String toString() {
        String str = this.f53942m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f53931a) {
            sb2.append("no-cache, ");
        }
        if (this.f53932b) {
            sb2.append("no-store, ");
        }
        int i10 = this.f53933c;
        if (i10 != -1) {
            sb2.append("max-age=");
            sb2.append(i10);
            sb2.append(", ");
        }
        int i11 = this.f53934d;
        if (i11 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i11);
            sb2.append(", ");
        }
        if (this.f53935e) {
            sb2.append("private, ");
        }
        if (this.f53936f) {
            sb2.append("public, ");
        }
        if (this.f53937g) {
            sb2.append("must-revalidate, ");
        }
        int i12 = this.f53938h;
        if (i12 != -1) {
            sb2.append("max-stale=");
            sb2.append(i12);
            sb2.append(", ");
        }
        int i13 = this.f53939i;
        if (i13 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i13);
            sb2.append(", ");
        }
        if (this.f53940j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f53941k) {
            sb2.append("no-transform, ");
        }
        if (this.l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
        this.f53942m = string;
        return string;
    }
}
