package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f29186b;

    public /* synthetic */ lh(B b10, int i10) {
        this.f29185a = i10;
        this.f29186b = b10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29185a;
        B b10 = this.f29186b;
        switch (i10) {
            case 0:
                B.b(b10);
                break;
            default:
                B.c(b10);
                break;
        }
    }
}
