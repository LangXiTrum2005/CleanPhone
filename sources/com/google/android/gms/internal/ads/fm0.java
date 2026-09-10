package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fm0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ky0 f14461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f14462c;

    public /* synthetic */ fm0(ky0 ky0Var, View view, int i10) {
        this.f14460a = i10;
        this.f14461b = ky0Var;
        this.f14462c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14460a) {
            case 0:
                if (((Boolean) zzba.zzc().a(am.q6)).booleanValue() && pi1.L.f17679b) {
                    ky0 ky0Var = this.f14461b;
                    if (!ky0Var.f16562f) {
                        ky0Var.f16558b.a(this.f14462c, my0.f17588a);
                        break;
                    }
                }
                break;
            default:
                if (((Boolean) zzba.zzc().a(am.q6)).booleanValue() && pi1.L.f17679b) {
                    this.f14461b.b(this.f14462c);
                    break;
                }
                break;
        }
    }
}
