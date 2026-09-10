package com.appsflyer.internal;

import android.content.Context;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1eSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char areAllFieldsValid = 28972;
    private static char component4 = 39723;
    private static char copydefault = 3892;
    private static int equals = 0;
    private static int hashCode = 1;
    private static char toString = 50688;
    private volatile String component1;
    private volatile String component2;
    private final AFf1dSDK getCurrencyIso4217Code;
    Map<String, Object> getMediationNetwork;
    private final AFc1hSDK getMonetizationNetwork;
    private long getRevenue;
    private boolean AFAdRevenueData = false;
    private volatile boolean component3 = false;

    public AFf1eSDK(AFc1hSDK aFc1hSDK, AFf1dSDK aFf1dSDK) {
        this.getMonetizationNetwork = aFc1hSDK;
        this.getCurrencyIso4217Code = aFf1dSDK;
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        char[] cArr = new char[charArray.length];
        aFk1qSDK.getRevenue = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i2 = aFk1qSDK.getRevenue;
            if (i2 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i);
                return;
            }
            $10 = ($11 + 39) % 128;
            cArr2[0] = charArray[i2];
            cArr2[1] = charArray[i2 + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                $11 = ($10 + 91) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (((long) copydefault) ^ (-1199070254561146252L))))) ^ ((c2 >>> 5) + ((char) (((long) toString) ^ (-1199070254561146252L))))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - (((c3 >>> 5) + ((char) (((long) areAllFieldsValid) ^ (-1199070254561146252L)))) ^ ((c3 + i3) ^ ((c3 << 4) + ((char) (((long) component4) ^ (-1199070254561146252L)))))));
                i3 -= 40503;
            }
            int i5 = aFk1qSDK.getRevenue;
            cArr[i5] = cArr2[0];
            cArr[i5 + 1] = cArr2[1];
            aFk1qSDK.getRevenue = i5 + 2;
        }
    }

    private boolean component1() {
        int i = hashCode;
        equals = (i + 83) % 128;
        Map<String, Object> map = this.getMediationNetwork;
        if (map == null) {
            return false;
        }
        equals = (i + 69) % 128;
        if (map.isEmpty()) {
            return false;
        }
        hashCode = (equals + 47) % 128;
        return true;
    }

    private long component2() {
        return ((Long) getCurrencyIso4217Code(new Object[]{this}, -518249890, 518249890, System.identityHashCode(this))).longValue();
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~((~i3) | i4);
        int i6 = (i * (-337)) + (i2 * 339) + (((~((~i2) | i)) | i5 | (~(i | i3))) * (-338)) + ((~(i4 | i2)) * 338) + (((~(i | i2 | i3)) | i5) * 338);
        if (i6 == 1) {
            AFf1eSDK aFf1eSDK = (AFf1eSDK) objArr[0];
            AFc1oSDK aFc1oSDK = (AFc1oSDK) objArr[1];
            StringBuilder sb = new StringBuilder();
            sb.append(AFb1kSDK.getCurrencyIso4217Code(aFc1oSDK.getMediationNetwork));
            sb.append(((Long) getCurrencyIso4217Code(new Object[]{aFf1eSDK}, -518249890, 518249890, System.identityHashCode(aFf1eSDK))).longValue());
            long revenue = AFj1dSDK.getRevenue(AFj1dSDK.AFAdRevenueData(sb.toString()));
            equals = (hashCode + 35) % 128;
            return Long.valueOf(revenue);
        }
        if (i6 != 2) {
            AFf1eSDK aFf1eSDK2 = (AFf1eSDK) objArr[0];
            int i7 = hashCode;
            equals = (i7 + 117) % 128;
            long j = aFf1eSDK2.getRevenue;
            equals = (i7 + 51) % 128;
            return Long.valueOf(j);
        }
        AFf1eSDK aFf1eSDK3 = (AFf1eSDK) objArr[0];
        String str = (String) objArr[1];
        equals = (hashCode + 91) % 128;
        aFf1eSDK3.component2 = str;
        hashCode = (equals + 53) % 128;
        return null;
    }

    public final void AFAdRevenueData(String str) {
        int i = equals + 17;
        hashCode = i % 128;
        if (i % 2 != 0) {
            this.component1 = str;
        } else {
            this.component1 = str;
            int i2 = 0 / 0;
        }
    }

    public final void component4() {
        Map<String, Object> map;
        Object currencyIso4217Code;
        int i = equals + 55;
        hashCode = i % 128;
        if (i % 2 == 0) {
            this.getMediationNetwork.put("ttr", Long.valueOf(System.currentTimeMillis() / this.getRevenue));
            map = this.getMediationNetwork;
            currencyIso4217Code = getCurrencyIso4217Code(new Object[]{this}, -518249890, 518249890, System.identityHashCode(this));
        } else {
            this.getMediationNetwork.put("ttr", Long.valueOf(System.currentTimeMillis() - this.getRevenue));
            map = this.getMediationNetwork;
            currencyIso4217Code = getCurrencyIso4217Code(new Object[]{this}, -518249890, 518249890, System.identityHashCode(this));
        }
        map.put("lvl_timestamp", Long.valueOf(((Long) currencyIso4217Code).longValue()));
    }

    public final String getMediationNetwork() {
        int i = equals + 51;
        hashCode = i % 128;
        if (i % 2 != 0) {
            return this.component1;
        }
        throw null;
    }

    public final void getMonetizationNetwork(boolean z) {
        int i = equals + 47;
        hashCode = i % 128;
        if (i % 2 != 0) {
            this.component3 = z;
        } else {
            this.component3 = z;
            int i2 = 23 / 0;
        }
    }

    public final Map<String, Object> getRevenue(Map<String, Object> map) {
        AFc1iSDK aFc1iSDK = new AFc1iSDK(map, this.getMonetizationNetwork.getMonetizationNetwork);
        int i = hashCode + 77;
        equals = i % 128;
        if (i % 2 == 0) {
            return aFc1iSDK;
        }
        throw null;
    }

    public final Map<String, Object> getMediationNetwork(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.getMonetizationNetwork.getMonetizationNetwork};
                Map map2 = AFa1hSDK.d;
                Object declaredConstructor = map2.get(-532394666);
                if (declaredConstructor == null) {
                    declaredConstructor = ((Class) AFa1hSDK.getRevenue(Process.getGidForName("") + 126, (char) TextUtils.getCapsMode("", 0, 0), 36 - (Process.myTid() >> 22))).getDeclaredConstructor(Map.class, Context.class);
                    map2.put(-532394666, declaredConstructor);
                }
                Map<String, Object> map3 = (Map) ((Constructor) declaredConstructor).newInstance(objArr);
                hashCode = (equals + 115) % 128;
                return map3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.ANTI_FRAUD, "AFCksmV3: reflection init failed", th2, false, false, true);
            return new HashMap();
        }
    }

    public static boolean getRevenue(AFh1mSDK aFh1mSDK, AFc1oSDK aFc1oSDK) {
        String str;
        equals = (hashCode + 115) % 128;
        if (!AFk1wSDK.getMonetizationNetwork(aFc1oSDK.AFAdRevenueData)) {
            str = aFc1oSDK.AFAdRevenueData;
            hashCode = (equals + 1) % 128;
        } else {
            String currencyIso4217Code = aFc1oSDK.getCurrencyIso4217Code("com.appsflyer.security.uuid");
            if (AFk1wSDK.getMonetizationNetwork(currencyIso4217Code)) {
                str = null;
            } else {
                String strSubstring = currencyIso4217Code.substring(0, 8);
                aFc1oSDK.AFAdRevenueData = strSubstring;
                str = strSubstring;
            }
        }
        if (str != null) {
            hashCode = (equals + 83) % 128;
            if (!str.isEmpty()) {
                try {
                    Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
                    Object[] objArr = new Object[1];
                    a("颸╊Џ誢䚯ྸ\uf0ec⣑缞腁羥燓", '<' - AndroidCharacter.getMirror('0'), objArr);
                    long j = Long.parseLong(String.valueOf(map.get(((String) objArr[0]).intern())));
                    char[] charArray = str.toCharArray();
                    int i = ((int) (j % 94)) + 33;
                    for (int i2 = 0; i2 < charArray.length; i2++) {
                        charArray[i2] = (char) (charArray[i2] ^ i);
                    }
                    aFh1mSDK.getMediationNetwork.put("af-sdk-sbid", Base64.encodeToString(new String(charArray).getBytes(Charset.defaultCharset()), 2));
                    return true;
                } catch (Exception e) {
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception occurred while generating sbid ", e);
                }
            }
        }
        return false;
    }

    public final String AFAdRevenueData() {
        int i = equals + 89;
        hashCode = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        String str = this.component2;
        int i2 = equals + 81;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x007a A[Catch: Exception -> 0x005d, InvocationTargetException -> 0x005f, TRY_LEAVE, TryCatch #2 {InvocationTargetException -> 0x005f, Exception -> 0x005d, blocks: (B:12:0x0042, B:23:0x007a, B:19:0x0061), top: B:47:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    public final String getMonetizationNetwork(AFc1qSDK aFc1qSDK) {
        String str;
        hashCode = (equals + 81) % 128;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String monetizationNetwork = aFc1qSDK.getMonetizationNetwork("imeiCached", (String) null);
        if (z && AFk1wSDK.getMonetizationNetwork(this.component2)) {
            Context context = this.getMonetizationNetwork.getMonetizationNetwork;
            if (context == null || !getRevenue(context)) {
                str = null;
            } else {
                int i = hashCode + 123;
                equals = i % 128;
                try {
                    if (i % 2 != 0) {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        str = (String) telephonyManager.getClass().getMethod("getDeviceId", null).invoke(telephonyManager, new Object[1]);
                        if (str == null) {
                            if (monetizationNetwork != null) {
                                AFLogger.afDebugLog("use cached IMEI: ".concat(monetizationNetwork));
                            } else {
                                monetizationNetwork = null;
                            }
                            str = monetizationNetwork;
                        }
                    } else {
                        TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
                        str = (String) telephonyManager2.getClass().getMethod("getDeviceId", null).invoke(telephonyManager2, null);
                        if (str == null) {
                            if (monetizationNetwork != null) {
                                AFLogger.afDebugLog("use cached IMEI: ".concat(monetizationNetwork));
                            } else {
                                monetizationNetwork = null;
                            }
                            str = monetizationNetwork;
                        }
                    }
                } catch (InvocationTargetException e) {
                    if (monetizationNetwork != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(monetizationNetwork));
                    } else {
                        monetizationNetwork = null;
                    }
                    StringBuilder sb = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                    sb.append(e.getMessage());
                    AFLogger.afErrorLog(sb.toString(), e);
                } catch (Exception e2) {
                    if (monetizationNetwork != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(monetizationNetwork));
                    } else {
                        monetizationNetwork = null;
                    }
                    StringBuilder sb2 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                    sb2.append(e2.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e2);
                }
            }
        } else if (this.component2 != null) {
            str = this.component2;
        } else {
            str = null;
        }
        if (!AFk1wSDK.getMonetizationNetwork(str)) {
            aFc1qSDK.getRevenue("imeiCached", str);
            int i2 = equals + 57;
            hashCode = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
        AFLogger.afInfoLog("IMEI was not collected.");
        return null;
    }

    public final boolean getCurrencyIso4217Code() {
        int i = hashCode + 39;
        equals = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        boolean z = this.component3;
        hashCode = (equals + 39) % 128;
        return z;
    }

    private long getCurrencyIso4217Code(AFc1oSDK aFc1oSDK) {
        return ((Long) getCurrencyIso4217Code(new Object[]{this, aFc1oSDK}, 1277266909, -1277266908, System.identityHashCode(this))).longValue();
    }

    public final Map<String, Object> getRevenue() {
        HashMap map = new HashMap();
        if (component1()) {
            hashCode = (equals + 53) % 128;
            map.put("lvl", this.getMediationNetwork);
            hashCode = (equals + 55) % 128;
            return map;
        }
        if (this.AFAdRevenueData) {
            this.getMediationNetwork = new HashMap();
            component4();
            this.getMediationNetwork.put("error", "pending LVL response");
            map.put("lvl", this.getMediationNetwork);
        }
        return map;
    }

    public static void getMonetizationNetwork(AFh1mSDK aFh1mSDK, byte[] bArr) throws Throwable {
        try {
            new AFb1sSDK(aFh1mSDK, bArr).afInfoLog();
            hashCode = (equals + 105) % 128;
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFg1cSDK.SECURITY, "native: reflection init failed", e, false, false, true);
        }
    }

    public final boolean getMonetizationNetwork() {
        equals = (hashCode + 37) % 128;
        if (!this.AFAdRevenueData || component1()) {
            return false;
        }
        equals = (hashCode + 21) % 128;
        return true;
    }

    public final void getRevenue(AFc1oSDK aFc1oSDK) {
        this.getRevenue = System.currentTimeMillis();
        this.AFAdRevenueData = this.getCurrencyIso4217Code.getRevenue(((Long) getCurrencyIso4217Code(new Object[]{this, aFc1oSDK}, 1277266909, -1277266908, System.identityHashCode(this))).longValue(), this.getMonetizationNetwork.getMonetizationNetwork, new AFf1dSDK.AFa1tSDK() { // from class: com.appsflyer.internal.AFf1eSDK.3
            @Override // com.appsflyer.internal.AFf1dSDK.AFa1tSDK
            public final void getMonetizationNetwork(String str, String str2) {
                AFf1eSDK.this.getMediationNetwork = new ConcurrentHashMap();
                AFf1eSDK.this.getMediationNetwork.put("signedData", str);
                AFf1eSDK.this.getMediationNetwork.put(InAppPurchaseMetaData.KEY_SIGNATURE, str2);
                AFf1eSDK.this.component4();
                AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
            }

            @Override // com.appsflyer.internal.AFf1dSDK.AFa1tSDK
            public final void getRevenue(String str, Exception exc) {
                AFf1eSDK.this.getMediationNetwork = new ConcurrentHashMap();
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                AFf1eSDK.this.component4();
                AFf1eSDK.this.getMediationNetwork.put("error", message);
                AFLogger.afErrorLog(str, exc, true, true, false);
            }
        });
        int i = equals + 69;
        hashCode = i % 128;
        if (i % 2 == 0) {
            int i2 = 61 / 0;
        }
    }

    private static boolean getRevenue(Context context) {
        equals = (hashCode + 63) % 128;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return true;
        }
        equals = (hashCode + 3) % 128;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        equals = (hashCode + 123) % 128;
        AFa1ySDK.getRevenue();
        if (!AFa1ySDK.getRevenue(context)) {
            return true;
        }
        hashCode = (equals + 75) % 128;
        return false;
    }

    public final void getRevenue(String str) {
        getCurrencyIso4217Code(new Object[]{this, str}, -1410448561, 1410448563, System.identityHashCode(this));
    }
}
