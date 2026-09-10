package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class lg implements AppOpsManager.OnOpActiveChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16977b;

    public /* synthetic */ lg(Object obj, int i10) {
        this.f16976a = i10;
        this.f16977b = obj;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        switch (this.f16976a) {
            case 0:
                mg mgVar = (mg) this.f16977b;
                if (z10) {
                    mgVar.f17427a = System.currentTimeMillis();
                    mgVar.f17430d = true;
                    return;
                }
                long j10 = mgVar.f17428b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (j10 > 0) {
                    long j11 = mgVar.f17428b;
                    if (jCurrentTimeMillis >= j11) {
                        mgVar.f17429c = jCurrentTimeMillis - j11;
                    }
                }
                mgVar.f17430d = false;
                return;
            default:
                x61 x61Var = (x61) this.f16977b;
                synchronized (x61Var) {
                    try {
                        if (z10) {
                            x61Var.f21759c = System.currentTimeMillis();
                            x61Var.f21762f = true;
                        } else {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            long j12 = x61Var.f21760d;
                            if (j12 > 0 && jCurrentTimeMillis2 >= j12) {
                                x61Var.f21761e = jCurrentTimeMillis2 - j12;
                            }
                            x61Var.f21762f = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }
}
