package com.adjust.sdk;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityPackage f7068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SdkClickHandler f7069c;

    public /* synthetic */ y0(SdkClickHandler sdkClickHandler, ActivityPackage activityPackage, int i10) {
        this.f7067a = i10;
        this.f7069c = sdkClickHandler;
        this.f7068b = activityPackage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7067a) {
            case 0:
                SdkClickHandler sdkClickHandler = this.f7069c;
                List list = sdkClickHandler.packageQueue;
                ActivityPackage activityPackage = this.f7068b;
                list.add(activityPackage);
                sdkClickHandler.logger.debug("Added sdk_click %d", Integer.valueOf(sdkClickHandler.packageQueue.size()));
                sdkClickHandler.logger.verbose("%s", activityPackage.getExtendedString());
                sdkClickHandler.sendNextSdkClick();
                break;
            default:
                ActivityPackage activityPackage2 = this.f7068b;
                SdkClickHandler sdkClickHandler2 = this.f7069c;
                sdkClickHandler2.sendSdkClickI(activityPackage2);
                sdkClickHandler2.sendNextSdkClick();
                break;
        }
    }
}
