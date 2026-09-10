package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.ironsource.L6;
import com.ironsource.mediationsdk.metadata.a;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1oSDK extends AFf1sSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFLogger = 1;
    private static int registerClient;
    private final AFc1hSDK copy;
    private final String copydefault;
    private final AFg1nSDK equals;
    private final AFc1oSDK hashCode;
    private static char[] AFKeystoreWrapper = {52730, 63488, 52732, 63493, 63494, 52733, 63510, 52735, 63498};
    private static char AFInAppEventType = 52733;

    public AFf1oSDK(String str, AFd1zSDK aFd1zSDK) {
        super(new AFg1tSDK(), aFd1zSDK, str);
        this.hashCode = aFd1zSDK.AFAdRevenueData();
        this.copy = aFd1zSDK.AFInAppEventParameterName();
        this.copydefault = str;
        this.equals = aFd1zSDK.component3();
    }

    private static void a(byte b, String str, int i, Object[] objArr) {
        int i2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        char[] cArr2 = AFKeystoreWrapper;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr3[i3] = (char) (((long) cArr2[i3]) ^ (-9203380046050046466L));
            }
            cArr2 = cArr3;
        }
        char c = (char) ((-9203380046050046466L) ^ ((long) AFInAppEventType));
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i4 = $10 + 65;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            aFk1pSDK.getMonetizationNetwork = 0;
            while (true) {
                int i6 = aFk1pSDK.getMonetizationNetwork;
                if (i6 >= i2) {
                    break;
                }
                char c2 = cArr[i6];
                aFk1pSDK.getRevenue = c2;
                char c3 = cArr[i6 + 1];
                aFk1pSDK.getCurrencyIso4217Code = c3;
                if (c2 == c3) {
                    int i7 = $11 + 115;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        cArr4[i6] = (char) (c2 >>> b);
                        cArr4[i6 >> 1] = (char) (c3 << b);
                    } else {
                        cArr4[i6] = (char) (c2 - b);
                        cArr4[i6 + 1] = (char) (c3 - b);
                    }
                } else {
                    int i8 = c2 / c;
                    aFk1pSDK.getMediationNetwork = i8;
                    int i9 = c2 % c;
                    aFk1pSDK.component2 = i9;
                    int i10 = c3 / c;
                    aFk1pSDK.AFAdRevenueData = i10;
                    int i11 = c3 % c;
                    aFk1pSDK.component3 = i11;
                    if (i9 == i11) {
                        int i12 = ((i8 + c) - 1) % c;
                        aFk1pSDK.getMediationNetwork = i12;
                        int i13 = ((i10 + c) - 1) % c;
                        aFk1pSDK.AFAdRevenueData = i13;
                        cArr4[i6] = cArr2[(i12 * c) + i9];
                        cArr4[i6 + 1] = cArr2[(i13 * c) + i11];
                    } else if (i8 == i10) {
                        int i14 = ((i9 + c) - 1) % c;
                        aFk1pSDK.component2 = i14;
                        int i15 = ((i11 + c) - 1) % c;
                        aFk1pSDK.component3 = i15;
                        cArr4[i6] = cArr2[(i8 * c) + i14];
                        cArr4[i6 + 1] = cArr2[(i10 * c) + i15];
                    } else {
                        cArr4[i6] = cArr2[(i8 * c) + i11];
                        cArr4[i6 + 1] = cArr2[(i10 * c) + i9];
                    }
                }
                aFk1pSDK.getMonetizationNetwork = i6 + 2;
            }
        }
        $10 = ($11 + 5) % 128;
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private void equals() {
        int i = AFLogger + 33;
        registerClient = i % 128;
        int i2 = i % 2;
        ((AFf1sSDK) this).component2.AFAdRevenueData("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i;
        int i6 = ~i3;
        return ((((i * 495) + (i2 * (-493))) + ((i | i4) * (-988))) + (((i2 | i5) | i6) * 494)) + (((~(i | i2)) | ((~(i6 | i2)) | (~(i4 | i5)))) * 494) != 1 ? getMonetizationNetwork(objArr) : getMediationNetwork(objArr);
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFf1oSDK aFf1oSDK = (AFf1oSDK) objArr[0];
        int i = registerClient + 109;
        AFLogger = i % 128;
        if (i % 2 == 0) {
            super.getCurrencyIso4217Code();
            throw null;
        }
        super.getCurrencyIso4217Code();
        ResponseNetwork responseNetwork = ((AFe1fSDK) aFf1oSDK).areAllFieldsValid;
        if (responseNetwork != null) {
            int i2 = registerClient + 3;
            AFLogger = i2 % 128;
            if (i2 % 2 == 0) {
                responseNetwork.isSuccessful();
                throw null;
            }
            if (responseNetwork.isSuccessful()) {
                aFf1oSDK.equals();
                registerClient = (AFLogger + 17) % 128;
            }
        }
        return null;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFf1oSDK aFf1oSDK = (AFf1oSDK) objArr[0];
        AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
        super.AFAdRevenueData(aFh1mSDK);
        Context context = aFf1oSDK.copy.getMonetizationNetwork;
        AFa1ySDK revenue = AFa1ySDK.getRevenue();
        if (context == null) {
            throw new IllegalStateException("Context is not provided, can't send register request");
        }
        if (revenue.getCurrencyIso4217Code()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        try {
            aFh1mSDK.getMonetizationNetwork("app_version_code", Integer.toString(aFf1oSDK.hashCode.n_().versionCode));
            aFh1mSDK.getMonetizationNetwork("app_version_name", aFf1oSDK.hashCode.n_().versionName);
            aFh1mSDK.getMonetizationNetwork("app_name", aFf1oSDK.s_(context.getPackageManager()));
            aFh1mSDK.getMonetizationNetwork("installDate", AFa1ySDK.getMonetizationNetwork(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), aFf1oSDK.hashCode.n_().firstInstallTime));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th);
        }
        aFf1oSDK.equals.getRevenue(aFh1mSDK.AFAdRevenueData);
        aFh1mSDK.AFAdRevenueData.remove("ivc");
        String mediationNetwork = AFa1ySDK.getMediationNetwork();
        if (mediationNetwork != null) {
            int i = AFLogger + 47;
            registerClient = i % 128;
            if (i % 2 != 0) {
                aFh1mSDK.getMonetizationNetwork("appUserId", mediationNetwork);
                int i2 = 83 / 0;
            } else {
                aFh1mSDK.getMonetizationNetwork("appUserId", mediationNetwork);
            }
        }
        try {
            aFh1mSDK.getMonetizationNetwork(L6.B, Build.MODEL);
            Object[] objArr2 = new Object[1];
            a((byte) (3 - (ViewConfiguration.getTouchSlop() >> 8)), "\u0003\u0007\u0005\u0006㘁", 5 - (Process.myPid() >> 22), objArr2);
            aFh1mSDK.getMonetizationNetwork(((String) objArr2[0]).intern(), Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i3 = AFLogger + 89;
            registerClient = i3 % 128;
            if (i3 % 2 != 0) {
                aFh1mSDK.getMonetizationNetwork(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, a.g);
                int i4 = 47 / 0;
            } else {
                aFh1mSDK.getMonetizationNetwork(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, a.g);
            }
        }
        AFb1jSDK aFb1jSDKL_ = AFb1lSDK.l_(context.getContentResolver());
        if (aFb1jSDKL_ != null) {
            registerClient = (AFLogger + 35) % 128;
            aFh1mSDK.getMonetizationNetwork("amazon_aid", aFb1jSDKL_.getRevenue);
            aFh1mSDK.getMonetizationNetwork("amazon_aid_limit", String.valueOf(aFb1jSDKL_.getCurrencyIso4217Code));
        }
        aFh1mSDK.getMonetizationNetwork("devkey", ((AFe1fSDK) aFf1oSDK).component1.getMediationNetwork());
        aFh1mSDK.getMonetizationNetwork("uid", AFb1kSDK.getCurrencyIso4217Code(aFf1oSDK.hashCode.getMediationNetwork));
        aFh1mSDK.getMonetizationNetwork("af_gcm_token", aFf1oSDK.copydefault);
        aFh1mSDK.getMonetizationNetwork("launch_counter", Integer.toString(((AFf1sSDK) aFf1oSDK).component2.getRevenue("appsFlyerCount", 0)));
        aFh1mSDK.getMonetizationNetwork("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String strComponent3 = aFf1oSDK.hashCode.component3();
        if (strComponent3 == null) {
            return null;
        }
        aFh1mSDK.getMonetizationNetwork(AppsFlyerProperties.CHANNEL, strComponent3);
        AFLogger = (registerClient + 61) % 128;
        return null;
    }

    private String s_(PackageManager packageManager) {
        ApplicationInfo applicationInfo = this.hashCode.n_().applicationInfo;
        if (applicationInfo != null) {
            String string = packageManager.getApplicationLabel(applicationInfo).toString();
            int i = AFLogger + 95;
            registerClient = i % 128;
            if (i % 2 == 0) {
                return string;
            }
            throw null;
        }
        int i2 = AFLogger;
        int i3 = i2 + 119;
        registerClient = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        registerClient = (i2 + 71) % 128;
        return "";
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    public final void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
        getCurrencyIso4217Code(new Object[]{this, aFh1mSDK}, 908933800, -908933800, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    public final void component1(AFh1mSDK aFh1mSDK) {
        String strAreAllFieldsValid;
        int i = AFLogger + 13;
        registerClient = i % 128;
        if (i % 2 != 0) {
            strAreAllFieldsValid = this.hashCode.areAllFieldsValid();
            int i2 = 83 / 0;
            if (strAreAllFieldsValid == null) {
                return;
            }
        } else {
            strAreAllFieldsValid = this.hashCode.areAllFieldsValid();
            if (strAreAllFieldsValid == null) {
                return;
            }
        }
        registerClient = (AFLogger + 19) % 128;
        aFh1mSDK.getMonetizationNetwork("advertiserId", strAreAllFieldsValid);
        AFLogger = (registerClient + 39) % 128;
    }

    @Override // com.appsflyer.internal.AFf1sSDK, com.appsflyer.internal.AFe1fSDK
    public final boolean copydefault() {
        int i = registerClient + 87;
        int i2 = i % 128;
        AFLogger = i2;
        boolean z = i % 2 == 0;
        registerClient = (i2 + 117) % 128;
        return z;
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    public final void getRevenue(AFh1mSDK aFh1mSDK) {
        int i = AFLogger + 51;
        registerClient = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    public final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
        registerClient = (AFLogger + 67) % 128;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        getCurrencyIso4217Code(new Object[]{this}, 838739924, -838739923, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    public final void getMediationNetwork(AFh1mSDK aFh1mSDK) {
        registerClient = (AFLogger + 21) % 128;
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    public final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        AFLogger = (registerClient + 1) % 128;
    }
}
