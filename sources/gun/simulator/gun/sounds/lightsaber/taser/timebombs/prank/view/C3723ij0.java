package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ij0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3723ij0 {
    public static final C3723ij0 INSTANCE = new C3723ij0();

    private C3723ij0() {
    }

    public static final String getCCPAStatus() {
        return OV.INSTANCE.getCcpaStatus();
    }

    public static final String getCOPPAStatus() {
        return OV.INSTANCE.getCoppaStatus().name();
    }

    public static final String getGDPRMessageVersion() {
        return OV.INSTANCE.getConsentMessageVersion();
    }

    public static final String getGDPRSource() {
        return OV.INSTANCE.getConsentSource();
    }

    public static final String getGDPRStatus() {
        return OV.INSTANCE.getConsentStatus();
    }

    public static final long getGDPRTimestamp() {
        return OV.INSTANCE.getConsentTimestamp();
    }

    public static final void setCCPAStatus(boolean z) {
        OV.INSTANCE.updateCcpaConsent(z ? LV.OPT_IN : LV.OPT_OUT);
    }

    public static final void setCOPPAStatus(boolean z) {
        OV.INSTANCE.updateCoppaConsent(z);
    }

    public static final void setGDPRStatus(boolean z, String str) {
        OV.INSTANCE.updateGdprConsent(z ? LV.OPT_IN.getValue() : LV.OPT_OUT.getValue(), "publisher", str);
    }
}
