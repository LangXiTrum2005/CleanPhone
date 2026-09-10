package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.util.Consumer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC5016xU {
    public static final C4928wU Companion = C4928wU.$$INSTANCE;
    public static final String MANUFACTURER_AMAZON = "Amazon";

    L3 getAdvertisingInfo();

    String getAppSetId();

    Integer getAppSetIdScope();

    String getCarrierName();

    String getUserAgent();

    void getUserAgentLazy(Consumer<String> consumer);

    float getVolumeLevel();

    boolean isBatterySaverEnabled();

    boolean isSdCardPresent();

    boolean isSideLoaded();

    boolean isSilentModeEnabled();

    boolean isSoundEnabled();
}
