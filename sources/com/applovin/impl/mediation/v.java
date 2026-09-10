package com.applovin.impl.mediation;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8793b;

    public /* synthetic */ v(Object obj, int i10) {
        this.f8792a = i10;
        this.f8793b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8792a;
        Object obj = this.f8793b;
        switch (i10) {
            case 0:
                ((h.b) obj).a();
                break;
            default:
                ((h) obj).l();
                break;
        }
    }
}
