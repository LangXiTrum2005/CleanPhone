package d5;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f38675i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f38677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f38678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38680e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38676a = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f38681f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f38682g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f38683h = new d();

    static {
        d dVar = new d();
        b bVar = new b();
        bVar.f38676a = 1;
        bVar.f38681f = -1L;
        bVar.f38682g = -1L;
        new HashSet();
        bVar.f38677b = false;
        bVar.f38678c = false;
        bVar.f38676a = 1;
        bVar.f38679d = false;
        bVar.f38680e = false;
        bVar.f38683h = dVar;
        bVar.f38681f = -1L;
        bVar.f38682g = -1L;
        f38675i = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f38677b == bVar.f38677b && this.f38678c == bVar.f38678c && this.f38679d == bVar.f38679d && this.f38680e == bVar.f38680e && this.f38681f == bVar.f38681f && this.f38682g == bVar.f38682g && this.f38676a == bVar.f38676a) {
            return this.f38683h.equals(bVar.f38683h);
        }
        return false;
    }

    public final int hashCode() {
        int iC = ((((((((v0.i.c(this.f38676a) * 31) + (this.f38677b ? 1 : 0)) * 31) + (this.f38678c ? 1 : 0)) * 31) + (this.f38679d ? 1 : 0)) * 31) + (this.f38680e ? 1 : 0)) * 31;
        long j10 = this.f38681f;
        int i10 = (iC + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f38682g;
        return this.f38683h.f38686a.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }
}
