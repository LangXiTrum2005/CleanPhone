package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6885b;

    public /* synthetic */ n(boolean z10, int i10) {
        this.f6884a = i10;
        this.f6885b = z10;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        int i10 = this.f6884a;
        boolean z10 = this.f6885b;
        switch (i10) {
            case 0:
                activityHandler.tryTrackMeasurementConsentI(z10);
                break;
            default:
                activityHandler.tryTrackMeasurementConsentI(z10);
                break;
        }
    }
}
