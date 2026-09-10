package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ti implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0408ja f30739b;

    public /* synthetic */ ti(InterfaceC0408ja interfaceC0408ja, int i10) {
        this.f30738a = i10;
        this.f30739b = interfaceC0408ja;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f30738a;
        InterfaceC0408ja interfaceC0408ja = this.f30739b;
        switch (i10) {
            case 0:
                C0650x1.d(interfaceC0408ja);
                break;
            default:
                C0650x1.c(interfaceC0408ja);
                break;
        }
    }
}
