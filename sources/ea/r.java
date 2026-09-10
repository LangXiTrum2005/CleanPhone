package ea;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f39732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f39733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f39734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f39735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f39736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f39737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f39738j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f39739k;

    public r(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l, Long l10, Long l11, Boolean bool) {
        k9.c0.e(str);
        k9.c0.e(str2);
        k9.c0.b(j10 >= 0);
        k9.c0.b(j11 >= 0);
        k9.c0.b(j12 >= 0);
        k9.c0.b(j14 >= 0);
        this.f39729a = str;
        this.f39730b = str2;
        this.f39731c = j10;
        this.f39732d = j11;
        this.f39733e = j12;
        this.f39734f = j13;
        this.f39735g = j14;
        this.f39736h = l;
        this.f39737i = l10;
        this.f39738j = l11;
        this.f39739k = bool;
    }

    public final r a(long j10) {
        return new r(this.f39729a, this.f39730b, this.f39731c, this.f39732d, this.f39733e, j10, this.f39735g, this.f39736h, this.f39737i, this.f39738j, this.f39739k);
    }

    public final r b(Long l, Long l10, Boolean bool) {
        return new r(this.f39729a, this.f39730b, this.f39731c, this.f39732d, this.f39733e, this.f39734f, this.f39735g, this.f39736h, l, l10, bool);
    }
}
