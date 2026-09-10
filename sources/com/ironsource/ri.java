package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ri implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0640w9 f30188b;

    public /* synthetic */ ri(C0640w9 c0640w9, int i10) {
        this.f30187a = i10;
        this.f30188b = c0640w9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f30187a;
        C0640w9 c0640w9 = this.f30188b;
        switch (i10) {
            case 0:
                C0640w9.a(c0640w9);
                break;
            case 1:
                C0640w9.c(c0640w9);
                break;
            case 2:
                C0640w9.b(c0640w9);
                break;
            default:
                C0640w9.d(c0640w9);
                break;
        }
    }
}
