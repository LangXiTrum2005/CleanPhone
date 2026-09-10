package com.google.ads.mediation.vungle;

import android.content.Context;
import com.vungle.ads.oilcan;
import com.vungle.ads.taiyuan;
import com.vungle.ads.triweekly;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VungleSdkWrapper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/google/ads/mediation/vungle/VungleSdkWrapper;", "", "<init>", "()V", "delegate", "Lcom/google/ads/mediation/vungle/SdkWrapper;", "liftoffmonetize_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VungleSdkWrapper {
    public static final VungleSdkWrapper INSTANCE = new VungleSdkWrapper();
    public static SdkWrapper delegate = new SdkWrapper() { // from class: com.google.ads.mediation.vungle.VungleSdkWrapper$delegate$1
        @Override // com.google.ads.mediation.vungle.SdkWrapper
        public void getBiddingToken(Context context, taiyuan callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            oilcan.Companion.getBiddingToken(context, callback);
        }

        @Override // com.google.ads.mediation.vungle.SdkWrapper
        public String getSdkVersion() {
            return oilcan.Companion.getSdkVersion();
        }

        @Override // com.google.ads.mediation.vungle.SdkWrapper
        public void init(Context context, String appId, triweekly initializationListener) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
            oilcan.Companion.init(context, appId, initializationListener);
        }

        @Override // com.google.ads.mediation.vungle.SdkWrapper
        public boolean isInitialized() {
            return oilcan.Companion.isInitialized();
        }
    };
}
