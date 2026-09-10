package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6821a;

    public /* synthetic */ c(int i10) {
        this.f6821a = i10;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f6821a) {
            case 0:
                activityHandler.removeGlobalCallbackParametersI();
                break;
            default:
                activityHandler.removeGlobalPartnerParametersI();
                break;
        }
    }
}
