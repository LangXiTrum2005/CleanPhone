package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jz1 implements v32, c22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lz1 f16226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lo0 f16227b;

    public jz1(lo0 lo0Var, lz1 lz1Var) {
        this.f16227b = lo0Var;
        this.f16226a = lz1Var;
    }

    @Override // com.google.android.gms.internal.ads.v32
    public final void a(int i10, r32 r32Var, j32 j32Var, o32 o32Var) {
        Pair pairF = f(r32Var);
        if (pairF != null) {
            ((ys0) this.f16227b.f17090k).e(new hz1(this, pairF, j32Var, o32Var, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.v32
    public final void b(int i10, r32 r32Var, j32 j32Var, o32 o32Var) {
        Pair pairF = f(r32Var);
        if (pairF != null) {
            ((ys0) this.f16227b.f17090k).e(new hz1(this, pairF, j32Var, o32Var, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.v32
    public final void c(int i10, r32 r32Var, final j32 j32Var, final o32 o32Var, final int i11) {
        final Pair pairF = f(r32Var);
        if (pairF != null) {
            ((ys0) this.f16227b.f17090k).e(new Runnable() { // from class: com.google.android.gms.internal.ads.iz1
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairF;
                    int iIntValue = ((Integer) pair.first).intValue();
                    r32 r32Var2 = (r32) pair.second;
                    ((d02) this.f15880a.f16227b.f17089j).c(iIntValue, r32Var2, j32Var, o32Var, i11);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.v32
    public final void d(int i10, r32 r32Var, o32 o32Var) {
        Pair pairF = f(r32Var);
        if (pairF != null) {
            ((ys0) this.f16227b.f17090k).e(new o1(this, pairF, o32Var, 15));
        }
    }

    @Override // com.google.android.gms.internal.ads.v32
    public final void e(int i10, r32 r32Var, j32 j32Var, o32 o32Var, IOException iOException, boolean z10) {
        Pair pairF = f(r32Var);
        if (pairF != null) {
            ((ys0) this.f16227b.f17090k).e(new q21(this, pairF, j32Var, o32Var, iOException, z10));
        }
    }

    public final Pair f(r32 r32Var) {
        r32 r32VarA;
        lz1 lz1Var = this.f16226a;
        r32 r32Var2 = null;
        if (r32Var != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = lz1Var.f17167c;
                if (i10 >= arrayList.size()) {
                    r32VarA = null;
                    break;
                }
                if (((r32) arrayList.get(i10)).f19362d == r32Var.f19362d) {
                    Object obj = r32Var.f19359a;
                    Object obj2 = lz1Var.f17166b;
                    int i11 = sz1.f20092k;
                    r32VarA = r32Var.a(Pair.create(obj2, obj));
                    break;
                }
                i10++;
            }
            if (r32VarA == null) {
                return null;
            }
            r32Var2 = r32VarA;
        }
        return Pair.create(Integer.valueOf(lz1Var.f17168d), r32Var2);
    }
}
