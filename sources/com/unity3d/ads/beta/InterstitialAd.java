package com.unity3d.ads.beta;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/beta/InterstitialAd;", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/beta/LoadOptions;", "(Lcom/unity3d/ads/core/data/model/AdObject;Lcom/unity3d/ads/beta/LoadOptions;)V", "show", "", "activity", "Landroid/app/Activity;", "options", "Lcom/unity3d/ads/beta/ShowOptions;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/beta/ShowListener;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InterstitialAd {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AdObject adObject;
    private final LoadOptions loadOptions;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/beta/InterstitialAd$Companion;", "", "()V", "load", "", "options", "Lcom/unity3d/ads/beta/LoadOptions;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/beta/LoadListener;", "Lcom/unity3d/ads/beta/InterstitialAd;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void load(LoadOptions options, LoadListener<InterstitialAd> listener) {
            Intrinsics.f(options, "options");
            Intrinsics.f(listener, "listener");
        }

        private Companion() {
        }
    }

    public InterstitialAd(AdObject adObject, LoadOptions loadOptions) {
        Intrinsics.f(adObject, "adObject");
        Intrinsics.f(loadOptions, "loadOptions");
        this.adObject = adObject;
        this.loadOptions = loadOptions;
    }

    @JvmStatic
    public static final void load(LoadOptions loadOptions, LoadListener<InterstitialAd> loadListener) {
        INSTANCE.load(loadOptions, loadListener);
    }

    public final void show(Activity activity, ShowOptions options, ShowListener<InterstitialAd> listener) {
        Intrinsics.f(activity, "activity");
        Intrinsics.f(listener, "listener");
    }
}
