package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V0 f28316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f28317c;

    public /* synthetic */ bi(V0 v4, long j10, int i10) {
        this.f28315a = i10;
        this.f28316b = v4;
        this.f28317c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28315a) {
            case 0:
                W2.a.a(this.f28316b, this.f28317c);
                break;
            case 1:
                W2.a.b(this.f28316b, this.f28317c);
                break;
            case 2:
                W2.a.c(this.f28316b, this.f28317c);
                break;
            default:
                W2.a.d(this.f28316b, this.f28317c);
                break;
        }
    }
}
