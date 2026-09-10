package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hb0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f15244b;

    public /* synthetic */ hb0(jb0 jb0Var, int i10) {
        this.f15243a = i10;
        switch (i10) {
            case 1:
                this.f15244b = new WeakReference(jb0Var);
                break;
            default:
                this.f15244b = new WeakReference(jb0Var);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15243a) {
            case 0:
                jb0 jb0Var = (jb0) this.f15244b.get();
                if (jb0Var != null) {
                    jb0Var.S0(xa0.f21820o);
                }
                break;
            default:
                jb0 jb0Var2 = (jb0) this.f15244b.get();
                if (jb0Var2 != null) {
                    jb0Var2.S0(xa0.f21819n);
                }
                break;
        }
    }
}
