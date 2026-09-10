package i9;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f42966d = new t(null, true, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f42969c;

    public t(String str, boolean z10, Exception exc) {
        this.f42967a = z10;
        this.f42968b = str;
        this.f42969c = exc;
    }

    public static t b(String str) {
        return new t(str, false, null);
    }

    public static t c(String str, Exception exc) {
        return new t(str, false, exc);
    }

    public String a() {
        return this.f42968b;
    }
}
