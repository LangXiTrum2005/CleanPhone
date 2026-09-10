package f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f40205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f40206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f40207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f40209e;

    public a(x3.b navigationEvent) {
        kotlin.jvm.internal.n.f(navigationEvent, "navigationEvent");
        float f10 = navigationEvent.f53574c;
        float f11 = navigationEvent.f53575d;
        float f12 = navigationEvent.f53573b;
        int i10 = navigationEvent.f53572a;
        long j10 = navigationEvent.f53576e;
        this.f40205a = f10;
        this.f40206b = f11;
        this.f40207c = f12;
        this.f40208d = i10;
        this.f40209e = j10;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.f40205a + ", touchY=" + this.f40206b + ", progress=" + this.f40207c + ", swipeEdge=" + this.f40208d + ", frameTimeMillis=" + this.f40209e + ')';
    }
}
