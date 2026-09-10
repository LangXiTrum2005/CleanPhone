package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ji implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0427kb f29009b;

    public /* synthetic */ ji(C0427kb c0427kb, int i10) {
        this.f29008a = i10;
        this.f29009b = c0427kb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29008a;
        C0427kb c0427kb = this.f29009b;
        switch (i10) {
            case 0:
                C0427kb.b(c0427kb);
                break;
            default:
                C0427kb.a(c0427kb);
                break;
        }
    }
}
