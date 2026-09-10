package com.vungle.ads;

import android.app.Application;
import android.content.Context;
import com.ironsource.X3;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.VungleInitializer;
import com.vungle.ads.internal.VungleInternal;
import monacal.Placement;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VungleAds.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/oilcan;", "", "<init>", "()V", "Companion", "attabal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class oilcan {
    public static final String TAG = "VungleAds";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static VungleInternal vungleInternal = new VungleInternal();
    private static VungleInitializer initializer = new VungleInitializer();
    public static final FirstPartyData firstPartyData = new FirstPartyData();

    /* JADX INFO: renamed from: com.vungle.ads.oilcan$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: VungleAds.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/vungle/ads/oilcan$attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "appId", "Lcom/vungle/ads/triweekly;", "callback", "", X3.a.f, "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/triweekly;)V", "", "isInitialized", "()Z", "Lcom/vungle/ads/taiyuan;", "getBiddingToken", "(Landroid/content/Context;Lcom/vungle/ads/taiyuan;)V", "getSdkVersion", "()Ljava/lang/String;", "placementId", "isInline", "(Ljava/lang/String;)Z", "Lcom/vungle/ads/VungleWrapperFramework;", "wrapperFramework", "wrapperFrameworkVersion", "setIntegrationName", "(Lcom/vungle/ads/VungleWrapperFramework;Ljava/lang/String;)V", "deInit", "(Landroid/content/Context;)V", "TAG", "Ljava/lang/String;", "Lcom/vungle/ads/fpd/FirstPartyData;", "firstPartyData", "Lcom/vungle/ads/fpd/FirstPartyData;", "Lcom/vungle/ads/internal/VungleInitializer;", "initializer", "Lcom/vungle/ads/internal/VungleInitializer;", "Lcom/vungle/ads/internal/VungleInternal;", "vungleInternal", "Lcom/vungle/ads/internal/VungleInternal;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void deInit(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            oilcan.initializer.deInit$vungle_ads_release();
        }

        public final void getBiddingToken(Context context, taiyuan callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            oilcan.vungleInternal.getAvailableBidTokensAsync(context, callback);
        }

        public final String getSdkVersion() {
            return oilcan.vungleInternal.getSdkVersion();
        }

        public final void init(Context context, String appId, triweekly callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            VungleInitializer vungleInitializer = oilcan.initializer;
            Intrinsics.checkNotNullExpressionValue(context, "appContext");
            vungleInitializer.init(appId, context, callback);
        }

        public final boolean isInitialized() {
            return oilcan.initializer.isInitialized();
        }

        public final boolean isInline(String placementId) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
            Placement placement = ConfigManager.INSTANCE.getPlacement(placementId);
            if (placement != null) {
                return placement.isInline();
            }
            return false;
        }

        public final void setIntegrationName(VungleWrapperFramework wrapperFramework, String wrapperFrameworkVersion) {
            Intrinsics.checkNotNullParameter(wrapperFramework, "wrapperFramework");
            Intrinsics.checkNotNullParameter(wrapperFrameworkVersion, "wrapperFrameworkVersion");
            oilcan.initializer.setIntegrationName(wrapperFramework, wrapperFrameworkVersion);
        }

        private Companion() {
        }
    }

    public static final void deInit(Context context) {
        INSTANCE.deInit(context);
    }

    public static final void getBiddingToken(Context context, taiyuan taiyuanVar) {
        INSTANCE.getBiddingToken(context, taiyuanVar);
    }

    public static final String getSdkVersion() {
        return INSTANCE.getSdkVersion();
    }

    public static final void init(Context context, String str, triweekly triweeklyVar) {
        INSTANCE.init(context, str, triweeklyVar);
    }

    public static final boolean isInitialized() {
        return INSTANCE.isInitialized();
    }

    public static final boolean isInline(String str) {
        return INSTANCE.isInline(str);
    }

    public static final void setIntegrationName(VungleWrapperFramework vungleWrapperFramework, String str) {
        INSTANCE.setIntegrationName(vungleWrapperFramework, str);
    }
}
