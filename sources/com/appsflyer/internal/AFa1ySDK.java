package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.android.billingclient.api.BillingClient;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1oSDK.AnonymousClass1;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.google.android.gms.common.GoogleApiAvailability;
import com.ironsource.X3;
import com.ironsource.mediationsdk.metadata.a;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class AFa1ySDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean AFInAppEventParameterName = false;
    private static boolean AFInAppEventType = false;
    private static int AFKeystoreWrapper = 0;
    private static char[] AFLogger = null;
    private static AFa1ySDK areAllFieldsValid = null;
    static AppsFlyerInAppPurchaseValidatorListener getCurrencyIso4217Code = null;
    public static final String getMediationNetwork;
    public static final String getMonetizationNetwork;
    private static int i = 1;
    private static int registerClient;
    Application component2;
    private Map<Long, String> copydefault;
    private AFf1mSDK equals;
    private boolean hashCode;
    private volatile SharedPreferences toString;
    public volatile AppsFlyerConversionListener getRevenue = null;
    private long component3 = -1;
    long AFAdRevenueData = -1;
    private long component4 = TimeUnit.SECONDS.toMillis(5);
    boolean component1 = false;
    private final AFc1bSDK copy = new AFc1bSDK();

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1ySDK$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            getCurrencyIso4217Code = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getCurrencyIso4217Code[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        component2();
        getMonetizationNetwork = "366";
        getMediationNetwork = "6.17";
        getCurrencyIso4217Code = null;
        areAllFieldsValid = new AFa1ySDK();
        i = (AFKeystoreWrapper + 87) % 128;
    }

    public AFa1ySDK() {
        getMonetizationNetwork().afInfoLog().getRevenue();
        getMonetizationNetwork().afInfoLog().getMonetizationNetwork();
        AFe1oSDK aFe1oSDKCopydefault = getMonetizationNetwork().copydefault();
        aFe1oSDKCopydefault.getMediationNetwork.add(new AFa1zSDK());
    }

    private static void a(String str, int[] iArr, String str2, int i2, Object[] objArr) throws UnsupportedEncodingException {
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object bytes = str;
        if (str != null) {
            int i3 = $10 + 79;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 41 / 0;
                bytes = str.getBytes("ISO-8859-1");
            } else {
                bytes = str.getBytes("ISO-8859-1");
            }
        }
        byte[] bArr = (byte[]) bytes;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr2 = AFLogger;
        if (cArr2 != null) {
            $11 = ($10 + 29) % 128;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr3[i5] = (char) (((long) cArr2[i5]) ^ 1825820251896122634L);
            }
            cArr2 = cArr3;
        }
        int i6 = (int) (1825820251896122634L ^ ((long) registerClient));
        if (AFInAppEventType) {
            int length2 = bArr.length;
            aFk1oSDK.getMonetizationNetwork = length2;
            char[] cArr4 = new char[length2];
            aFk1oSDK.AFAdRevenueData = 0;
            $11 = ($10 + 43) % 128;
            while (true) {
                int i7 = aFk1oSDK.AFAdRevenueData;
                int i8 = aFk1oSDK.getMonetizationNetwork;
                if (i7 >= i8) {
                    objArr[0] = new String(cArr4);
                    return;
                } else {
                    cArr4[i7] = (char) (cArr2[bArr[(i8 - 1) - i7] + i2] - i6);
                    aFk1oSDK.AFAdRevenueData = i7 + 1;
                }
            }
        } else if (AFInAppEventParameterName) {
            int length3 = cArr.length;
            aFk1oSDK.getMonetizationNetwork = length3;
            char[] cArr5 = new char[length3];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i9 = aFk1oSDK.AFAdRevenueData;
                int i10 = aFk1oSDK.getMonetizationNetwork;
                if (i9 >= i10) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i9] = (char) (cArr2[cArr[(i10 - 1) - i9] - i2] - i6);
                    aFk1oSDK.AFAdRevenueData = i9 + 1;
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
                    cArr6[i11] = (char) (cArr2[iArr[(i12 - 1) - i11] - i2] - i6);
                    aFk1oSDK.AFAdRevenueData = i11 + 1;
                }
            }
        }
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        String str = (String) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = AFKeystoreWrapper + 37;
        i = i2 % 128;
        if (i2 % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, zBooleanValue);
            return null;
        }
        AppsFlyerProperties.getInstance().set(str, zBooleanValue);
        throw null;
    }

    private static void c_(Context context, PackageInfo packageInfo) {
        try {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (applicationInfo.flags & 32768) == 0) {
                return;
            }
            if (Build.VERSION.SDK_INT < 31) {
                if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                    return;
                } else {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                    return;
                }
            }
            if (context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName()) == 0) {
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                AFKeystoreWrapper = (i + 49) % 128;
            } else {
                int i2 = i + 65;
                AFKeystoreWrapper = i2 % 128;
                (i2 % 2 != 0 ? AFLogger.INSTANCE : AFLogger.INSTANCE).i(AFg1cSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
            }
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while checking BackupRules: ", th);
        }
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        String str = (String) objArr[0];
        try {
            if (!new JSONObject(str).has("pid")) {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                int i2 = AFKeystoreWrapper + 113;
                i = i2 % 128;
                if (i2 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            int i3 = i + 97;
            AFKeystoreWrapper = i3 % 128;
            if (i3 % 2 == 0) {
                getMediationNetwork("preInstallName", str);
                return null;
            }
            getMediationNetwork("preInstallName", str);
            throw null;
        } catch (JSONException e) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0056  */
    /* JADX WARN: Code duplicated, block: B:12:0x0063  */
    /* JADX WARN: Code duplicated, block: B:9:0x0049 A[PHI: r1 r2
  0x0049: PHI (r1v4 com.appsflyer.internal.AFh1xSDK) = (r1v3 com.appsflyer.internal.AFh1xSDK), (r1v8 com.appsflyer.internal.AFh1xSDK) binds: [B:8:0x0047, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0049: PHI (r2v4 com.appsflyer.internal.AFh1vSDK) = (r2v3 com.appsflyer.internal.AFh1vSDK), (r2v5 com.appsflyer.internal.AFh1vSDK) binds: [B:8:0x0047, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object component3(Object[] objArr) {
        AFh1xSDK aFh1xSDKAreAllFieldsValid;
        AFh1vSDK mediationNetwork;
        int i2;
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        Context context = (Context) objArr[1];
        AFh1tSDK aFh1tSDK = (AFh1tSDK) objArr[2];
        int i3 = AFKeystoreWrapper + 77;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            aFa1ySDK.AFAdRevenueData(context);
            aFh1xSDKAreAllFieldsValid = aFa1ySDK.getMonetizationNetwork().areAllFieldsValid();
            mediationNetwork = AFh1vSDK.getMediationNetwork(context);
            int i4 = 14 / 0;
            if (aFh1xSDKAreAllFieldsValid.AFAdRevenueData()) {
                i2 = AFKeystoreWrapper + 75;
                i = i2 % 128;
                if (i2 % 2 != 0) {
                    aFh1xSDKAreAllFieldsValid.AFAdRevenueData.put("api_name", aFh1tSDK.toString());
                    aFh1xSDKAreAllFieldsValid.getRevenue(mediationNetwork);
                    throw null;
                }
                aFh1xSDKAreAllFieldsValid.AFAdRevenueData.put("api_name", aFh1tSDK.toString());
                aFh1xSDKAreAllFieldsValid.getRevenue(mediationNetwork);
            }
        } else {
            aFa1ySDK.AFAdRevenueData(context);
            aFh1xSDKAreAllFieldsValid = aFa1ySDK.getMonetizationNetwork().areAllFieldsValid();
            mediationNetwork = AFh1vSDK.getMediationNetwork(context);
            if (aFh1xSDKAreAllFieldsValid.AFAdRevenueData()) {
                i2 = AFKeystoreWrapper + 75;
                i = i2 % 128;
                if (i2 % 2 != 0) {
                    aFh1xSDKAreAllFieldsValid.AFAdRevenueData.put("api_name", aFh1tSDK.toString());
                    aFh1xSDKAreAllFieldsValid.getRevenue(mediationNetwork);
                    throw null;
                }
                aFh1xSDKAreAllFieldsValid.AFAdRevenueData.put("api_name", aFh1tSDK.toString());
                aFh1xSDKAreAllFieldsValid.getRevenue(mediationNetwork);
            }
        }
        aFh1xSDKAreAllFieldsValid.getMonetizationNetwork();
        int i5 = AFKeystoreWrapper + 61;
        i = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005b A[Catch: all -> 0x003c, JSONException -> 0x003f, PHI: r3
  0x005b: PHI (r3v3 long) = (r3v2 long), (r3v14 long) binds: [B:14:0x0059, B:6:0x0039] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {JSONException -> 0x003f, all -> 0x003c, blocks: (B:5:0x002a, B:16:0x0066, B:18:0x0071, B:21:0x008a, B:25:0x009d, B:26:0x00a0, B:30:0x00b3, B:31:0x00b6, B:20:0x0085, B:15:0x005b, B:13:0x004d), top: B:37:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0066 A[Catch: all -> 0x003c, JSONException -> 0x003f, PHI: r3 r7
  0x0066: PHI (r3v12 long) = (r3v2 long), (r3v14 long) binds: [B:14:0x0059, B:6:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x0066: PHI (r7v3 java.lang.String) = (r7v0 java.lang.String), (r7v8 java.lang.String) binds: [B:14:0x0059, B:6:0x0039] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {JSONException -> 0x003f, all -> 0x003c, blocks: (B:5:0x002a, B:16:0x0066, B:18:0x0071, B:21:0x008a, B:25:0x009d, B:26:0x00a0, B:30:0x00b3, B:31:0x00b6, B:20:0x0085, B:15:0x005b, B:13:0x004d), top: B:37:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0071 A[Catch: all -> 0x003c, JSONException -> 0x003f, TRY_LEAVE, TryCatch #2 {JSONException -> 0x003f, all -> 0x003c, blocks: (B:5:0x002a, B:16:0x0066, B:18:0x0071, B:21:0x008a, B:25:0x009d, B:26:0x00a0, B:30:0x00b3, B:31:0x00b6, B:20:0x0085, B:15:0x005b, B:13:0x004d), top: B:37:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0085 A[Catch: all -> 0x003c, JSONException -> 0x003f, TRY_ENTER, TryCatch #2 {JSONException -> 0x003f, all -> 0x003c, blocks: (B:5:0x002a, B:16:0x0066, B:18:0x0071, B:21:0x008a, B:25:0x009d, B:26:0x00a0, B:30:0x00b3, B:31:0x00b6, B:20:0x0085, B:15:0x005b, B:13:0x004d), top: B:37:0x001d }] */
    private static /* synthetic */ Object component4(Object[] objArr) {
        long jCurrentTimeMillis;
        String monetizationNetwork;
        JSONObject jSONObject;
        JSONArray jSONArray;
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        int i2 = AFKeystoreWrapper + 83;
        i = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
                jCurrentTimeMillis = System.currentTimeMillis();
                monetizationNetwork = aFa1ySDK.getMonetizationNetwork(context).getMonetizationNetwork("extraReferrers", (String) null);
                int i3 = 25 / 0;
                if (monetizationNetwork == null) {
                    jSONObject = new JSONObject();
                    jSONArray = new JSONArray();
                } else {
                    jSONObject = new JSONObject(monetizationNetwork);
                    if (jSONObject.has(str)) {
                        jSONArray = new JSONArray((String) jSONObject.get(str));
                        AFKeystoreWrapper = (i + 123) % 128;
                    } else {
                        jSONArray = new JSONArray();
                    }
                }
            } else {
                AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
                jCurrentTimeMillis = System.currentTimeMillis();
                monetizationNetwork = aFa1ySDK.getMonetizationNetwork(context).getMonetizationNetwork("extraReferrers", (String) null);
                if (monetizationNetwork == null) {
                    jSONObject = new JSONObject();
                    jSONArray = new JSONArray();
                } else {
                    jSONObject = new JSONObject(monetizationNetwork);
                    if (jSONObject.has(str)) {
                        jSONArray = new JSONArray((String) jSONObject.get(str));
                        AFKeystoreWrapper = (i + 123) % 128;
                    } else {
                        jSONArray = new JSONArray();
                    }
                }
            }
            if (jSONArray.length() < 5) {
                AFKeystoreWrapper = (i + 75) % 128;
                jSONArray.put(jCurrentTimeMillis);
            }
            if (jSONObject.length() >= 4) {
                i = (AFKeystoreWrapper + 67) % 128;
                AFAdRevenueData(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            aFa1ySDK.getMonetizationNetwork(context).getRevenue("extraReferrers", jSONObject.toString());
            return null;
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e);
            return null;
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
            return null;
        }
    }

    private static /* synthetic */ Object copy(Object[] objArr) {
        Context context = (Context) objArr[0];
        try {
            List listAsList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!listAsList.contains("android.permission.INTERNET")) {
                int i2 = AFKeystoreWrapper + 73;
                i = i2 % 128;
                if (i2 % 2 == 0) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                    int i3 = 51 / 0;
                } else {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                }
            }
            if (!listAsList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT > 32) {
                i = (AFKeystoreWrapper + 11) % 128;
                if (!listAsList.contains("com.google.android.gms.permission.AD_ID")) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                }
            }
            AFKeystoreWrapper = (i + 61) % 128;
            return null;
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while validation permissions. ", e);
            return null;
        }
    }

    private static /* synthetic */ Object copydefault(Object[] objArr) {
        i = (AFKeystoreWrapper + 121) % 128;
        String currencyIso4217Code = getCurrencyIso4217Code(AppsFlyerProperties.APP_USER_ID);
        int i2 = i + 115;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    public static SharedPreferences d_(Context context) {
        return (SharedPreferences) getRevenue(new Object[]{context}, 1916447333, -1916447320, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0037  */
    public /* synthetic */ void e_(Context context, Intent intent) {
        Uri data;
        boolean z;
        i = (AFKeystoreWrapper + 69) % 128;
        AFAdRevenueData(context);
        AFa1mSDK aFa1mSDKI = getMonetizationNetwork().i();
        AFc1qSDK aFc1qSDKComponent4 = getMonetizationNetwork().component4();
        if (intent != null) {
            i = (AFKeystoreWrapper + 95) % 128;
            if ("android.intent.action.VIEW".equals(intent.getAction())) {
                data = intent.getData();
            } else {
                data = null;
            }
        } else {
            data = null;
        }
        if (data != null) {
            AFKeystoreWrapper = (i + 33) % 128;
            if (data.toString().isEmpty()) {
                z = false;
            } else {
                int i2 = i + 27;
                AFKeystoreWrapper = i2 % 128;
                if (i2 % 2 != 0) {
                    z = false;
                } else {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        if (!aFc1qSDKComponent4.getMediationNetwork("ddl_sent", false) || z) {
            aFa1mSDKI.f_(AFa1jSDK.getMediationNetwork(aFa1mSDKI.areAllFieldsValid.afVerboseLog()), intent, context);
        } else {
            aFa1mSDKI.getMediationNetwork("No direct deep link", null);
        }
    }

    private static /* synthetic */ Object equals(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        int i2 = AFKeystoreWrapper + 93;
        i = i2 % 128;
        if (i2 % 2 != 0) {
            aFa1ySDK.getMonetizationNetwork().v().getMonetizationNetwork();
            return null;
        }
        aFa1ySDK.getMonetizationNetwork().v().getMonetizationNetwork();
        throw null;
    }

    private static String getCurrencyIso4217Code(String str) {
        String string;
        int i2 = AFKeystoreWrapper + 59;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            string = AppsFlyerProperties.getInstance().getString(str);
            int i3 = 57 / 0;
        } else {
            string = AppsFlyerProperties.getInstance().getString(str);
        }
        i = (AFKeystoreWrapper + 41) % 128;
        return string;
    }

    private static void getMediationNetwork(String str, String str2) {
        int i2 = i + 19;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, str2);
            int i3 = 77 / 0;
        } else {
            AppsFlyerProperties.getInstance().set(str, str2);
        }
        int i4 = AFKeystoreWrapper + 73;
        i = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i2, int i3, int i4) {
        String strConcat;
        int i5 = (i2 * (-755)) + (i3 * (-755));
        int i6 = ~((~i2) | (~i3));
        int i7 = i2 | i3;
        boolean z = true;
        switch (i5 + (i6 * 1512) + (((~(i7 | i4)) | i6) * (-756)) + ((i7 | (~i4)) * 756)) {
            case 1:
                AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
                String str = (String) objArr[1];
                Map map = (Map) objArr[2];
                i = (AFKeystoreWrapper + 117) % 128;
                AFc1eSDK aFc1eSDKForce = aFa1ySDK.getMonetizationNetwork().force();
                if (aFc1eSDKForce.AFAdRevenueData == null) {
                    aFc1eSDKForce.AFAdRevenueData = new AFb1rSDK();
                }
                AFb1rSDK aFb1rSDK = aFc1eSDKForce.AFAdRevenueData;
                if (str == null || str.isEmpty()) {
                    AFLogger.afWarnLog("Partner ID is missing or `null`");
                    return null;
                }
                if (map == null || map.isEmpty()) {
                    if (aFb1rSDK.getCurrencyIso4217Code.remove(str) == null) {
                        AFKeystoreWrapper = (i + 39) % 128;
                        strConcat = "Partner data is missing or `null`";
                    } else {
                        strConcat = "Cleared partner data for ".concat(str);
                    }
                    AFLogger.afWarnLog(strConcat);
                    return null;
                }
                StringBuilder sb = new StringBuilder("Setting partner data for ");
                sb.append(str);
                sb.append(": ");
                sb.append(map);
                AFLogger.afDebugLog(sb.toString());
                int length = new JSONObject(map).toString().length();
                if (length <= 1000) {
                    aFb1rSDK.getCurrencyIso4217Code.put(str, map);
                    aFb1rSDK.getMonetizationNetwork.remove(str);
                    return null;
                }
                AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                HashMap map2 = new HashMap();
                map2.put("error", "limit exceeded: ".concat(String.valueOf(length)));
                aFb1rSDK.getMonetizationNetwork.put(str, map2);
                return null;
            case 2:
                return getMonetizationNetwork(objArr);
            case 3:
                AFa1ySDK aFa1ySDK2 = (AFa1ySDK) objArr[0];
                String[] strArr = (String[]) objArr[1];
                i = (AFKeystoreWrapper + 19) % 128;
                aFa1ySDK2.setSharingFilterForPartners(strArr);
                i = (AFKeystoreWrapper + 21) % 128;
                return null;
            case 4:
                return getCurrencyIso4217Code(objArr);
            case 5:
                AFa1ySDK aFa1ySDK3 = (AFa1ySDK) objArr[0];
                Context context = (Context) objArr[1];
                String str2 = (String) objArr[2];
                i = (AFKeystoreWrapper + 77) % 128;
                aFa1ySDK3.start(context, str2, null);
                AFKeystoreWrapper = (i + 65) % 128;
                return null;
            case 6:
                return getRevenue(objArr);
            case 7:
                return AFAdRevenueData(objArr);
            case 8:
                AFa1ySDK aFa1ySDK4 = (AFa1ySDK) objArr[0];
                String str3 = (String) objArr[1];
                int i8 = i + 91;
                AFKeystoreWrapper = i8 % 128;
                if (i8 % 2 != 0) {
                    AFd1oSDK aFd1oSDKCopy = aFa1ySDK4.getMonetizationNetwork().copy();
                    String[] strArr2 = new String[0];
                    strArr2[1] = str3;
                    aFd1oSDKCopy.getRevenue("setCurrencyCode", strArr2);
                } else {
                    aFa1ySDK4.getMonetizationNetwork().copy().getRevenue("setCurrencyCode", str3);
                }
                AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str3);
                return null;
            case 9:
                AFa1ySDK aFa1ySDK5 = (AFa1ySDK) objArr[0];
                AFe1aSDK aFe1aSDK = new AFe1aSDK((AFi1hSDK) objArr[1], aFa1ySDK5.getMonetizationNetwork().AFAdRevenueData(), aFa1ySDK5.getMonetizationNetwork(), aFa1ySDK5.getMonetizationNetwork().component3(), aFa1ySDK5.getMonetizationNetwork().AFInAppEventParameterName());
                AFe1oSDK aFe1oSDKCopydefault = aFa1ySDK5.getMonetizationNetwork().copydefault();
                aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new AnonymousClass1(aFe1aSDK));
                i = (AFKeystoreWrapper + 77) % 128;
                return null;
            case 10:
                return areAllFieldsValid(objArr);
            case 11:
                return component3(objArr);
            case 12:
                AFa1ySDK aFa1ySDK6 = (AFa1ySDK) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                aFa1ySDK6.AFAdRevenueData((Context) objArr[2]);
                final AFd1zSDK monetizationNetwork = aFa1ySDK6.getMonetizationNetwork();
                monetizationNetwork.AFInAppEventType().getMonetizationNetwork(zBooleanValue);
                monetizationNetwork.getMonetizationNetwork().submit(new Runnable() { // from class: com.appsflyer.internal.competently
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFa1ySDK.getMediationNetwork(monetizationNetwork);
                    }
                });
                if (zBooleanValue) {
                    AFKeystoreWrapper = (i + 81) % 128;
                    monetizationNetwork.component4().AFAdRevenueData("is_stop_tracking_used", true);
                    i = (AFKeystoreWrapper + 73) % 128;
                }
                return null;
            case 13:
                return component1(objArr);
            case 14:
                AFd1zSDK aFd1zSDK = (AFd1zSDK) objArr[0];
                AFKeystoreWrapper = (i + 79) % 128;
                aFd1zSDK.registerClient().getRevenue();
                i = (AFKeystoreWrapper + 121) % 128;
                return null;
            case 15:
                return component4(objArr);
            case 16:
                return component2(objArr);
            case 17:
                AFa1ySDK aFa1ySDK7 = (AFa1ySDK) objArr[0];
                Context context2 = (Context) objArr[1];
                int i9 = AFKeystoreWrapper;
                i = (i9 + 69) % 128;
                if (context2 instanceof Activity) {
                    return new AFh1qSDK((Activity) context2, aFa1ySDK7.getMonetizationNetwork().w());
                }
                i = (i9 + 105) % 128;
                return null;
            case 18:
                AFa1ySDK aFa1ySDK8 = (AFa1ySDK) objArr[0];
                Context context3 = (Context) objArr[1];
                String str4 = (String) objArr[2];
                aFa1ySDK8.AFAdRevenueData(context3);
                AFg1sSDK aFg1sSDK = new AFg1sSDK(context3);
                if (str4 == null || str4.trim().isEmpty()) {
                    AFLogger.INSTANCE.w(AFg1cSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
                    return null;
                }
                AFLogger.INSTANCE.i(AFg1cSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str4));
                AFf1aSDK revenue = aFg1sSDK.getRevenue();
                if (revenue == null || !str4.equals(revenue.getRevenue)) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (revenue != null && jCurrentTimeMillis - revenue.getMonetizationNetwork <= TimeUnit.SECONDS.toMillis(2L)) {
                        z = false;
                    }
                    AFf1aSDK aFf1aSDK = new AFf1aSDK(str4, jCurrentTimeMillis, !z);
                    aFg1sSDK.getCurrencyIso4217Code.getRevenue("afUninstallToken", aFf1aSDK.getRevenue);
                    aFg1sSDK.getCurrencyIso4217Code.AFAdRevenueData("afUninstallToken_received_time", aFf1aSDK.getMonetizationNetwork);
                    aFg1sSDK.getCurrencyIso4217Code.AFAdRevenueData("afUninstallToken_queued", aFf1aSDK.getMediationNetwork);
                    if (z) {
                        AFd1zSDK monetizationNetwork2 = getRevenue().getMonetizationNetwork();
                        AFf1oSDK aFf1oSDK = new AFf1oSDK(str4, monetizationNetwork2);
                        AFe1oSDK aFe1oSDKCopydefault2 = monetizationNetwork2.copydefault();
                        aFe1oSDKCopydefault2.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault2.new AnonymousClass1(aFf1oSDK));
                    }
                }
                return null;
            case 19:
                return copy(objArr);
            case 20:
                AFa1ySDK aFa1ySDK9 = (AFa1ySDK) objArr[0];
                Context context4 = (Context) objArr[1];
                AFj1gSDK aFj1gSDK = new AFj1gSDK((Intent) objArr[2]);
                if (aFj1gSDK.AFAdRevenueData("appsflyer_preinstall") != null) {
                    AFKeystoreWrapper = (i + 105) % 128;
                    getRevenue(new Object[]{aFj1gSDK.AFAdRevenueData("appsflyer_preinstall")}, -374487647, 374487663, (int) System.currentTimeMillis());
                    AFKeystoreWrapper = (i + 29) % 128;
                }
                AFLogger.afInfoLog("****** onReceive called *******");
                AppsFlyerProperties.getInstance();
                String strAFAdRevenueData = aFj1gSDK.AFAdRevenueData("referrer");
                AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(strAFAdRevenueData)));
                if (strAFAdRevenueData != null) {
                    aFa1ySDK9.getMonetizationNetwork(context4).getRevenue("referrer", strAFAdRevenueData);
                    AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                    appsFlyerProperties.set("AF_REFERRER", strAFAdRevenueData);
                    appsFlyerProperties.getRevenue = strAFAdRevenueData;
                    if (AppsFlyerProperties.getInstance().getMediationNetwork()) {
                        AFLogger.afInfoLog("onReceive: isLaunchCalled");
                        getRevenue(new Object[]{aFa1ySDK9, context4, AFh1tSDK.onReceive}, -268043806, 268043817, System.identityHashCode(aFa1ySDK9));
                        aFa1ySDK9.AFAdRevenueData(strAFAdRevenueData);
                    }
                }
                return null;
            case 21:
                AFa1ySDK aFa1ySDK10 = (AFa1ySDK) objArr[0];
                int i10 = AFKeystoreWrapper + 9;
                i = i10 % 128;
                if (i10 % 2 == 0) {
                    aFa1ySDK10.setSharingFilterForPartners("all");
                } else {
                    aFa1ySDK10.setSharingFilterForPartners("all");
                }
                return null;
            case 22:
                return copydefault(objArr);
            case 23:
                return hashCode(objArr);
            case 24:
                return equals(objArr);
            default:
                return getMediationNetwork(objArr);
        }
    }

    private static /* synthetic */ Object hashCode(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        i = (AFKeystoreWrapper + 93) % 128;
        aFa1ySDK.getMonetizationNetwork().copy().getRevenue("setCollectOaid", String.valueOf(zBooleanValue));
        getMediationNetwork(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(zBooleanValue));
        int i2 = i + 89;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final void AFAdRevenueData(Context context) {
        int i2 = (i + 27) % 128;
        AFKeystoreWrapper = i2;
        AFc1bSDK aFc1bSDK = this.copy;
        if (context != null) {
            int i3 = i2 + 101;
            i = i3 % 128;
            if (i3 % 2 == 0) {
                AFc1hSDK aFc1hSDK = aFc1bSDK.getCurrencyIso4217Code;
                throw null;
            }
            aFc1bSDK.getCurrencyIso4217Code.getMonetizationNetwork = context.getApplicationContext();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i2 = AFKeystoreWrapper + 83;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            getMonetizationNetwork().i().getRevenue.contains(Arrays.asList(strArr));
            throw null;
        }
        List<String> listAsList = Arrays.asList(strArr);
        List<List<String>> list = getMonetizationNetwork().i().getRevenue;
        if (!list.contains(listAsList)) {
            list.add(listAsList);
        }
        int i3 = AFKeystoreWrapper + 97;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        int i2 = i + 91;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            AFd1oSDK aFd1oSDKCopy = getMonetizationNetwork().copy();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z);
            aFd1oSDKCopy.getRevenue("anonymizeUser", strArr);
        } else {
            getMonetizationNetwork().copy().getRevenue("anonymizeUser", String.valueOf(z));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
        int i3 = i + 35;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i2 = AFKeystoreWrapper + 53;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            AFa1mSDK aFa1mSDKI = getMonetizationNetwork().i();
            aFa1mSDKI.getMonetizationNetwork = str;
            aFa1mSDKI.getMediationNetwork = map;
            int i3 = 47 / 0;
        } else {
            AFa1mSDK aFa1mSDKI2 = getMonetizationNetwork().i();
            aFa1mSDKI2.getMonetizationNetwork = str;
            aFa1mSDKI2.getMediationNetwork = map;
        }
        AFKeystoreWrapper = (i + 113) % 128;
    }

    public final void b_(Context context, Intent intent) {
        getRevenue(new Object[]{this, context, intent}, -1498667330, 1498667350, System.identityHashCode(this));
    }

    public final void component1() {
        int i2;
        if (AFe1bSDK.component3()) {
            i2 = AFKeystoreWrapper + 107;
        } else {
            AFd1zSDK monetizationNetwork = getMonetizationNetwork();
            AFe1oSDK aFe1oSDKCopydefault = monetizationNetwork.copydefault();
            aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new AnonymousClass1(new AFe1bSDK(monetizationNetwork)));
            i2 = AFKeystoreWrapper + 13;
        }
        i = i2 % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void disableAppSetId() {
        i = (AFKeystoreWrapper + 87) % 128;
        getMonetizationNetwork().force().areAllFieldsValid = true;
        i = (AFKeystoreWrapper + 111) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z) {
        i = (AFKeystoreWrapper + 69) % 128;
        getMonetizationNetwork().e().getCurrencyIso4217Code(z);
        i = (AFKeystoreWrapper + 75) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z) {
        int i2 = AFKeystoreWrapper + 43;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z));
            int i3 = 6 / 0;
        } else {
            getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z));
        }
        AFKeystoreWrapper = (i + 39) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(Context context) {
        getMonetizationNetwork().copy().getRevenue("getAppsFlyerUID", new String[0]);
        if (context == null) {
            int i2 = AFKeystoreWrapper + 45;
            i = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 58 / 0;
            }
            return null;
        }
        AFAdRevenueData(context);
        String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(getMonetizationNetwork().AFAdRevenueData().getMediationNetwork);
        int i4 = i + 117;
        AFKeystoreWrapper = i4 % 128;
        if (i4 % 2 == 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        AFKeystoreWrapper = (i + 21) % 128;
        AFAdRevenueData(context);
        String strAFAdRevenueData = getMonetizationNetwork().AFAdRevenueData().AFAdRevenueData(context);
        int i2 = i + 19;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
        return strAFAdRevenueData;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        int i2 = i + 29;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            return getMonetizationNetwork().AFKeystoreWrapper().AFAdRevenueData();
        }
        int i3 = 24 / 0;
        return getMonetizationNetwork().AFKeystoreWrapper().AFAdRevenueData();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        int i2 = i + 17;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            return getMonetizationNetwork().AFKeystoreWrapper().getCurrencyIso4217Code();
        }
        getMonetizationNetwork().AFKeystoreWrapper().getCurrencyIso4217Code();
        throw null;
    }

    public final AFd1zSDK getMonetizationNetwork() {
        int i2 = (i + 91) % 128;
        AFKeystoreWrapper = i2;
        AFc1bSDK aFc1bSDK = this.copy;
        i = (i2 + 109) % 128;
        return aFc1bSDK;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            int i2 = AFKeystoreWrapper + 99;
            i = i2 % 128;
            if (i2 % 2 != 0) {
                return string;
            }
            throw null;
        }
        String currencyIso4217Code = getCurrencyIso4217Code(context, "AF_STORE");
        if (currencyIso4217Code != null) {
            i = (AFKeystoreWrapper + 51) % 128;
            return currencyIso4217Code;
        }
        AFLogger.afInfoLog("No out-of-store value set");
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        int i2 = i + 9;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            getMonetizationNetwork().copy().getRevenue("getSdkVersion", new String[1]);
        } else {
            getMonetizationNetwork().copy().getRevenue("getSdkVersion", new String[0]);
        }
        String strComponent4 = AFc1oSDK.component4();
        AFKeystoreWrapper = (i + 87) % 128;
        return strComponent4;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        String str2;
        if (this.hashCode) {
            AFKeystoreWrapper = (i + 123) % 128;
            return this;
        }
        this.hashCode = true;
        getMonetizationNetwork().AFInAppEventType().AFAdRevenueData(str);
        if (context != null) {
            AFAdRevenueData(context);
            Application applicationO_ = AFj1kSDK.O_(context);
            if (applicationO_ == null) {
                return this;
            }
            int i2 = i;
            int i3 = i2 + 77;
            AFKeystoreWrapper = i3 % 128;
            if (i3 % 2 != 0) {
                this.component2 = applicationO_;
                throw null;
            }
            this.component2 = applicationO_;
            AFKeystoreWrapper = (i2 + 91) % 128;
            getMonetizationNetwork().getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.dern
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17372kowloon.copy();
                }
            });
            AFe1oSDK aFe1oSDKCopydefault = getMonetizationNetwork().copydefault();
            aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new AnonymousClass1(new AFe1eSDK(getMonetizationNetwork())));
            getMonetizationNetwork().afErrorLogForExcManagerOnly().getMonetizationNetwork(new AFd1xSDK.AFa1vSDK() { // from class: com.appsflyer.internal.wireman
                @Override // com.appsflyer.internal.AFd1xSDK.AFa1vSDK
                public final void onConfigurationChanged(boolean z) {
                    this.f17413attabal.getMediationNetwork(z);
                }
            });
            getMonetizationNetwork().component1().AFAdRevenueData(AFAdRevenueData());
            AFj1sSDK aFj1sSDKAFLogger = getMonetizationNetwork().AFLogger();
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.marial
                @Override // java.lang.Runnable
                public final void run() throws UnsupportedEncodingException {
                    this.f17386kowloon.equals();
                }
            };
            AFi1aSDK currencyIso4217Code = aFj1sSDKAFLogger.getCurrencyIso4217Code(runnable);
            Runnable runnableAFAdRevenueData = aFj1sSDKAFLogger.AFAdRevenueData(currencyIso4217Code, runnable);
            aFj1sSDKAFLogger.getRevenue.add(currencyIso4217Code);
            aFj1sSDKAFLogger.getRevenue.add(new AFj1oSDK(aFj1sSDKAFLogger.getCurrencyIso4217Code.AFAdRevenueData(), runnableAFAdRevenueData));
            aFj1sSDKAFLogger.getRevenue.add(new AFj1wSDK(runnableAFAdRevenueData, aFj1sSDKAFLogger.getCurrencyIso4217Code, new AFj1xSDK()));
            aFj1sSDKAFLogger.getRevenue.add(new AFj1mSDK(runnableAFAdRevenueData, aFj1sSDKAFLogger.getCurrencyIso4217Code));
            aFj1sSDKAFLogger.getRevenue.add(new AFj1rSDK(aFj1sSDKAFLogger.getCurrencyIso4217Code.getMonetizationNetwork(), aFj1sSDKAFLogger.getCurrencyIso4217Code.AFAdRevenueData(), runnableAFAdRevenueData));
            aFj1sSDKAFLogger.getMediationNetwork(runnableAFAdRevenueData);
            for (AFj1tSDK aFj1tSDK : (AFj1tSDK[]) aFj1sSDKAFLogger.getRevenue.toArray(new AFj1tSDK[0])) {
                aFj1tSDK.getMonetizationNetwork(aFj1sSDKAFLogger.getCurrencyIso4217Code.AFInAppEventParameterName().getMonetizationNetwork);
            }
            if (!aFj1sSDKAFLogger.getCurrencyIso4217Code()) {
                AFKeystoreWrapper = (i + 67) % 128;
                aFj1sSDKAFLogger.getRevenue(aFj1sSDKAFLogger.getCurrencyIso4217Code.AFInAppEventParameterName().getMonetizationNetwork, runnableAFAdRevenueData, aFj1sSDKAFLogger.getCurrencyIso4217Code);
            }
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        AFd1oSDK aFd1oSDKCopy = getMonetizationNetwork().copy();
        if (appsFlyerConversionListener == null) {
            AFKeystoreWrapper = (i + 87) % 128;
            str2 = "null";
        } else {
            str2 = "conversionDataListener";
        }
        aFd1oSDKCopy.getRevenue(X3.a.f, str, str2);
        AFLogger.INSTANCE.force(AFg1cSDK.GENERAL, String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.17.5", getMonetizationNetwork));
        this.getRevenue = appsFlyerConversionListener;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        int i2 = i + 77;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            AFAdRevenueData(context);
            return getMonetizationNetwork().AFAdRevenueData().getMonetizationNetwork(context);
        }
        AFAdRevenueData(context);
        getMonetizationNetwork().AFAdRevenueData().getMonetizationNetwork(context);
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        boolean currencyIso4217Code;
        int i2 = i + 123;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            currencyIso4217Code = getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code();
            int i3 = 45 / 0;
        } else {
            currencyIso4217Code = getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code();
        }
        i = (AFKeystoreWrapper + 55) % 128;
        return currencyIso4217Code;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logAdRevenue(AFAdRevenueData aFAdRevenueData, Map<String, Object> map) throws UnsupportedEncodingException {
        if (!this.hashCode) {
            getRevenue("logAdRevenue");
            return;
        }
        if (!aFAdRevenueData.areAllFieldsValid()) {
            i = (AFKeystoreWrapper + 91) % 128;
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
        } else if (getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code()) {
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "SDK is stopped");
        } else if (!AFk1wSDK.getMonetizationNetwork(getMonetizationNetwork().AFInAppEventType().getMediationNetwork())) {
            AFAdRevenueData(new AFh1lSDK(aFAdRevenueData, map));
        } else {
            i = (AFKeystoreWrapper + 23) % 128;
            getRevenue(new Object[0], -516060765, 516060769, (int) System.currentTimeMillis());
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i2 = i + 87;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            logEvent(context, str, map, null);
            throw null;
        }
        logEvent(context, str, map, null);
        int i3 = AFKeystoreWrapper + 27;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d, double d2) throws UnsupportedEncodingException {
        getMonetizationNetwork().copy().getRevenue("logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap map = new HashMap();
        map.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d2));
        map.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        AFAdRevenueData(context, AFInAppEventType.LOCATION_COORDINATES, map);
        AFKeystoreWrapper = (i + 3) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) throws UnsupportedEncodingException {
        i = (AFKeystoreWrapper + 15) % 128;
        getMonetizationNetwork().copy().getRevenue("logSession", new String[0]);
        getMonetizationNetwork().copy().getCurrencyIso4217Code();
        getRevenue(new Object[]{this, context, AFh1tSDK.logSession}, -268043806, 268043817, System.identityHashCode(this));
        AFAdRevenueData(context, null, null);
        int i2 = AFKeystoreWrapper + 33;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 69 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        getRevenue(new Object[]{this, context}, 537134056, -537134032, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(Context context, URI uri) {
        if (uri != null) {
            AFKeystoreWrapper = (i + 5) % 128;
            if (!uri.toString().isEmpty()) {
                if (context == null) {
                    AFa1mSDK aFa1mSDKI = getMonetizationNetwork().i();
                    StringBuilder sb = new StringBuilder("Context is \"");
                    sb.append(context);
                    sb.append("\"");
                    aFa1mSDKI.getMediationNetwork(sb.toString(), DeepLinkResult.Error.NETWORK);
                    return;
                }
                AFAdRevenueData(context);
                getMonetizationNetwork().i().g_(AFa1jSDK.getMediationNetwork(getMonetizationNetwork().afVerboseLog()), Uri.parse(uri.toString()));
                int i2 = i + 73;
                AFKeystoreWrapper = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
        }
        AFa1mSDK aFa1mSDKI2 = getMonetizationNetwork().i();
        StringBuilder sb2 = new StringBuilder("Link is \"");
        sb2.append(uri);
        sb2.append("\"");
        aFa1mSDKI2.getMediationNetwork(sb2.toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(final Intent intent, Context context) {
        if (intent == null) {
            AFKeystoreWrapper = (i + 15) % 128;
            getMonetizationNetwork().i().getMediationNetwork("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (context == null) {
            int i2 = i + 115;
            AFKeystoreWrapper = i2 % 128;
            if (i2 % 2 == 0) {
                getMonetizationNetwork().i().getMediationNetwork("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            } else {
                getMonetizationNetwork().i().getMediationNetwork("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                throw null;
            }
        }
        final Context applicationContext = context.getApplicationContext();
        AFAdRevenueData(applicationContext);
        getMonetizationNetwork().getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.beachfront
            @Override // java.lang.Runnable
            public final void run() {
                this.f17365kowloon.e_(applicationContext, intent);
            }
        });
        int i3 = i + 121;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        AFKeystoreWrapper = (i + 23) % 128;
        getMonetizationNetwork().copy().getRevenue("registerConversionListener", new String[0]);
        getRevenue(appsFlyerConversionListener);
        i = (AFKeystoreWrapper + 77) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        com.appsflyer.internal.AFa1ySDK.getCurrencyIso4217Code = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("registerValidatorListener null listener");
        com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = (com.appsflyer.internal.AFa1ySDK.i + 113) % 128;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void registerValidatorListener(android.content.Context r4, com.appsflyer.AppsFlyerInAppPurchaseValidatorListener r5) {
        /*
            r3 = this;
            int r4 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper
            int r4 = r4 + 7
            int r0 = r4 % 128
            com.appsflyer.internal.AFa1ySDK.i = r0
            int r4 = r4 % 2
            java.lang.String r0 = "registerValidatorListener called"
            java.lang.String r1 = "registerValidatorListener"
            if (r4 != 0) goto L24
            com.appsflyer.internal.AFd1zSDK r4 = r3.getMonetizationNetwork()
            com.appsflyer.internal.AFd1oSDK r4 = r4.copy()
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r4.getRevenue(r1, r2)
            com.appsflyer.AFLogger.afDebugLog(r0)
            if (r5 != 0) goto L45
            goto L37
        L24:
            com.appsflyer.internal.AFd1zSDK r4 = r3.getMonetizationNetwork()
            com.appsflyer.internal.AFd1oSDK r4 = r4.copy()
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            r4.getRevenue(r1, r2)
            com.appsflyer.AFLogger.afDebugLog(r0)
            if (r5 != 0) goto L45
        L37:
            java.lang.String r4 = "registerValidatorListener null listener"
            com.appsflyer.AFLogger.afDebugLog(r4)
            int r4 = com.appsflyer.internal.AFa1ySDK.i
            int r4 = r4 + 113
            int r4 = r4 % 128
            com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = r4
            return
        L45:
            com.appsflyer.internal.AFa1ySDK.getCurrencyIso4217Code = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1ySDK.registerValidatorListener(android.content.Context, com.appsflyer.AppsFlyerInAppPurchaseValidatorListener):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        getRevenue(new Object[]{this, context, map, purchaseValidationCallback}, 1567165248, -1567165246, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFKeystoreWrapper = (i + 63) % 128;
        AFAdRevenueData(context);
        PurchaseHandler purchaseHandlerComponent2 = getMonetizationNetwork().component2();
        if (purchaseHandlerComponent2.getRevenue(map, purchaseValidationCallback, BillingClient.FeatureType.SUBSCRIPTIONS)) {
            AFe1kSDK aFe1kSDK = new AFe1kSDK(map, purchaseValidationCallback, purchaseHandlerComponent2.AFAdRevenueData);
            AFe1oSDK aFe1oSDK = purchaseHandlerComponent2.getCurrencyIso4217Code;
            aFe1oSDK.getCurrencyIso4217Code.execute(aFe1oSDK.new AnonymousClass1(aFe1kSDK));
            AFKeystoreWrapper = (i + 43) % 128;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0175  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPushNotificationData(Activity activity) {
        long j;
        long jLongValue;
        if (activity != null && activity.getIntent() != null) {
            AFd1oSDK aFd1oSDKCopy = getMonetizationNetwork().copy();
            String localClassName = activity.getLocalClassName();
            StringBuilder sb = new StringBuilder("activity_intent_");
            sb.append(activity.getIntent().toString());
            aFd1oSDKCopy.getRevenue("sendPushNotificationData", localClassName, sb.toString());
        } else if (activity != null) {
            i = (AFKeystoreWrapper + 55) % 128;
            getMonetizationNetwork().copy().getRevenue("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
        } else {
            getMonetizationNetwork().copy().getRevenue("sendPushNotificationData", "activity_null");
            i = (AFKeystoreWrapper + 119) % 128;
        }
        AFc1eSDK aFc1eSDKForce = getMonetizationNetwork().force();
        String revenue = getRevenue(activity);
        aFc1eSDKForce.getMonetizationNetwork = revenue;
        if (revenue != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.copydefault == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.copydefault = new ConcurrentHashMap();
                jLongValue = jCurrentTimeMillis;
                j = jLongValue;
            } else {
                try {
                    long j2 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                    jLongValue = jCurrentTimeMillis;
                    for (Long l : this.copydefault.keySet()) {
                        try {
                            JSONObject jSONObject = new JSONObject(aFc1eSDKForce.getMonetizationNetwork);
                            JSONObject jSONObject2 = new JSONObject(this.copydefault.get(l));
                            j = jCurrentTimeMillis;
                            try {
                                if (jSONObject.opt("pid").equals(jSONObject2.opt("pid")) && jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                    StringBuilder sb2 = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
                                    sb2.append(jSONObject2);
                                    sb2.append(", new: ");
                                    sb2.append(jSONObject);
                                    sb2.append(")");
                                    AFLogger.afInfoLog(sb2.toString());
                                    aFc1eSDKForce.getMonetizationNetwork = null;
                                    return;
                                }
                                if (j - l.longValue() > j2) {
                                    AFKeystoreWrapper = (i + 69) % 128;
                                    this.copydefault.remove(l);
                                }
                                if (l.longValue() <= jLongValue) {
                                    jLongValue = l.longValue();
                                }
                                jCurrentTimeMillis = j;
                            } catch (Throwable th) {
                                th = th;
                                StringBuilder sb3 = new StringBuilder("Error while handling push notification measurement: ");
                                sb3.append(th.getClass().getSimpleName());
                                AFLogger.afErrorLog(sb3.toString(), th);
                                if (this.copydefault.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                                    StringBuilder sb4 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                                    sb4.append(jLongValue);
                                    sb4.append(")");
                                    AFLogger.afInfoLog(sb4.toString());
                                    this.copydefault.remove(Long.valueOf(jLongValue));
                                }
                                this.copydefault.put(Long.valueOf(j), aFc1eSDKForce.getMonetizationNetwork);
                                start(activity);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j = jCurrentTimeMillis;
                        }
                    }
                    j = jCurrentTimeMillis;
                } catch (Throwable th3) {
                    th = th3;
                    j = jCurrentTimeMillis;
                    jLongValue = j;
                }
            }
            if (this.copydefault.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                StringBuilder sb5 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                sb5.append(jLongValue);
                sb5.append(")");
                AFLogger.afInfoLog(sb5.toString());
                this.copydefault.remove(Long.valueOf(jLongValue));
            }
            this.copydefault.put(Long.valueOf(j), aFc1eSDKForce.getMonetizationNetwork);
            start(activity);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        int i2 = i + 81;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 94 / 0;
            if (map != null) {
                getMonetizationNetwork().copy().getRevenue("setAdditionalData", map.toString());
                AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
            }
        } else if (map != null) {
            getMonetizationNetwork().copy().getRevenue("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
        }
        AFKeystoreWrapper = (i + 43) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        i = (AFKeystoreWrapper + 23) % 128;
        getMonetizationNetwork().copy().getRevenue("setAndroidIdData", str);
        getMonetizationNetwork().force().getCurrencyIso4217Code = str;
        AFKeystoreWrapper = (i + 29) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i2 = i + 3;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            getMonetizationNetwork().copy().getRevenue("setAppId", str);
        } else {
            getMonetizationNetwork().copy().getRevenue("setAppId", str);
        }
        getMediationNetwork("appid", str);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0038  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) {
        getMonetizationNetwork().copy().getRevenue("setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str != null) {
            i = (AFKeystoreWrapper + 13) % 128;
            if (!str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
                AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
                AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
                AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
                AFKeystoreWrapper = (i + 101) % 128;
            }
        } else {
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
            AFKeystoreWrapper = (i + 101) % 128;
        }
        getMediationNetwork(AppsFlyerProperties.ONELINK_ID, str);
        i = (AFKeystoreWrapper + 9) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) {
        AFKeystoreWrapper = (i + 57) % 128;
        getMonetizationNetwork().copy().getRevenue("setCollectAndroidID", String.valueOf(z));
        getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
        i = (AFKeystoreWrapper + 13) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z) {
        getRevenue(new Object[]{this, Boolean.valueOf(z)}, -312979490, 312979496, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z) {
        getRevenue(new Object[]{this, Boolean.valueOf(z)}, -1241724786, 1241724809, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(AppsFlyerConsent appsFlyerConsent) {
        int i2 = i + 41;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            Objects.requireNonNull(appsFlyerConsent);
            getMonetizationNetwork().force().component1 = appsFlyerConsent;
        } else {
            Objects.requireNonNull(appsFlyerConsent);
            getMonetizationNetwork().force().component1 = appsFlyerConsent;
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        getRevenue(new Object[]{this, str}, -1717702056, 1717702064, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) throws UnsupportedEncodingException {
        int i2 = (AFKeystoreWrapper + 41) % 128;
        i = i2;
        if (context != null) {
            AFKeystoreWrapper = (i2 + 35) % 128;
            if (!getCurrencyIso4217Code()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                return;
            }
            setCustomerUserId(str);
            StringBuilder sb = new StringBuilder("CustomerUserId set: ");
            sb.append(str);
            sb.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(getMonetizationNetwork().component4());
            getRevenue(new Object[]{this, context, AFh1tSDK.setCustomerIdAndLogSession}, -268043806, 268043817, System.identityHashCode(this));
            getMonetizationNetwork().AFInAppEventType().getMediationNetwork();
            if (referrer == null) {
                referrer = "";
            }
            if (context instanceof Activity) {
                ((Activity) context).getIntent();
            }
            getRevenue(context, referrer);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        i = (AFKeystoreWrapper + 53) % 128;
        getMonetizationNetwork().copy().getRevenue("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getMediationNetwork(AppsFlyerProperties.APP_USER_ID, str);
        getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.FALSE}, -1569798316, 1569798326, (int) System.currentTimeMillis());
        int i2 = AFKeystoreWrapper + 117;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z) {
        getRevenue(new Object[]{this, Boolean.valueOf(z)}, -451136324, 451136331, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z) {
        boolean z2;
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
        if (z) {
            z2 = false;
        } else {
            i = (AFKeystoreWrapper + 39) % 128;
            z2 = true;
        }
        AFb1lSDK.AFAdRevenueData = Boolean.valueOf(z2);
        AFd1zSDK monetizationNetwork = getMonetizationNetwork();
        monetizationNetwork.force().component2 = z;
        if (!z) {
            AFe1oSDK aFe1oSDKCopydefault = monetizationNetwork.copydefault();
            aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new AnonymousClass1(new AFe1eSDK(getMonetizationNetwork())));
        } else {
            monetizationNetwork.force().component3 = null;
            int i2 = AFKeystoreWrapper + 25;
            i = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z) {
        i = (AFKeystoreWrapper + 111) % 128;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
        getRevenue(new Object[]{AppsFlyerProperties.DISABLE_NETWORK_DATA, Boolean.valueOf(z)}, -1569798316, 1569798326, (int) System.currentTimeMillis());
        int i2 = i + 103;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        AFKeystoreWrapper = (i + 23) % 128;
        getMonetizationNetwork().copy().getRevenue("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i2 = AFKeystoreWrapper + 123;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 71 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        String strTrim;
        if (AFk1wSDK.getCurrencyIso4217Code(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        if (str != null) {
            strTrim = str.trim();
            AFKeystoreWrapper = (i + 21) % 128;
        } else {
            strTrim = "";
        }
        AFe1vSDK.getMonetizationNetwork(new AFe1ySDK(strTrim, str2.trim()));
        AFKeystoreWrapper = (i + 63) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i2 = AFKeystoreWrapper + 57;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            getMonetizationNetwork().copy().getRevenue("setImeiData", str);
            AFf1eSDK aFf1eSDKAFInAppEventType = getMonetizationNetwork().AFInAppEventType();
            AFf1eSDK.getCurrencyIso4217Code(new Object[]{aFf1eSDKAFInAppEventType, str}, -1410448561, 1410448563, System.identityHashCode(aFf1eSDKAFInAppEventType));
        } else {
            getMonetizationNetwork().copy().getRevenue("setImeiData", str);
            AFf1eSDK aFf1eSDKAFInAppEventType2 = getMonetizationNetwork().AFInAppEventType();
            AFf1eSDK.getCurrencyIso4217Code(new Object[]{aFf1eSDKAFInAppEventType2, str}, -1410448561, 1410448563, System.identityHashCode(aFf1eSDKAFInAppEventType2));
        }
        i = (AFKeystoreWrapper + 31) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setInstallId(String str) {
        getMonetizationNetwork().copy().getRevenue("setInstallId", new String[0]);
        if (!this.hashCode) {
            i = (AFKeystoreWrapper + 1) % 128;
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyerLib.init() method should be called first");
            return;
        }
        if (!getMonetizationNetwork().AFAdRevenueData().getMediationNetwork("APPSFLYER_ALLOW_CUSTOM_INSTALL_ID")) {
            i = (AFKeystoreWrapper + 47) % 128;
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first");
            AFKeystoreWrapper = (i + 109) % 128;
        } else if (str == null) {
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyer installId can't be null");
            AFKeystoreWrapper = (i + 75) % 128;
        } else {
            AFb1kSDK.getCurrencyIso4217Code(str, getMonetizationNetwork().component4());
            i = (AFKeystoreWrapper + 41) % 128;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        AFKeystoreWrapper = (i + 87) % 128;
        getMonetizationNetwork().copy().getRevenue("setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
        AFKeystoreWrapper = (i + 57) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        boolean z = false;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            int i2 = i + 79;
            AFKeystoreWrapper = i2 % 128;
            if (i2 % 2 == 0) {
                z = true;
            }
        }
        getMonetizationNetwork().copy().getRevenue("log", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (z) {
            getMonetizationNetwork().afInfoLog().areAllFieldsValid();
            return;
        }
        int i3 = AFKeystoreWrapper + 27;
        i = i3 % 128;
        if (i3 % 2 != 0) {
            getMonetizationNetwork().afInfoLog().getMonetizationNetwork();
        } else {
            getMonetizationNetwork().afInfoLog().getMonetizationNetwork();
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i2) {
        int i3 = i + 65;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            this.component4 = TimeUnit.SECONDS.toMillis(i2);
            throw null;
        }
        this.component4 = TimeUnit.SECONDS.toMillis(i2);
        int i4 = AFKeystoreWrapper + 15;
        i = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        AFKeystoreWrapper = (i + 77) % 128;
        getMonetizationNetwork().copy().getRevenue("setOaidData", str);
        AFb1lSDK.getMonetizationNetwork = str;
        int i2 = i + 85;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        i = (AFKeystoreWrapper + 85) % 128;
        AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
        getMonetizationNetwork().i().component3 = strArr;
        int i2 = AFKeystoreWrapper + 103;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        i = (AFKeystoreWrapper + 19) % 128;
        if (str == null) {
            AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
            return;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
        AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
        int i2 = i + 105;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(String str, Map<String, Object> map) {
        getRevenue(new Object[]{this, str, map}, 252063752, -252063751, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i2 = i + 13;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            getMonetizationNetwork().force().getMediationNetwork = AFj1dSDK.getCurrencyIso4217Code(str);
            int i3 = 11 / 0;
        } else {
            getMonetizationNetwork().force().getMediationNetwork = AFj1dSDK.getCurrencyIso4217Code(str);
        }
        AFKeystoreWrapper = (i + 25) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(PluginInfo pluginInfo) {
        AFKeystoreWrapper = (i + 3) % 128;
        Objects.requireNonNull(pluginInfo);
        getMonetizationNetwork().unregisterClient().getRevenue(pluginInfo);
        AFKeystoreWrapper = (i + 115) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Code duplicated, block: B:12:0x002c A[Catch: JSONException -> 0x001a, TRY_ENTER, TryCatch #0 {JSONException -> 0x001a, blocks: (B:5:0x0016, B:12:0x002c, B:13:0x0030, B:18:0x003f), top: B:27:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0030 A[Catch: JSONException -> 0x001a, TRY_LEAVE, TryCatch #0 {JSONException -> 0x001a, blocks: (B:5:0x0016, B:12:0x002c, B:13:0x0030, B:18:0x003f), top: B:27:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        int i2;
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            AFKeystoreWrapper = (i + 115) % 128;
            try {
                jSONObject.put("pid", str);
                if (str2 != null) {
                    i2 = AFKeystoreWrapper + 117;
                    i = i2 % 128;
                    if (i2 % 2 != 0) {
                        jSONObject.put("c", str2);
                        throw null;
                    }
                    jSONObject.put("c", str2);
                }
                if (str3 != null) {
                    i = (AFKeystoreWrapper + 93) % 128;
                    jSONObject.put("af_siteid", str3);
                }
            } catch (JSONException e) {
                AFLogger.afErrorLog(e.getMessage(), e);
            }
        } else {
            if (str2 != null) {
                i2 = AFKeystoreWrapper + 117;
                i = i2 % 128;
                if (i2 % 2 != 0) {
                    jSONObject.put("c", str2);
                    throw null;
                }
                jSONObject.put("c", str2);
            }
            if (str3 != null) {
                i = (AFKeystoreWrapper + 93) % 128;
                jSONObject.put("af_siteid", str3);
            }
        }
        if (jSONObject.has("pid")) {
            getMediationNetwork("preInstallName", jSONObject.toString());
        } else {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        AFKeystoreWrapper = (i + 25) % 128;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFa1mSDK aFa1mSDKI = getMonetizationNetwork().i();
        aFa1mSDKI.component1.clear();
        aFa1mSDKI.component1.addAll(Arrays.asList(strArr));
        int i2 = AFKeystoreWrapper + 85;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(String... strArr) {
        getRevenue(new Object[]{this, strArr}, 1586087259, -1586087256, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        getRevenue(new Object[]{this}, -1362959156, 1362959177, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        getMonetizationNetwork().force().getRevenue = new AFb1tSDK(strArr);
        AFKeystoreWrapper = (i + 39) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i2 = i + 61;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            getMonetizationNetwork().copy().getRevenue("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            int i3 = 44 / 0;
        } else {
            getMonetizationNetwork().copy().getRevenue("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        }
        i = (AFKeystoreWrapper + 71) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        int i2 = AFKeystoreWrapper + 39;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            start(context, null);
            throw null;
        }
        start(context, null);
        int i3 = i + 7;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) {
        getRevenue(new Object[]{this, Boolean.valueOf(z), context}, -1981102572, 1981102584, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        i = (AFKeystoreWrapper + 27) % 128;
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        i = (AFKeystoreWrapper + 45) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        AFKeystoreWrapper = (i + 91) % 128;
        getMonetizationNetwork().copy().getRevenue("unregisterConversionListener", new String[0]);
        this.getRevenue = null;
        int i2 = AFKeystoreWrapper + 21;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 12 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        getRevenue(new Object[]{this, context, str}, -38035383, 38035401, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        getMonetizationNetwork().copy().getRevenue("validateAndTrackInAppPurchase", str, str2, str3, str4, str5, map == null ? "" : map.toString());
        if (!getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.PURCHASE_VALIDATION;
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str3);
            sb.append(" ");
            sb.append(str4);
            sb.append(" ");
            sb.append(str5);
            aFLogger.i(aFg1cSDK, sb.toString());
        }
        if (str != null && str4 != null) {
            int i2 = i + 105;
            int i3 = i2 % 128;
            AFKeystoreWrapper = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (str2 != null && str5 != null) {
                i = (i3 + 5) % 128;
                if (str3 != null) {
                    new Thread(new com.appsflyer.internal.AFa1zSDK(context.getApplicationContext(), getMonetizationNetwork().AFInAppEventType().getMediationNetwork(), str, str2, str3, str4, str5, map)).start();
                    return;
                }
            }
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = getCurrencyIso4217Code;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            int i4 = AFKeystoreWrapper + 91;
            i = i4 % 128;
            if (i4 % 2 != 0) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
            } else {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                throw null;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z) {
        int i2 = i + 67;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
            getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.valueOf(z)}, -1569798316, 1569798326, (int) System.currentTimeMillis());
        } else {
            AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
            getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.valueOf(z)}, -1569798316, 1569798326, (int) System.currentTimeMillis());
        }
    }

    private static void copydefault() {
        getRevenue(new Object[0], -516060765, 516060769, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004c A[PHI: r0
  0x004c: PHI (r0v5 com.appsflyer.PurchaseHandler) = (r0v4 com.appsflyer.PurchaseHandler), (r0v10 com.appsflyer.PurchaseHandler) binds: [B:8:0x004a, B:5:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        PurchaseHandler purchaseHandlerComponent2;
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        Context context = (Context) objArr[1];
        Map<String, Object> map = (Map) objArr[2];
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback = (PurchaseHandler.PurchaseValidationCallback) objArr[3];
        int i2 = i + 59;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            aFa1ySDK.AFAdRevenueData(context);
            purchaseHandlerComponent2 = aFa1ySDK.getMonetizationNetwork().component2();
            String[] strArr = new String[1];
            strArr[1] = "purchases";
            if (purchaseHandlerComponent2.getRevenue(map, purchaseValidationCallback, strArr)) {
                AFe1cSDK aFe1cSDK = new AFe1cSDK(map, purchaseValidationCallback, purchaseHandlerComponent2.AFAdRevenueData);
                AFe1oSDK aFe1oSDK = purchaseHandlerComponent2.getCurrencyIso4217Code;
                aFe1oSDK.getCurrencyIso4217Code.execute(aFe1oSDK.new AnonymousClass1(aFe1cSDK));
            }
        } else {
            aFa1ySDK.AFAdRevenueData(context);
            purchaseHandlerComponent2 = aFa1ySDK.getMonetizationNetwork().component2();
            if (purchaseHandlerComponent2.getRevenue(map, purchaseValidationCallback, "purchases")) {
                AFe1cSDK aFe1cSDK2 = new AFe1cSDK(map, purchaseValidationCallback, purchaseHandlerComponent2.AFAdRevenueData);
                AFe1oSDK aFe1oSDK2 = purchaseHandlerComponent2.getCurrencyIso4217Code;
                aFe1oSDK2.getCurrencyIso4217Code.execute(aFe1oSDK2.new AnonymousClass1(aFe1cSDK2));
            }
        }
        int i3 = AFKeystoreWrapper + 63;
        i = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final boolean getCurrencyIso4217Code() {
        if (getMediationNetwork(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID) && ((String) getRevenue(new Object[0], 131288073, -131288051, (int) System.currentTimeMillis())) == null) {
            i = (AFKeystoreWrapper + 123) % 128;
            return true;
        }
        i = (AFKeystoreWrapper + 41) % 128;
        return false;
    }

    public final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK, AFh1qSDK aFh1qSDK) throws UnsupportedEncodingException {
        getMediationNetwork(aFh1mSDK, aFh1qSDK);
        if (getMonetizationNetwork().AFInAppEventType().getMediationNetwork() == null) {
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener = aFh1mSDK.getCurrencyIso4217Code;
            if (appsFlyerRequestListener != null) {
                i = (AFKeystoreWrapper + 5) % 128;
                appsFlyerRequestListener.onError(41, "No dev key");
                return;
            }
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(getMonetizationNetwork().component4());
        if (referrer == null) {
            referrer = "";
        } else {
            i = (AFKeystoreWrapper + 65) % 128;
        }
        aFh1mSDK.component1 = referrer;
        AFAdRevenueData(aFh1mSDK);
    }

    private void areAllFieldsValid() {
        i = (AFKeystoreWrapper + 73) % 128;
        try {
            final AFi1hSDK aFi1hSDKAfErrorLog = getMonetizationNetwork().afErrorLog();
            if (aFi1hSDKAfErrorLog == null) {
                return;
            }
            if (aFi1hSDKAfErrorLog.getCurrencyIso4217Code()) {
                int i2 = i + 101;
                AFKeystoreWrapper = i2 % 128;
                if (i2 % 2 == 0) {
                    aFi1hSDKAfErrorLog.getMediationNetwork(new AFi1dSDK() { // from class: com.appsflyer.internal.attabal
                        @Override // com.appsflyer.internal.AFi1dSDK
                        public final void onRequestFinished() {
                            this.f17362attabal.AFAdRevenueData(aFi1hSDKAfErrorLog);
                        }
                    });
                    return;
                } else {
                    aFi1hSDKAfErrorLog.getMediationNetwork(new AFi1dSDK() { // from class: com.appsflyer.internal.attabal
                        @Override // com.appsflyer.internal.AFi1dSDK
                        public final void onRequestFinished() {
                            this.f17362attabal.AFAdRevenueData(aFi1hSDKAfErrorLog);
                        }
                    });
                    throw null;
                }
            }
            if (aFi1hSDKAfErrorLog.AFAdRevenueData()) {
                return;
            }
            getRevenue(new Object[]{this, aFi1hSDKAfErrorLog}, 608861720, -608861711, System.identityHashCode(this));
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Error at attempt to request PIA token", th);
            AFLogger.afRDLog("Get PIA token failed with exception:".concat(String.valueOf(th)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void equals() throws UnsupportedEncodingException {
        getMediationNetwork(new AFh1kSDK());
        AFKeystoreWrapper = (i + 81) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j) {
        int i2 = AFKeystoreWrapper + 89;
        i = i2 % 128;
        if (i2 % 2 != 0) {
            getMonetizationNetwork().i().getCurrencyIso4217Code = deepLinkListener;
            getMonetizationNetwork().i().component2 = j;
        } else {
            getMonetizationNetwork().i().getCurrencyIso4217Code = deepLinkListener;
            getMonetizationNetwork().i().component2 = j;
            throw null;
        }
    }

    private static boolean getMediationNetwork(String str) {
        i = (AFKeystoreWrapper + 51) % 128;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(str, false);
        int i2 = AFKeystoreWrapper + 117;
        i = i2 % 128;
        if (i2 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) throws UnsupportedEncodingException {
        HashMap map2 = map == null ? null : new HashMap(map);
        AFAdRevenueData(context);
        AFh1hSDK aFh1hSDK = new AFh1hSDK();
        aFh1hSDK.areAllFieldsValid = str;
        aFh1hSDK.getCurrencyIso4217Code = appsFlyerRequestListener;
        if (map2 != null && map2.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap map3 = new HashMap();
            Object obj = map2.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap map4 = new HashMap();
                map4.put("x", Float.valueOf(motionEvent.getX()));
                map4.put("y", Float.valueOf(motionEvent.getY()));
                map3.put("loc", map4);
                map3.put("pf", Float.valueOf(motionEvent.getPressure()));
                map3.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                map3.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(AFg1cSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> mapSingletonMap = Collections.singletonMap("tch_data", map3);
            map2.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1hSDK.AFAdRevenueData(mapSingletonMap);
        }
        aFh1hSDK.getRevenue = map2;
        AFd1oSDK aFd1oSDKCopy = getMonetizationNetwork().copy();
        Map map5 = aFh1hSDK.getRevenue;
        if (map5 == null) {
            map5 = new HashMap();
        }
        aFd1oSDKCopy.getRevenue("logEvent", str, new JSONObject(map5).toString());
        if (str == null) {
            getRevenue(new Object[]{this, context, AFh1tSDK.logEvent}, -268043806, 268043817, System.identityHashCode(this));
        }
        getCurrencyIso4217Code(aFh1hSDK, (AFh1qSDK) getRevenue(new Object[]{this, context}, 348348548, -348348531, System.identityHashCode(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r9.hashCode != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        getRevenue("start");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r11 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r12 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        r12.onError(41, "No dev key");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        AFAdRevenueData(r10);
        r0 = getMonetizationNetwork().areAllFieldsValid();
        r0.getRevenue(com.appsflyer.internal.AFh1vSDK.getMediationNetwork(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r9.component2 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        r5 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper + 53;
        com.appsflyer.internal.AFa1ySDK.i = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if ((r5 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        r5 = com.appsflyer.internal.AFj1kSDK.O_(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r5 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        r7 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper + 69;
        com.appsflyer.internal.AFa1ySDK.i = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if ((r7 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        r9.component2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        r9.component2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        com.appsflyer.internal.AFj1kSDK.O_(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        getMonetizationNetwork().copy().getRevenue("start", r11);
        r4 = com.appsflyer.AFLogger.INSTANCE;
        r5 = com.appsflyer.internal.AFg1cSDK.GENERAL;
        r6 = com.appsflyer.internal.AFa1ySDK.getMonetizationNetwork;
        r4.i(r5, java.lang.String.format("Starting AppsFlyer: (v%s.%s)", "6.17.5", r6));
        r7 = new java.lang.StringBuilder("Build Number: ");
        r7.append(r6);
        r4.i(r5, r7.toString());
        com.appsflyer.AppsFlyerProperties.getInstance().loadProperties(getMonetizationNetwork().component4());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
    
        if (android.text.TextUtils.isEmpty(r11) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d4, code lost:
    
        getMonetizationNetwork().AFInAppEventType().AFAdRevenueData(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f0, code lost:
    
        if (android.text.TextUtils.isEmpty(getMonetizationNetwork().AFInAppEventType().getMediationNetwork()) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f2, code lost:
    
        getRevenue(new java.lang.Object[0], -516060765, 516060769, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0102, code lost:
    
        if (r12 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0104, code lost:
    
        com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = (com.appsflyer.internal.AFa1ySDK.i + 49) % 128;
        r12.onError(41, "No dev key");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0110, code lost:
    
        getMonetizationNetwork().component1().AFAdRevenueData(AFAdRevenueData());
        component1();
        c_(r9.component2.getBaseContext(), r9.copy.AFAdRevenueData().n_());
        getMonetizationNetwork().e().getMonetizationNetwork();
        r9.copy.v().AFAdRevenueData(r10, new com.appsflyer.internal.AFa1ySDK.AnonymousClass2(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (getMonetizationNetwork().v().getMediationNetwork() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (getMonetizationNetwork().v().getMediationNetwork() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        com.appsflyer.internal.AFa1ySDK.i = (com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper + 31) % 128;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void start(android.content.Context r10, java.lang.String r11, final com.appsflyer.attribution.AppsFlyerRequestListener r12) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1ySDK.start(android.content.Context, java.lang.String, com.appsflyer.attribution.AppsFlyerRequestListener):void");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    private static /* synthetic */ Object component1(Object[] objArr) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
        Context context = (Context) objArr[0];
        int i2 = i + 9;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
            if (getRevenue().toString == null) {
                threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    getRevenue().toString = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th;
                }
            }
        } else if (getRevenue().toString == null) {
            threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            getRevenue().toString = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
        SharedPreferences sharedPreferences = getRevenue().toString;
        int i4 = AFKeystoreWrapper + 7;
        i = i4 % 128;
        if (i4 % 2 != 0) {
            return sharedPreferences;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(boolean z) {
        if (z) {
            int i2 = AFKeystoreWrapper + 67;
            i = i2 % 128;
            if (i2 % 2 != 0) {
                getMonetizationNetwork().afInfoLog().getMediationNetwork();
                return;
            } else {
                getMonetizationNetwork().afInfoLog().getMediationNetwork();
                throw null;
            }
        }
        getMonetizationNetwork().afInfoLog().AFAdRevenueData();
        AFKeystoreWrapper = (i + 7) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(AFf1pSDK aFf1pSDK) {
        int i2 = AFKeystoreWrapper + 77;
        i = i2 % 128;
        if (i2 % 2 != 0) {
            AFd1zSDK monetizationNetwork = getMonetizationNetwork();
            if (aFf1pSDK == AFf1pSDK.SUCCESS) {
                monetizationNetwork.afErrorLogForExcManagerOnly().getMonetizationNetwork();
            }
            if (!monetizationNetwork.copy().AFAdRevenueData()) {
                i = (AFKeystoreWrapper + 7) % 128;
                monetizationNetwork.afInfoLog().getCurrencyIso4217Code();
                int i3 = i + 103;
                AFKeystoreWrapper = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 20 / 0;
                    return;
                }
                return;
            }
            monetizationNetwork.afInfoLog().getRevenue();
            return;
        }
        getMonetizationNetwork();
        AFf1pSDK aFf1pSDK2 = AFf1pSDK.SUCCESS;
        throw null;
    }

    public static void component2() {
        AFLogger = new char[]{35848, 35853, 35850, 35871, 35840, 35844, 35852, 35870, 35867};
        registerClient = 1912311211;
        AFInAppEventParameterName = true;
        AFInAppEventType = true;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        getMonetizationNetwork().copy().getRevenue("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        for (String str2 : strArr) {
            i = (AFKeystoreWrapper + 107) % 128;
            if (AnonymousClass3.getCurrencyIso4217Code[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFj1dSDK.getCurrencyIso4217Code(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                i = (AFKeystoreWrapper + 103) % 128;
                str = "plain_el_arr";
            }
        }
        map.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(map).toString());
        AFKeystoreWrapper = (i + 117) % 128;
    }

    private static void getMediationNetwork(AFh1mSDK aFh1mSDK, AFh1qSDK aFh1qSDK) {
        int i2 = (AFKeystoreWrapper + 61) % 128;
        i = i2;
        if (aFh1qSDK != null) {
            aFh1mSDK.getMonetizationNetwork = aFh1qSDK.getCurrencyIso4217Code;
            aFh1mSDK.copydefault = aFh1qSDK.AFAdRevenueData;
        }
        int i3 = i2 + 41;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static void areAllFieldsValid(Context context) {
        getRevenue(new Object[]{context}, 750744286, -750744267, (int) System.currentTimeMillis());
    }

    private String getCurrencyIso4217Code(Context context, String str) {
        int i2 = AFKeystoreWrapper + 55;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (context == null) {
            return null;
        }
        AFAdRevenueData(context);
        String currencyIso4217Code = getMonetizationNetwork().AFAdRevenueData().getCurrencyIso4217Code(str);
        AFKeystoreWrapper = (i + 89) % 128;
        return currencyIso4217Code;
    }

    public static String getMonetizationNetwork(SimpleDateFormat simpleDateFormat, long j) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date(j));
        int i2 = i + 3;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
        return str;
    }

    public final Map<String, Object> getMonetizationNetwork(AFh1mSDK aFh1mSDK) throws UnsupportedEncodingException {
        String str;
        Context context = getMonetizationNetwork().AFInAppEventParameterName().getMonetizationNetwork;
        AFc1qSDK monetizationNetwork = getMonetizationNetwork(context);
        AFg1nSDK aFg1nSDKComponent3 = getMonetizationNetwork().component3();
        boolean currencyIso4217Code = getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code();
        boolean revenue = aFh1mSDK.getRevenue();
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        long time = new Date().getTime();
        boolean z = false;
        Object[] objArr = new Object[1];
        a("\u0089\u0086\u0081\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (currencyIso4217Code) {
                int i2 = i + 63;
                AFKeystoreWrapper = i2 % 128;
                if (i2 % 2 != 0) {
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", false);
                } else {
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
                }
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                if (revenue) {
                    int i3 = i + 105;
                    AFKeystoreWrapper = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 15 / 0;
                    }
                    str = "Launch";
                } else {
                    str = aFh1mSDK.areAllFieldsValid;
                }
                sb.append(str);
                aFLogger.i(aFg1cSDK, sb.toString(), true);
                i = (AFKeystoreWrapper + 71) % 128;
            }
            getRevenue(new Object[]{context}, 750744286, -750744267, (int) System.currentTimeMillis());
            int currencyIso4217Code2 = getCurrencyIso4217Code(monetizationNetwork, revenue);
            if (aFh1mSDK.areAllFieldsValid != null) {
                int i5 = i + 75;
                AFKeystoreWrapper = i5 % 128;
                if (i5 % 2 == 0) {
                    z = true;
                }
            }
            int revenue2 = getRevenue(monetizationNetwork, z);
            if (revenue && currencyIso4217Code2 == 1) {
                AppsFlyerProperties.getInstance().getCurrencyIso4217Code = true;
            }
            aFg1nSDKComponent3.getCurrencyIso4217Code(map, currencyIso4217Code2, revenue2);
            return map;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Error while preparing to send event", th, true, true, true);
            return map;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        AFe1oSDK aFe1oSDKCopydefault = this.copy.copydefault();
        aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new AnonymousClass1(new AFf1ySDK(this.copy, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        int i2 = i + 111;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 96 / 0;
        }
    }

    private AFj1tSDK[] component3() {
        Object[] array;
        int i2 = AFKeystoreWrapper + 71;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            array = getMonetizationNetwork().AFLogger().getRevenue.toArray(new AFj1tSDK[0]);
        } else {
            array = getMonetizationNetwork().AFLogger().getRevenue.toArray(new AFj1tSDK[0]);
        }
        AFj1tSDK[] aFj1tSDKArr = (AFj1tSDK[]) array;
        i = (AFKeystoreWrapper + 107) % 128;
        return aFj1tSDKArr;
    }

    public static int getCurrencyIso4217Code(AFc1qSDK aFc1qSDK, boolean z) {
        int i2 = AFKeystoreWrapper + 65;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            getMediationNetwork(aFc1qSDK, "appsFlyerCount", z);
            throw null;
        }
        int mediationNetwork = getMediationNetwork(aFc1qSDK, "appsFlyerCount", z);
        AFKeystoreWrapper = (i + 71) % 128;
        return mediationNetwork;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) throws UnsupportedEncodingException {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
        AFKeystoreWrapper = (i + 31) % 128;
        aFa1ySDK.getMediationNetwork(aFh1mSDK);
        int i2 = i + 27;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void copy() {
        int i2 = i + 121;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            if (getMonetizationNetwork().afLogForce().AFAdRevenueData()) {
                AFKeystoreWrapper = (i + 21) % 128;
                getMonetizationNetwork().afLogForce().getMonetizationNetwork();
            }
            AFi1pSDK aFi1pSDKD = getMonetizationNetwork().d();
            aFi1pSDKD.getMonetizationNetwork = Build.VERSION.SDK_INT >= 31 ? new AFi1mSDK(aFi1pSDKD.getMediationNetwork) : new AFi1tSDK(aFi1pSDKD.getMediationNetwork);
            getMonetizationNetwork().AFInAppEventType().getRevenue(getMonetizationNetwork().AFAdRevenueData());
            AFh1xSDK aFh1xSDKAreAllFieldsValid = getMonetizationNetwork().areAllFieldsValid();
            aFh1xSDKAreAllFieldsValid.areAllFieldsValid = System.currentTimeMillis();
            int revenue = aFh1xSDKAreAllFieldsValid.getCurrencyIso4217Code.getMediationNetwork.getRevenue("appsFlyerCount", 0);
            if (revenue == 1) {
                AFKeystoreWrapper = (i + 89) % 128;
                if (aFh1xSDKAreAllFieldsValid.getMonetizationNetwork.getMonetizationNetwork("first_launch")) {
                    aFh1xSDKAreAllFieldsValid.AFAdRevenueData.putAll(aFh1xSDKAreAllFieldsValid.getCurrencyIso4217Code("first_launch"));
                }
            }
            if (revenue > 0 && aFh1xSDKAreAllFieldsValid.getMonetizationNetwork.getMonetizationNetwork("gcd")) {
                int i3 = AFKeystoreWrapper + 85;
                i = i3 % 128;
                if (i3 % 2 == 0) {
                    aFh1xSDKAreAllFieldsValid.getRevenue.putAll(aFh1xSDKAreAllFieldsValid.getCurrencyIso4217Code("gcd"));
                    int i4 = 79 / 0;
                } else {
                    aFh1xSDKAreAllFieldsValid.getRevenue.putAll(aFh1xSDKAreAllFieldsValid.getCurrencyIso4217Code("gcd"));
                }
            }
            aFh1xSDKAreAllFieldsValid.copydefault = aFh1xSDKAreAllFieldsValid.getMonetizationNetwork.getMonetizationNetwork("prev_session_dur", 0L);
            areAllFieldsValid();
            getMonetizationNetwork().registerClient().getMediationNetwork();
            return;
        }
        getMonetizationNetwork().afLogForce().AFAdRevenueData();
        throw null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        i = (AFKeystoreWrapper + 123) % 128;
        AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        int i2 = AFKeystoreWrapper + 113;
        i = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final void getMediationNetwork(AFh1mSDK aFh1mSDK) throws UnsupportedEncodingException {
        Context context = getMonetizationNetwork().AFInAppEventParameterName().getMonetizationNetwork;
        boolean z = true;
        if (context == null) {
            AFLogger.INSTANCE.d(AFg1cSDK.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
            return;
        }
        String mediationNetwork = getMonetizationNetwork().AFInAppEventType().getMediationNetwork();
        AppsFlyerRequestListener appsFlyerRequestListener = aFh1mSDK.getCurrencyIso4217Code;
        if (mediationNetwork != null) {
            int i2 = AFKeystoreWrapper + 49;
            i = i2 % 128;
            if (i2 % 2 != 0) {
                if (mediationNetwork.length() != 0) {
                    AFc1qSDK monetizationNetwork = getMonetizationNetwork(context);
                    AppsFlyerProperties.getInstance().saveProperties(monetizationNetwork);
                    if (!getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code()) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                        StringBuilder sb = new StringBuilder("sendWithEvent from activity: ");
                        sb.append(context.getClass().getName());
                        aFLogger.i(aFg1cSDK, sb.toString(), true);
                    }
                    boolean revenue = aFh1mSDK.getRevenue();
                    Map<String, ?> monetizationNetwork2 = getMonetizationNetwork(aFh1mSDK);
                    if (getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code()) {
                        AFKeystoreWrapper = (i + 31) % 128;
                        AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyerLib.sendWithEvent");
                    }
                    int currencyIso4217Code = getCurrencyIso4217Code(monetizationNetwork, false);
                    getRevenue(monetizationNetwork2);
                    AFa1tSDK aFa1tSDK = new AFa1tSDK(getMonetizationNetwork(), aFh1mSDK.AFAdRevenueData(monetizationNetwork2).AFAdRevenueData(currencyIso4217Code), getMonetizationNetwork().e().getMediationNetwork());
                    if (revenue) {
                        boolean z2 = false;
                        for (AFj1tSDK aFj1tSDK : component3()) {
                            if (aFj1tSDK.component4 == AFj1tSDK.AFa1tSDK.STARTED) {
                                AFLogger aFLogger2 = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK2 = AFg1cSDK.REFERRER;
                                StringBuilder sb2 = new StringBuilder("Failed to get ");
                                sb2.append(aFj1tSDK.component3);
                                sb2.append(" referrer, wait ...");
                                aFLogger2.d(aFg1cSDK2, sb2.toString());
                                z2 = true;
                            }
                        }
                        if (getMonetizationNetwork().e().AFAdRevenueData()) {
                            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "fetching Facebook deferred AppLink data, wait ...");
                            z2 = true;
                        }
                        if (!getMonetizationNetwork().AFInAppEventType().getMonetizationNetwork()) {
                            z = z2;
                        }
                    } else {
                        z = false;
                    }
                    AFj1aSDK.getCurrencyIso4217Code(getMonetizationNetwork().getMediationNetwork(), aFa1tSDK, z ? 500L : 0L, TimeUnit.MILLISECONDS);
                    return;
                }
            } else {
                throw null;
            }
        }
        AFLogger aFLogger3 = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK3 = AFg1cSDK.GENERAL;
        aFLogger3.i(aFg1cSDK3, "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ", true);
        aFLogger3.i(aFg1cSDK3, "AppsFlyer will not track this event.", true);
        if (appsFlyerRequestListener != null) {
            appsFlyerRequestListener.onError(41, "No dev key");
        }
        AFKeystoreWrapper = (i + 35) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001e A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:3:0x0001, B:5:0x000d, B:17:0x002d, B:16:0x001e, B:11:0x0017, B:14:0x001a, B:7:0x0011), top: B:24:0x0001, inners: #0 }] */
    public final synchronized AFf1mSDK AFAdRevenueData() {
        try {
            int i2 = i + 11;
            AFKeystoreWrapper = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 9 / 0;
                if (this.equals == null) {
                    this.equals = new AFf1mSDK() { // from class: com.appsflyer.internal.impromptu
                        @Override // com.appsflyer.internal.AFf1mSDK
                        public final void onRemoteConfigUpdateFinished(AFf1pSDK aFf1pSDK) {
                            this.f17382attabal.AFAdRevenueData(aFf1pSDK);
                        }
                    };
                    i = (AFKeystoreWrapper + 81) % 128;
                }
            } else if (this.equals == null) {
                this.equals = new AFf1mSDK() { // from class: com.appsflyer.internal.impromptu
                    @Override // com.appsflyer.internal.AFf1mSDK
                    public final void onRemoteConfigUpdateFinished(AFf1pSDK aFf1pSDK) {
                        this.f17382attabal.AFAdRevenueData(aFf1pSDK);
                    }
                };
                i = (AFKeystoreWrapper + 81) % 128;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.equals;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
        getRevenue(new Object[]{this, aFh1mSDK}, -316162006, 316162006, System.identityHashCode(this));
    }

    public class AFa1zSDK implements AFe1qSDK {
        public AFa1zSDK() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit getMediationNetwork() throws UnsupportedEncodingException {
            AFa1ySDK.this.getMediationNetwork(new AFh1kSDK());
            return Unit.f29295attabal;
        }

        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getRevenue(AFe1mSDK<?> aFe1mSDK, AFe1uSDK aFe1uSDK) {
            JSONObject monetizationNetwork;
            AFf1aSDK revenue;
            if (!(aFe1mSDK instanceof AFf1sSDK)) {
                if (!(aFe1mSDK instanceof AFg1kSDK) || aFe1uSDK == AFe1uSDK.SUCCESS) {
                    return;
                }
                AFg1pSDK aFg1pSDK = new AFg1pSDK(AFa1ySDK.this.getMonetizationNetwork());
                AFe1oSDK aFe1oSDKCopydefault = AFa1ySDK.this.getMonetizationNetwork().copydefault();
                aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new AnonymousClass1(aFg1pSDK));
                return;
            }
            AFf1sSDK aFf1sSDK = (AFf1sSDK) aFe1mSDK;
            boolean z = aFe1mSDK instanceof AFf1rSDK;
            if (z && getRevenue()) {
                AFf1rSDK aFf1rSDK = (AFf1rSDK) aFe1mSDK;
                if (aFf1rSDK.getMonetizationNetwork == AFe1uSDK.SUCCESS || aFf1rSDK.getMediationNetwork == 1) {
                    AFg1kSDK aFg1kSDK = new AFg1kSDK(aFf1rSDK, AFa1ySDK.this.getMonetizationNetwork().component4());
                    AFe1oSDK aFe1oSDKCopydefault2 = AFa1ySDK.this.getMonetizationNetwork().copydefault();
                    aFe1oSDKCopydefault2.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault2.new AnonymousClass1(aFg1kSDK));
                }
            }
            AFh1pSDK aFh1pSDKAfWarnLog = AFa1ySDK.this.getMonetizationNetwork().afWarnLog();
            if (aFh1pSDKAfWarnLog != null && z) {
                aFh1pSDKAfWarnLog.getMonetizationNetwork((AFf1rSDK) aFe1mSDK, new Function0() { // from class: com.appsflyer.internal.taiyuan
                    @Override // p002kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.f17409kowloon.getMediationNetwork();
                    }
                });
            }
            if (aFe1uSDK == AFe1uSDK.SUCCESS) {
                AFa1ySDK aFa1ySDK = AFa1ySDK.this;
                aFa1ySDK.getMonetizationNetwork(aFa1ySDK.component2).getRevenue("sentSuccessfully", a.g);
                if (!(aFe1mSDK instanceof AFf1oSDK) && (revenue = new AFg1sSDK(AFa1ySDK.this.component2).getRevenue()) != null && revenue.getMediationNetwork) {
                    String str = revenue.getRevenue;
                    AFLogger.INSTANCE.d(AFg1cSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                    AFd1zSDK monetizationNetwork2 = AFa1ySDK.getRevenue().getMonetizationNetwork();
                    AFf1oSDK aFf1oSDK = new AFf1oSDK(str, monetizationNetwork2);
                    AFe1oSDK aFe1oSDKCopydefault3 = monetizationNetwork2.copydefault();
                    aFe1oSDKCopydefault3.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault3.new AnonymousClass1(aFf1oSDK));
                }
                ResponseNetwork responseNetwork = ((AFe1fSDK) aFf1sSDK).areAllFieldsValid;
                if (responseNetwork != null && (monetizationNetwork = AFa1qSDK.getMonetizationNetwork((String) responseNetwork.getBody())) != null) {
                    AFa1ySDK.this.component1 = monetizationNetwork.optBoolean("send_background", false);
                }
                if (z) {
                    AFa1ySDK.this.AFAdRevenueData = System.currentTimeMillis();
                }
            }
        }

        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getCurrencyIso4217Code(AFe1mSDK<?> aFe1mSDK) {
        }

        private boolean getRevenue() {
            return AFa1ySDK.this.getRevenue != null;
        }
    }

    private static void AFAdRevenueData(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            if (!itKeys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(itKeys.next()));
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i2)));
                }
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> itKeys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (true) {
                if (!itKeys2.hasNext()) {
                    break loop2;
                }
                i = (AFKeystoreWrapper + 7) % 128;
                if (str != null) {
                    break loop2;
                }
                String next = itKeys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i3 = 0;
                    while (i3 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i3) == ((Long) arrayList.get(0)).longValue() || jSONArray2.getLong(i3) == ((Long) arrayList.get(1)).longValue()) {
                            break;
                        }
                        AFKeystoreWrapper = (i + 61) % 128;
                        if (jSONArray2.getLong(i3) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                            break;
                        }
                        i3++;
                        str = next;
                    }
                } catch (JSONException e2) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e2);
                }
            }
        }
        if (str != null) {
            AFKeystoreWrapper = (i + 111) % 128;
            jSONObject.remove(str);
        }
    }

    private boolean component4() {
        i = (AFKeystoreWrapper + 101) % 128;
        if (this.component3 > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.component3;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            String monetizationNetwork = getMonetizationNetwork(simpleDateFormat, this.component3);
            String monetizationNetwork2 = getMonetizationNetwork(simpleDateFormat, this.AFAdRevenueData);
            if (jCurrentTimeMillis < this.component4 && !isStopped()) {
                AFKeystoreWrapper = (i + 25) % 128;
                AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", monetizationNetwork, monetizationNetwork2, Long.valueOf(jCurrentTimeMillis), Long.valueOf(this.component4)));
                return true;
            }
            if (isStopped()) {
                return false;
            }
            AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", monetizationNetwork, monetizationNetwork2, Long.valueOf(jCurrentTimeMillis)));
            return false;
        }
        if (isStopped()) {
            return false;
        }
        i = (AFKeystoreWrapper + 113) % 128;
        AFLogger.afInfoLog("Sending first launch for this session!");
        i = (AFKeystoreWrapper + 121) % 128;
        return false;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) {
        getRevenue(new Object[]{this, context, str}, -973034294, 973034299, System.identityHashCode(this));
    }

    public final AFc1qSDK getMonetizationNetwork(Context context) {
        i = (AFKeystoreWrapper + 13) % 128;
        AFAdRevenueData(context);
        AFc1qSDK aFc1qSDKComponent4 = getMonetizationNetwork().component4();
        int i2 = AFKeystoreWrapper + 85;
        i = i2 % 128;
        if (i2 % 2 != 0) {
            return aFc1qSDKComponent4;
        }
        throw null;
    }

    private static void getMonetizationNetwork(String str) {
        getRevenue(new Object[]{str}, -374487647, 374487663, (int) System.currentTimeMillis());
    }

    private void getMonetizationNetwork(AFi1hSDK aFi1hSDK) {
        getRevenue(new Object[]{this, aFi1hSDK}, 608861720, -608861711, System.identityHashCode(this));
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = AFKeystoreWrapper + 5;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        aFa1ySDK.setLogLevel(zBooleanValue ? AFLogger.LogLevel.DEBUG : AFLogger.LogLevel.NONE);
        AFKeystoreWrapper = (i + 117) % 128;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(AFi1hSDK aFi1hSDK) {
        int i2 = AFKeystoreWrapper + 25;
        i = i2 % 128;
        Object[] objArr = {this, aFi1hSDK};
        if (i2 % 2 == 0) {
            getRevenue(objArr, 608861720, -608861711, System.identityHashCode(this));
            throw null;
        }
        getRevenue(objArr, 608861720, -608861711, System.identityHashCode(this));
        AFKeystoreWrapper = (i + 15) % 128;
    }

    private void AFAdRevenueData(Context context, String str, Map<String, Object> map) throws UnsupportedEncodingException {
        AFh1hSDK aFh1hSDK = new AFh1hSDK();
        aFh1hSDK.areAllFieldsValid = str;
        aFh1hSDK.getRevenue = map;
        getCurrencyIso4217Code(aFh1hSDK, (AFh1qSDK) getRevenue(new Object[]{this, context}, 348348548, -348348531, System.identityHashCode(this)));
        i = (AFKeystoreWrapper + 125) % 128;
    }

    @Deprecated
    public static Map<String, Object> getMediationNetwork(Map<String, Object> map) {
        if (map.containsKey("meta")) {
            i = (AFKeystoreWrapper + 115) % 128;
            Map<String, Object> map2 = (Map) map.get("meta");
            AFKeystoreWrapper = (i + 81) % 128;
            return map2;
        }
        HashMap map3 = new HashMap();
        map.put("meta", map3);
        return map3;
    }

    private void AFAdRevenueData(String str) {
        final AFh1mSDK aFh1mSDKAFAdRevenueData = new AFh1nSDK().AFAdRevenueData(getMonetizationNetwork().AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0));
        aFh1mSDKAFAdRevenueData.component1 = str;
        if (str == null || str.length() <= 5 || !getMonetizationNetwork().AFLogger().getMediationNetwork(aFh1mSDKAFAdRevenueData)) {
            return;
        }
        int i2 = i + 15;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            AFj1aSDK.getCurrencyIso4217Code(getMonetizationNetwork().getMediationNetwork(), new Runnable() { // from class: com.appsflyer.internal.saneness
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17399kowloon.getCurrencyIso4217Code(aFh1mSDKAFAdRevenueData);
                }
            }, 5L, TimeUnit.MILLISECONDS);
            i = (AFKeystoreWrapper + 21) % 128;
        } else {
            AFj1aSDK.getCurrencyIso4217Code(getMonetizationNetwork().getMediationNetwork(), new Runnable() { // from class: com.appsflyer.internal.saneness
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17399kowloon.getCurrencyIso4217Code(aFh1mSDKAFAdRevenueData);
                }
            }, 5L, TimeUnit.MILLISECONDS);
            throw null;
        }
    }

    private static int getMediationNetwork(AFc1qSDK aFc1qSDK, String str, boolean z) {
        int revenue;
        int i2 = i + 15;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            revenue = aFc1qSDK.getRevenue(str, 0);
            if (!z) {
                return revenue;
            }
        } else {
            revenue = aFc1qSDK.getRevenue(str, 0);
            if (!z) {
                return revenue;
            }
        }
        AFKeystoreWrapper = (i + 13) % 128;
        int i3 = revenue + 1;
        aFc1qSDK.getMediationNetwork(str, i3);
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getMediationNetwork(AFd1zSDK aFd1zSDK) {
        getRevenue(new Object[]{aFd1zSDK}, 757923489, -757923475, (int) System.currentTimeMillis());
    }

    private AFh1qSDK getMediationNetwork(Context context) {
        return (AFh1qSDK) getRevenue(new Object[]{this, context}, 348348548, -348348531, System.identityHashCode(this));
    }

    private void getMediationNetwork(Context context, AFh1tSDK aFh1tSDK) {
        getRevenue(new Object[]{this, context, aFh1tSDK}, -268043806, 268043817, System.identityHashCode(this));
    }

    public static String getMediationNetwork() {
        return (String) getRevenue(new Object[0], 131288073, -131288051, (int) System.currentTimeMillis());
    }

    public static String AFAdRevenueData(AFc1qSDK aFc1qSDK, String str) {
        i = (AFKeystoreWrapper + 71) % 128;
        String monetizationNetwork = aFc1qSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
        if (monetizationNetwork != null) {
            int i2 = i + 87;
            AFKeystoreWrapper = i2 % 128;
            if (i2 % 2 == 0) {
                return monetizationNetwork;
            }
            throw null;
        }
        aFc1qSDK.getRevenue("CACHED_CHANNEL", str);
        i = (AFKeystoreWrapper + 37) % 128;
        return str;
    }

    private void AFAdRevenueData(AFh1mSDK aFh1mSDK) throws UnsupportedEncodingException {
        boolean z;
        if (aFh1mSDK.areAllFieldsValid == null) {
            AFKeystoreWrapper = (i + 73) % 128;
            z = true;
        } else {
            z = false;
        }
        if (getCurrencyIso4217Code()) {
            i = (AFKeystoreWrapper + 33) % 128;
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                i = (AFKeystoreWrapper + 7) % 128;
                if (component4()) {
                    AFKeystoreWrapper = (i + 39) % 128;
                    AppsFlyerRequestListener appsFlyerRequestListener = aFh1mSDK.getCurrencyIso4217Code;
                    if (appsFlyerRequestListener != null) {
                        appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                        return;
                    }
                    return;
                }
            } else {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            }
            this.component3 = System.currentTimeMillis();
        }
        getMediationNetwork(aFh1mSDK);
    }

    public static AFa1ySDK getRevenue() {
        int i2 = AFKeystoreWrapper;
        AFa1ySDK aFa1ySDK = areAllFieldsValid;
        int i3 = i2 + 9;
        i = i3 % 128;
        if (i3 % 2 != 0) {
            return aFa1ySDK;
        }
        throw null;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        AFKeystoreWrapper = (i + 11) % 128;
        aFa1ySDK.getMonetizationNetwork().copy().getRevenue("setCollectIMEI", String.valueOf(zBooleanValue));
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(zBooleanValue));
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(zBooleanValue));
        int i2 = i + 115;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 60 / 0;
        }
        return null;
    }

    private void getRevenue(AppsFlyerConversionListener appsFlyerConversionListener) {
        AFKeystoreWrapper = (i + 53) % 128;
        if (appsFlyerConversionListener == null) {
            return;
        }
        this.getRevenue = appsFlyerConversionListener;
        i = (AFKeystoreWrapper + 101) % 128;
    }

    private static void AFAdRevenueData(String str, boolean z) {
        getRevenue(new Object[]{str, Boolean.valueOf(z)}, -1569798316, 1569798326, (int) System.currentTimeMillis());
    }

    public final void AFAdRevenueData(Context context, String str) {
        getRevenue(new Object[]{this, context, str}, 1454368071, -1454368056, System.identityHashCode(this));
    }

    private void getRevenue(Context context, String str) throws UnsupportedEncodingException {
        AFh1eSDK aFh1eSDK = new AFh1eSDK();
        AFAdRevenueData(context);
        aFh1eSDK.areAllFieldsValid = null;
        aFh1eSDK.getRevenue = null;
        aFh1eSDK.component1 = str;
        aFh1eSDK.getMonetizationNetwork = null;
        AFAdRevenueData(aFh1eSDK);
        i = (AFKeystoreWrapper + 29) % 128;
    }

    private void getRevenue(Map<String, Object> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return;
        }
        AFKeystoreWrapper = (i + 115) % 128;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return;
        }
        i = (AFKeystoreWrapper + 115) % 128;
        if (map.get("advertiserId") != null) {
            try {
                if (AFk1wSDK.getMonetizationNetwork(getMonetizationNetwork().force().getCurrencyIso4217Code) && map.remove("android_id") != null) {
                    AFKeystoreWrapper = (i + 65) % 128;
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                }
                if (AFk1wSDK.getMonetizationNetwork(getMonetizationNetwork().AFInAppEventType().AFAdRevenueData())) {
                    i = (AFKeystoreWrapper + 67) % 128;
                    if (map.remove("imei") != null) {
                        int i2 = i + 33;
                        AFKeystoreWrapper = i2 % 128;
                        if (i2 % 2 == 0) {
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                            return;
                        }
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                        try {
                            throw null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
            }
        }
    }

    private static String getRevenue(Activity activity) {
        Intent intent;
        AFKeystoreWrapper = (i + 117) % 128;
        String str = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    int i2 = AFKeystoreWrapper + 75;
                    i = i2 % 128;
                    if (i2 % 2 != 0) {
                        String string = extras.getString("af");
                        if (string == null) {
                            return string;
                        }
                        AFLogger.INSTANCE.w(AFg1cSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(String.valueOf(string)));
                        extras.remove("af");
                        activity.setIntent(intent.putExtras(extras));
                        AFKeystoreWrapper = (i + 45) % 128;
                        return string;
                    }
                    String string2 = extras.getString("af");
                    try {
                        throw null;
                    } catch (Throwable th) {
                        str = string2;
                        th = th;
                        AFLogger.INSTANCE.e(AFg1cSDK.ENGAGEMENT, th.getMessage(), th);
                        return str;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return str;
    }

    public static boolean getRevenue(Context context) {
        i = (AFKeystoreWrapper + 103) % 128;
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                AFKeystoreWrapper = (i + 83) % 128;
                return true;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    private static int getRevenue(AFc1qSDK aFc1qSDK, boolean z) {
        int i2 = AFKeystoreWrapper + 125;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            getMediationNetwork(aFc1qSDK, "appsFlyerInAppEventCount", z);
            throw null;
        }
        int mediationNetwork = getMediationNetwork(aFc1qSDK, "appsFlyerInAppEventCount", z);
        i = (AFKeystoreWrapper + 33) % 128;
        return mediationNetwork;
    }

    private static void getRevenue(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.SDK_LIFECYCLE;
        StringBuilder sb = new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '");
        sb.append(str);
        sb.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        aFLogger.w(aFg1cSDK, sb.toString());
        int i2 = AFKeystoreWrapper + 99;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
