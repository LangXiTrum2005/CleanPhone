package com.mbridge.msdk.config.component.common.network.retry;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f32026b;

    public /* synthetic */ d(c cVar, int i10) {
        this.f32025a = i10;
        this.f32026b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f32025a;
        c cVar = this.f32026b;
        switch (i10) {
            case 0:
                cVar.c();
                break;
            default:
                cVar.e();
                break;
        }
    }
}
