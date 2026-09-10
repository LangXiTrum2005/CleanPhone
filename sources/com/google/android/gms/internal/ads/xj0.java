package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xj0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21911d;

    public /* synthetic */ xj0(int i10, int i11, Object obj, Object obj2) {
        this.f21908a = i11;
        this.f21910c = obj;
        this.f21909b = i10;
        this.f21911d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21908a) {
            case 0:
                for (mj0 mj0Var : (CopyOnWriteArraySet) this.f21910c) {
                    li0 li0Var = (li0) this.f21911d;
                    if (!mj0Var.f17457d) {
                        int i10 = this.f21909b;
                        if (i10 != -1) {
                            mj0Var.f17455b.c(i10);
                        }
                        mj0Var.f17456c = true;
                        li0Var.mo161zza(mj0Var.f17454a);
                    }
                }
                break;
            default:
                ((id1) this.f21910c).s(this.f21909b, (ListenableFuture) this.f21911d);
                break;
        }
    }
}
