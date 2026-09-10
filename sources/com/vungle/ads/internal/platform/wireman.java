package com.vungle.ads.internal.platform;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: Platform.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\r\bf\u0018\u0000 '2\u00020\u0001:\u0001(J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H&¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H&¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0018R\u0014\u0010\"\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\fR\u0014\u0010#\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0018R\u0016\u0010%\u001a\u0004\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\fR\u0014\u0010&\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0018¨\u0006)"}, d2 = {"Lcom/vungle/ads/internal/platform/wireman;", "", "Ltechnofreak/saneness;", "", "consumer", "", "getUserAgentLazy", "(Ltechnofreak/saneness;)V", "Lmonacal/saneness;", "getAdvertisingInfo", "()Lmonacal/saneness;", "getAppSetId", "()Ljava/lang/String;", "", "getAppSetIdScope", "()Ljava/lang/Integer;", "", "getOSInstallationTime", "()J", "getSDKInstallationTime", "getLastBootTime", "getBuildTime", "", "isProblematicMaliDevice", "()Z", "getGPVersion", "isBatterySaverEnabled", "isSideLoaded", "", "getVolumeLevel", "()F", "volumeLevel", "isSoundEnabled", "getCarrierName", "carrierName", "isSdCardPresent", "getUserAgent", "userAgent", "isSilentModeEnabled", "Companion", "attabal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface wireman {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String MANUFACTURER_AMAZON = "Amazon";

    /* JADX INFO: renamed from: com.vungle.ads.internal.platform.wireman$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Platform.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/platform/wireman$attabal;", "", "<init>", "()V", "", "MANUFACTURER_AMAZON", "Ljava/lang/String;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String MANUFACTURER_AMAZON = "Amazon";

        private Companion() {
        }
    }

    monacal.saneness getAdvertisingInfo();

    String getAppSetId();

    Integer getAppSetIdScope();

    long getBuildTime();

    String getCarrierName();

    String getGPVersion();

    long getLastBootTime();

    long getOSInstallationTime();

    long getSDKInstallationTime();

    String getUserAgent();

    void getUserAgentLazy(technofreak.saneness<String> consumer);

    float getVolumeLevel();

    boolean isBatterySaverEnabled();

    boolean isProblematicMaliDevice();

    boolean isSdCardPresent();

    boolean isSideLoaded();

    boolean isSilentModeEnabled();

    boolean isSoundEnabled();
}
