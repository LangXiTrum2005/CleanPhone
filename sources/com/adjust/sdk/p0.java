package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AttributionHandler f6902b;

    public /* synthetic */ p0(AttributionHandler attributionHandler, int i10) {
        this.f6901a = i10;
        this.f6902b = attributionHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6901a) {
            case 0:
                this.f6902b.sendAttributionRequest();
                break;
            case 1:
                AttributionHandler attributionHandler = this.f6902b;
                attributionHandler.lastInitiatedBy = "sdk";
                attributionHandler.getAttributionI(0L);
                break;
            default:
                this.f6902b.sendAttributionRequestI();
                break;
        }
    }
}
