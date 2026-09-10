package com.thinkup.core.api;

import android.content.Context;
import com.p004ironsource.x4;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ooo.oo;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TUInitMediation {
    public static final String KEY_LOCAL = "thinkup_local";
    protected String devBundleName;

    public static boolean getBooleanFromMap(Map<String, Object> map, String str) {
        return getBooleanFromMap(map, str, false);
    }

    public static double getDoubleFromMap(Map<String, Object> map, String str) {
        return getDoubleFromMap(map, str, 0.0d);
    }

    public static int getIntFromMap(Map<String, Object> map, String str) {
        return getIntFromMap(map, str, 0);
    }

    public static long getLongFromMap(Map<String, Object> map, String str) {
        return getLongFromMap(map, str, 0L);
    }

    public static String getStringFromMap(Map<String, Object> map, String str) {
        return getStringFromMap(map, str, "");
    }

    public final void checkToSaveInitData(String str, Map<String, Object> map, String... strArr) {
        o0n.m().o(str, map, strArr);
    }

    public List getActivityStatus() {
        return null;
    }

    public String getAdapterVersion() {
        return "";
    }

    public String getBundleName() {
        return o0n.m().n00();
    }

    public String getDevBundleName() {
        return this.devBundleName;
    }

    public List getMetaValutStatus() {
        return null;
    }

    public String getNetworkName() {
        return "";
    }

    public String getNetworkSDKClass() {
        return "";
    }

    public String getNetworkVersion() {
        return "";
    }

    public List getPermissionStatus() {
        return null;
    }

    public Map<String, Boolean> getPluginClassStatus() {
        return null;
    }

    public List getProviderStatus() {
        return null;
    }

    public List getResourceStatus() {
        return null;
    }

    public List getServiceStatus() {
        return null;
    }

    public String getUserId() {
        Map<String, Object> mapNo = o0n.m().no();
        return mapNo != null ? getStringFromMap(mapNo, "user_id") : "";
    }

    public abstract void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback);

    public boolean needCheckAdapterVersion() {
        return true;
    }

    public final void runOnMainThread(Runnable runnable) {
        o0n.m().m(runnable);
    }

    public final void runOnThreadPool(Runnable runnable) {
        o0n.m();
        o0n.n(runnable);
    }

    public final void sendNetworkEvent(final int i2, final int i3, final Map<String, Object> map) {
        runOnThreadPool(new Runnable() { // from class: com.thinkup.core.api.TUInitMediation.1
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i2;
                int i5 = i3;
                Map<String, Object> map2 = map;
                try {
                    if (i4 != 2) {
                        if (i4 == 15 || i4 == 46 || i4 == 92) {
                            if (i5 == 10002 || i5 == 10003) {
                                oo.o().o(i4, map2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i5 != 10001 || map2 == null) {
                        return;
                    }
                    long jM = o00.m(map2, "init_st");
                    long jM2 = o00.m(map2, "init_et");
                    long jM3 = o00.m(map2, "token_st");
                    long jM4 = o00.m(map2, "token_et");
                    com.thinkup.core.common.oo0.oo.o(o00.o(map2, "ad_format", x4.DISABLED_AUCTION_FALLBACK_ID), o00.o(map2, "admob_init_adsource_id", ""), o00.o(map2, "admob_token_adsource_id", ""), o00.o(map2, "admob_init_mode", 0), jM, jM2, jM3, jM4, (jM <= 0 || jM2 <= 0 || jM3 <= 0 || jM4 <= 0 || jM <= jM3) ? -1L : jM2 - jM3);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void setDevBundleName(String str) {
        this.devBundleName = str;
    }

    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return false;
    }

    public static boolean getBooleanFromMap(Map<String, Object> map, String str, boolean z2) {
        return ((Boolean) o00.o(map, str, Boolean.valueOf(z2))).booleanValue();
    }

    public static double getDoubleFromMap(Map<String, Object> map, String str, double d) {
        return ((Double) o00.o(map, str, Double.valueOf(d))).doubleValue();
    }

    public static int getIntFromMap(Map<String, Object> map, String str, int i2) {
        return ((Integer) o00.o(map, str, Integer.valueOf(i2))).intValue();
    }

    public static long getLongFromMap(Map<String, Object> map, String str, long j) {
        return ((Long) o00.o(map, str, Long.valueOf(j))).longValue();
    }

    public static String getStringFromMap(Map<String, Object> map, String str, String str2) {
        return (String) o00.o(map, str, str2);
    }
}
