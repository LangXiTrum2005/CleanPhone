package n2;

import com.google.android.gms.internal.ads.bl0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bl0 f46487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bl0 f46488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f46489c;

    public r(long[] jArr, long[] jArr2, long j10) {
        go.k.i(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f46487a = new bl0(length, 1);
            this.f46488b = new bl0(length, 1);
        } else {
            int i10 = length + 1;
            bl0 bl0Var = new bl0(i10, 1);
            this.f46487a = bl0Var;
            bl0 bl0Var2 = new bl0(i10, 1);
            this.f46488b = bl0Var2;
            bl0Var.a(0L);
            bl0Var2.a(0L);
        }
        this.f46487a.b(jArr);
        this.f46488b.b(jArr2);
        this.f46489c = j10;
    }

    @Override // n2.t
    public final long getDurationUs() {
        return this.f46489c;
    }

    @Override // n2.t
    public final s getSeekPoints(long j10) {
        bl0 bl0Var = this.f46488b;
        if (bl0Var.f12818a == 0) {
            u uVar = u.f46492c;
            return new s(uVar, uVar);
        }
        int iC = l1.y.c(bl0Var, j10);
        long jC = bl0Var.c(iC);
        bl0 bl0Var2 = this.f46487a;
        u uVar2 = new u(jC, bl0Var2.c(iC));
        if (jC == j10 || iC == bl0Var.f12818a - 1) {
            return new s(uVar2, uVar2);
        }
        int i10 = iC + 1;
        return new s(uVar2, new u(bl0Var.c(i10), bl0Var2.c(i10)));
    }

    @Override // n2.t
    public final boolean isSeekable() {
        return this.f46488b.f12818a > 0;
    }
}
