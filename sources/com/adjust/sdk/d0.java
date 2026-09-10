package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6830c;

    public /* synthetic */ d0(int i10, Object obj, Object obj2) {
        this.f6828a = i10;
        this.f6829b = obj;
        this.f6830c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6828a) {
            case 0:
                OnRemoteTriggerListener onRemoteTriggerListener = ((ActivityHandler) this.f6829b).adjustConfig.onRemoteTriggerListener;
                if (onRemoteTriggerListener != null) {
                    onRemoteTriggerListener.onRemoteTrigger((AdjustRemoteTrigger) this.f6830c);
                }
                break;
            case 1:
                ((ActivityHandler) this.f6829b).launchSdkClickResponseTasksI((SdkClickResponseData) this.f6830c);
                break;
            case 2:
                ((ActivityHandler) this.f6829b).launchAttributionResponseTasksI((AttributionResponseData) this.f6830c);
                break;
            case 3:
                ((ActivityHandler) this.f6829b).launchPurchaseVerificationResponseTasksI((PurchaseVerificationResponseData) this.f6830c);
                break;
            case 4:
                ((ActivityHandler) this.f6829b).launchThirdPartySharingResponseTasksI((ThirdPartySharingResponseData) this.f6830c);
                break;
            case 5:
                ((ActivityHandler) this.f6829b).processRemoteTriggersI((ResponseData) this.f6830c);
                break;
            case 6:
                ((OnThirdPartySharingSettingsReadListener) this.f6830c).onThirdPartySharingSettingsRead(((ActivityHandler) this.f6829b).thirdPartySharingResult);
                break;
            case 7:
                ((OnDeeplinkResolvedListener) this.f6830c).onDeeplinkResolved(((SdkClickResponseData) this.f6829b).resolvedDeeplink);
                break;
            case 8:
                ((PurchaseVerificationResponseData) this.f6830c).activityPackage.getPurchaseVerificationCallback().onVerificationFinished((AdjustPurchaseVerificationResult) this.f6829b);
                break;
            case 9:
                ((OnDeeplinkResolvedListener) this.f6830c).onDeeplinkResolved((String) this.f6829b);
                break;
            case 10:
                ((ActivityHandler) this.f6829b).sendLicenseVerificationDataI((LicenseData) this.f6830c);
                break;
            case 11:
                ((OnThirdPartySharingSettingsReadListener) ((i0) this.f6829b).f6859e).onThirdPartySharingSettingsRead((AdjustThirdPartySharingResult) this.f6830c);
                break;
            case 12:
                ((OnAdidReadListener) ((i0) this.f6829b).f6859e).onAdidRead((String) this.f6830c);
                break;
            case 13:
                ((OnAttributionReadListener) ((i0) this.f6829b).f6859e).onAttributionRead((AdjustAttribution) this.f6830c);
                break;
            case 14:
                AttributionHandler attributionHandler = (AttributionHandler) this.f6829b;
                IActivityHandler iActivityHandler = (IActivityHandler) attributionHandler.activityHandlerWeakRef.get();
                if (iActivityHandler != null) {
                    attributionHandler.checkSessionResponseI(iActivityHandler, (SessionResponseData) this.f6830c);
                    break;
                }
                break;
            case 15:
                AttributionHandler attributionHandler2 = (AttributionHandler) this.f6829b;
                IActivityHandler iActivityHandler2 = (IActivityHandler) attributionHandler2.activityHandlerWeakRef.get();
                if (iActivityHandler2 != null) {
                    attributionHandler2.checkSdkClickResponseI(iActivityHandler2, (SdkClickResponseData) this.f6830c);
                    break;
                }
                break;
            case 16:
                AttributionHandler attributionHandler3 = (AttributionHandler) this.f6829b;
                IActivityHandler iActivityHandler3 = (IActivityHandler) attributionHandler3.activityHandlerWeakRef.get();
                if (iActivityHandler3 != null) {
                    attributionHandler3.checkAttributionResponseI(iActivityHandler3, (AttributionResponseData) this.f6830c);
                    break;
                }
                break;
            case 17:
                AttributionHandler attributionHandler4 = (AttributionHandler) this.f6829b;
                IActivityHandler iActivityHandler4 = (IActivityHandler) attributionHandler4.activityHandlerWeakRef.get();
                if (iActivityHandler4 != null) {
                    ResponseData responseData = (ResponseData) this.f6830c;
                    if (responseData.trackingState == TrackingState.OPTED_OUT) {
                        iActivityHandler4.gotOptOutResponse();
                        break;
                    } else if (responseData instanceof AttributionResponseData) {
                        attributionHandler4.checkAttributionResponseI(iActivityHandler4, (AttributionResponseData) responseData);
                        break;
                    }
                }
                break;
            case 18:
                ((PackageHandler) this.f6829b).addI((ActivityPackage) this.f6830c);
                break;
            case 19:
                ((PackageHandler) this.f6829b).sendNextI(((ResponseData) this.f6830c).continueIn);
                break;
            default:
                ((PurchaseVerificationHandler) this.f6829b).sendPurchaseVerificationPackageI((ActivityPackage) this.f6830c);
                break;
        }
    }

    public /* synthetic */ d0(Object obj, boolean z10, Object obj2, int i10) {
        this.f6828a = i10;
        this.f6830c = obj;
        this.f6829b = obj2;
    }
}
