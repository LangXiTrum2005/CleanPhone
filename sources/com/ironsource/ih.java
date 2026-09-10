package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ih implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Aa f28912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0659xa f28913c;

    public /* synthetic */ ih(Aa aa2, C0659xa c0659xa, int i10) {
        this.f28911a = i10;
        this.f28912b = aa2;
        this.f28913c = c0659xa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28911a) {
            case 0:
                Aa.a(this.f28912b, this.f28913c);
                break;
            default:
                Aa.b(this.f28912b, this.f28913c);
                break;
        }
    }
}
