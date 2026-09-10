package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7052b;

    public /* synthetic */ v(Object obj, int i10) {
        this.f7051a = i10;
        this.f7052b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7051a) {
            case 0:
                w wVar = (w) this.f7052b;
                OnAdidReadListener onAdidReadListener = wVar.f7056b.getOnAdidReadListener();
                if (onAdidReadListener != null) {
                    onAdidReadListener.onAdidRead(null);
                }
                wVar.f7056b.setOnAdidReadListener(null);
                break;
            case 1:
                w wVar2 = (w) this.f7052b;
                OnAttributionReadListener onAttributionReadListener = wVar2.f7056b.getOnAttributionReadListener();
                if (onAttributionReadListener != null) {
                    onAttributionReadListener.onAttributionRead(null);
                }
                wVar2.f7056b.setOnAttributionReadListener(null);
                break;
            case 2:
                w wVar3 = (w) this.f7052b;
                OnThirdPartySharingSettingsReadListener onThirdPartySharingSettingsReadListener = wVar3.f7056b.getOnThirdPartySharingSettingsReadListener();
                if (onThirdPartySharingSettingsReadListener != null) {
                    onThirdPartySharingSettingsReadListener.onThirdPartySharingSettingsRead(null);
                }
                wVar3.f7056b.setOnThirdPartySharingSettingsReadListener(null);
                break;
            case 3:
                ((InstallReferrer) this.f7052b).startConnection();
                break;
            default:
                ((SdkClickHandler) this.f7052b).sendNextSdkClickI();
                break;
        }
    }
}
