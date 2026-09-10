package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0512p6 f29771b;

    public /* synthetic */ mi(C0512p6 c0512p6, int i10) {
        this.f29770a = i10;
        this.f29771b = c0512p6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29770a;
        C0512p6 c0512p6 = this.f29771b;
        switch (i10) {
            case 0:
                C0512p6.b(c0512p6);
                break;
            case 1:
                C0512p6.c(c0512p6);
                break;
            default:
                C0512p6.a(c0512p6);
                break;
        }
    }
}
