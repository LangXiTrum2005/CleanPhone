package com.vungle.ads;

import com.ironsource.Db;
import com.ironsource.K1;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: VunglePrivacySettings.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/vungle/ads/sealless;", "", "<init>", "()V", "", "isUserCoppa", "", "setCOPPAStatus", "(Z)V", "", "getCOPPAStatus", "()Ljava/lang/String;", K1.k, "consentMessageVersion", "setGDPRStatus", "(ZLjava/lang/String;)V", "getGDPRStatus", "getGDPRMessageVersion", "getGDPRSource", "", "getGDPRTimestamp", "()J", "setCCPAStatus", "getCCPAStatus", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class sealless {
    public static final sealless INSTANCE = new sealless();

    private sealless() {
    }

    public static final String getCCPAStatus() {
        return PrivacyManager.INSTANCE.getCcpaStatus();
    }

    public static final String getCOPPAStatus() {
        return PrivacyManager.INSTANCE.getCoppaStatus().name();
    }

    public static final String getGDPRMessageVersion() {
        return PrivacyManager.INSTANCE.getConsentMessageVersion();
    }

    public static final String getGDPRSource() {
        return PrivacyManager.INSTANCE.getConsentSource();
    }

    public static final String getGDPRStatus() {
        return PrivacyManager.INSTANCE.getConsentStatus();
    }

    public static final long getGDPRTimestamp() {
        return PrivacyManager.INSTANCE.getConsentTimestamp();
    }

    public static final void setCCPAStatus(boolean optIn) {
        PrivacyManager.INSTANCE.updateCcpaConsent(optIn ? PrivacyConsent.OPT_IN : PrivacyConsent.OPT_OUT);
    }

    public static final void setCOPPAStatus(boolean isUserCoppa) {
        PrivacyManager.INSTANCE.updateCoppaConsent(isUserCoppa);
    }

    public static final void setGDPRStatus(boolean optIn, String consentMessageVersion) {
        PrivacyManager.INSTANCE.updateGdprConsent(optIn ? PrivacyConsent.OPT_IN.getValue() : PrivacyConsent.OPT_OUT.getValue(), Db.b, consentMessageVersion);
    }
}
