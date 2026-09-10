package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23288b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f23287a = i10;
        this.f23288b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f23287a) {
            case 0:
                return new ab(((r6) this.f23288b).f23921c);
            case 1:
                return new ab(((r6) this.f23288b).f23922d);
            default:
                h6 h6Var = (h6) this.f23288b;
                synchronized (((mf) h6Var.f23541c).f23748g) {
                    h6Var.f23540b = null;
                    break;
                }
                return null;
        }
    }
}
