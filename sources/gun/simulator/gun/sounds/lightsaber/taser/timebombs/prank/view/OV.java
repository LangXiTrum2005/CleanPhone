package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.VisibleForTesting;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class OV {
    private static LV ccpaConsent;
    private static C2919Yt filePreferences;
    private static String gdprConsent;
    private static String gdprConsentMessageVersion;
    private static String gdprConsentSource;
    private static Long gdprConsentTimestamp;
    private static SharedPreferences sharedPreferences;
    public static final OV INSTANCE = new OV();
    private static final AtomicReference<Boolean> disableAdId = new AtomicReference<>();
    private static final AtomicReference<Boolean> coppaStatus = new AtomicReference<>();
    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    private OV() {
    }

    private final void saveCcpaConsent(LV lv) {
        C2919Yt c2919YtPut;
        C2919Yt c2919Yt = filePreferences;
        if (c2919Yt == null || (c2919YtPut = c2919Yt.put("ccpa_status", lv.getValue())) == null) {
            return;
        }
        c2919YtPut.apply();
    }

    private final void saveCoppaConsent(boolean z) {
        C2919Yt c2919YtPut;
        C2919Yt c2919Yt = filePreferences;
        if (c2919Yt == null || (c2919YtPut = c2919Yt.put("is_coppa", z)) == null) {
            return;
        }
        c2919YtPut.apply();
    }

    private final void saveGdprConsent(String str, String str2, String str3, long j) {
        C2919Yt c2919YtPut;
        C2919Yt c2919YtPut2;
        C2919Yt c2919YtPut3;
        C2919Yt c2919YtPut4;
        C2919Yt c2919Yt = filePreferences;
        if (c2919Yt == null || (c2919YtPut = c2919Yt.put("gdpr_status", str)) == null || (c2919YtPut2 = c2919YtPut.put("gdpr_source", str2)) == null || (c2919YtPut3 = c2919YtPut2.put("gdpr_message_version", str3)) == null || (c2919YtPut4 = c2919YtPut3.put("gdpr_timestamp", j)) == null) {
            return;
        }
        c2919YtPut4.apply();
    }

    public final MV allowDeviceIDFromTCF() {
        Boolean gdprAppliesFromPreferences = getGdprAppliesFromPreferences();
        if (!AbstractC2995aW.i(gdprAppliesFromPreferences, Boolean.TRUE)) {
            return gdprAppliesFromPreferences == null ? MV.FALLBACK : MV.ALLOW_ID;
        }
        EnumC2337Ci tcfStatus = C3457fi.INSTANCE.getTcfStatus();
        int i = tcfStatus == null ? -1 : NV.$EnumSwitchMapping$1[tcfStatus.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return MV.DISABLE_ID;
            }
            if (i == 2) {
                return MV.ALLOW_ID;
            }
            if (i != 3) {
                throw new C3770jF(7, 0);
            }
        }
        return MV.FALLBACK;
    }

    public final String getCcpaStatus() {
        String value;
        LV lv = ccpaConsent;
        return (lv == null || (value = lv.getValue()) == null) ? LV.OPT_IN.getValue() : value;
    }

    public final String getConsentMessageVersion() {
        String str = gdprConsentMessageVersion;
        return str == null ? "" : str;
    }

    public final String getConsentSource() {
        String str = gdprConsentSource;
        return str == null ? "no_interaction" : str;
    }

    public final String getConsentStatus() {
        String str = gdprConsent;
        return str == null ? "unknown" : str;
    }

    public final long getConsentTimestamp() {
        Long l = gdprConsentTimestamp;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final EnumC4323pc getCoppaStatus() {
        AtomicReference<Boolean> atomicReference = coppaStatus;
        if (atomicReference.get() == null) {
            return EnumC4323pc.COPPA_NOTSET;
        }
        if (AbstractC2995aW.i(atomicReference.get(), Boolean.TRUE)) {
            return EnumC4323pc.COPPA_ENABLED;
        }
        return AbstractC2995aW.i(atomicReference.get(), Boolean.FALSE) ? EnumC4323pc.COPPA_DISABLED : EnumC4323pc.COPPA_NOTSET;
    }

    @VisibleForTesting
    public final Boolean getDisableAdId$vungle_ads_release() {
        return disableAdId.get();
    }

    public final Boolean getGdprAppliesFromPreferences() {
        Object objV;
        Object objV2;
        String string;
        try {
            SharedPreferences sharedPreferences2 = sharedPreferences;
            objV = sharedPreferences2 != null ? Integer.valueOf(sharedPreferences2.getInt("IABTCF_gdprApplies", -1)) : null;
        } catch (Throwable th) {
            objV = AbstractC3375el.v(th);
        }
        if (IZ.a(objV) != null) {
            try {
                SharedPreferences sharedPreferences3 = sharedPreferences;
                objV2 = (sharedPreferences3 == null || (string = sharedPreferences3.getString("IABTCF_gdprApplies", "-1")) == null) ? null : Integer.valueOf(Integer.parseInt(string));
            } catch (Throwable th2) {
                objV2 = AbstractC3375el.v(th2);
            }
            objV = objV2;
        }
        if (objV instanceof HZ) {
            objV = null;
        }
        Integer num = (Integer) objV;
        if (num != null && num.intValue() == 1) {
            return Boolean.TRUE;
        }
        if (num != null && num.intValue() == 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final String getIABTCFString() {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        String string = sharedPreferences2 != null ? sharedPreferences2.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, "") : null;
        return string == null ? "" : string;
    }

    public final String getPreviousTcfToken() {
        C2919Yt c2919Yt = filePreferences;
        if (c2919Yt != null) {
            return c2919Yt.getString("previous_tcf_token", "");
        }
        return null;
    }

    public final SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    public final synchronized void init(Context context) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AtomicBoolean atomicBoolean = initialized;
        if (atomicBoolean.get()) {
            C4917wJ.Companion.w("PrivacyManager", "PrivacyManager already initialized");
            return;
        }
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        C2919Yt c2919Yt = (C2919Yt) C3756j50.Companion.getInstance(context).getService(C2919Yt.class);
        filePreferences = c2919Yt;
        AtomicReference<Boolean> atomicReference = disableAdId;
        Boolean bool = atomicReference.get();
        if (bool != null) {
            saveDisableAdId(bool.booleanValue());
        } else {
            Boolean bool2 = c2919Yt.getBoolean("disable_ad_id");
            if (bool2 != null) {
                atomicReference.set(bool2);
            }
        }
        String str = gdprConsent;
        if (str != null) {
            String str2 = gdprConsentSource;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            String str4 = gdprConsentMessageVersion;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = str4;
            Long l = gdprConsentTimestamp;
            saveGdprConsent(str, str3, str5, l != null ? l.longValue() : 0L);
        } else {
            String string = c2919Yt.getString("gdpr_status");
            LV lv = LV.OPT_IN;
            if (AbstractC2995aW.i(string, lv.getValue())) {
                string = lv.getValue();
            } else {
                LV lv2 = LV.OPT_OUT;
                if (AbstractC2995aW.i(string, lv2.getValue())) {
                    string = lv2.getValue();
                }
            }
            gdprConsent = string;
            gdprConsentSource = c2919Yt.getString("gdpr_source");
            gdprConsentMessageVersion = c2919Yt.getString("gdpr_message_version");
            gdprConsentTimestamp = Long.valueOf(c2919Yt.getLong("gdpr_timestamp", 0L));
        }
        LV lv3 = ccpaConsent;
        if (lv3 != null) {
            saveCcpaConsent(lv3);
        } else {
            String string2 = c2919Yt.getString("ccpa_status");
            LV lv4 = LV.OPT_OUT;
            if (!AbstractC2995aW.i(lv4.getValue(), string2)) {
                lv4 = LV.OPT_IN;
            }
            ccpaConsent = lv4;
        }
        AtomicReference<Boolean> atomicReference2 = coppaStatus;
        Boolean bool3 = atomicReference2.get();
        if (bool3 != null) {
            saveCoppaConsent(bool3.booleanValue());
        } else {
            Boolean bool4 = c2919Yt.getBoolean("is_coppa");
            if (bool4 != null) {
                atomicReference2.set(bool4);
            }
        }
        atomicBoolean.set(true);
    }

    @VisibleForTesting
    public final void saveDisableAdId(boolean z) {
        C2919Yt c2919YtPut;
        C2919Yt c2919Yt = filePreferences;
        if (c2919Yt == null || (c2919YtPut = c2919Yt.put("disable_ad_id", z)) == null) {
            return;
        }
        c2919YtPut.apply();
    }

    public final void setPreviousTcfToken(String str) {
        C2919Yt c2919Yt;
        C2919Yt c2919YtPut;
        if (str == null || str.length() == 0 || (c2919Yt = filePreferences) == null || (c2919YtPut = c2919Yt.put("previous_tcf_token", str)) == null) {
            return;
        }
        c2919YtPut.apply();
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences2) {
        sharedPreferences = sharedPreferences2;
    }

    public final boolean shouldReturnTrueForLegacy$vungle_ads_release() {
        String iABTCFString = getIABTCFString();
        if (AbstractC2995aW.i(getPreviousTcfToken(), iABTCFString)) {
            return false;
        }
        setPreviousTcfToken(iABTCFString);
        return true;
    }

    public final boolean shouldSendAdIds() {
        int i = NV.$EnumSwitchMapping$0[allowDeviceIDFromTCF().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2 && i != 3) {
            throw new C3770jF(7, 0);
        }
        Boolean disableAdId$vungle_ads_release = getDisableAdId$vungle_ads_release();
        return (disableAdId$vungle_ads_release == null || disableAdId$vungle_ads_release.booleanValue()) ? false : true;
    }

    public final boolean shouldSendTCFString() {
        if (!AbstractC2995aW.i(getGdprAppliesFromPreferences(), Boolean.TRUE)) {
            return false;
        }
        EnumC2337Ci tcfStatus = C3457fi.INSTANCE.getTcfStatus();
        int i = tcfStatus == null ? -1 : NV.$EnumSwitchMapping$1[tcfStatus.ordinal()];
        if (i != -1) {
            if (i == 1 || i == 2) {
                return true;
            }
            if (i != 3) {
                throw new C3770jF(7, 0);
            }
        }
        return shouldReturnTrueForLegacy$vungle_ads_release();
    }

    public final void updateCcpaConsent(LV lv) {
        AbstractC2995aW.q(lv, "consent");
        ccpaConsent = lv;
        saveCcpaConsent(lv);
    }

    public final void updateCoppaConsent(boolean z) {
        coppaStatus.set(Boolean.valueOf(z));
        saveCoppaConsent(z);
    }

    public final void updateDisableAdId(boolean z) {
        disableAdId.set(Boolean.valueOf(z));
        saveDisableAdId(z);
    }

    public final void updateGdprConsent(String str, String str2, String str3) {
        AbstractC2995aW.q(str, "consent");
        AbstractC2995aW.q(str2, "source");
        gdprConsent = str;
        gdprConsentSource = str2;
        gdprConsentMessageVersion = str3;
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        gdprConsentTimestamp = Long.valueOf(jCurrentTimeMillis);
        String str4 = gdprConsentMessageVersion;
        if (str4 == null) {
            str4 = "";
        }
        saveGdprConsent(str, str2, str4, jCurrentTimeMillis);
    }
}
