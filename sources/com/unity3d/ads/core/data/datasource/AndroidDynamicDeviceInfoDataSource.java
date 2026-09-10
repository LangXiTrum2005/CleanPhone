package com.unity3d.ads.core.data.datasource;

import ak.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.T3;
import com.ironsource.X3;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.core.utils.GetMemoryValueFromStringKt;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.OpenAdvertisingId;
import fn.a1;
import fn.c;
import fn.e;
import fn.g;
import fn.n0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoKt;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import qk.i0;
import wj.f;
import xj.b0;
import xj.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 x2\u00020\u0001:\u0001xB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0012J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001aJ\u0019\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u000fJ\u000f\u0010#\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010\u000fJ\u000f\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010\u0012J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0%H\u0016¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0010¢\u0006\u0004\b(\u0010\u0012J\r\u0010)\u001a\u00020\u001f¢\u0006\u0004\b)\u0010!J\r\u0010*\u001a\u00020\u001f¢\u0006\u0004\b*\u0010!J\r\u0010,\u001a\u00020+¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0018¢\u0006\u0004\b.\u0010\u001aJ\r\u0010/\u001a\u00020\u0018¢\u0006\u0004\b/\u0010\u001aJ\u000f\u00101\u001a\u000200H\u0007¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u000200H\u0007¢\u0006\u0004\b3\u00102J\u000f\u00104\u001a\u00020\u0010H\u0007¢\u0006\u0004\b4\u0010\u0012J\u000f\u00105\u001a\u00020\u001fH\u0007¢\u0006\u0004\b5\u0010!J\u000f\u00107\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\rH\u0002¢\u0006\u0004\b9\u0010\u000fJ\u000f\u0010:\u001a\u00020\rH\u0002¢\u0006\u0004\b:\u0010\u000fJ\u000f\u0010;\u001a\u00020\u0018H\u0002¢\u0006\u0004\b;\u0010\u001aJ\u000f\u0010<\u001a\u00020\u001fH\u0002¢\u0006\u0004\b<\u0010!J\u000f\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0010H\u0003¢\u0006\u0004\b@\u0010\u0012J\u000f\u0010A\u001a\u00020\u001fH\u0002¢\u0006\u0004\bA\u0010!J\u000f\u0010B\u001a\u00020\rH\u0002¢\u0006\u0004\bB\u0010\u000fJ\u000f\u0010C\u001a\u00020\rH\u0002¢\u0006\u0004\bC\u0010\u000fJ\u000f\u0010D\u001a\u00020\u0010H\u0002¢\u0006\u0004\bD\u0010\u0012J\u000f\u0010E\u001a\u00020\u0010H\u0002¢\u0006\u0004\bE\u0010\u0012J\u000f\u0010F\u001a\u00020\u001fH\u0002¢\u0006\u0004\bF\u0010!J\u000f\u0010G\u001a\u00020\u001fH\u0002¢\u0006\u0004\bG\u0010!J\u0017\u0010H\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\bH\u0010\u0016J\u0019\u0010K\u001a\u00020\u00182\b\u0010J\u001a\u0004\u0018\u00010IH\u0003¢\u0006\u0004\bK\u0010LJ\u0019\u0010M\u001a\u00020\u00182\b\u0010J\u001a\u0004\u0018\u00010IH\u0002¢\u0006\u0004\bM\u0010LJ\u000f\u0010N\u001a\u00020\u0014H\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0010H\u0002¢\u0006\u0004\bP\u0010\u0012J\u0017\u0010S\u001a\u00020\u00182\u0006\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u001fH\u0002¢\u0006\u0004\bU\u0010!J\u000f\u0010V\u001a\u00020\u001fH\u0002¢\u0006\u0004\bV\u0010!J\u000f\u0010W\u001a\u00020\u001fH\u0002¢\u0006\u0004\bW\u0010!J\u000f\u0010X\u001a\u00020\u0018H\u0002¢\u0006\u0004\bX\u0010\u001aJ\u000f\u0010Y\u001a\u00020\u0018H\u0002¢\u0006\u0004\bY\u0010\u001aJ\u000f\u0010Z\u001a\u00020\u001fH\u0002¢\u0006\u0004\bZ\u0010!J\u000f\u0010[\u001a\u00020\u001fH\u0002¢\u0006\u0004\b[\u0010!J\u000f\u0010\\\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\\\u0010!J\u000f\u0010]\u001a\u00020\u0018H\u0002¢\u0006\u0004\b]\u0010\u001aJ\u0011\u0010_\u001a\u0004\u0018\u00010^H\u0002¢\u0006\u0004\b_\u0010`J\u0011\u0010b\u001a\u0004\u0018\u00010aH\u0002¢\u0006\u0004\bb\u0010cJ\u0011\u0010e\u001a\u0004\u0018\u00010dH\u0002¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020\u001fH\u0002¢\u0006\u0004\bg\u0010!J\u000f\u0010h\u001a\u00020\u001fH\u0003¢\u0006\u0004\bh\u0010!J\u000f\u0010i\u001a\u00020\u001fH\u0002¢\u0006\u0004\bi\u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010j\u001a\u0004\bk\u0010lR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010mR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010nR&\u0010p\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001f0\u001c0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR \u0010t\u001a\b\u0012\u0004\u0012\u00020s0r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w¨\u0006y"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidDynamicDeviceInfoDataSource;", "Lcom/unity3d/ads/core/data/datasource/DynamicDeviceInfoDataSource;", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "lifecycleDataSource", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;Lcom/unity3d/ads/core/log/Logger;)V", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "fetch", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "", "getNetworkCountryISO", "()Ljava/lang/String;", "", "getRingerMode", "()I", "streamType", "", "getStreamMaxVolume", "(I)D", "getScreenBrightness", "", "getTotalMemory", "()J", "getFreeMemory", "", "getProcessInfo", "()Ljava/util/Map;", "", "hasInternet", "()Z", "getOrientation", "getConnectionTypeStr", "getCurrentUiTheme", "", "getLocaleList", "()Ljava/util/List;", "getChargingType", "getStayOnWhilePluggedIn", "getIsSdCardPresent", "Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "getNetworkCapabilityTransports", "()Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "getJvmFreeMemory", "getJvmTotalMemory", "", "getFontScale", "()F", "getAnimatorScale", "getAccessibilityDisplayDaltonizer", "getDisplayInversionEnabled", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "fetchAndroidDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "getLanguage", "getTimeZone", "getTimeZoneOffset", "isUsingWifi", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$ConnectionType;", "getConnectionType", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$ConnectionType;", "getNetworkType", "getNetworkMetered", "getNetworkOperator", "getNetworkOperatorName", "getScreenWidth", "getScreenHeight", "isActiveNetworkConnected", "isWiredHeadsetOn", "getStreamVolume", "Ljava/io/File;", X3.i.f27782b, "getFreeSpace", "(Ljava/io/File;)J", "getUsableSpace", "getBatteryLevel", "()D", "getBatteryStatus", "Lcom/unity3d/services/core/device/Device$MemoryInfoType;", "infoType", "getMemoryInfo", "(Lcom/unity3d/services/core/device/Device$MemoryInfoType;)J", "isAdbEnabled", "adbStatus", "isUSBConnected", "getUptime", "getElapsedRealtime", X3.j.M, "isLimitOpenAdTrackingEnabled", "isAppActive", "getEventTimeStamp", "Landroid/telephony/TelephonyManager;", "getTelephonyManager", "()Landroid/telephony/TelephonyManager;", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "Landroid/media/AudioManager;", "getAudioManager", "()Landroid/media/AudioManager;", "hasInternetConnection", "hasInternetConnectionM", "getAirplaneMode", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "Lcom/unity3d/ads/core/log/Logger;", "Lfn/n0;", "reportedWarning", "Lfn/n0;", "Lfn/e;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "volumeSettingsChange", "Lfn/e;", "getVolumeSettingsChange", "()Lfn/e;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidDynamicDeviceInfoDataSource implements DynamicDeviceInfoDataSource {
    public static final String DIRECTORY_MEM_INFO = "/proc/meminfo";
    public static final String DIRECTORY_MODE_READ = "r";
    public static final String DIRECTORY_PROCESS_INFO = "/proc/self/stat";
    public static final String INTENT_USB_STATE = "android.hardware.usb.action.USB_STATE";
    public static final String KEY_STAT_CONTENT = "stat";
    public static final String SETTING_ACCESSIBILITY_DISPLAY_DALTONIZER = "accessibility_display_daltonizer";
    public static final String SETTING_ACCESSIBILITY_DISPLAY_DALTONIZER_ENABLED = "accessibility_display_daltonizer_enabled";
    public static final String SETTING_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED = "accessibility_display_inversion_enabled";
    public static final String USB_EXTRA_CONNECTED = "connected";
    private final Context context;
    private final LifecycleDataSource lifecycleDataSource;
    private final Logger logger;
    private final n0 reportedWarning;
    private final e volumeSettingsChange;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Device.MemoryInfoType.values().length];
            try {
                iArr[Device.MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Device.MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DynamicDeviceInfoOuterClass.ConnectionType.values().length];
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_CELLULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AndroidDynamicDeviceInfoDataSource(Context context, LifecycleDataSource lifecycleDataSource, Logger logger) {
        n.f(context, "context");
        n.f(lifecycleDataSource, "lifecycleDataSource");
        n.f(logger, "logger");
        this.context = context;
        this.lifecycleDataSource = lifecycleDataSource;
        this.logger = logger;
        this.reportedWarning = g.c(w.f53867a);
        this.volumeSettingsChange = new c(new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this, null), l.f3620a, -2, en.a.f40122a);
    }

    private final boolean adbStatus() {
        Boolean boolValueOf;
        try {
            boolean z10 = true;
            if (1 != Settings.Global.getInt(this.context.getContentResolver(), "adb_enabled", 0)) {
                z10 = false;
            }
            boolValueOf = Boolean.valueOf(z10);
        } catch (Exception e10) {
            this.logger.error("Problems fetching adb enabled status", e10);
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android fetchAndroidDynamicDeviceInfo() {
        DynamicDeviceInfoKt dynamicDeviceInfoKt = DynamicDeviceInfoKt.INSTANCE;
        DynamicDeviceInfoKt.AndroidKt.Dsl.Companion companion = DynamicDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builderNewBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.newBuilder();
        n.e(builderNewBuilder, "newBuilder()");
        DynamicDeviceInfoKt.AndroidKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setNetworkConnected(isActiveNetworkConnected());
        dsl_create.setNetworkType(getNetworkType());
        dsl_create.setNetworkMetered(getNetworkMetered());
        dsl_create.setTelephonyManagerNetworkType(getNetworkType());
        dsl_create.setAdbEnabled(isAdbEnabled());
        dsl_create.setUsbConnected(isUSBConnected());
        dsl_create.setVolume(getStreamVolume(3));
        dsl_create.setMaxVolume(getStreamMaxVolume(3));
        dsl_create.setDeviceElapsedRealtime(getElapsedRealtime());
        dsl_create.setDeviceUpTime(getUptime());
        dsl_create.setAirplaneMode(getAirplaneMode());
        dsl_create.setChargingType(getChargingType());
        dsl_create.setStayOnWhilePluggedIn(getStayOnWhilePluggedIn());
        dsl_create.setSdCardPresent(getIsSdCardPresent());
        dsl_create.setNetworkCapabilityTransports(getNetworkCapabilityTransports());
        dsl_create.setJvmFreeMemory(getJvmFreeMemory());
        dsl_create.setJvmTotalMemory(getJvmTotalMemory());
        dsl_create.setFontScale(getFontScale());
        dsl_create.setAnimatorScale(getAnimatorScale());
        dsl_create.setAccessibilityDisplayDaltonizer(getAccessibilityDisplayDaltonizer());
        dsl_create.setDisplayInversionEnabled(getDisplayInversionEnabled());
        return dsl_create._build();
    }

    private final boolean getAirplaneMode() {
        try {
            return Settings.Global.getInt(this.context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Throwable th2) {
            this.logger.error("Problems fetching airplane mode status", th2);
            return false;
        }
    }

    private final AudioManager getAudioManager() {
        Object systemService = this.context.getSystemService("audio");
        if (systemService instanceof AudioManager) {
            return (AudioManager) systemService;
        }
        return null;
    }

    private final double getBatteryLevel() {
        Intent intentRegisterReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return -1.0d;
        }
        return ((double) intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, 0)) / ((double) intentRegisterReceiver.getIntExtra("scale", 0));
    }

    private final int getBatteryStatus() {
        Intent intentRegisterReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("status", 0);
        }
        return -1;
    }

    private final DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
        if (isUsingWifi()) {
            return DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_WIFI;
        }
        return isActiveNetworkConnected() ? DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_CELLULAR : DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_UNSPECIFIED;
    }

    private final ConnectivityManager getConnectivityManager() {
        Object systemService = this.context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            return (ConnectivityManager) systemService;
        }
        return null;
    }

    private final long getElapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    private final long getEventTimeStamp() {
        return System.currentTimeMillis() / ((long) 1000);
    }

    private final long getFreeSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return a.a.H(file.getFreeSpace() / ((long) 1024));
    }

    private final String getLanguage() {
        String string = Locale.getDefault().toString();
        n.e(string, "getDefault().toString()");
        return string;
    }

    private final long getMemoryInfo(Device.MemoryInfoType infoType) throws IOException {
        int i10 = WhenMappings.$EnumSwitchMapping$0[infoType.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = -1;
            }
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(DIRECTORY_MEM_INFO, "r");
        String line = null;
        for (int i12 = 0; i12 < i11; i12++) {
            try {
                line = randomAccessFile.readLine();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    i0.j(randomAccessFile, th2);
                    throw th3;
                }
            }
        }
        randomAccessFile.close();
        return GetMemoryValueFromStringKt.getMemoryValueFromString(line);
    }

    private final boolean getNetworkMetered() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        return connectivityManager != null && connectivityManager.isActiveNetworkMetered();
    }

    private final String getNetworkOperator() {
        TelephonyManager telephonyManager = getTelephonyManager();
        String networkOperator = telephonyManager != null ? telephonyManager.getNetworkOperator() : null;
        return networkOperator == null ? "" : networkOperator;
    }

    private final String getNetworkOperatorName() {
        TelephonyManager telephonyManager = getTelephonyManager();
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        return networkOperatorName == null ? "" : networkOperatorName;
    }

    @SuppressLint({"MissingPermission"})
    private final int getNetworkType() {
        a1 a1Var;
        Object value;
        TelephonyManager telephonyManager = getTelephonyManager();
        if (telephonyManager != null) {
            try {
                return telephonyManager.getNetworkType();
            } catch (SecurityException unused) {
                if (!n.a(((Map) ((a1) this.reportedWarning).getValue()).get("getNetworkType"), Boolean.TRUE)) {
                    n0 n0Var = this.reportedWarning;
                    do {
                        a1Var = (a1) n0Var;
                        value = a1Var.getValue();
                    } while (!a1Var.c0(value, b0.U((Map) value, new f("getNetworkType", Boolean.TRUE))));
                    this.logger.info("Unity Ads was not able to get current network type due to missing permission");
                }
            }
        }
        return -1;
    }

    private final int getScreenHeight() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.heightPixels;
    }

    private final int getScreenWidth() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double getStreamVolume(int streamType) {
        AudioManager audioManager = getAudioManager();
        return audioManager != null ? audioManager.getStreamVolume(streamType) : -2;
    }

    private final TelephonyManager getTelephonyManager() {
        Object systemService = this.context.getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            return (TelephonyManager) systemService;
        }
        return null;
    }

    private final String getTimeZone() {
        try {
            String displayName = TimeZone.getDefault().getDisplayName(false, 0, Locale.US);
            n.e(displayName, "{\n            TimeZone.g…ORT, Locale.US)\n        }");
            return displayName;
        } catch (AssertionError e10) {
            Logger.DefaultImpls.error$default(this.logger, "Could not read timeZone information: " + e10.getMessage(), null, 2, null);
            return "";
        }
    }

    private final long getTimeZoneOffset() {
        return ((long) TimeZone.getDefault().getOffset(System.currentTimeMillis())) / ((long) 1000);
    }

    private final long getUptime() {
        return SystemClock.uptimeMillis();
    }

    private final long getUsableSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return a.a.H(file.getUsableSpace() / ((long) 1024));
    }

    private final boolean hasInternetConnection() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = getConnectivityManager();
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    private final boolean hasInternetConnectionM() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = getConnectivityManager();
        return connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    private final boolean isActiveNetworkConnected() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private final boolean isAdbEnabled() {
        return adbStatus();
    }

    private final boolean isAppActive() {
        return this.lifecycleDataSource.appIsForeground();
    }

    private final boolean isLimitAdTrackingEnabled() {
        return AdvertisingId.getLimitedAdTracking();
    }

    private final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    private final boolean isUSBConnected() {
        Intent intentRegisterReceiver = this.context.registerReceiver(null, new IntentFilter(INTENT_USB_STATE));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getBooleanExtra(USB_EXTRA_CONNECTED, false);
        }
        return false;
    }

    private final boolean isUsingWifi() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager == null) {
            return false;
        }
        TelephonyManager telephonyManager = getTelephonyManager();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && connectivityManager.getBackgroundDataSetting() && activeNetworkInfo.isConnected() && telephonyManager != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected();
    }

    private final boolean isWiredHeadsetOn() {
        AudioManager audioManager = getAudioManager();
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch() {
        DynamicDeviceInfoKt.Dsl.Companion companion = DynamicDeviceInfoKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builderNewBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder();
        n.e(builderNewBuilder, "newBuilder()");
        DynamicDeviceInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setLanguage(getLanguage());
        dsl_create.setNetworkOperator(getNetworkOperator());
        dsl_create.setNetworkOperatorName(getNetworkOperatorName());
        dsl_create.setFreeDiskSpace(getUsableSpace(this.context.getExternalFilesDir(null)));
        dsl_create.setFreeRamMemory(getFreeMemory());
        dsl_create.setWiredHeadset(isWiredHeadsetOn());
        dsl_create.setTimeZone(getTimeZone());
        dsl_create.setTimeZoneOffset(getTimeZoneOffset());
        dsl_create.setLimitedTracking(isLimitAdTrackingEnabled());
        dsl_create.setLimitedOpenAdTracking(isLimitOpenAdTrackingEnabled());
        dsl_create.setBatteryLevel(getBatteryLevel());
        dsl_create.setBatteryStatus(getBatteryStatus());
        dsl_create.setConnectionType(getConnectionType());
        dsl_create.setAndroid(fetchAndroidDynamicDeviceInfo());
        dsl_create.setAppActive(isAppActive());
        dsl_create.setScreenWidth(getScreenWidth());
        dsl_create.setScreenHeight(getScreenHeight());
        return dsl_create._build();
    }

    public final int getAccessibilityDisplayDaltonizer() {
        try {
            Integer numValueOf = Integer.valueOf(Settings.Secure.getInt(this.context.getContentResolver(), SETTING_ACCESSIBILITY_DISPLAY_DALTONIZER_ENABLED, 0));
            if (numValueOf.intValue() == 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return Settings.Secure.getInt(this.context.getContentResolver(), SETTING_ACCESSIBILITY_DISPLAY_DALTONIZER, -1);
            }
            return -1;
        } catch (Throwable th2) {
            this.logger.error("Problems fetching accessibility display daltonizer", th2);
            return -1;
        }
    }

    public final float getAnimatorScale() {
        try {
            return Settings.Global.getFloat(this.context.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Throwable th2) {
            this.logger.error("Problems fetching animator scale", th2);
            return 1.0f;
        }
    }

    public final int getChargingType() {
        Intent intentRegisterReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public String getConnectionTypeStr() {
        int i10 = WhenMappings.$EnumSwitchMapping$1[getConnectionType().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? "none" : T3.f27215g;
        }
        return T3.f27210b;
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public int getCurrentUiTheme() {
        return this.context.getResources().getConfiguration().uiMode;
    }

    public final boolean getDisplayInversionEnabled() {
        try {
            return Settings.Secure.getInt(this.context.getContentResolver(), SETTING_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED, 0) != 0;
        } catch (Throwable th2) {
            this.logger.error("Problems fetching display inversion enabled status", th2);
            return false;
        }
    }

    public final float getFontScale() {
        return this.context.getResources().getConfiguration().fontScale;
    }

    public final long getFreeMemory() {
        return getMemoryInfo(Device.MemoryInfoType.FREE_MEMORY);
    }

    public final boolean getIsSdCardPresent() {
        return n.a(Environment.getExternalStorageState(), "mounted");
    }

    public final long getJvmFreeMemory() {
        return Runtime.getRuntime().freeMemory();
    }

    public final long getJvmTotalMemory() {
        return Runtime.getRuntime().totalMemory();
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public List<String> getLocaleList() {
        LocaleList locales = this.context.getResources().getConfiguration().getLocales();
        n.e(locales, "context.resources.configuration.locales");
        int size = locales.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String string = locales.get(i10).toString();
            n.e(string, "locales[it].toString()");
            arrayList.add(string);
        }
        return arrayList;
    }

    public final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
        Network activeNetwork;
        NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder result = NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder();
        if (Build.VERSION.SDK_INT < 31) {
            NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransportsBuild = result.build();
            n.e(networkCapabilityTransportsBuild, "result.build()");
            return networkCapabilityTransportsBuild;
        }
        Object systemService = this.context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null) {
            NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransportsBuild2 = result.build();
            n.e(networkCapabilityTransportsBuild2, "result.build()");
            return networkCapabilityTransportsBuild2;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransportsBuild3 = result.build();
            n.e(networkCapabilityTransportsBuild3, "result.build()");
            return networkCapabilityTransportsBuild3;
        }
        boolean zHasTransport = networkCapabilities.hasTransport(1);
        n.e(result, "result");
        result.setWifi(zHasTransport);
        result.setCellular(networkCapabilities.hasTransport(0));
        result.setVpn(networkCapabilities.hasTransport(4));
        result.setEthernet(networkCapabilities.hasTransport(3));
        result.setWifiAware(networkCapabilities.hasTransport(5));
        result.setLowpan(networkCapabilities.hasTransport(6));
        result.setBluetooth(networkCapabilities.hasTransport(2));
        NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransportsBuild4 = result.build();
        n.e(networkCapabilityTransportsBuild4, "result.build()");
        return networkCapabilityTransportsBuild4;
    }

    public final String getNetworkCountryISO() {
        TelephonyManager telephonyManager = getTelephonyManager();
        String networkCountryIso = telephonyManager != null ? telephonyManager.getNetworkCountryIso() : null;
        return networkCountryIso == null ? "" : networkCountryIso;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public String getOrientation() {
        return getScreenHeight() > getScreenWidth() ? X3.i.D : X3.i.C;
    }

    public final Map<String, String> getProcessInfo() throws IOException {
        HashMap map = new HashMap();
        RandomAccessFile randomAccessFile = new RandomAccessFile(DIRECTORY_PROCESS_INFO, "r");
        try {
            String statContent = randomAccessFile.readLine();
            n.e(statContent, "statContent");
            map.put(KEY_STAT_CONTENT, statContent);
            randomAccessFile.close();
            return map;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(randomAccessFile, th2);
                throw th3;
            }
        }
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public int getRingerMode() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            return audioManager.getRingerMode();
        }
        return -2;
    }

    public final int getScreenBrightness() {
        return Settings.System.getInt(this.context.getContentResolver(), "screen_brightness", -1);
    }

    public final boolean getStayOnWhilePluggedIn() {
        try {
            return Settings.Global.getInt(this.context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Throwable th2) {
            this.logger.error("Problems fetching stay on while plugged in status", th2);
            return false;
        }
    }

    public final double getStreamMaxVolume(int streamType) {
        AudioManager audioManager = getAudioManager();
        return audioManager != null ? audioManager.getStreamMaxVolume(streamType) : -2;
    }

    public final long getTotalMemory() {
        return getMemoryInfo(Device.MemoryInfoType.TOTAL_MEMORY);
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public e getVolumeSettingsChange() {
        return this.volumeSettingsChange;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public boolean hasInternet() {
        return hasInternetConnectionM();
    }
}
