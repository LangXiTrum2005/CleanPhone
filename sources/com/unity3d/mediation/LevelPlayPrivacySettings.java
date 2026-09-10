package com.unity3d.mediation;

import com.ironsource.C0481nb;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class LevelPlayPrivacySettings {
    public static final LevelPlayPrivacySettings INSTANCE = new LevelPlayPrivacySettings();

    private LevelPlayPrivacySettings() {
    }

    public static final void setCCPA(boolean z10) {
        IronLog.API.info("LevelPlayPrivacySettings.setCCPA() value: " + z10);
        C0481nb.f29838c.b().a(z10);
    }

    public static final void setCOPPA(boolean z10) {
        IronLog.API.info("LevelPlayPrivacySettings.setCOPPA() value: " + z10);
        C0481nb.f29838c.b().b(z10);
    }

    public static final void setGDPRConsents(Map<String, Boolean> networkConsents) {
        n.f(networkConsents, "networkConsents");
        IronLog.API.info("LevelPlayPrivacySettings.setGDPRConsents() networkConsents: " + networkConsents);
        C0481nb.f29838c.b().a(networkConsents);
    }
}
