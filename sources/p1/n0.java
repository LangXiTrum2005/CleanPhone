package p1;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2.c0 f48126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f48128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f48129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f48130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f48131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f48132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f48133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f48134i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f48135j;

    public n0(f2.c0 c0Var, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        go.k.i(!z14 || z12);
        go.k.i(!z13 || z12);
        if (z11 && (z12 || z13 || z14)) {
            z15 = false;
        }
        go.k.i(z15);
        this.f48126a = c0Var;
        this.f48127b = j10;
        this.f48128c = j11;
        this.f48129d = j12;
        this.f48130e = j13;
        this.f48131f = z10;
        this.f48132g = z11;
        this.f48133h = z12;
        this.f48134i = z13;
        this.f48135j = z14;
    }

    public final n0 a(long j10) {
        if (j10 == this.f48128c) {
            return this;
        }
        return new n0(this.f48126a, this.f48127b, j10, this.f48129d, this.f48130e, this.f48131f, this.f48132g, this.f48133h, this.f48134i, this.f48135j);
    }

    public final n0 b(long j10) {
        if (j10 == this.f48127b) {
            return this;
        }
        return new n0(this.f48126a, j10, this.f48128c, this.f48129d, this.f48130e, this.f48131f, this.f48132g, this.f48133h, this.f48134i, this.f48135j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n0.class == obj.getClass()) {
            n0 n0Var = (n0) obj;
            if (this.f48127b == n0Var.f48127b && this.f48128c == n0Var.f48128c && this.f48129d == n0Var.f48129d && this.f48130e == n0Var.f48130e && this.f48131f == n0Var.f48131f && this.f48132g == n0Var.f48132g && this.f48133h == n0Var.f48133h && this.f48134i == n0Var.f48134i && this.f48135j == n0Var.f48135j && Objects.equals(this.f48126a, n0Var.f48126a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f48126a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f48127b)) * 31) + ((int) this.f48128c)) * 31) + ((int) this.f48129d)) * 31) + ((int) this.f48130e)) * 31) + (this.f48131f ? 1 : 0)) * 31) + (this.f48132g ? 1 : 0)) * 31) + (this.f48133h ? 1 : 0)) * 31) + (this.f48134i ? 1 : 0)) * 31) + (this.f48135j ? 1 : 0);
    }
}
