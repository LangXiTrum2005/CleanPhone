package com.kochava.tracker.datapoint.internal;

import A.AbstractC0891g;
import android.app.NotificationManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Point;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.datastore.preferences.protobuf.a;
import com.applovin.sdk.AppLovinEventTypes;
import com.kochava.core.json.internal.JsonElement;
import com.kochava.core.json.internal.JsonElementApi;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.util.internal.AppUtil;
import com.kochava.core.util.internal.DeviceUtil;
import com.kochava.core.util.internal.TextUtil;
import com.kochava.tracker.payload.internal.PayloadMetadata;
import com.kochava.tracker.payload.internal.PayloadType;
import com.p004ironsource.d9;
import com.p004ironsource.z8;
import com.smartdigimkt.o1.b;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
public final class DataPointCollectionState extends DataPointCollection {
    public static JsonElement d() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return JsonElement.f(false);
        }
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i2 = 0; i2 < 10; i2++) {
            if (new File(strArr[i2]).exists()) {
                return JsonElement.f(false);
            }
        }
        return JsonElement.f(true);
    }

    public static JsonElement e(Context context) {
        Intent intentD = a.d("android.intent.action.BATTERY_CHANGED", context, null);
        if (intentD == null || !intentD.hasExtra("status")) {
            throw new UnsupportedOperationException("Cannot retrieve battery status");
        }
        int intExtra = intentD.getIntExtra("status", -1);
        if (intExtra == 2) {
            return new JsonElement("charging");
        }
        if (intExtra == 3) {
            return new JsonElement("discharging");
        }
        if (intExtra != 4) {
            return intExtra != 5 ? new JsonElement("unknown") : new JsonElement(b.x0);
        }
        return new JsonElement("not_charging");
    }

    public static JsonElement f(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("IABUSPrivacy_String", "");
        if (!TextUtil.b(string)) {
            if (string.length() > Math.max(0, 128)) {
                string = string.substring(0, Math.max(0, 128));
            }
            return new JsonElement(string);
        }
        String string2 = context.getSharedPreferences(context.getPackageName() + ".v2.playerprefs", 0).getString("IABUSPrivacy_String", "");
        if (TextUtil.b(string2)) {
            return JsonElement.h();
        }
        if (string2.length() > Math.max(0, 128)) {
            string2 = string2.substring(0, Math.max(0, 128));
        }
        return new JsonElement(string2);
    }

    public static JsonElement g(Context context) {
        ConnectivityManager connectivityManagerA = DeviceUtil.a(context);
        Network activeNetwork = connectivityManagerA.getActiveNetwork();
        if (activeNetwork == null) {
            return new JsonElement("none");
        }
        NetworkCapabilities networkCapabilities = connectivityManagerA.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return new JsonElement("none");
        }
        if (networkCapabilities.hasTransport(1)) {
            return new JsonElement(z8.f27869b);
        }
        if (networkCapabilities.hasTransport(0)) {
            return new JsonElement(z8.g);
        }
        return networkCapabilities.hasTransport(3) ? new JsonElement("wired") : new JsonElement("none");
    }

    public static JsonElement h(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            throw new UnsupportedOperationException("Cannot retrieve NotificationManager");
        }
        if (i2 >= 26) {
            List notificationChannels = notificationManager.getNotificationChannels();
            Iterator it = notificationChannels.iterator();
            boolean z2 = true;
            while (it.hasNext()) {
                if (AbstractC0891g.f(it.next()).getImportance() != 0) {
                    z2 = false;
                }
            }
            if (z2 && !notificationChannels.isEmpty()) {
                return JsonElement.f(false);
            }
        }
        return JsonElement.f(notificationManager.areNotificationsEnabled());
    }

    public static JsonElement i(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics == null) {
            throw new UnsupportedOperationException("Cannot retrieve DisplayMetrics");
        }
        return new JsonElement(Double.valueOf(Math.round(Math.sqrt(Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d) + Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d)) * 10.0d) / 10.0d));
    }

    public static JsonElement j(Context context) {
        Signature[] signingCertificateHistory;
        String packageName = context.getPackageName();
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = context.getPackageManager().getPackageInfo(packageName, 134217728).signingInfo;
            signingCertificateHistory = signingInfo != null ? signingInfo.getSigningCertificateHistory() : null;
        } else {
            signingCertificateHistory = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
        }
        if (signingCertificateHistory == null || signingCertificateHistory.length == 0) {
            throw new UnsupportedOperationException("Unable to read signing signature");
        }
        return new JsonElement(android.support.v4.media.a.D(Integer.toString(Math.abs(signingCertificateHistory[0].toCharsString().hashCode())), TokenBuilder.TOKEN_DELIMITER, Integer.toString(Math.abs(packageName.hashCode()))));
    }

    public static JsonElement k(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager == null) {
            throw new UnsupportedOperationException("Cannot retrieve UiModeManager");
        }
        switch (uiModeManager.getCurrentModeType()) {
            case 0:
                return new JsonElement("Undefined");
            case 1:
                return new JsonElement("Normal");
            case 2:
                return new JsonElement("Desk");
            case 3:
                return new JsonElement("Car");
            case 4:
                return new JsonElement("Television");
            case 5:
                return new JsonElement("Appliance");
            case 6:
                return new JsonElement("Watch");
            case 7:
                return new JsonElement("VR_Headset");
            default:
                return new JsonElement("Unknown");
        }
    }

    @Override // com.kochava.tracker.datapoint.internal.DataPointCollection
    public final synchronized DataPointApi[] a() {
        PayloadType payloadType;
        DataPoint dataPointE;
        DataPoint dataPointE2;
        PayloadType payloadType2;
        DataPoint dataPointE3;
        DataPoint dataPointE4;
        PayloadType payloadType3;
        PayloadType payloadType4;
        PayloadType payloadType5;
        DataPoint dataPointE5;
        PayloadType payloadType6;
        DataPoint dataPointE6;
        DataPoint dataPointE7;
        DataPoint dataPointE8;
        DataPoint dataPointE9;
        DataPoint dataPointE10;
        DataPoint dataPointE11;
        DataPoint dataPointE12;
        DataPoint dataPointE13;
        DataPoint dataPointE14;
        DataPoint dataPointE15;
        DataPoint dataPointE16;
        DataPoint dataPointE17;
        DataPoint dataPointE18;
        DataPoint dataPointE19;
        DataPoint dataPointE20;
        DataPoint dataPointE21;
        PayloadType payloadType7;
        PayloadType payloadType8;
        payloadType = PayloadType.l0;
        dataPointE = DataPoint.e("installed_date", false, false, payloadType);
        dataPointE2 = DataPoint.e("installer_package", false, false, payloadType);
        payloadType2 = PayloadType.k0;
        dataPointE3 = DataPoint.e("metrics", false, false, payloadType2);
        dataPointE4 = DataPoint.e("package", false, false, payloadType2, payloadType);
        payloadType3 = PayloadType.t0;
        payloadType4 = PayloadType.r0;
        payloadType5 = PayloadType.s0;
        dataPointE5 = DataPoint.e("app_name", false, false, payloadType, payloadType3, payloadType4, payloadType5);
        payloadType6 = PayloadType.m0;
        dataPointE6 = DataPoint.e("app_version", false, false, payloadType, payloadType6, payloadType3, payloadType4, payloadType5);
        dataPointE7 = DataPoint.e("app_short_string", false, false, payloadType, payloadType6, payloadType3, payloadType4, payloadType5);
        dataPointE8 = DataPoint.e("sdk_id", false, false, payloadType);
        dataPointE9 = DataPoint.e("instant_app", false, false, payloadType, payloadType3, payloadType4, payloadType5);
        dataPointE10 = DataPoint.e("bms", false, false, payloadType, payloadType4, payloadType5, payloadType3);
        dataPointE11 = DataPoint.e("screen_inches", false, false, payloadType);
        dataPointE12 = DataPoint.e("device_cores", false, false, payloadType);
        dataPointE13 = DataPoint.e("screen_dpi", false, false, payloadType, payloadType3, payloadType4, payloadType5);
        dataPointE14 = DataPoint.e("manufacturer", false, false, payloadType, payloadType3, payloadType4, payloadType5);
        dataPointE15 = DataPoint.e("product_name", false, false, payloadType, payloadType3, payloadType4, payloadType5);
        dataPointE16 = DataPoint.e("architecture", false, false, payloadType, payloadType3, payloadType4, payloadType5);
        dataPointE17 = DataPoint.e(d9.h.G, false, false, payloadType2, payloadType, payloadType3, payloadType4, payloadType5);
        dataPointE18 = DataPoint.e("disp_h", false, false, payloadType, payloadType3, payloadType4, payloadType5);
        dataPointE19 = DataPoint.e("disp_w", false, false, payloadType, payloadType3, payloadType4, payloadType5);
        dataPointE20 = DataPoint.e("is_genuine", false, false, payloadType, payloadType6);
        dataPointE21 = DataPoint.e("language", false, false, payloadType, payloadType6);
        payloadType7 = PayloadType.p0;
        payloadType8 = PayloadType.q0;
        return new DataPointApi[]{dataPointE, dataPointE2, dataPointE3, dataPointE4, dataPointE5, dataPointE6, dataPointE7, dataPointE8, dataPointE9, dataPointE10, dataPointE11, dataPointE12, dataPointE13, dataPointE14, dataPointE15, dataPointE16, dataPointE17, dataPointE18, dataPointE19, dataPointE20, dataPointE21, DataPoint.e("locale", false, false, payloadType, payloadType7, payloadType8, payloadType3, payloadType4, payloadType5), DataPoint.e(com.smartdigimkt.b0.a.h1, false, false, payloadType2, payloadType, payloadType6, payloadType3, payloadType4, payloadType5), DataPoint.e("screen_brightness", false, false, payloadType, payloadType3, payloadType4, payloadType5), DataPoint.e("device_orientation", false, false, payloadType, payloadType3, payloadType4, payloadType5), DataPoint.e("volume", false, false, payloadType, payloadType3, payloadType4, payloadType5), DataPoint.e("battery_status", false, false, payloadType, payloadType3, payloadType4, payloadType5), DataPoint.e("battery_level", false, false, payloadType, payloadType3, payloadType4, payloadType5), DataPoint.e("timezone", false, false, payloadType, payloadType7, payloadType8, payloadType3, payloadType4, payloadType5), DataPoint.e("ui_mode", false, false, payloadType, payloadType3, payloadType4, payloadType5), DataPoint.e("notifications_enabled", false, false, payloadType, payloadType7, payloadType8, payloadType3, payloadType4, payloadType5), DataPoint.e("iab_usp", false, false, payloadType, payloadType3, payloadType4, payloadType5), DataPoint.e("network_conn_type", false, false, payloadType, payloadType3, payloadType4, payloadType5)};
    }

    @Override // com.kochava.tracker.datapoint.internal.DataPointCollection
    public final synchronized JsonElementApi b(Context context, PayloadMetadata payloadMetadata, String str, ArrayList arrayList, List list) {
        JsonElement jsonElement;
        try {
            str.getClass();
            switch (str) {
                case "instant_app":
                    return JsonElement.f(AppUtil.b(context));
                case "timezone":
                    return new JsonElement(TimeZone.getDefault().getID());
                case "manufacturer":
                    return new JsonElement(Build.MANUFACTURER);
                case "installed_date":
                    return new JsonElement(Long.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime / 1000));
                case "language":
                case "locale":
                    return new JsonElement(Locale.getDefault().getLanguage() + TokenBuilder.TOKEN_DELIMITER + Locale.getDefault().getCountry());
                case "device":
                    return new JsonElement(Build.MODEL + TokenBuilder.TOKEN_DELIMITER + Build.BRAND);
                case "disp_h":
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        throw new UnsupportedOperationException("Cannot retrieve WindowManager");
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    return JsonElement.g(point.y);
                case "disp_w":
                    WindowManager windowManager2 = (WindowManager) context.getSystemService("window");
                    if (windowManager2 == null) {
                        throw new UnsupportedOperationException("Cannot retrieve WindowManager");
                    }
                    Display defaultDisplay2 = windowManager2.getDefaultDisplay();
                    Point point2 = new Point();
                    defaultDisplay2.getRealSize(point2);
                    return JsonElement.g(point2.x);
                case "battery_status":
                    return e(context);
                case "sdk_id":
                    return j(context);
                case "app_version":
                    return new JsonElement(Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                case "battery_level":
                    Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    if (intentRegisterReceiver == null || !intentRegisterReceiver.hasExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL)) {
                        throw new UnsupportedOperationException("Cannot retrieve battery level");
                    }
                    return JsonElement.g(Math.min(100, Math.max(0, intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1))));
                case "volume":
                    AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                    if (audioManager != null) {
                        return new JsonElement(Double.valueOf(Math.min(1.0d, Math.max(0.0d, Math.round(((((double) audioManager.getStreamVolume(3)) * 1.0d) / ((double) audioManager.getStreamMaxVolume(3))) * 10000.0d) / 10000.0d))));
                    }
                    throw new UnsupportedOperationException("Cannot retrieve AudioManager");
                case "package":
                    return new JsonElement(context.getPackageName());
                case "device_cores":
                    return JsonElement.g(Math.max(1, Runtime.getRuntime().availableProcessors()));
                case "ui_mode":
                    return k(context);
                case "screen_dpi":
                    return JsonElement.g(context.getResources().getDisplayMetrics().densityDpi);
                case "installer_package":
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    return installerPackageName != null ? new JsonElement(installerPackageName) : JsonElement.h();
                case "network_conn_type":
                    return g(context);
                case "bms":
                    return new JsonElement(Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                case "os_version":
                    return new JsonElement("Android " + Build.VERSION.RELEASE);
                case "notifications_enabled":
                    return h(context);
                case "architecture":
                    String property = System.getProperty("os.arch");
                    return property != null ? new JsonElement(property) : JsonElement.h();
                case "metrics":
                    JsonObject jsonObjectW = JsonObject.w();
                    jsonObjectW.z(context.getApplicationInfo().minSdkVersion, "min_api");
                    jsonObjectW.z(context.getApplicationInfo().targetSdkVersion, "target_api");
                    return jsonObjectW.p();
                case "product_name":
                    return new JsonElement(Build.PRODUCT);
                case "app_name":
                    return new JsonElement(context.getApplicationInfo().loadLabel(context.getPackageManager()).toString());
                case "screen_inches":
                    return i(context);
                case "is_genuine":
                    return d();
                case "iab_usp":
                    return f(context);
                case "screen_brightness":
                    return new JsonElement(Double.valueOf(Math.min(1.0d, Math.max(0.0d, Math.round((((double) Settings.System.getInt(context.getContentResolver(), "screen_brightness")) / 255.0d) * 10000.0d) / 10000.0d))));
                case "device_orientation":
                    int i2 = context.getResources().getConfiguration().orientation;
                    if (i2 == 2) {
                        jsonElement = new JsonElement(d9.h.C);
                    } else {
                        if (i2 != 1) {
                            throw new UnsupportedOperationException("Orientation undefined");
                        }
                        jsonElement = new JsonElement(d9.h.D);
                    }
                    return jsonElement;
                case "app_short_string":
                    String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                    return str2 != null ? new JsonElement(str2) : JsonElement.h();
                default:
                    throw new Exception("Invalid key name");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
