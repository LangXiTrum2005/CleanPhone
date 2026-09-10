package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a8 extends y7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f23297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b8 f23298g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(b8 b8Var, Activity activity, int i10) {
        super(b8Var.f23317a, true);
        this.f23296e = i10;
        switch (i10) {
            case 1:
                this.f23297f = activity;
                this.f23298g = b8Var;
                super(b8Var.f23317a, true);
                break;
            case 2:
                this.f23297f = activity;
                this.f23298g = b8Var;
                super(b8Var.f23317a, true);
                break;
            case 3:
                this.f23297f = activity;
                this.f23298g = b8Var;
                super(b8Var.f23317a, true);
                break;
            case 4:
                this.f23297f = activity;
                this.f23298g = b8Var;
                super(b8Var.f23317a, true);
                break;
            default:
                this.f23297f = activity;
                this.f23298g = b8Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.y7
    public final void a() {
        switch (this.f23296e) {
            case 0:
                y6 y6Var = this.f23298g.f23317a.f23358f;
                k9.c0.h(y6Var);
                y6Var.onActivityStartedByScionActivityInfo(k7.b(this.f23297f), this.f24172b);
                break;
            case 1:
                y6 y6Var2 = this.f23298g.f23317a.f23358f;
                k9.c0.h(y6Var2);
                y6Var2.onActivityResumedByScionActivityInfo(k7.b(this.f23297f), this.f24172b);
                break;
            case 2:
                y6 y6Var3 = this.f23298g.f23317a.f23358f;
                k9.c0.h(y6Var3);
                y6Var3.onActivityPausedByScionActivityInfo(k7.b(this.f23297f), this.f24172b);
                break;
            case 3:
                y6 y6Var4 = this.f23298g.f23317a.f23358f;
                k9.c0.h(y6Var4);
                y6Var4.onActivityStoppedByScionActivityInfo(k7.b(this.f23297f), this.f24172b);
                break;
            default:
                y6 y6Var5 = this.f23298g.f23317a.f23358f;
                k9.c0.h(y6Var5);
                y6Var5.onActivityDestroyedByScionActivityInfo(k7.b(this.f23297f), this.f24172b);
                break;
        }
    }
}
