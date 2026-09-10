package n2;

import com.google.android.gms.internal.ads.b2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f46447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f46450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f46451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f46452f;

    public c(d dVar, long j10, long j11, long j12, long j13, long j14) {
        this.f46447a = dVar;
        this.f46448b = j10;
        this.f46449c = j11;
        this.f46450d = j12;
        this.f46451e = j13;
        this.f46452f = j14;
    }

    @Override // n2.t
    public final long getDurationUs() {
        return this.f46448b;
    }

    @Override // n2.t
    public final s getSeekPoints(long j10) {
        u uVar = new u(j10, b2.a(this.f46447a.b(j10), 0L, this.f46449c, this.f46450d, this.f46451e, this.f46452f));
        return new s(uVar, uVar);
    }

    @Override // n2.t
    public final boolean isSeekable() {
        return true;
    }
}
