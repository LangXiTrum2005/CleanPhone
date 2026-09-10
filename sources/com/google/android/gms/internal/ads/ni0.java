package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ni0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hx1 f17835b;

    public /* synthetic */ ni0(hx1 hx1Var, int i10) {
        this.f17834a = i10;
        this.f17835b = hx1Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f17834a) {
            case 0:
                return new so0((dr) this.f17835b.f15424a, 24);
            case 1:
                return new b21((ed0) this.f17835b.f15424a, 28);
            case 2:
                return new qp0((ct0) this.f17835b.f15424a, 3);
            case 3:
                return new zr0((nt0) this.f17835b.f15424a);
            case 4:
                File dir = ((Context) this.f17835b.f15424a).getDir("yqzdkcache", 0);
                ic1.h(dir);
                return dir;
            case 5:
                ExecutorService executorService = (ExecutorService) this.f17835b.f15424a;
                if (executorService instanceof fe1) {
                    return (fe1) executorService;
                }
                return executorService instanceof ScheduledExecutorService ? new ke1((ScheduledExecutorService) executorService) : new k00(executorService);
            case 6:
                return new a31((ExecutorService) this.f17835b.f15424a);
            default:
                DisplayMetrics displayMetrics = ((Context) this.f17835b.f15424a).getResources().getDisplayMetrics();
                ic1.h(displayMetrics);
                return displayMetrics;
        }
    }
}
