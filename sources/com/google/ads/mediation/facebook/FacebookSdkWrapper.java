package com.google.ads.mediation.facebook;

import com.facebook.ads.internal.settings.AdSdkVersion;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: FacebookSdkWrapper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/ads/mediation/facebook/FacebookSdkWrapper;", "", "<init>", "()V", "sdkVersion", "", "getSdkVersion$annotations", "getSdkVersion", "()Ljava/lang/String;", "meta_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FacebookSdkWrapper {
    public static final FacebookSdkWrapper INSTANCE = new FacebookSdkWrapper();

    public static final String getSdkVersion() {
        return AdSdkVersion.BUILD;
    }

    public static /* synthetic */ void getSdkVersion$annotations() {
    }
}
