package com.unity3d.ads.beta;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000fH\u0000\"\u0014\u0010\u0000\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"isInitialize", "", "()Z", "version", "", "getVersion", "()Ljava/lang/String;", "getToken", "", "configuration", "Lcom/unity3d/ads/beta/TokenConfiguration;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/beta/TokenListener;", MobileAdsBridgeBase.initializeMethodName, "Lcom/unity3d/ads/beta/InitializationConfiguration;", "Lcom/unity3d/ads/beta/InitializationListener;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class UnityAdsBeta {
    public static final void getToken(TokenConfiguration configuration, TokenListener listener) {
        Intrinsics.f(configuration, "configuration");
        Intrinsics.f(listener, "listener");
    }

    public static final String getVersion() {
        return "";
    }

    public static final void initialize(InitializationConfiguration configuration, InitializationListener listener) {
        Intrinsics.f(configuration, "configuration");
        Intrinsics.f(listener, "listener");
    }

    public static final boolean isInitialize() {
        return true;
    }
}
