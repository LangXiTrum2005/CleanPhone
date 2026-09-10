package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P2 f30975b;

    public /* synthetic */ wh(P2 p10, int i10) {
        this.f30974a = i10;
        this.f30975b = p10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f30974a;
        P2 p10 = this.f30975b;
        switch (i10) {
            case 0:
                P2.d(p10);
                break;
            case 1:
                P2.c(p10);
                break;
            default:
                P2.b(p10);
                break;
        }
    }
}
