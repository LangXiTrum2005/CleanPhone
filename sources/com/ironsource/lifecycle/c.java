package com.ironsource.lifecycle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f29209b;

    public /* synthetic */ c(b bVar, int i10) {
        this.f29208a = i10;
        this.f29209b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29208a;
        b bVar = this.f29209b;
        switch (i10) {
            case 0:
                bVar.f();
                break;
            case 1:
                bVar.g();
                break;
            case 2:
                bVar.h();
                break;
            case 3:
                bVar.i();
                break;
            default:
                bVar.j();
                break;
        }
    }
}
