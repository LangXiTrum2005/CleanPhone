package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xh0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lj1 f21897b;

    public /* synthetic */ xh0(lj1 lj1Var, int i10) {
        this.f21896a = i10;
        this.f21897b = lj1Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f21896a) {
            case 0:
                lj1 lj1Var = this.f21897b;
                ((yh0) lj1Var.f17037c).f22254a.c((ConcurrentHashMap) lj1Var.f17036b);
                break;
            default:
                lj1 lj1Var2 = this.f21897b;
                ((yh0) lj1Var2.f17037c).f22254a.b((ConcurrentHashMap) lj1Var2.f17036b);
                break;
        }
    }
}
