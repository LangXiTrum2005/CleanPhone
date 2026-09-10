package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qs implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ms f19186b;

    public /* synthetic */ qs(ms msVar, int i10) {
        this.f19185a = i10;
        this.f19186b = msVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19185a) {
            case 0:
                ms msVar = this.f19186b;
                b30 b30Var = msVar.f17535a;
                if (b30Var != null) {
                    b30Var.destroy();
                    msVar.f17535a = null;
                }
                break;
            case 1:
                ms msVar2 = this.f19186b;
                b30 b30Var2 = msVar2.f17535a;
                if (b30Var2 != null) {
                    b30Var2.destroy();
                    msVar2.f17535a = null;
                }
                break;
            default:
                zze.zza("maybeDestroy > Destroying engine.");
                lq lqVar = nq.f17899j;
                ms msVar3 = this.f19186b;
                msVar3.k("/result", lqVar);
                b30 b30Var3 = msVar3.f17535a;
                if (b30Var3 != null) {
                    b30Var3.destroy();
                    msVar3.f17535a = null;
                }
                break;
        }
    }
}
