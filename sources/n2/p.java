package n2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f46483a;

    public p(t tVar) {
        this.f46483a = tVar;
    }

    @Override // n2.t
    public final boolean a() {
        return this.f46483a.a();
    }

    @Override // n2.t
    public long getDurationUs() {
        return this.f46483a.getDurationUs();
    }

    @Override // n2.t
    public s getSeekPoints(long j10) {
        return this.f46483a.getSeekPoints(j10);
    }

    @Override // n2.t
    public final boolean isSeekable() {
        return this.f46483a.isSeekable();
    }
}
