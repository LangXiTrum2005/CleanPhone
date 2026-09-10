package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h61 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i61 f15186b;

    public /* synthetic */ h61(i61 i61Var, int i10) {
        this.f15185a = i10;
        this.f15186b = i61Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f15185a;
        i61 i61Var = this.f15186b;
        switch (i10) {
            case 0:
                l51 l51Var = i61Var.f15628a;
                l31 l31VarB = l51Var.b(1);
                if (l31VarB == null) {
                    l51Var.f16743e.b(15315);
                    return null;
                }
                String strZ = l31VarB.z().z();
                File fileD = rb0.d(strZ, "pcam.jar", l51Var.c());
                fileD.getClass();
                if (!fileD.exists()) {
                    fileD = rb0.d(strZ, "pcam", l51Var.c());
                    fileD.getClass();
                }
                File fileD2 = rb0.d(strZ, "pcopt", l51Var.c());
                fileD2.getClass();
                File fileD3 = rb0.d(strZ, "pcbc", l51Var.c());
                fileD3.getClass();
                return new i01(l31VarB.z(), fileD, fileD3, fileD2);
            default:
                l31 l31VarB2 = i61Var.f15628a.b(1);
                return l31VarB2 == null ? l31.F() : l31VarB2;
        }
    }
}
