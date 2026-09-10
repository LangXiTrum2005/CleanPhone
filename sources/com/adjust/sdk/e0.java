package com.adjust.sdk;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6837d;

    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, int i10) {
        this.f6834a = i10;
        this.f6835b = obj;
        this.f6836c = obj2;
        this.f6837d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6834a) {
            case 0:
                Uri uri = (Uri) this.f6836c;
                ActivityHandler activityHandler = (ActivityHandler) this.f6835b;
                AdjustConfig adjustConfig = activityHandler.adjustConfig;
                if (adjustConfig != null) {
                    OnDeferredDeeplinkResponseListener onDeferredDeeplinkResponseListener = adjustConfig.onDeferredDeeplinkResponseListener;
                    if (onDeferredDeeplinkResponseListener != null ? onDeferredDeeplinkResponseListener.launchReceivedDeeplink(uri) : true) {
                        activityHandler.launchDeeplinkMain((Intent) this.f6837d, uri);
                    }
                    break;
                }
                break;
            case 1:
                ((ActivityHandler) this.f6835b).sendInstallReferrerI((ReferrerDetails) this.f6836c, (String) this.f6837d);
                break;
            default:
                SdkClickHandler sdkClickHandler = (SdkClickHandler) this.f6835b;
                IActivityHandler iActivityHandler = (IActivityHandler) sdkClickHandler.activityHandlerWeakRef.get();
                if (iActivityHandler != null) {
                    sdkClickHandler.sendSdkClick(PackageFactory.buildPreinstallSdkClickPackage((String) this.f6836c, (String) this.f6837d, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getGlobalParameters(), iActivityHandler.getFirstSessionDelayManager()));
                    break;
                }
                break;
        }
    }
}
