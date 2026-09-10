package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u70 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hz f20672b;

    public /* synthetic */ u70(hz hzVar, int i10) {
        this.f20671a = i10;
        this.f20672b = hzVar;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f20671a) {
            case 0:
                View view = (View) this.f20672b.f15434c;
                ic1.h(view);
                return view;
            case 1:
                eu0 eu0Var = (eu0) this.f20672b.f15435d;
                ic1.h(eu0Var);
                return eu0Var;
            case 2:
                return (j80) this.f20672b.f15433b;
            default:
                return (b30) this.f20672b.f15436e;
        }
    }
}
