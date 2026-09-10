package hg;

import com.google.android.gms.internal.ads.n3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42347b;

    public a(int i10) {
        this.f42346a = i10;
        this.f42347b = Integer.MAX_VALUE;
    }

    @Override // hg.c
    public final n3 a(n3 n3Var) {
        int i10 = n3Var.f17625b;
        int i11 = n3Var.f17624a;
        int i12 = this.f42347b;
        int i13 = this.f42346a;
        if (i10 <= i13 && i11 <= i12) {
            return n3Var;
        }
        float f10 = i10;
        float f11 = i13;
        float f12 = f10 / f11;
        float f13 = i11;
        float f14 = i12;
        float f15 = f10 / f13;
        if (f13 / f14 >= f12) {
            i13 = (int) (f14 * f15);
        } else {
            i12 = (int) (f11 / f15);
        }
        if (i13 % 2 != 0) {
            i13--;
        }
        if (i12 % 2 != 0) {
            i12--;
        }
        return new n3(i13, i12);
    }

    public a(int i10, int i11) {
        this.f42346a = i10;
        this.f42347b = i11;
    }
}
