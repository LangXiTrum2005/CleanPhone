package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.j5;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9584b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f9583a = i10;
        this.f9584b = obj;
    }

    @Override // s.a
    public final Object apply(Object obj) {
        int i10 = this.f9583a;
        Object obj2 = this.f9584b;
        switch (i10) {
            case 0:
                return ((AppLovinNativeAdImpl) obj2).lambda$getCustomTabsNavigationAbortedPostbacks$6((j5) obj);
            case 1:
                return ((AppLovinNativeAdImpl) obj2).lambda$getOpenMeasurementVerificationScriptResources$10((JSONArray) obj);
            case 2:
                return ((AppLovinNativeAdImpl) obj2).lambda$getDirectClickTrackingPostbacks$9((j5) obj);
            case 3:
                return ((AppLovinNativeAdImpl) obj2).lambda$getCustomTabsNavigationFinishedPostbacks$4((j5) obj);
            case 4:
                return ((AppLovinNativeAdImpl) obj2).lambda$getCustomTabsNavigationFailedPostbacks$5((j5) obj);
            case 5:
                return ((AppLovinNativeAdImpl) obj2).lambda$getCustomTabsHeaders$2((j5) obj);
            case 6:
                return ((AppLovinNativeAdImpl) obj2).lambda$getCustomTabsTabShownPostbacks$7((j5) obj);
            case 7:
                return ((AppLovinNativeAdImpl) obj2).lambda$getCustomTabsTabHiddenPostbacks$8((j5) obj);
            case 8:
                return ((AppLovinNativeAdImpl) obj2).lambda$getCustomTabsNavigationStartedPostbacks$3((j5) obj);
            default:
                return AppLovinNativeAdImpl.lambda$getOpenMeasurementVerificationScriptResources$11((c) obj2, (j5) obj);
        }
    }
}
