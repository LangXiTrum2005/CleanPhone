package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.L6;
import com.ironsource.X3;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1lSDK implements AFd1oSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] component3 = null;
    private static boolean copy = false;
    private static int copydefault = 1;
    private static int equals;
    private static final int getCurrencyIso4217Code;
    private static int hashCode;
    private static boolean toString;
    private final AFd1zSDK component2;
    private List<String> AFAdRevenueData = new ArrayList();
    private boolean getRevenue = true;
    private final Map<String, Object> getMediationNetwork = new HashMap();
    private SecureRandom areAllFieldsValid = new SecureRandom();
    private boolean component1 = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int getMonetizationNetwork = 0;
    private boolean component4 = false;

    static {
        component3();
        getCurrencyIso4217Code = 98166;
        equals = (copydefault + 23) % 128;
    }

    public AFd1lSDK(AFd1zSDK aFd1zSDK) {
        this.component2 = aFd1zSDK;
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i, int i2, int i3) {
        int i4 = i | i2;
        int i5 = (i * PglCryptUtils.COMPRESS_FAILED) + (i2 * PglCryptUtils.COMPRESS_FAILED) + (i4 * (-502));
        int i6 = ~i;
        int i7 = ~((~i2) | i6);
        int i8 = i6 | (~i3);
        int i9 = i7 | (~i8);
        int i10 = ~(i3 | i4);
        int i11 = i5 + ((i9 | i10) * (-502)) + (((~(i8 | i2)) | i10) * 502);
        if (i11 == 1) {
            return getCurrencyIso4217Code(objArr);
        }
        if (i11 != 2) {
            return i11 != 3 ? getMonetizationNetwork(objArr) : getRevenue(objArr);
        }
        return getMediationNetwork(objArr);
    }

    private void AFInAppEventType() {
        copydefault = (equals + 119) % 128;
        this.component2.component4().AFAdRevenueData("participantInProxy");
        int i = copydefault + 89;
        equals = i % 128;
        if (i % 2 != 0) {
            int i2 = 31 / 0;
        }
    }

    private boolean AFLogger() {
        return ((Boolean) AFAdRevenueData(new Object[]{this}, -916590221, 916590222, System.identityHashCode(this))).booleanValue();
    }

    private static void a(String str, int[] iArr, String str2, int i, Object[] objArr) throws UnsupportedEncodingException {
        int i2 = ($11 + 29) % 128;
        $10 = i2;
        Object charArray = str2;
        if (str2 != null) {
            int i3 = i2 + 95;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr2 = component3;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                cArr3[i4] = (char) (((long) cArr2[i4]) ^ 1825820251896122634L);
            }
            cArr2 = cArr3;
        }
        int i5 = (int) (1825820251896122634L ^ ((long) hashCode));
        if (copy) {
            int length2 = bArr.length;
            aFk1oSDK.getMonetizationNetwork = length2;
            char[] cArr4 = new char[length2];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i6 = aFk1oSDK.AFAdRevenueData;
                int i7 = aFk1oSDK.getMonetizationNetwork;
                if (i6 >= i7) {
                    objArr[0] = new String(cArr4);
                    return;
                } else {
                    cArr4[i6] = (char) (cArr2[bArr[(i7 - 1) - i6] + i] - i5);
                    aFk1oSDK.AFAdRevenueData = i6 + 1;
                }
            }
        } else if (toString) {
            int length3 = cArr.length;
            aFk1oSDK.getMonetizationNetwork = length3;
            char[] cArr5 = new char[length3];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i8 = aFk1oSDK.AFAdRevenueData;
                int i9 = aFk1oSDK.getMonetizationNetwork;
                if (i8 >= i9) {
                    String str3 = new String(cArr5);
                    $11 = ($10 + 51) % 128;
                    objArr[0] = str3;
                    return;
                } else {
                    int i10 = $11 + 55;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        cArr5[i8] = (char) (cArr2[cArr[(i9 % 1) / i8] - i] % i5);
                    } else {
                        cArr5[i8] = (char) (cArr2[cArr[(i9 - 1) - i8] - i] - i5);
                        i8++;
                    }
                    aFk1oSDK.AFAdRevenueData = i8;
                }
            }
        } else {
            int length4 = iArr.length;
            aFk1oSDK.getMonetizationNetwork = length4;
            char[] cArr6 = new char[length4];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i11 = aFk1oSDK.AFAdRevenueData;
                int i12 = aFk1oSDK.getMonetizationNetwork;
                if (i11 >= i12) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i11] = (char) (cArr2[iArr[(i12 - 1) - i11] - i] - i5);
                    aFk1oSDK.AFAdRevenueData = i11 + 1;
                }
            }
        }
    }

    private synchronized void component1() {
        int i = copydefault + 51;
        equals = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (this.component4) {
            return;
        }
        this.component4 = true;
        try {
            getCurrencyIso4217Code("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            equals = (copydefault + 83) % 128;
            return;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while starting remote debugger", th, true, true, true);
            return;
        }
        throw th;
    }

    private float component2() {
        int i = copydefault + 115;
        equals = i % 128;
        if (i % 2 == 0) {
            return this.areAllFieldsValid.nextFloat();
        }
        this.areAllFieldsValid.nextFloat();
        throw null;
    }

    public static void component3() {
        component3 = new char[]{36322, 36338, 36333, 36350, 36320};
        hashCode = 1912311180;
        toString = true;
        copy = true;
    }

    private static String component4() {
        int i = equals + 83;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return "6.17.5";
        }
        throw null;
    }

    private synchronized void copy() {
        this.AFAdRevenueData = new ArrayList();
        this.getMonetizationNetwork = 0;
        copydefault = (equals + 29) % 128;
    }

    private synchronized Map<String, Object> copydefault() {
        Map<String, Object> map;
        copydefault = (equals + 37) % 128;
        this.getMediationNetwork.put("data", this.AFAdRevenueData);
        copy();
        map = this.getMediationNetwork;
        copydefault = (equals + 111) % 128;
        return map;
    }

    private boolean equals() {
        if (this.component1) {
            int i = copydefault;
            equals = (i + 31) % 128;
            if (this.getRevenue) {
                return true;
            }
            int i2 = i + 37;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.component4) {
                return true;
            }
        }
        int i3 = copydefault + 39;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean areAllFieldsValid() {
        int i = copydefault + 105;
        equals = i % 128;
        if (i % 2 == 0) {
            return this.component4;
        }
        int i2 = 7 / 0;
        return this.component4;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getCurrencyIso4217Code() {
        int i = copydefault;
        this.component1 = false;
        equals = (i + 13) % 128;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final synchronized void getMediationNetwork() {
        if (!this.component4 && !this.getRevenue) {
            copydefault = (equals + 85) % 128;
            return;
        }
        this.component4 = false;
        this.getRevenue = false;
        try {
            getCurrencyIso4217Code("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            equals = (copydefault + 91) % 128;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while stopping remote debugger", th, true, true, true);
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final synchronized void getMonetizationNetwork() {
        equals = (copydefault + 29) % 128;
        this.getMediationNetwork.clear();
        this.AFAdRevenueData.clear();
        this.getMonetizationNetwork = 0;
        int i = equals + 61;
        copydefault = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getRevenue(String str, String... strArr) {
        int i = copydefault + 47;
        equals = i % 128;
        if (i % 2 != 0) {
            getCurrencyIso4217Code("public_api_call", str, strArr);
            int i2 = 67 / 0;
        } else {
            getCurrencyIso4217Code("public_api_call", str, strArr);
        }
        equals = (copydefault + 3) % 128;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void q_(String str, PackageManager packageManager) {
        int i = copydefault + 33;
        equals = i % 128;
        try {
            if (i % 2 != 0) {
                this.component2.getRevenue().getMediationNetwork(AFAdRevenueData(str), this.component2.AFInAppEventType().getMediationNetwork());
                throw null;
            }
            final AFd1kSDK mediationNetwork = this.component2.getRevenue().getMediationNetwork(AFAdRevenueData(str), this.component2.AFInAppEventType().getMediationNetwork());
            if (mediationNetwork == null) {
                AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
            } else {
                this.component2.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.arytenoidectomy
                    @Override // java.lang.Runnable
                    public final void run() {
                        mediationNetwork.AFAdRevenueData();
                    }
                });
                equals = (copydefault + 61) % 128;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean AFAdRevenueData() {
        equals = (copydefault + 67) % 128;
        boolean monetizationNetwork = getMonetizationNetwork(getMonetizationNetwork(this.component2.component1().AFAdRevenueData.getCurrencyIso4217Code), getMonetizationNetwork(this.component2.component1().AFAdRevenueData.getMediationNetwork));
        if (monetizationNetwork) {
            equals = (copydefault + 13) % 128;
            component1();
        } else {
            getRevenue();
            getMediationNetwork();
        }
        copydefault = (equals + 119) % 128;
        return monetizationNetwork;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0077 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0041, B:10:0x005a, B:20:0x0077, B:24:0x008c), top: B:31:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0085 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #1 {all -> 0x0099, blocks: (B:3:0x0001, B:7:0x004d, B:9:0x0053, B:14:0x0065, B:16:0x0068, B:18:0x006e, B:21:0x007f, B:23:0x0085), top: B:33:0x0001 }] */
    private synchronized void getCurrencyIso4217Code(String str, String str2, String str3) {
        try {
            Map<String, Object> map = this.getMediationNetwork;
            Object[] objArr = new Object[1];
            a("\u0085\u0084\u0083\u0082\u0081", null, null, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.getMediationNetwork.put(L6.B, Build.MODEL);
            this.getMediationNetwork.put(L6.H, X3.d);
            this.getMediationNetwork.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                int i = copydefault + 19;
                equals = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
                if (str.length() > 0) {
                    this.getMediationNetwork.put("advertiserId", str);
                    copydefault = (equals + 55) % 128;
                }
                if (str2 != null && str2.length() > 0) {
                    this.getMediationNetwork.put("imei", str2);
                }
                if (str3 != null) {
                    equals = (copydefault + 111) % 128;
                    if (str3.length() > 0) {
                        this.getMediationNetwork.put("android_id", str3);
                        equals = (copydefault + 123) % 128;
                    }
                }
            } else {
                if (str2 != null) {
                    this.getMediationNetwork.put("imei", str2);
                }
                if (str3 != null) {
                    equals = (copydefault + 111) % 128;
                    if (str3.length() > 0) {
                        this.getMediationNetwork.put("android_id", str3);
                        equals = (copydefault + 123) % 128;
                    }
                }
            }
            throw th;
        } catch (Throwable unused) {
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getMonetizationNetwork(String str, String str2) {
        int i = equals + 109;
        copydefault = i % 128;
        if (i % 2 == 0) {
            getCurrencyIso4217Code((String) null, str, str2);
        } else {
            getCurrencyIso4217Code((String) null, str, str2);
        }
        int i2 = equals + 125;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032 A[PHI: r0 r1
  0x0032: PHI (r0v10 java.lang.Throwable) = (r0v3 java.lang.Throwable), (r0v11 java.lang.Throwable) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r1v5 java.lang.String) = (r1v2 java.lang.String), (r1v7 java.lang.String) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002d A[PHI: r0 r1
  0x002d: PHI (r0v4 java.lang.Throwable) = (r0v3 java.lang.Throwable), (r0v11 java.lang.Throwable) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x002d: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v7 java.lang.String) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getRevenue(Throwable th) {
        Throwable cause;
        String simpleName;
        String message;
        StackTraceElement[] stackTrace;
        int i = equals + 103;
        copydefault = i % 128;
        if (i % 2 == 0) {
            cause = th.getCause();
            simpleName = th.getClass().getSimpleName();
            int i2 = 82 / 0;
            if (cause == null) {
                message = th.getMessage();
            } else {
                message = cause.getMessage();
            }
        } else {
            cause = th.getCause();
            simpleName = th.getClass().getSimpleName();
            if (cause == null) {
                message = th.getMessage();
            } else {
                message = cause.getMessage();
            }
        }
        if (cause == null) {
            stackTrace = th.getStackTrace();
        } else {
            stackTrace = cause.getStackTrace();
            equals = (copydefault + 47) % 128;
        }
        getCurrencyIso4217Code("exception", simpleName, getCurrencyIso4217Code(message, stackTrace));
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        boolean mediationNetwork;
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        AFi1xSDK aFi1xSDK = (AFi1xSDK) objArr[1];
        AFi1xSDK aFi1xSDK2 = (AFi1xSDK) objArr[2];
        int i = equals + 87;
        copydefault = i % 128;
        if (i % 2 == 0) {
            aFi1xSDK.equals(aFi1xSDK2);
            throw null;
        }
        if (aFi1xSDK.equals(aFi1xSDK2)) {
            mediationNetwork = aFd1lSDK.AFLogger();
        } else {
            mediationNetwork = aFd1lSDK.getMediationNetwork(aFi1xSDK.getCurrencyIso4217Code);
            aFd1lSDK.getMediationNetwork(mediationNetwork);
        }
        int i2 = copydefault + 63;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return Boolean.valueOf(mediationNetwork);
        }
        throw null;
    }

    private synchronized boolean getMonetizationNetwork(AFi1xSDK aFi1xSDK, AFi1xSDK aFi1xSDK2) {
        try {
            if (aFi1xSDK == null) {
                AFInAppEventType();
                return false;
            }
            if (!aFi1xSDK.AFAdRevenueData()) {
                return false;
            }
            if (this.component2.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0) > aFi1xSDK.getMonetizationNetwork) {
                return false;
            }
            equals = (copydefault + 113) % 128;
            if (!AFAdRevenueData(aFi1xSDK, aFi1xSDK2)) {
                return false;
            }
            if (!getMonetizationNetwork(aFi1xSDK.getMediationNetwork)) {
                return false;
            }
            if (getCurrencyIso4217Code(aFi1xSDK.getRevenue)) {
                return true;
            }
            int i = copydefault + 115;
            equals = i % 128;
            if (i % 2 == 0) {
                return false;
            }
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void AFAdRevenueData(String str, int i, String str2) {
        int i2 = copydefault + 3;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            String[] strArr = new String[4];
            strArr[1] = String.valueOf(i);
            strArr[0] = str2;
            getCurrencyIso4217Code("server_response", str, strArr);
        } else {
            getCurrencyIso4217Code("server_response", str, String.valueOf(i), str2);
        }
        int i3 = copydefault + 113;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 72 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getRevenue(String str, String str2) {
        int i = equals + 19;
        copydefault = i % 128;
        if (i % 2 == 0) {
            String[] strArr = new String[0];
            strArr[0] = str2;
            getCurrencyIso4217Code("server_request", str, strArr);
        } else {
            getCurrencyIso4217Code("server_request", str, str2);
        }
        int i2 = copydefault + 115;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void getMediationNetwork(boolean z) {
        int i = equals + 57;
        copydefault = i % 128;
        if (i % 2 != 0) {
            this.component2.component4().AFAdRevenueData("participantInProxy", z);
        } else {
            this.component2.component4().AFAdRevenueData("participantInProxy", z);
            throw null;
        }
    }

    private Map<String, Object> AFAdRevenueData(String str) {
        int i = equals + 7;
        copydefault = i % 128;
        if (i % 2 != 0) {
            AFAdRevenueData(str, this.component2.AFInAppEventType(), this.component2.force());
            return copydefault();
        }
        AFAdRevenueData(str, this.component2.AFInAppEventType(), this.component2.force());
        copydefault();
        throw null;
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String str3, String str4) {
        try {
            int i = equals + 5;
            copydefault = i % 128;
            try {
                if (i % 2 != 0) {
                    this.getMediationNetwork.put("sdk_version", str);
                    if (str2 != null) {
                        equals = (copydefault + 29) % 128;
                        if (str2.length() > 0) {
                            this.getMediationNetwork.put("devkey", str2);
                        }
                    }
                    if (str3 != null && str3.length() > 0) {
                        int i2 = copydefault + 61;
                        equals = i2 % 128;
                        if (i2 % 2 == 0) {
                            this.getMediationNetwork.put("originalAppsFlyerId", str3);
                        } else {
                            this.getMediationNetwork.put("originalAppsFlyerId", str3);
                            throw null;
                        }
                    }
                    if (str4 != null) {
                        int i3 = equals + 79;
                        copydefault = i3 % 128;
                        if (i3 % 2 != 0) {
                            if (str4.length() > 0) {
                                this.getMediationNetwork.put("uid", str4);
                            }
                        } else {
                            throw null;
                        }
                    }
                } else {
                    this.getMediationNetwork.put("sdk_version", str);
                    throw null;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final synchronized void getRevenue() {
        try {
            int i = copydefault + 23;
            equals = i % 128;
            if (i % 2 != 0) {
                this.getRevenue = false;
            } else {
                this.getRevenue = false;
            }
            getMonetizationNetwork();
            copy();
            int i2 = equals + 31;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 15 / 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean getMediationNetwork(float f) {
        return ((Boolean) AFAdRevenueData(new Object[]{this, Float.valueOf(f)}, 1140261820, -1140261820, System.identityHashCode(this))).booleanValue();
    }

    private synchronized void AFAdRevenueData(String str, AFf1eSDK aFf1eSDK, AFc1eSDK aFc1eSDK) {
        try {
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            String string = appsFlyerProperties.getString("remote_debug_static_data");
            this.getMediationNetwork.clear();
            if (string != null) {
                try {
                    this.getMediationNetwork.putAll(AFg1eSDK.getRevenue(new JSONObject(string)));
                } catch (Throwable unused) {
                }
            } else {
                getCurrencyIso4217Code(this.component2.AFAdRevenueData().areAllFieldsValid(), aFf1eSDK.AFAdRevenueData(), aFc1eSDK.getCurrencyIso4217Code);
                StringBuilder sb = new StringBuilder("6.17.5.");
                sb.append(AFa1ySDK.getMonetizationNetwork);
                getCurrencyIso4217Code(sb.toString(), this.component2.AFInAppEventType().getMediationNetwork(), appsFlyerProperties.getString("KSAppsFlyerId"), AFb1kSDK.getCurrencyIso4217Code(this.component2.AFAdRevenueData().getMediationNetwork));
                try {
                    int i = this.component2.AFAdRevenueData().n_().versionCode;
                    getRevenue(str, String.valueOf(i), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                    copydefault = (equals + 29) % 128;
                } catch (Throwable unused2) {
                }
                appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.getMediationNetwork).toString());
            }
            this.getMediationNetwork.put("launch_counter", String.valueOf(this.component2.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0)));
            copydefault = (equals + 41) % 128;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026 A[Catch: all -> 0x0084, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:4:0x0003, B:7:0x0011, B:14:0x0026, B:18:0x0038, B:19:0x0040, B:20:0x0047, B:23:0x0052, B:27:0x0064, B:28:0x006c, B:29:0x0073, B:31:0x0076, B:33:0x007c), top: B:44:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0038 A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:4:0x0003, B:7:0x0011, B:14:0x0026, B:18:0x0038, B:19:0x0040, B:20:0x0047, B:23:0x0052, B:27:0x0064, B:28:0x006c, B:29:0x0073, B:31:0x0076, B:33:0x007c), top: B:44:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0040 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:4:0x0003, B:7:0x0011, B:14:0x0026, B:18:0x0038, B:19:0x0040, B:20:0x0047, B:23:0x0052, B:27:0x0064, B:28:0x006c, B:29:0x0073, B:31:0x0076, B:33:0x007c), top: B:44:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004a A[Catch: all -> 0x0021, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0009, B:8:0x0018, B:16:0x002c, B:22:0x004a, B:25:0x0058, B:37:0x0086), top: B:42:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[Catch: all -> 0x0021, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0009, B:8:0x0018, B:16:0x002c, B:22:0x004a, B:25:0x0058, B:37:0x0086), top: B:42:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0064 A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:4:0x0003, B:7:0x0011, B:14:0x0026, B:18:0x0038, B:19:0x0040, B:20:0x0047, B:23:0x0052, B:27:0x0064, B:28:0x006c, B:29:0x0073, B:31:0x0076, B:33:0x007c), top: B:44:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x006c A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:4:0x0003, B:7:0x0011, B:14:0x0026, B:18:0x0038, B:19:0x0040, B:20:0x0047, B:23:0x0052, B:27:0x0064, B:28:0x006c, B:29:0x0073, B:31:0x0076, B:33:0x007c), top: B:44:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0076 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:4:0x0003, B:7:0x0011, B:14:0x0026, B:18:0x0038, B:19:0x0040, B:20:0x0047, B:23:0x0052, B:27:0x0064, B:28:0x006c, B:29:0x0073, B:31:0x0076, B:33:0x007c), top: B:44:0x0003 }] */
    private synchronized void getRevenue(String str, String str2, String str3, String str4) {
        int i;
        int i2;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    copydefault = (equals + 65) % 128;
                    this.getMediationNetwork.put("app_id", str);
                    equals = (copydefault + 37) % 128;
                    if (str2 != null && str2.length() > 0) {
                        i2 = equals + 19;
                        copydefault = i2 % 128;
                        if (i2 % 2 != 0) {
                            this.getMediationNetwork.put("app_version", str2);
                        } else {
                            this.getMediationNetwork.put("app_version", str2);
                            throw null;
                        }
                    }
                    if (str3 != null) {
                        equals = (copydefault + 105) % 128;
                        if (str3.length() > 0) {
                            i = equals + 123;
                            copydefault = i % 128;
                            if (i % 2 != 0) {
                                this.getMediationNetwork.put(AppsFlyerProperties.CHANNEL, str3);
                            } else {
                                this.getMediationNetwork.put(AppsFlyerProperties.CHANNEL, str3);
                                throw null;
                            }
                        }
                    }
                    if (str4 != null && str4.length() > 0) {
                        this.getMediationNetwork.put("preInstall", str4);
                    }
                    copydefault = (equals + 57) % 128;
                } else {
                    if (str2 != null) {
                        i2 = equals + 19;
                        copydefault = i2 % 128;
                        if (i2 % 2 != 0) {
                            this.getMediationNetwork.put("app_version", str2);
                        } else {
                            this.getMediationNetwork.put("app_version", str2);
                            throw null;
                        }
                    }
                    if (str3 != null) {
                        equals = (copydefault + 105) % 128;
                        if (str3.length() > 0) {
                            i = equals + 123;
                            copydefault = i % 128;
                            if (i % 2 != 0) {
                                this.getMediationNetwork.put(AppsFlyerProperties.CHANNEL, str3);
                            } else {
                                this.getMediationNetwork.put(AppsFlyerProperties.CHANNEL, str3);
                                throw null;
                            }
                        }
                    }
                    if (str4 != null) {
                        this.getMediationNetwork.put("preInstall", str4);
                    }
                    copydefault = (equals + 57) % 128;
                }
            } catch (Throwable unused) {
                return;
            }
        } else {
            if (str2 != null) {
                i2 = equals + 19;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    this.getMediationNetwork.put("app_version", str2);
                } else {
                    this.getMediationNetwork.put("app_version", str2);
                    throw null;
                }
            }
            if (str3 != null) {
                equals = (copydefault + 105) % 128;
                if (str3.length() > 0) {
                    i = equals + 123;
                    copydefault = i % 128;
                    if (i % 2 != 0) {
                        this.getMediationNetwork.put(AppsFlyerProperties.CHANNEL, str3);
                    } else {
                        this.getMediationNetwork.put(AppsFlyerProperties.CHANNEL, str3);
                        throw null;
                    }
                }
            }
            if (str4 != null) {
                this.getMediationNetwork.put("preInstall", str4);
            }
            copydefault = (equals + 57) % 128;
        }
        throw th;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r3 = r3.equals(r2.component2.AFAdRevenueData().n_().versionName);
        com.appsflyer.internal.AFd1lSDK.copydefault = (com.appsflyer.internal.AFd1lSDK.equals + 83) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (com.appsflyer.internal.AFk1wSDK.getCurrencyIso4217Code(r3) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (com.appsflyer.internal.AFk1wSDK.getCurrencyIso4217Code(r3) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        com.appsflyer.internal.AFd1lSDK.equals = (com.appsflyer.internal.AFd1lSDK.copydefault + 89) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean getMonetizationNetwork(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = com.appsflyer.internal.AFd1lSDK.equals
            int r0 = r0 + 47
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1lSDK.copydefault = r1
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L15
            boolean r0 = com.appsflyer.internal.AFk1wSDK.getCurrencyIso4217Code(r3)
            int r1 = r1 / 0
            if (r0 == 0) goto L25
            goto L1b
        L15:
            boolean r0 = com.appsflyer.internal.AFk1wSDK.getCurrencyIso4217Code(r3)
            if (r0 == 0) goto L25
        L1b:
            int r3 = com.appsflyer.internal.AFd1lSDK.copydefault
            int r3 = r3 + 89
            int r3 = r3 % 128
            com.appsflyer.internal.AFd1lSDK.equals = r3
            r3 = 1
            return r3
        L25:
            com.appsflyer.internal.AFd1zSDK r0 = r2.component2
            com.appsflyer.internal.AFc1oSDK r0 = r0.AFAdRevenueData()
            android.content.pm.PackageInfo r0 = r0.n_()
            java.lang.String r0 = r0.versionName
            boolean r3 = r3.equals(r0)
            int r0 = com.appsflyer.internal.AFd1lSDK.equals
            int r0 = r0 + 83
            int r0 = r0 % 128
            com.appsflyer.internal.AFd1lSDK.copydefault = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1lSDK.getMonetizationNetwork(java.lang.String):boolean");
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        double d = fFloatValue;
        if (d >= 1.0d) {
            int i = copydefault + 109;
            equals = i % 128;
            if (i % 2 == 0) {
                return Boolean.TRUE;
            }
            throw null;
        }
        if (d <= 0.0d) {
            return Boolean.FALSE;
        }
        if (aFd1lSDK.component2() <= fFloatValue) {
            int i2 = equals + 47;
            copydefault = i2 % 128;
            return i2 % 2 == 0 ? Boolean.FALSE : Boolean.TRUE;
        }
        int i3 = equals + 71;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return Boolean.FALSE;
        }
        int i4 = 5 / 0;
        return Boolean.FALSE;
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String... strArr) {
        String string;
        try {
            if (!equals() || this.getMonetizationNetwork >= 98304) {
                return;
            }
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strJoin = TextUtils.join(", ", strArr);
                if (str != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(jCurrentTimeMillis);
                    sb.append(" ");
                    sb.append(Thread.currentThread().getId());
                    sb.append(" _/AppsFlyer_6.17.5 [");
                    sb.append(str);
                    sb.append("] ");
                    sb.append(str2);
                    sb.append(" ");
                    sb.append(strJoin);
                    string = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(jCurrentTimeMillis);
                    sb2.append(" ");
                    sb2.append(Thread.currentThread().getId());
                    sb2.append(" ");
                    sb2.append(str2);
                    sb2.append("/AppsFlyer_6.17.5 ");
                    sb2.append(strJoin);
                    string = sb2.toString();
                }
                int length = this.getMonetizationNetwork + (string.length() << 1);
                int i = getCurrencyIso4217Code;
                boolean z = false;
                if (length > i) {
                    copydefault = (equals + 55) % 128;
                    string = string.substring(0, (i - this.getMonetizationNetwork) / 2);
                    z = true;
                }
                this.AFAdRevenueData.add(string);
                this.getMonetizationNetwork += string.length() << 1;
                if (z) {
                    int i2 = equals + 113;
                    copydefault = i2 % 128;
                    if (i2 % 2 == 0) {
                        this.AFAdRevenueData.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.getMonetizationNetwork *= 26120;
                    } else {
                        this.AFAdRevenueData.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.getMonetizationNetwork += 138;
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static AFi1xSDK getMonetizationNetwork(AFi1vSDK aFi1vSDK) {
        int i = copydefault + 83;
        int i2 = i % 128;
        equals = i2;
        if (i % 2 != 0) {
            int i3 = 4 / 0;
            if (aFi1vSDK == null) {
                return null;
            }
        } else if (aFi1vSDK == null) {
            return null;
        }
        AFi1zSDK aFi1zSDK = aFi1vSDK.getMonetizationNetwork;
        if (aFi1zSDK == null) {
            return null;
        }
        copydefault = (i2 + 33) % 128;
        return aFi1zSDK.getMediationNetwork;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        String str = (String) objArr[0];
        int i = equals + 87;
        copydefault = i % 128;
        if (i % 2 != 0) {
            if (!AFk1wSDK.getCurrencyIso4217Code(str)) {
                new AFd1pSDK();
                return Boolean.valueOf(AFd1pSDK.getCurrencyIso4217Code(component4(), str));
            }
            int i2 = equals + 123;
            copydefault = i2 % 128;
            return Boolean.valueOf(i2 % 2 != 0);
        }
        AFk1wSDK.getCurrencyIso4217Code(str);
        throw null;
    }

    private boolean AFAdRevenueData(AFi1xSDK aFi1xSDK, AFi1xSDK aFi1xSDK2) {
        return ((Boolean) AFAdRevenueData(new Object[]{this, aFi1xSDK, aFi1xSDK2}, 322554097, -322554095, System.identityHashCode(this))).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        r2 = 1;
        r0 = new java.lang.String[r4.length + 1];
        r0[0] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r2 >= r4.length) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        r3 = com.appsflyer.internal.AFd1lSDK.copydefault + 61;
        com.appsflyer.internal.AFd1lSDK.equals = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if ((r3 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        r0[r2] = r4[r2].toString();
        r2 = r2 + 43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r0[r2] = r4[r2].toString();
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        return new java.lang.String[]{r3};
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String[] getCurrencyIso4217Code(java.lang.String r3, java.lang.StackTraceElement[] r4) {
        /*
            int r0 = com.appsflyer.internal.AFd1lSDK.copydefault
            int r0 = r0 + 105
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1lSDK.equals = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L13
            r0 = 86
            int r0 = r0 / r1
            if (r4 != 0) goto L1a
            goto L15
        L13:
            if (r4 != 0) goto L1a
        L15:
            java.lang.String[] r3 = new java.lang.String[]{r3}
            return r3
        L1a:
            int r0 = r4.length
            r2 = 1
            int r0 = r0 + r2
            java.lang.String[] r0 = new java.lang.String[r0]
            r0[r1] = r3
        L21:
            int r3 = r4.length
            if (r2 >= r3) goto L46
            int r3 = com.appsflyer.internal.AFd1lSDK.copydefault
            int r3 = r3 + 61
            int r1 = r3 % 128
            com.appsflyer.internal.AFd1lSDK.equals = r1
            int r3 = r3 % 2
            if (r3 == 0) goto L3b
            r3 = r4[r2]
            java.lang.String r3 = r3.toString()
            r0[r2] = r3
            int r2 = r2 + 43
            goto L21
        L3b:
            r3 = r4[r2]
            java.lang.String r3 = r3.toString()
            r0[r2] = r3
            int r2 = r2 + 1
            goto L21
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1lSDK.getCurrencyIso4217Code(java.lang.String, java.lang.StackTraceElement[]):java.lang.String[]");
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        copydefault = (equals + 117) % 128;
        boolean mediationNetwork = aFd1lSDK.component2.component4().getMediationNetwork("participantInProxy", false);
        int i = copydefault + 37;
        equals = i % 128;
        if (i % 2 == 0) {
            return Boolean.valueOf(mediationNetwork);
        }
        throw null;
    }

    private static boolean getCurrencyIso4217Code(String str) {
        return ((Boolean) AFAdRevenueData(new Object[]{str}, -1244422585, 1244422588, (int) System.currentTimeMillis())).booleanValue();
    }
}
