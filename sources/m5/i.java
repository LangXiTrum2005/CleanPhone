package m5;

import d5.o;
import d5.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45883b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f45884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f45885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d5.f f45886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d5.f f45887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f45888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f45889h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f45890i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d5.b f45891j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45892k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f45893m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f45894n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f45895o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f45896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f45897q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f45898r;

    static {
        o.i("WorkSpec");
    }

    public i(String str, String str2) {
        d5.f fVar = d5.f.f38690c;
        this.f45886e = fVar;
        this.f45887f = fVar;
        this.f45891j = d5.b.f38675i;
        this.l = 1;
        this.f45893m = 30000L;
        this.f45896p = -1L;
        this.f45898r = 1;
        this.f45882a = str;
        this.f45884c = str2;
    }

    public final long a() {
        int i10;
        if (this.f45883b == 1 && (i10 = this.f45892k) > 0) {
            return Math.min(18000000L, this.l == 2 ? this.f45893m * ((long) i10) : (long) Math.scalb(this.f45893m, i10 - 1)) + this.f45894n;
        }
        if (!c()) {
            long jCurrentTimeMillis = this.f45894n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f45888g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j10 = this.f45894n;
        if (j10 == 0) {
            j10 = this.f45888g + jCurrentTimeMillis2;
        }
        long j11 = this.f45890i;
        long j12 = this.f45889h;
        if (j11 != j12) {
            return j10 + j12 + (j10 == 0 ? j11 * (-1) : 0L);
        }
        return j10 + (j10 != 0 ? j12 : 0L);
    }

    public final boolean b() {
        return !d5.b.f38675i.equals(this.f45891j);
    }

    public final boolean c() {
        return this.f45889h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f45888g != iVar.f45888g || this.f45889h != iVar.f45889h || this.f45890i != iVar.f45890i || this.f45892k != iVar.f45892k || this.f45893m != iVar.f45893m || this.f45894n != iVar.f45894n || this.f45895o != iVar.f45895o || this.f45896p != iVar.f45896p || this.f45897q != iVar.f45897q || !this.f45882a.equals(iVar.f45882a) || this.f45883b != iVar.f45883b || !this.f45884c.equals(iVar.f45884c)) {
            return false;
        }
        String str = this.f45885d;
        if (str != null) {
            if (!str.equals(iVar.f45885d)) {
                return false;
            }
        } else if (iVar.f45885d != null) {
            return false;
        }
        return this.f45886e.equals(iVar.f45886e) && this.f45887f.equals(iVar.f45887f) && this.f45891j.equals(iVar.f45891j) && this.l == iVar.l && this.f45898r == iVar.f45898r;
    }

    public final int hashCode() {
        int iE = u.e((v0.i.c(this.f45883b) + (this.f45882a.hashCode() * 31)) * 31, 31, this.f45884c);
        String str = this.f45885d;
        int iHashCode = (this.f45887f.hashCode() + ((this.f45886e.hashCode() + ((iE + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j10 = this.f45888g;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f45889h;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f45890i;
        int iC = (v0.i.c(this.l) + ((((this.f45891j.hashCode() + ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + this.f45892k) * 31)) * 31;
        long j13 = this.f45893m;
        int i12 = (iC + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f45894n;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f45895o;
        int i14 = (i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f45896p;
        return v0.i.c(this.f45898r) + ((((i14 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f45897q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return defpackage.e.q(this.f45882a, "}", new StringBuilder("{WorkSpec: "));
    }
}
