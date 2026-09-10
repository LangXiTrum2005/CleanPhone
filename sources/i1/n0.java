package i1;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f42582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f42583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f42585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f42586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f42587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f42588g = c.f42523c;

    static {
        d5.u.m(0, 1, 2, 3, 4);
    }

    public final long a(int i10, int i11) {
        a aVarA = this.f42588g.a(i10);
        return aVarA.f42490a != -1 ? aVarA.f42495f[i11] : C.TIME_UNSET;
    }

    public final int b(long j10) {
        a aVarA;
        int i10;
        c cVar = this.f42588g;
        long j11 = this.f42585d;
        int i11 = cVar.f42525a;
        if (j10 != Long.MIN_VALUE && (j11 == C.TIME_UNSET || j10 < j11)) {
            int i12 = 0;
            while (i12 < i11) {
                cVar.a(i12).getClass();
                cVar.a(i12).getClass();
                if (0 > j10 && ((i10 = (aVarA = cVar.a(i12)).f42490a) == -1 || aVarA.a(-1) < i10)) {
                    break;
                }
                i12++;
            }
            if (i12 < i11) {
                if (j11 != C.TIME_UNSET) {
                    cVar.a(i12).getClass();
                    if (0 <= j11) {
                    }
                }
                return i12;
            }
        }
        return -1;
    }

    public final int c(long j10) {
        c cVar = this.f42588g;
        int i10 = cVar.f42525a;
        int i11 = i10 - 1;
        if (i11 == i10 - 1) {
            cVar.a(i11).getClass();
        }
        while (i11 >= 0 && j10 != Long.MIN_VALUE) {
            cVar.a(i11).getClass();
            if (j10 >= 0) {
                break;
            }
            i11--;
        }
        if (i11 >= 0) {
            a aVarA = cVar.a(i11);
            int i12 = aVarA.f42490a;
            if (i12 != -1) {
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = aVarA.f42494e[i13];
                    if (i14 != 0 && i14 != 1) {
                    }
                }
            }
            return i11;
        }
        return -1;
    }

    public final long d(int i10) {
        this.f42588g.a(i10).getClass();
        return 0L;
    }

    public final int e(int i10) {
        return this.f42588g.a(i10).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !n0.class.equals(obj.getClass())) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Objects.equals(this.f42582a, n0Var.f42582a) && Objects.equals(this.f42583b, n0Var.f42583b) && this.f42584c == n0Var.f42584c && this.f42585d == n0Var.f42585d && this.f42586e == n0Var.f42586e && this.f42587f == n0Var.f42587f && Objects.equals(this.f42588g, n0Var.f42588g);
    }

    public final boolean f(int i10) {
        c cVar = this.f42588g;
        int i11 = cVar.f42525a;
        if (i10 != i11 - 1 || i10 != i11 - 1) {
            return false;
        }
        cVar.a(i10).getClass();
        return false;
    }

    public final boolean g(int i10) {
        this.f42588g.a(i10).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i10, long j10, long j11, c cVar, boolean z10) {
        this.f42582a = obj;
        this.f42583b = obj2;
        this.f42584c = i10;
        this.f42585d = j10;
        this.f42586e = j11;
        this.f42588g = cVar;
        this.f42587f = z10;
    }

    public final int hashCode() {
        Object obj = this.f42582a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f42583b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f42584c) * 31;
        long j10 = this.f42585d;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f42586e;
        return this.f42588g.hashCode() + ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f42587f ? 1 : 0)) * 31);
    }
}
