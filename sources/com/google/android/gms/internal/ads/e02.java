package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r32 f13797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f02 f13800g;

    public e02(f02 f02Var, String str, int i10, r32 r32Var) {
        this.f13800g = f02Var;
        this.f13794a = str;
        this.f13795b = i10;
        this.f13796c = r32Var == null ? -1L : r32Var.f19362d;
        if (r32Var == null || !r32Var.b()) {
            return;
        }
        this.f13797d = r32Var;
    }

    public final boolean a(ci ciVar, ci ciVar2) {
        r32 r32Var;
        int i10 = this.f13795b;
        if (i10 < ciVar.a()) {
            f02 f02Var = this.f13800g;
            ih ihVar = f02Var.f14149a;
            ciVar.b(i10, ihVar, 0L);
            int i11 = ihVar.f15754k;
            while (true) {
                if (i11 > ihVar.l) {
                    i10 = -1;
                    break;
                }
                int iE = ciVar2.e(ciVar.f(i11));
                if (iE != -1) {
                    i10 = ciVar2.d(iE, f02Var.f14150b, false).f20772c;
                    break;
                }
                i11++;
            }
        } else if (i10 >= ciVar2.a()) {
            i10 = -1;
            break;
        }
        this.f13795b = i10;
        return i10 != -1 && ((r32Var = this.f13797d) == null || ciVar2.e(r32Var.f19359a) != -1);
    }

    public final boolean b(zz1 zz1Var) {
        r32 r32Var = zz1Var.f22778d;
        if (r32Var == null) {
            return this.f13795b != zz1Var.f22777c;
        }
        long j10 = this.f13796c;
        if (j10 == -1) {
            return false;
        }
        long j11 = r32Var.f19362d;
        if (j11 > j10) {
            return true;
        }
        r32 r32Var2 = this.f13797d;
        if (r32Var2 == null) {
            return false;
        }
        ci ciVar = zz1Var.f22776b;
        int iE = ciVar.e(r32Var.f19359a);
        int iE2 = ciVar.e(r32Var2.f19359a);
        long j12 = r32Var2.f19362d;
        int i10 = r32Var2.f19360b;
        if (j11 < j12 || iE < iE2) {
            return false;
        }
        if (iE > iE2) {
            return true;
        }
        if (!r32Var.b()) {
            int i11 = r32Var.f19363e;
            return i11 == -1 || i11 > i10;
        }
        int i12 = r32Var.f19360b;
        int i13 = r32Var.f19361c;
        if (i12 <= i10) {
            return i12 == i10 && i13 > r32Var2.f19361c;
        }
        return true;
    }
}
