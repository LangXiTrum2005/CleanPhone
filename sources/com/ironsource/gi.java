package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jk.a f28752b;

    public /* synthetic */ gi(jk.a aVar, int i10) {
        this.f28751a = i10;
        this.f28752b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f28751a;
        jk.a aVar = this.f28752b;
        switch (i10) {
            case 0:
                C0361gg.b(aVar);
                break;
            case 1:
                C0361gg.a(aVar);
                break;
            case 2:
                C0606ub.a(aVar);
                break;
            default:
                aVar.invoke();
                break;
        }
    }
}
