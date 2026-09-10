package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdjustThirdPartySharing f6874b;

    public /* synthetic */ l(AdjustThirdPartySharing adjustThirdPartySharing, int i10) {
        this.f6873a = i10;
        this.f6874b = adjustThirdPartySharing;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        int i10 = this.f6873a;
        AdjustThirdPartySharing adjustThirdPartySharing = this.f6874b;
        switch (i10) {
            case 0:
                activityHandler.tryTrackThirdPartySharingI(adjustThirdPartySharing);
                break;
            default:
                activityHandler.tryTrackThirdPartySharingI(adjustThirdPartySharing);
                break;
        }
    }
}
