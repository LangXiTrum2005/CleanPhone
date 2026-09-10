package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f15455b;

    public /* synthetic */ i0(Handler handler, int i10) {
        this.f15454a = i10;
        this.f15455b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f15454a) {
            case 0:
                this.f15455b.post(runnable);
                break;
            case 1:
                this.f15455b.post(runnable);
                break;
            default:
                this.f15455b.post(runnable);
                break;
        }
    }

    public i0(b21 b21Var, Handler handler) {
        this.f15454a = 1;
        this.f15455b = handler;
    }
}
