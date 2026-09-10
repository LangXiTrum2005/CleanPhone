package com.appsflyer.internal;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import com.applovin.sdk.AppLovinEventTypes;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.ironsource.L6;
import com.ironsource.X3;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class AFg1rSDK implements AFg1nSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int e = 1;
    private static int unregisterClient;
    private final String AFAdRevenueData;
    private final patroclinal.taiyuan AFKeystoreWrapper;
    private final AFh1xSDK areAllFieldsValid;
    private final AFc1qSDK component1;
    private final AFg1vSDK component2;
    private final AFi1pSDK component3;
    private final AFc1oSDK component4;
    private final AFc1hSDK copy;
    private final AFg1zSDK copydefault;
    private final patroclinal.taiyuan equals;
    private final Context getCurrencyIso4217Code;
    private final AFi1kSDK getMediationNetwork;
    private final AFg1uSDK getMonetizationNetwork;
    private final AFj1lSDK getRevenue;
    private final AFf1eSDK hashCode;
    private final AFc1eSDK toString;
    private static char[] AFInAppEventParameterName = {35909, 35928, 35921, 35926, 35927, 35903, 35904, 35924, 35933, 35910, 35931, 35879, 35908, 35905, 35911};
    private static int registerClient = 1912311267;
    private static boolean AFLogger = true;
    private static boolean AFInAppEventType = true;

    public AFg1rSDK(String str, Context context, AFi1kSDK aFi1kSDK, AFg1uSDK aFg1uSDK, AFj1lSDK aFj1lSDK, AFg1vSDK aFg1vSDK, AFh1xSDK aFh1xSDK, AFc1qSDK aFc1qSDK, AFc1oSDK aFc1oSDK, AFi1pSDK aFi1pSDK, AFf1eSDK aFf1eSDK, AFc1hSDK aFc1hSDK, AFg1zSDK aFg1zSDK, AFc1eSDK aFc1eSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1kSDK, "");
        Intrinsics.checkNotNullParameter(aFg1uSDK, "");
        Intrinsics.checkNotNullParameter(aFj1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1vSDK, "");
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFi1pSDK, "");
        Intrinsics.checkNotNullParameter(aFf1eSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFg1zSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        this.AFAdRevenueData = str;
        this.getCurrencyIso4217Code = context;
        this.getMediationNetwork = aFi1kSDK;
        this.getMonetizationNetwork = aFg1uSDK;
        this.getRevenue = aFj1lSDK;
        this.component2 = aFg1vSDK;
        this.areAllFieldsValid = aFh1xSDK;
        this.component1 = aFc1qSDK;
        this.component4 = aFc1oSDK;
        this.component3 = aFi1pSDK;
        this.hashCode = aFf1eSDK;
        this.copy = aFc1hSDK;
        this.copydefault = aFg1zSDK;
        this.toString = aFc1eSDK;
        this.equals = p002kotlin.saneness.saneness(new Function0<AppsFlyerProperties>() { // from class: com.appsflyer.internal.AFg1rSDK.5
            @Override // p002kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AppsFlyerProperties invoke() {
                return AppsFlyerProperties.getInstance();
            }
        });
        this.AFKeystoreWrapper = p002kotlin.saneness.saneness(new Function0<SimpleDateFormat>() { // from class: com.appsflyer.internal.AFg1rSDK.4
            @Override // p002kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final SimpleDateFormat invoke() {
                return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            }
        });
    }

    private void AFInAppEventParameterName(Map<String, Object> map) {
        e = (unregisterClient + 113) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
        if (string != null) {
            unregisterClient = (e + 59) % 128;
            if (string.length() != 0) {
                map.put(AppsFlyerProperties.EXTENSION, string);
            }
        }
        int i = e + 19;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            int i2 = 35 / 0;
        }
    }

    private void AFInAppEventType(Map<String, Object> map) {
        unregisterClient = (e + 71) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.putAll(this.copydefault.AFAdRevenueData());
        e = (unregisterClient + 111) % 128;
    }

    private static void AFKeystoreWrapper(Map<String, Object> map) {
        getRevenue(new Object[]{map}, -1950585912, 1950585914, (int) System.currentTimeMillis());
    }

    private static void AFLogger(Map<String, Object> map) {
        getRevenue(new Object[]{map}, -1520031212, 1520031215, (int) System.currentTimeMillis());
    }

    private static void a(String str, int[] iArr, String str2, int i, Object[] objArr) throws UnsupportedEncodingException {
        char[] cArr;
        Object obj = str2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            $11 = ($10 + 103) % 128;
            obj = charArray;
        }
        char[] cArr2 = (char[]) obj;
        Object obj2 = str;
        if (str != null) {
            $11 = ($10 + 67) % 128;
            byte[] bytes = str.getBytes("ISO-8859-1");
            $10 = ($11 + 25) % 128;
            obj2 = bytes;
        }
        byte[] bArr = (byte[]) obj2;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr3 = AFInAppEventParameterName;
        if (cArr3 != null) {
            $10 = ($11 + 111) % 128;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i2 = 0;
            while (i2 < length) {
                int i3 = $10 + 117;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    cArr4[i2] = (char) (((long) cArr3[i2]) - 1825820251896122634L);
                } else {
                    cArr4[i2] = (char) (((long) cArr3[i2]) ^ 1825820251896122634L);
                    i2++;
                }
            }
            cArr3 = cArr4;
        }
        int i4 = (int) (1825820251896122634L ^ ((long) registerClient));
        if (AFInAppEventType) {
            int i5 = $11 + 25;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int length2 = bArr.length;
                aFk1oSDK.getMonetizationNetwork = length2;
                cArr = new char[length2];
                aFk1oSDK.AFAdRevenueData = 1;
            } else {
                int length3 = bArr.length;
                aFk1oSDK.getMonetizationNetwork = length3;
                cArr = new char[length3];
                aFk1oSDK.AFAdRevenueData = 0;
            }
            while (true) {
                int i6 = aFk1oSDK.AFAdRevenueData;
                int i7 = aFk1oSDK.getMonetizationNetwork;
                if (i6 >= i7) {
                    objArr[0] = new String(cArr);
                    return;
                } else {
                    cArr[i6] = (char) (cArr3[bArr[(i7 - 1) - i6] + i] - i4);
                    aFk1oSDK.AFAdRevenueData = i6 + 1;
                    $11 = ($10 + 17) % 128;
                }
            }
        } else if (AFLogger) {
            int i8 = $11 + 23;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length4 = cArr2.length;
            aFk1oSDK.getMonetizationNetwork = length4;
            char[] cArr5 = new char[length4];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i10 = aFk1oSDK.AFAdRevenueData;
                int i11 = aFk1oSDK.getMonetizationNetwork;
                if (i10 >= i11) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i10] = (char) (cArr3[cArr2[(i11 - 1) - i10] - i] - i4);
                    aFk1oSDK.AFAdRevenueData = i10 + 1;
                }
            }
        } else {
            int length5 = iArr.length;
            aFk1oSDK.getMonetizationNetwork = length5;
            char[] cArr6 = new char[length5];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i12 = aFk1oSDK.AFAdRevenueData;
                int i13 = aFk1oSDK.getMonetizationNetwork;
                if (i12 >= i13) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i12] = (char) (cArr3[iArr[(i13 - 1) - i12] - i] - i4);
                    aFk1oSDK.AFAdRevenueData = i12 + 1;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0041  */
    private String areAllFieldsValid() {
        String string;
        int i = unregisterClient + 109;
        e = i % 128;
        if (i % 2 == 0) {
            string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
            int i2 = 81 / 0;
            if (string == null) {
                string = getMonetizationNetwork("AF_STORE");
                e = (unregisterClient + 31) % 128;
            }
        } else {
            string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
            if (string == null) {
                string = getMonetizationNetwork("AF_STORE");
                e = (unregisterClient + 31) % 128;
            }
        }
        unregisterClient = (e + 111) % 128;
        return string;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        int i = unregisterClient + 83;
        e = i % 128;
        int i2 = i % 2;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) aFg1rSDK.equals.getValue();
        if (i2 != 0) {
            return appsFlyerProperties;
        }
        throw null;
    }

    private static String component2() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double dPow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / dPow)) + "/" + ((long) (blockCountLong / dPow));
        int i = e + 113;
        unregisterClient = i % 128;
        if (i % 2 == 0) {
            return str;
        }
        throw null;
    }

    private void component3(Map<String, Object> map) {
        int i = e + 99;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            map.put("onelink_id", string);
        }
        if (string2 != null) {
            int i2 = e + 75;
            unregisterClient = i2 % 128;
            if (i2 % 2 == 0) {
                map.put("onelink_ver", string2);
            } else {
                map.put("onelink_ver", string2);
                int i3 = 0 / 0;
            }
        }
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        try {
            long jLongValue = ((Long) getRevenue(new Object[]{aFg1rSDK}, 1297709710, -1297709700, System.identityHashCode(aFg1rSDK))).longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(jLongValue)));
            int i = unregisterClient + 109;
            e = i % 128;
            if (i % 2 != 0) {
                return null;
            }
            throw null;
        } catch (Exception e2) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e2);
            return null;
        }
    }

    private final void copy(Map<String, Object> map) {
        e = (unregisterClient + 59) % 128;
        UiModeManager uiModeManager = (UiModeManager) this.getCurrencyIso4217Code.getSystemService(UiModeManager.class);
        if (uiModeManager != null) {
            int i = unregisterClient + 27;
            e = i % 128;
            if (i % 2 == 0) {
                if (uiModeManager.getCurrentModeType() != 2) {
                    return;
                }
            } else if (uiModeManager.getCurrentModeType() != 4) {
                return;
            }
            int i2 = unregisterClient + 65;
            e = i2 % 128;
            if (i2 % 2 != 0) {
                map.put("tv", Boolean.TRUE);
            } else {
                map.put("tv", Boolean.TRUE);
                throw null;
            }
        }
    }

    private static List<AFe1pSDK> copydefault() {
        unregisterClient = (e + 47) % 128;
        List<AFe1pSDK> listKowloon = p002kotlin.collections.adultoid.kowloon(AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH, AFe1pSDK.INAPP, AFe1pSDK.MANUAL_PURCHASE_VALIDATION, AFe1pSDK.ARS_VALIDATE, AFe1pSDK.PURCHASE_VALIDATE, AFe1pSDK.ADREVENUE);
        int i = e + 109;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            int i2 = 56 / 0;
        }
        return listKowloon;
    }

    private void d(Map<String, Object> map) {
        String strAFAdRevenueData;
        int i = unregisterClient + 119;
        e = i % 128;
        if (i % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            if (!((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, false)) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            if (!((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
                return;
            }
        }
        try {
            this.getCurrencyIso4217Code.getPackageManager().getApplicationInfo(FbValidationUtils.FB_PACKAGE, 0);
            strAFAdRevenueData = this.component4.AFAdRevenueData(this.getCurrencyIso4217Code);
            unregisterClient = (e + 23) % 128;
        } catch (Throwable unused) {
            strAFAdRevenueData = null;
        }
        if (strAFAdRevenueData != null) {
            unregisterClient = (e + 123) % 128;
            map.put("fb", strAFAdRevenueData);
        }
    }

    private void e(Map<String, Object> map) {
        unregisterClient = (e + 5) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        boolean monetizationNetwork = AFg1sSDK.getMonetizationNetwork(this.getCurrencyIso4217Code);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=" + monetizationNetwork);
        if (!monetizationNetwork) {
            map.put("tokenRefreshConfigured", Boolean.FALSE);
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1sSDK.AFAdRevenueData(this.component1)));
        unregisterClient = (e + 45) % 128;
    }

    private void equals(Map<String, Object> map) {
        int i = e + 107;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            int i2 = 75 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        }
        e = (unregisterClient + 89) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029 A[PHI: r0
  0x0029: PHI (r0v5 long) = (r0v4 long), (r0v8 long) binds: [B:8:0x0027, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    private void hashCode(Map<String, Object> map) {
        long j;
        int i = e + 71;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            j = this.areAllFieldsValid.copydefault;
            if (j != 1) {
                e = (unregisterClient + 49) % 128;
                map.put("prev_session_dur", Long.valueOf(j));
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            j = this.areAllFieldsValid.copydefault;
            if (j != 0) {
                e = (unregisterClient + 49) % 128;
                map.put("prev_session_dur", Long.valueOf(j));
            }
        }
        e = (unregisterClient + 101) % 128;
    }

    private void i(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (this.component1.getMonetizationNetwork("is_stop_tracking_used")) {
            map.put("istu", String.valueOf(this.component1.getMediationNetwork("is_stop_tracking_used", false)));
            e = (unregisterClient + 33) % 128;
        }
        unregisterClient = (e + 3) % 128;
    }

    private void registerClient(Map<String, Object> map) {
        int i = e + 91;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("af_preinstalled", String.valueOf(this.component4.getMonetizationNetwork(this.getCurrencyIso4217Code)));
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(this.component4.getMonetizationNetwork(this.getCurrencyIso4217Code)));
        unregisterClient = (e + 37) % 128;
    }

    private final void toString(Map<String, Object> map) {
        int i = unregisterClient + 89;
        e = i % 128;
        if (i % 2 == 0) {
            int i2 = 38 / 0;
            if (!AFg1iSDK.getMonetizationNetwork(this.getCurrencyIso4217Code)) {
                return;
            }
        } else if (!AFg1iSDK.getMonetizationNetwork(this.getCurrencyIso4217Code)) {
            return;
        }
        int i3 = unregisterClient + 25;
        e = i3 % 128;
        if (i3 % 2 == 0) {
            map.put("inst_app", Boolean.TRUE);
            throw null;
        }
        map.put("inst_app", Boolean.TRUE);
        e = (unregisterClient + 91) % 128;
    }

    private void unregisterClient(Map<String, Object> map) {
        int i = unregisterClient + 105;
        e = i % 128;
        if (i % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFb1lSDK.l_(this.getCurrencyIso4217Code.getContentResolver());
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        AFb1jSDK aFb1jSDKL_ = AFb1lSDK.l_(this.getCurrencyIso4217Code.getContentResolver());
        if (aFb1jSDKL_ == null) {
            unregisterClient = (e + 121) % 128;
            return;
        }
        int i2 = unregisterClient + 49;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            map.put("amazon_aid", aFb1jSDKL_.getRevenue);
            map.put("amazon_aid_limit", String.valueOf(aFb1jSDKL_.getCurrencyIso4217Code));
        } else {
            map.put("amazon_aid", aFb1jSDKL_.getRevenue);
            map.put("amazon_aid_limit", String.valueOf(aFb1jSDKL_.getCurrencyIso4217Code));
            int i3 = 37 / 0;
        }
    }

    private void w(Map<String, Object> map) {
        int i = unregisterClient + 113;
        e = i % 128;
        if (i % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.hashCode.getMediationNetwork();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String mediationNetwork = this.hashCode.getMediationNetwork();
        if (mediationNetwork == null || mediationNetwork.length() == 0) {
            return;
        }
        e = (unregisterClient + 109) % 128;
        map.put("appsflyerKey", mediationNetwork);
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void AFAdRevenueData(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(this.component4.getMediationNetwork);
        if (currencyIso4217Code != null) {
            map.put("uid", currencyIso4217Code);
            boolean mediationNetwork = this.component4.getMediationNetwork.getMediationNetwork("CUSTOM_INSTALL_ID_APPLIED", false);
            Intrinsics.checkNotNullExpressionValue(Boolean.valueOf(mediationNetwork), "");
            if (mediationNetwork) {
                e = (unregisterClient + 97) % 128;
                map.put("custom_install_id", Boolean.TRUE);
            }
            int i = unregisterClient + 87;
            e = i % 128;
            if (i % 2 == 0) {
                int i2 = 63 / 0;
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map, int i, int i2) {
        boolean z;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i));
        map.put("iaecounter", String.valueOf(i2));
        if (component3()) {
            unregisterClient = (e + 67) % 128;
            z = false;
        } else {
            unregisterClient = (e + 109) % 128;
            z = true;
        }
        map.put("isFirstCall", String.valueOf(z));
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMediationNetwork(AFh1mSDK aFh1mSDK) {
        AFd1aSDK aFd1aSDK;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        if (this.component4.component2()) {
            AdvertisingIdData advertisingIdData = this.component4.getMonetizationNetwork.component3;
            if (advertisingIdData == null) {
                return;
            }
            String str = advertisingIdData.gaidError;
            if (str != null && str.length() != 0) {
                unregisterClient = (e + 121) % 128;
                aFh1mSDK.getMonetizationNetwork("gaidError", advertisingIdData.gaidError);
            }
            String str2 = advertisingIdData.advertisingId;
            if (str2 != null && advertisingIdData.isEnabled != null) {
                aFh1mSDK.getMonetizationNetwork("advertiserId", str2);
                aFh1mSDK.getMonetizationNetwork("advertiserIdEnabled", String.valueOf(advertisingIdData.isEnabled));
                aFh1mSDK.getMonetizationNetwork("isGaidWithGps", String.valueOf(advertisingIdData.isGaidWithGps));
            }
        } else {
            Map<String, Object> mediationNetwork = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
            mediationNetwork.put("ad_ids_disabled", Boolean.TRUE);
        }
        AdvertisingIdData advertisingIdData2 = this.component4.getMonetizationNetwork.component3;
        aFh1mSDK.getMonetizationNetwork("GAID_retry", String.valueOf(advertisingIdData2 != null ? Intrinsics.wireman(advertisingIdData2.retry, Boolean.TRUE) : false));
        if (!p002kotlin.collections.adultoid.kowloon(AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH).contains(aFh1mSDK.AFAdRevenueData()) || (aFd1aSDK = this.toString.component4) == null) {
            return;
        }
        int i = unregisterClient + 57;
        e = i % 128;
        if (i % 2 != 0) {
            Map<String, Object> mediationNetwork2 = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
            Intrinsics.checkNotNullExpressionValue(mediationNetwork2, "");
            mediationNetwork2.put("fetchAdIdLatency", Long.valueOf(aFd1aSDK.getMediationNetwork));
        } else {
            Map<String, Object> mediationNetwork3 = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
            Intrinsics.checkNotNullExpressionValue(mediationNetwork3, "");
            mediationNetwork3.put("fetchAdIdLatency", Long.valueOf(aFd1aSDK.getMediationNetwork));
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        map.put("open_referrer", aFh1mSDK.getMonetizationNetwork);
        String str = aFh1mSDK.copydefault;
        if (str != null) {
            int i = unregisterClient + 37;
            e = i % 128;
            if (i % 2 == 0) {
                StringsKt.empress(str);
                throw null;
            }
            if (StringsKt.empress(str)) {
                unregisterClient = (e + 23) % 128;
            } else {
                int i2 = unregisterClient + 111;
                e = i2 % 128;
                if (i2 % 2 == 0) {
                    map.put("af_web_referrer", aFh1mSDK.copydefault);
                    int i3 = 19 / 0;
                } else {
                    map.put("af_web_referrer", aFh1mSDK.copydefault);
                }
            }
        } else {
            unregisterClient = (e + 23) % 128;
        }
        int i4 = unregisterClient + 61;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getRevenue(Map<String, Object> map) {
        AFi1rSDK monetizationNetwork;
        Intrinsics.checkNotNullParameter(map, "");
        AFi1qSDK aFi1qSDK = this.component3.getMonetizationNetwork;
        if (aFi1qSDK != null) {
            unregisterClient = (e + 107) % 128;
            monetizationNetwork = aFi1qSDK.getMonetizationNetwork();
        } else {
            monetizationNetwork = null;
        }
        if (monetizationNetwork != null) {
            map.put("network", monetizationNetwork.getCurrencyIso4217Code);
            map.put("ivc", Boolean.valueOf(monetizationNetwork.getMediationNetwork()));
            if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                return;
            }
            int i = (e + 65) % 128;
            unregisterClient = i;
            int i2 = i + 99;
            e = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = monetizationNetwork.getMonetizationNetwork;
            if (str != null) {
                map.put("operator", str);
            }
            String str2 = monetizationNetwork.getRevenue;
            if (str2 != null) {
                map.put(L6.Q0, str2);
            }
        }
    }

    private static long component1() {
        int i = e + 101;
        unregisterClient = i % 128;
        long jCurrentTimeMillis = i % 2 != 0 ? System.currentTimeMillis() & SystemClock.elapsedRealtime() : System.currentTimeMillis() - SystemClock.elapsedRealtime();
        int i2 = e + 31;
        unregisterClient = i2 % 128;
        if (i2 % 2 == 0) {
            return jCurrentTimeMillis;
        }
        throw null;
    }

    private void component1(Map<String, ? extends Object> map) {
        getRevenue(new Object[]{this, map}, -841219204, 841219208, System.identityHashCode(this));
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        String monetizationNetwork;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = unregisterClient + 123;
        e = i % 128;
        if (i % 2 != 0) {
            String string = ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).getString("preInstallName");
            if (string != null) {
                return string;
            }
            if (aFg1rSDK.component1.getMonetizationNetwork("preInstallName")) {
                int i2 = e + 71;
                unregisterClient = i2 % 128;
                if (i2 % 2 != 0) {
                    monetizationNetwork = aFg1rSDK.component1.getMonetizationNetwork("preInstallName", (String) null);
                    int i3 = 30 / 0;
                } else {
                    monetizationNetwork = aFg1rSDK.component1.getMonetizationNetwork("preInstallName", (String) null);
                }
            } else {
                if (iIntValue <= 1) {
                    unregisterClient = (e + 99) % 128;
                    String strEquals = aFg1rSDK.equals();
                    if (strEquals == null) {
                        int i4 = e + 79;
                        unregisterClient = i4 % 128;
                        if (i4 % 2 == 0) {
                            strEquals = aFg1rSDK.getMonetizationNetwork("AF_PRE_INSTALL_NAME");
                        } else {
                            aFg1rSDK.getMonetizationNetwork("AF_PRE_INSTALL_NAME");
                            throw null;
                        }
                    }
                    string = strEquals;
                }
                if (string != null) {
                    aFg1rSDK.component1.getRevenue("preInstallName", string);
                }
                monetizationNetwork = string;
            }
            if (monetizationNetwork != null) {
                unregisterClient = (e + 89) % 128;
                ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).set("preInstallName", monetizationNetwork);
            }
            return monetizationNetwork;
        }
        ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).getString("preInstallName");
        throw null;
    }

    private final void component2(Map<String, Object> map) {
        int i = e + 107;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).isOtherSdkStringDisabled();
            throw null;
        }
        if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).isOtherSdkStringDisabled()) {
            return;
        }
        map.put(X3.j.Y, String.valueOf(this.getMonetizationNetwork.getCurrencyIso4217Code(this.getCurrencyIso4217Code).getMonetizationNetwork));
        e = (unregisterClient + 95) % 128;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) throws UnsupportedEncodingException {
        e = (unregisterClient + 103) % 128;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        AFAdRevenueData(map, aFh1mSDK.getRevenue());
        areAllFieldsValid(map);
        getRevenue(new Object[]{map}, -1950585912, 1950585914, (int) System.currentTimeMillis());
        getRevenue(map);
        getRevenue(new Object[]{this, map, this.toString.getCurrencyIso4217Code}, 274047423, -274047418, System.identityHashCode(this));
        unregisterClient(map);
        map.put("cell", p002kotlin.collections.seminary.impassible(patroclinal.formularize.attabal("mcc", Integer.valueOf(this.getCurrencyIso4217Code.getResources().getConfiguration().mcc)), patroclinal.formularize.attabal("mnc", Integer.valueOf(this.getCurrencyIso4217Code.getResources().getConfiguration().mnc))));
        map.put("sig", AFAdRevenueData());
        map.put("last_boot_time", Long.valueOf(component1()));
        map.put("disk", component2());
        unregisterClient = (e + 73) % 128;
    }

    private final boolean copy() {
        int i = unregisterClient + 15;
        e = i % 128;
        if (i % 2 != 0 ? !((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) : !((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, true)) {
            if (!((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                int i2 = (unregisterClient + 33) % 128;
                e = i2;
                int i3 = i2 + 81;
                unregisterClient = i3 % 128;
                if (i3 % 2 == 0) {
                    AFa1ySDK.getRevenue();
                    if (AFa1ySDK.getRevenue(this.getCurrencyIso4217Code)) {
                        return false;
                    }
                } else {
                    AFa1ySDK.getRevenue();
                    AFa1ySDK.getRevenue(this.getCurrencyIso4217Code);
                    throw null;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String component4() {
        String str;
        int i = e + 119;
        unregisterClient = i % 128;
        int i2 = i % 2;
        try {
            if (i2 == 0) {
                String monetizationNetwork = this.component1.getMonetizationNetwork("androidIdCached", (String) null);
                String string = Settings.Secure.getString(this.getCurrencyIso4217Code.getContentResolver(), "android_id");
                str = monetizationNetwork;
                if (string != null) {
                    unregisterClient = (e + 29) % 128;
                    return string;
                }
                if (str == 0) {
                    return null;
                }
                AFLogger.afDebugLog("use cached AndroidId: " + str);
                return str;
            }
            this.component1.getMonetizationNetwork("androidIdCached", (String) null);
            Settings.Secure.getString(this.getCurrencyIso4217Code.getContentResolver(), "android_id");
            throw null;
        } catch (Exception e2) {
            AFLogger.afErrorLog(e2.getMessage(), e2);
            str = i2;
        }
    }

    private void AFAdRevenueData(Map<String, Object> map, boolean z) {
        Intrinsics.checkNotNullParameter(map, "");
        HashMap map2 = new HashMap();
        map2.put("cpu_abi", getCurrencyIso4217Code("ro.product.cpu.abi"));
        map2.put("cpu_abi2", getCurrencyIso4217Code("ro.product.cpu.abi2"));
        map2.put("arch", getCurrencyIso4217Code("os.arch"));
        map2.put("build_display_id", getCurrencyIso4217Code("ro.build.display.id"));
        if (z) {
            getRevenue(new Object[]{this, map2}, -753773633, 753773645, System.identityHashCode(this));
            if (this.component4.getMediationNetwork.getRevenue("appsFlyerCount", 0) <= 2) {
                int i = unregisterClient + 43;
                e = i % 128;
                if (i % 2 != 0) {
                    map2.putAll(this.getRevenue.getMediationNetwork());
                } else {
                    map2.putAll(this.getRevenue.getMediationNetwork());
                    throw null;
                }
            }
        }
        map2.put("dim", this.component2.getMediationNetwork(this.getCurrencyIso4217Code));
        map.put("deviceData", map2);
        unregisterClient = (e + 119) % 128;
    }

    private void copydefault(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -1147564241, 1147564241, System.identityHashCode(this));
    }

    private final String equals() {
        int i = unregisterClient + 111;
        e = i % 128;
        if (i % 2 != 0) {
            File mediationNetwork = getMediationNetwork(getCurrencyIso4217Code("ro.appsflyer.preinstall.path"));
            if (getCurrencyIso4217Code(mediationNetwork)) {
                mediationNetwork = getMediationNetwork(getMonetizationNetwork("AF_PRE_INSTALL_PATH"));
                unregisterClient = (e + 125) % 128;
            }
            if (getCurrencyIso4217Code(mediationNetwork)) {
                mediationNetwork = getMediationNetwork("/data/local/tmp/pre_install.appsflyer");
            }
            if (getCurrencyIso4217Code(mediationNetwork)) {
                mediationNetwork = getMediationNetwork("/etc/pre_install.appsflyer");
            }
            if (getCurrencyIso4217Code(mediationNetwork)) {
                return null;
            }
            String packageName = this.getCurrencyIso4217Code.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            return getMediationNetwork(mediationNetwork, packageName);
        }
        getCurrencyIso4217Code(getMediationNetwork(getCurrencyIso4217Code("ro.appsflyer.preinstall.path")));
        throw null;
    }

    private boolean component3() {
        unregisterClient = (e + 73) % 128;
        boolean z = Boolean.parseBoolean(this.component1.getMonetizationNetwork("sentSuccessfully", (String) null));
        int i = e + 13;
        unregisterClient = i % 128;
        if (i % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMonetizationNetwork(Map<String, Object> map) {
        Object obj;
        unregisterClient = (e + 13) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Object string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString("appid");
        if (string != null) {
            int i = unregisterClient + 109;
            e = i % 128;
            if (i % 2 == 0) {
                map.put("appid", string);
                int i2 = 21 / 0;
            } else {
                map.put("appid", string);
            }
        }
        String string2 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            int i3 = e + 93;
            unregisterClient = i3 % 128;
            if (i3 % 2 == 0 ? string2.length() != 3 : string2.length() != 2) {
                StringBuilder sb = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb.append(string2);
                sb.append("' is not a legal value.");
                String string3 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "");
                AFLogger.afWarnLog(string3);
            }
            map.put("currency", string2);
        }
        Object string4 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.IS_UPDATE);
        if (string4 != null) {
            e = (unregisterClient + 113) % 128;
            map.put("isUpdate", string4);
            e = (unregisterClient + 27) % 128;
        }
        Object string5 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string5 != null) {
            map.put("customData", string5);
        }
        Object string6 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_USER_ID);
        if (string6 != null) {
            int i4 = unregisterClient + 85;
            e = i4 % 128;
            if (i4 % 2 == 0) {
                map.put("appUserId", string6);
                int i5 = 2 / 0;
            } else {
                map.put("appUserId", string6);
            }
        }
        Object string7 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.USER_EMAILS);
        if (string7 != null) {
            int i6 = unregisterClient + 31;
            e = i6 % 128;
            if (i6 % 2 != 0) {
                map.put("user_emails", string7);
            } else {
                map.put("user_emails", string7);
                throw null;
            }
        }
        AFb1tSDK aFb1tSDK = this.toString.getRevenue;
        if (aFb1tSDK == null || (obj = aFb1tSDK.AFAdRevenueData) == null) {
            return;
        }
        map.put("sharing_filter", obj);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x015b  */
    public static /* synthetic */ Object getRevenue(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = (i * 522) + (i2 * (-520)) + (((~(i4 | i2)) | i) * (-1042)) + ((i2 | i3) * 521);
        int i6 = ~i;
        switch (i5 + (((~(i | i4 | i2)) | (~(i3 | i6)) | (~((~i2) | i6))) * 521)) {
            case 1:
                return getMediationNetwork(objArr);
            case 2:
                return getMonetizationNetwork(objArr);
            case 3:
                return getRevenue(objArr);
            case 4:
                AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
                Map map = (Map) objArr[1];
                Intrinsics.checkNotNullParameter(map, "");
                AFh1xSDK aFh1xSDK = aFg1rSDK.areAllFieldsValid;
                HashMap map2 = new HashMap(aFh1xSDK.getRevenue);
                aFh1xSDK.getRevenue.clear();
                aFh1xSDK.getMonetizationNetwork.AFAdRevenueData("gcd");
                Intrinsics.checkNotNullExpressionValue(map2, "");
                if (!map2.isEmpty()) {
                    e = (unregisterClient + 61) % 128;
                    Map<String, Object> mediationNetwork = AFa1ySDK.getMediationNetwork((Map<String, Object>) map);
                    Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
                    mediationNetwork.put("gcd", map2);
                }
                return null;
            case 5:
                AFg1rSDK aFg1rSDK2 = (AFg1rSDK) objArr[0];
                Map map3 = (Map) objArr[1];
                String str = (String) objArr[2];
                Intrinsics.checkNotNullParameter(map3, "");
                if (((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK2}, -854454525, 854454532, System.identityHashCode(aFg1rSDK2))).getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
                    map3.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, a.g);
                    return null;
                }
                String monetizationNetwork = aFg1rSDK2.hashCode.getMonetizationNetwork(aFg1rSDK2.component1);
                if (monetizationNetwork != null) {
                    e = (unregisterClient + 103) % 128;
                    if (monetizationNetwork.length() != 0) {
                        map3.put("imei", monetizationNetwork);
                    } else {
                        e = (unregisterClient + 95) % 128;
                    }
                } else {
                    e = (unregisterClient + 95) % 128;
                }
                String strAFAdRevenueData = aFg1rSDK2.AFAdRevenueData(str);
                if (strAFAdRevenueData != null) {
                    aFg1rSDK2.component1.getRevenue("androidIdCached", strAFAdRevenueData);
                    map3.put("android_id", strAFAdRevenueData);
                } else {
                    AFLogger.afInfoLog("Android ID was not collected.");
                }
                AFb1jSDK mediationNetwork2 = AFb1lSDK.getMediationNetwork(aFg1rSDK2.getCurrencyIso4217Code);
                if (mediationNetwork2 != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Boolean bool = mediationNetwork2.getMonetizationNetwork;
                    Intrinsics.checkNotNullExpressionValue(bool, "");
                    linkedHashMap.put("isManual", bool);
                    String str2 = mediationNetwork2.getRevenue;
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    linkedHashMap.put("val", str2);
                    Boolean bool2 = mediationNetwork2.getCurrencyIso4217Code;
                    if (bool2 != null) {
                        unregisterClient = (e + 93) % 128;
                        linkedHashMap.put("isLat", bool2);
                        unregisterClient = (e + 79) % 128;
                    }
                    map3.put("oaid", linkedHashMap);
                }
                return null;
            case 6:
                return AFAdRevenueData(objArr);
            case 7:
                return component1(objArr);
            case 8:
                return component4(objArr);
            case 9:
                return areAllFieldsValid(objArr);
            case 10:
                AFg1rSDK aFg1rSDK3 = (AFg1rSDK) objArr[0];
                e = (unregisterClient + 41) % 128;
                Long lValueOf = Long.valueOf(aFg1rSDK3.component4.n_().firstInstallTime);
                e = (unregisterClient + 73) % 128;
                return lValueOf;
            case 11:
                AFg1rSDK aFg1rSDK4 = (AFg1rSDK) objArr[0];
                AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
                e = (unregisterClient + 109) % 128;
                Intrinsics.checkNotNullParameter(aFh1mSDK, "");
                Map<String, Object> map4 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map4, "");
                getRevenue(new Object[]{aFg1rSDK4, map4}, -539509618, 539509626, System.identityHashCode(aFg1rSDK4));
                Map<String, Object> map5 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map5, "");
                aFg1rSDK4.getMediationNetwork(map5, aFh1mSDK.component4);
                Map<String, Object> map6 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map6, "");
                int i7 = aFh1mSDK.component4;
                getRevenue(new Object[]{aFg1rSDK4, map6, Integer.valueOf(i7)}, 1731268052, -1731268046, i7);
                Map<String, Object> map7 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map7, "");
                aFg1rSDK4.registerClient(map7);
                Map<String, Object> map8 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map8, "");
                aFg1rSDK4.d(map8);
                Map<String, Object> map9 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map9, "");
                AFe1pSDK aFe1pSDKAFAdRevenueData = aFh1mSDK.AFAdRevenueData();
                Intrinsics.checkNotNullExpressionValue(aFe1pSDKAFAdRevenueData, "");
                aFg1rSDK4.getMediationNetwork(map9, aFe1pSDKAFAdRevenueData);
                e = (unregisterClient + 67) % 128;
                return null;
            case 12:
                AFg1rSDK aFg1rSDK5 = (AFg1rSDK) objArr[0];
                Map map10 = (Map) objArr[1];
                unregisterClient = (e + 49) % 128;
                AFg1uSDK.AFa1zSDK currencyIso4217Code = aFg1rSDK5.getMonetizationNetwork.getCurrencyIso4217Code(aFg1rSDK5.getCurrencyIso4217Code);
                float f = currencyIso4217Code.getMonetizationNetwork;
                String str3 = currencyIso4217Code.AFAdRevenueData;
                map10.put("btl", String.valueOf(f));
                if (str3 != null) {
                    map10.put("btch", str3);
                    unregisterClient = (e + 73) % 128;
                }
                return null;
            default:
                return getCurrencyIso4217Code(objArr);
        }
    }

    private static void areAllFieldsValid(Map<String, Object> map) throws UnsupportedEncodingException {
        e = (unregisterClient + 91) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a("\u008f\u0089\u0087\u0083\u008e", null, null, (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 127, objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put(X3.i.G, Build.DEVICE);
        map.put(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put(L6.B, Build.MODEL);
        map.put("deviceType", Build.TYPE);
        e = (unregisterClient + 19) % 128;
    }

    private final void component4(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -753773633, 753773645, System.identityHashCode(this));
    }

    private String AFAdRevenueData() throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
        int i = unregisterClient + 69;
        e = i % 128;
        if (i % 2 == 0) {
            AFj1kSDK.N_(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager(), this.getCurrencyIso4217Code.getApplicationContext().getPackageName());
            throw null;
        }
        String strN_ = AFj1kSDK.N_(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager(), this.getCurrencyIso4217Code.getApplicationContext().getPackageName());
        unregisterClient = (e + 55) % 128;
        return strN_;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final long getCurrencyIso4217Code() {
        e = (unregisterClient + 57) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = e + 121;
        unregisterClient = i % 128;
        if (i % 2 == 0) {
            return jCurrentTimeMillis;
        }
        throw null;
    }

    private final String AFAdRevenueData(String str) {
        int i = e + 43;
        unregisterClient = i % 128;
        if (i % 2 == 0 ? ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false) : ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, true)) {
            if (str == null || str.length() == 0) {
                e = (unregisterClient + 13) % 128;
                if (!copy()) {
                    return null;
                }
                int i2 = e + 105;
                unregisterClient = i2 % 128;
                if (i2 % 2 == 0) {
                    return component4();
                }
                component4();
                throw null;
            }
        }
        if (str != null) {
            return str;
        }
        return null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        e = (unregisterClient + 69) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        long monetizationNetwork = aFg1rSDK.component1.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        aFg1rSDK.component1.AFAdRevenueData("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
        map.put("timepassedsincelastlaunch", String.valueOf(monetizationNetwork > 0 ? TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - monetizationNetwork) : -1L));
        int i = e + 107;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            int i2 = 45 / 0;
        }
        return null;
    }

    private void AFAdRevenueData(AFh1mSDK aFh1mSDK, String str, String str2, AFb1rSDK aFb1rSDK) {
        e = (unregisterClient + 61) % 128;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        if (aFh1mSDK.AFAdRevenueData() == AFe1pSDK.CONVERSION) {
            Intrinsics.checkNotNullExpressionValue(map, "");
            component2(map);
            copy(map);
            toString(map);
            AFa1vSDK.getMonetizationNetwork(this.copy, this.component4);
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        getRevenue(new Object[]{this, map}, -1147564241, 1147564241, System.identityHashCode(this));
        component3(map);
        getRevenue(new Object[]{this, map}, -841219204, 841219208, System.identityHashCode(this));
        getMonetizationNetwork(map, str2);
        AFAdRevenueData(map, str);
        hashCode(map);
        if (aFb1rSDK != null) {
            e = (unregisterClient + 31) % 128;
            aFb1rSDK.getCurrencyIso4217Code(map);
            return;
        }
        int i = e + 35;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            int i2 = 41 / 0;
        }
    }

    private static String getCurrencyIso4217Code(String str) {
        unregisterClient = (e + 75) % 128;
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.competently(objInvoke, "");
            String str2 = (String) objInvoke;
            e = (unregisterClient + 123) % 128;
            return str2;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003f A[Catch: all -> 0x0020, TRY_ENTER, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x000f, B:13:0x003f, B:14:0x0050, B:15:0x005d, B:9:0x0023), top: B:19:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0050 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x000f, B:13:0x003f, B:14:0x0050, B:15:0x005d, B:9:0x0023), top: B:19:0x000d }] */
    private final void getMediationNetwork(Map<String, Object> map, int i) {
        int i2;
        int i3 = e + 1;
        unregisterClient = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                if (this.component4.n_().versionCode > this.component1.getRevenue("versionCode", 0)) {
                    i2 = e + 103;
                    unregisterClient = i2 % 128;
                    if (i2 % 2 != 0) {
                        this.component1.getMediationNetwork("versionCode", this.component4.n_().versionCode);
                        int i4 = 78 / 0;
                    } else {
                        this.component1.getMediationNetwork("versionCode", this.component4.n_().versionCode);
                    }
                }
            } else {
                if (this.component4.n_().versionCode > this.component1.getRevenue("versionCode", 0)) {
                    i2 = e + 103;
                    unregisterClient = i2 % 128;
                    if (i2 % 2 != 0) {
                        this.component1.getMediationNetwork("versionCode", this.component4.n_().versionCode);
                        int i5 = 78 / 0;
                    } else {
                        this.component1.getMediationNetwork("versionCode", this.component4.n_().versionCode);
                    }
                }
            }
            map.put("app_version_code", String.valueOf(this.component4.n_().versionCode));
            map.put("app_version_name", this.component4.n_().versionName);
            map.put("targetSDKver", Integer.valueOf(this.component4.getCurrencyIso4217Code.getMonetizationNetwork.getApplicationInfo().targetSdkVersion));
            map.put("date1", getRevenue().format(new Date(((Long) getRevenue(new Object[]{this}, 1297709710, -1297709700, System.identityHashCode(this))).longValue())));
            map.put("date2", getRevenue().format(new Date(this.component4.n_().lastUpdateTime)));
            Object[] objArr = new Object[1];
            a("\u008d\u0085\u0087\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, null, 127 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            SimpleDateFormat revenue = getRevenue();
            Intrinsics.checkNotNullExpressionValue(revenue, "");
            map.put(strIntern, getMediationNetwork(revenue, i));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
        }
    }

    private static boolean getCurrencyIso4217Code(File file) {
        int i = e;
        unregisterClient = (i + 33) % 128;
        if (file == null) {
            return true;
        }
        unregisterClient = (i + 79) % 128;
        if (!file.exists()) {
            return true;
        }
        int i2 = unregisterClient + 59;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, 528204691, -528204690, System.identityHashCode(this));
    }

    private void AFAdRevenueData(Map<String, Object> map, String str) {
        e = (unregisterClient + 7) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        if (str != null) {
            e = (unregisterClient + 89) % 128;
            if (str.length() != 0) {
                map.put("referrer", str);
            }
        }
        Object monetizationNetwork = this.component1.getMonetizationNetwork("extraReferrers", (String) null);
        if (monetizationNetwork != null) {
            map.put("extraReferrers", monetizationNetwork);
        }
        String referrer = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getReferrer(this.component1);
        if (referrer != null && referrer.length() != 0) {
            unregisterClient = (e + 27) % 128;
            if (map.get("referrer") == null) {
                map.put("referrer", referrer);
                return;
            }
            return;
        }
        e = (unregisterClient + 111) % 128;
    }

    private void getMonetizationNetwork(Map<String, Object> map, boolean z) {
        e = (unregisterClient + 19) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("platformextension", this.AFAdRevenueData);
        if (z) {
            map.put("platform_extension_v2", this.getMediationNetwork.getCurrencyIso4217Code());
        }
        unregisterClient = (e + 3) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    private String getMonetizationNetwork(int i) {
        String strAreAllFieldsValid = null;
        if (this.component1.getMonetizationNetwork("INSTALL_STORE")) {
            unregisterClient = (e + 83) % 128;
            String monetizationNetwork = this.component1.getMonetizationNetwork("INSTALL_STORE", (String) null);
            int i2 = e + 21;
            unregisterClient = i2 % 128;
            if (i2 % 2 == 0) {
                return monetizationNetwork;
            }
            throw null;
        }
        if (i <= 1) {
            int i3 = unregisterClient + 103;
            e = i3 % 128;
            if (i3 % 2 != 0) {
                strAreAllFieldsValid = areAllFieldsValid();
            } else {
                unregisterClient = (e + 77) % 128;
            }
        } else {
            unregisterClient = (e + 77) % 128;
        }
        this.component1.getRevenue("INSTALL_STORE", strAreAllFieldsValid);
        return strAreAllFieldsValid;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    private static void getMonetizationNetwork(Map<String, Object> map, String str) {
        int i = e + 87;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            int i2 = 86 / 0;
            if (str != null) {
                map.put("phone", str);
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            if (str != null) {
                map.put("phone", str);
            }
        }
        int i3 = e + 61;
        unregisterClient = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 36 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        boolean z;
        boolean z2 = false;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        Intrinsics.checkNotNullParameter(map, "");
        String strComponent3 = aFg1rSDK.component4.component3();
        String strAFAdRevenueData = AFAdRevenueData(aFg1rSDK.component1, strComponent3);
        if (strAFAdRevenueData == null || Intrinsics.wireman(strAFAdRevenueData, strComponent3)) {
            z = false;
        } else {
            unregisterClient = (e + 125) % 128;
            z = true;
        }
        if (strAFAdRevenueData == null && strComponent3 != null) {
            z2 = true;
        }
        if (z) {
            map.put("af_latestchannel", strComponent3);
        } else {
            int i = unregisterClient + 83;
            e = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            if (z2) {
                map.put("af_latestchannel", strComponent3);
            }
        }
        String monetizationNetwork = aFg1rSDK.getMonetizationNetwork(iIntValue);
        if (monetizationNetwork != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = monetizationNetwork.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            map.put("af_installstore", lowerCase);
        }
        String str = (String) getRevenue(new Object[]{aFg1rSDK, Integer.valueOf(iIntValue)}, -994471321, 994471330, iIntValue);
        if (str != null) {
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            String lowerCase2 = str.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            map.put("af_preinstall_name", lowerCase2);
            e = (unregisterClient + 19) % 128;
        }
        String strAreAllFieldsValid = aFg1rSDK.areAllFieldsValid();
        if (strAreAllFieldsValid != null) {
            Locale locale3 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            String lowerCase3 = strAreAllFieldsValid.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            map.put("af_currentstore", lowerCase3);
        }
        return null;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        Map map = (Map) objArr[0];
        e = (unregisterClient + 11) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            map.put(L6.q, Locale.getDefault().getDisplayLanguage());
        } catch (Exception e2) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e2);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
        } catch (Exception e3) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e3);
        }
        try {
            map.put("country", Locale.getDefault().getCountry());
            unregisterClient = (e + 85) % 128;
            return null;
        } catch (Exception e4) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e4);
            return null;
        }
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        Object objM3351constructorimpl;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        unregisterClient = (e + 91) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        String str = aFg1rSDK.toString.getMonetizationNetwork;
        if (str != null) {
            e = (unregisterClient + 107) % 128;
            if (map.get("af_deeplink") != null) {
                AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
            } else {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("isPush", a.g);
                    map.put("af_deeplink", jSONObject.toString());
                    objM3351constructorimpl = Result.m3351constructorimpl(Unit.f29295attabal);
                    unregisterClient = (e + 59) % 128;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
                }
                Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
                if (thM3354exceptionOrNullimpl != null) {
                    AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", thM3354exceptionOrNullimpl, false, false, false, false, 120, null);
                } else {
                    unregisterClient = (e + 3) % 128;
                }
                Result.m3350boximpl(objM3351constructorimpl);
            }
        }
        aFg1rSDK.toString.getMonetizationNetwork = null;
        return null;
    }

    private final String getMonetizationNetwork(String str) {
        e = (unregisterClient + 119) % 128;
        String currencyIso4217Code = this.component4.getCurrencyIso4217Code(str);
        e = (unregisterClient + 69) % 128;
        return currencyIso4217Code;
    }

    private static String AFAdRevenueData(AFc1qSDK aFc1qSDK, String str) {
        int i = unregisterClient + 73;
        e = i % 128;
        if (i % 2 != 0) {
            String monetizationNetwork = aFc1qSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
            if (monetizationNetwork != null) {
                e = (unregisterClient + 39) % 128;
                return monetizationNetwork;
            }
            aFc1qSDK.getRevenue("CACHED_CHANNEL", str);
            return str;
        }
        aFc1qSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
        throw null;
    }

    private final SimpleDateFormat getRevenue() {
        int i = unregisterClient + 71;
        e = i % 128;
        if (i % 2 != 0) {
            return (SimpleDateFormat) this.AFKeystoreWrapper.getValue();
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final Long getMonetizationNetwork() {
        return (Long) getRevenue(new Object[]{this}, 1297709710, -1297709700, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getRevenue(AFh1mSDK aFh1mSDK) {
        int i = unregisterClient + 75;
        e = i % 128;
        if (i % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFh1mSDK, "");
            Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
            if (aFh1mSDK.getRevenue()) {
                unregisterClient = (e + 47) % 128;
                String str = aFh1mSDK.component1;
                AFc1eSDK aFc1eSDK = this.toString;
                AFAdRevenueData(aFh1mSDK, str, aFc1eSDK.getMediationNetwork, aFc1eSDK.AFAdRevenueData);
            } else if (!(aFh1mSDK instanceof AFh1fSDK)) {
                Intrinsics.checkNotNullExpressionValue(map, "");
                String str2 = aFh1mSDK.areAllFieldsValid;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                getMediationNetwork(map, str2);
            }
            if (p002kotlin.collections.adultoid.kowloon(AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH, AFe1pSDK.INAPP).contains(aFh1mSDK.AFAdRevenueData())) {
                int i2 = e + 107;
                unregisterClient = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullExpressionValue(map, "");
                    equals(map);
                    int i3 = 37 / 0;
                } else {
                    Intrinsics.checkNotNullExpressionValue(map, "");
                    equals(map);
                }
            }
            Intrinsics.checkNotNullExpressionValue(map, "");
            w(map);
            getRevenue(new Object[]{map}, -1520031212, 1520031215, (int) System.currentTimeMillis());
            AFInAppEventType(map);
            AFInAppEventParameterName(map);
            AFAdRevenueData(map);
            getMonetizationNetwork(map, aFh1mSDK.getRevenue());
            e(map);
            i(map);
            getMediationNetwork(map, aFh1mSDK);
            map.put("af_events_api", "1");
            return;
        }
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
        aFh1mSDK.getRevenue();
        throw null;
    }

    private void AFAdRevenueData(Map<String, Object> map, int i) {
        getRevenue(new Object[]{this, map, Integer.valueOf(i)}, 1731268052, -1731268046, i);
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
        getRevenue(new Object[]{this, aFh1mSDK}, 572486758, -572486747, System.identityHashCode(this));
    }

    private void getMediationNetwork(Map<String, Object> map, String str) {
        unregisterClient = (e + 49) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            String monetizationNetwork = this.component1.getMonetizationNetwork("prev_event_name", (String) null);
            if (monetizationNetwork != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", this.component1.getMonetizationNetwork("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", monetizationNetwork);
                map.put("prev_event", jSONObject);
            }
            this.component1.getRevenue("prev_event_name", str);
            this.component1.AFAdRevenueData("prev_event_timestamp", System.currentTimeMillis());
            int i = unregisterClient + 113;
            e = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        } catch (Exception e2) {
            AFLogger.afErrorLog("Error while processing previous event.", e2);
        }
    }

    private String getMediationNetwork(SimpleDateFormat simpleDateFormat, int i) {
        int i2 = e + 7;
        unregisterClient = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(simpleDateFormat, "");
            String monetizationNetwork = this.component1.getMonetizationNetwork("appsFlyerFirstInstall", (String) null);
            if (monetizationNetwork == null) {
                int i3 = unregisterClient;
                e = (i3 + 93) % 128;
                if (i <= 1) {
                    AFLogger.afDebugLog("AppsFlyer: first launch detected");
                    monetizationNetwork = simpleDateFormat.format(new Date());
                } else {
                    e = (i3 + 41) % 128;
                    monetizationNetwork = "";
                }
                this.component1.getRevenue("appsFlyerFirstInstall", monetizationNetwork);
            }
            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "AppsFlyer: first launch date: " + monetizationNetwork, false, 4, null);
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            return monetizationNetwork;
        }
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        this.component1.getMonetizationNetwork("appsFlyerFirstInstall", (String) null);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031 A[PHI: r1 r2
  0x0031: PHI (r1v4 java.lang.String) = (r1v3 java.lang.String), (r1v5 java.lang.String) binds: [B:8:0x002f, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:8:0x002f, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        String monetizationNetwork;
        String currencyIso4217Code;
        int i;
        Map map = (Map) objArr[0];
        int i2 = e + 79;
        unregisterClient = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            monetizationNetwork = AFa1vSDK.getMonetizationNetwork();
            currencyIso4217Code = AFa1vSDK.getCurrencyIso4217Code();
            int i3 = 20 / 0;
            if (monetizationNetwork != null) {
                unregisterClient = (e + 67) % 128;
                if (currencyIso4217Code != null && Integer.parseInt(currencyIso4217Code) > 0) {
                    i = unregisterClient + 109;
                    e = i % 128;
                    if (i % 2 == 0) {
                        map.put("reinstallCounter", currencyIso4217Code);
                        map.put("originalAppsflyerId", monetizationNetwork);
                        int i4 = 28 / 0;
                    } else {
                        map.put("reinstallCounter", currencyIso4217Code);
                        map.put("originalAppsflyerId", monetizationNetwork);
                    }
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            monetizationNetwork = AFa1vSDK.getMonetizationNetwork();
            currencyIso4217Code = AFa1vSDK.getCurrencyIso4217Code();
            if (monetizationNetwork != null) {
                unregisterClient = (e + 67) % 128;
                if (currencyIso4217Code != null) {
                    i = unregisterClient + 109;
                    e = i % 128;
                    if (i % 2 == 0) {
                        map.put("reinstallCounter", currencyIso4217Code);
                        map.put("originalAppsflyerId", monetizationNetwork);
                        int i5 = 28 / 0;
                    } else {
                        map.put("reinstallCounter", currencyIso4217Code);
                        map.put("originalAppsflyerId", monetizationNetwork);
                    }
                }
            }
        }
        int i6 = e + 57;
        unregisterClient = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMediationNetwork(Map<String, Object> map, AFe1pSDK aFe1pSDK) {
        e = (unregisterClient + 43) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFe1pSDK, "");
        if (!copydefault().contains(aFe1pSDK)) {
            unregisterClient = (e + 57) % 128;
            return;
        }
        if (this.toString.getMediationNetwork()) {
            map.put("app_set_id", p002kotlin.collections.polder.beachfront(patroclinal.formularize.attabal("app_set_id_disabled", Boolean.TRUE)));
            if (this.toString.copydefault != null) {
                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
                return;
            } else {
                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
                return;
            }
        }
        AFb1gSDK aFb1gSDK = this.toString.copydefault;
        if (aFb1gSDK != null) {
            map.put("app_set_id", p002kotlin.collections.seminary.impassible(patroclinal.formularize.attabal("scope", Integer.valueOf(aFb1gSDK.getMonetizationNetwork)), patroclinal.formularize.attabal("id", aFb1gSDK.getMediationNetwork)));
        }
    }

    private void getRevenue(Map<String, Object> map, String str) {
        getRevenue(new Object[]{this, map, str}, 274047423, -274047418, System.identityHashCode(this));
    }

    private String getRevenue(int i) {
        return (String) getRevenue(new Object[]{this, Integer.valueOf(i)}, -994471321, 994471330, i);
    }

    private static File getMediationNetwork(String str) {
        int i = e + 5;
        unregisterClient = i % 128;
        try {
            if (i % 2 == 0) {
                if (str != null && StringsKt.stupefactive(str).toString().length() > 0) {
                    File file = new File(StringsKt.stupefactive(str).toString());
                    int i2 = e + 55;
                    unregisterClient = i2 % 128;
                    if (i2 % 2 == 0) {
                        return file;
                    }
                    throw null;
                }
                return null;
            }
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0057 A[EXC_TOP_SPLITTER, PHI: r2
  0x0057: PHI (r2v4 java.io.InputStreamReader) = (r2v3 java.io.InputStreamReader), (r2v6 java.io.InputStreamReader) binds: [B:23:0x0055, B:32:0x007f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    private static String getMediationNetwork(File file, String str) {
        InputStreamReader inputStreamReader;
        try {
            if (file == null) {
                int i = unregisterClient + 65;
                e = i % 128;
                if (i % 2 != 0) {
                    return null;
                }
                throw null;
            }
            try {
                Properties properties = new Properties();
                inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                try {
                    properties.load(inputStreamReader);
                    AFLogger.afInfoLog("Found PreInstall property!");
                    String property = properties.getProperty(str);
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th) {
                        AFLogger.afErrorLog(th.getMessage(), th);
                    }
                    int i2 = unregisterClient + 55;
                    e = i2 % 128;
                    if (i2 % 2 != 0) {
                        return property;
                    }
                    throw null;
                } catch (FileNotFoundException unused) {
                    AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        } catch (Throwable th2) {
                            AFLogger.afErrorLog(th2.getMessage(), th2);
                        }
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    AFLogger.afErrorLog(th.getMessage(), th);
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    return null;
                }
            } catch (FileNotFoundException unused2) {
                inputStreamReader = null;
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader = null;
            }
        } catch (Throwable th5) {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th6) {
                    AFLogger.afErrorLog(th6.getMessage(), th6);
                }
            }
            throw th5;
        }
    }

    private static void getMediationNetwork(Map<String, Object> map, AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        String str = aFh1mSDK.areAllFieldsValid;
        if (str != null) {
            map.put(X3.i.j0, str);
            Map map2 = aFh1mSDK.getRevenue;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    private final void getMediationNetwork(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -539509618, 539509626, System.identityHashCode(this));
    }

    private final AppsFlyerProperties getMediationNetwork() {
        return (AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this));
    }
}
