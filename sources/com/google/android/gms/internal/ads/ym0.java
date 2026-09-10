package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ym0 implements gd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qm0 f22311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ du0 f22312c;

    public /* synthetic */ ym0(tm0 tm0Var, qm0 qm0Var, du0 du0Var, int i10) {
        this.f22310a = i10;
        this.f22311b = qm0Var;
        this.f22312c = du0Var;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void c(boolean z10, Context context, ka0 ka0Var) throws fd0 {
        switch (this.f22310a) {
            case 0:
                try {
                    wu0 wu0Var = (wu0) this.f22311b.f19127b;
                    wu0Var.b(z10);
                    try {
                        wu0Var.f21609a.Y0(new s9.b(context));
                        return;
                    } catch (Throwable th2) {
                        throw new qu0(th2);
                    }
                } catch (qu0 e10) {
                    throw new fd0(e10.getCause());
                }
            default:
                try {
                    wu0 wu0Var2 = (wu0) this.f22311b.f19127b;
                    wu0Var2.b(z10);
                    try {
                        wu0Var2.f21609a.V(new s9.b(context));
                        return;
                    } catch (Throwable th3) {
                        throw new qu0(th3);
                    }
                } catch (qu0 e11) {
                    throw new fd0(e11.getCause());
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final du0 zzb() {
        switch (this.f22310a) {
            case 0:
                break;
        }
        return this.f22312c;
    }
}
