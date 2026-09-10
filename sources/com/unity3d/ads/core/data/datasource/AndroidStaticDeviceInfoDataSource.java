package com.unity3d.ads.core.data.datasource;

import aa.b;
import ak.f;
import an.h;
import an.p;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.SystemClock;
import android.os.ext.SdkExtensions;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.webkit.WebSettings;
import ck.c;
import ck.e;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.controller.y;
import com.unity3d.ads.core.data.model.StorageType;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.core.utils.GetMemoryValueFromStringKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.OpenAdvertisingId;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoKt;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.security.auth.x500.X500Principal;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import qk.i0;
import xj.o;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u008c\u00012\u00020\u0001:\u0002\u008c\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\r\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u0019J\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u0004\u0018\u00010\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b%\u0010!J\u0015\u0010&\u001a\u0004\u0018\u00010\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b&\u0010!J\r\u0010'\u001a\u00020\u0011¢\u0006\u0004\b'\u0010\u0019J\r\u0010(\u001a\u00020\u0011¢\u0006\u0004\b(\u0010\u0019J\r\u0010)\u001a\u00020\u0011¢\u0006\u0004\b)\u0010\u0019J\r\u0010*\u001a\u00020\u0011¢\u0006\u0004\b*\u0010\u0019J\r\u0010+\u001a\u00020\u0011¢\u0006\u0004\b+\u0010\u0019J\r\u0010,\u001a\u00020\u0011¢\u0006\u0004\b,\u0010\u0019J\r\u0010-\u001a\u00020\u0011¢\u0006\u0004\b-\u0010\u0019J\r\u0010.\u001a\u00020\u0011¢\u0006\u0004\b.\u0010\u0019J\u0013\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b/\u00100J\u0013\u00102\u001a\b\u0012\u0004\u0012\u0002010\u0010¢\u0006\u0004\b2\u00100J\u000f\u00103\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b3\u0010\u0019J\u000f\u00104\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b4\u0010\u0019J\r\u00105\u001a\u00020\"¢\u0006\u0004\b5\u0010$J\u0017\u00108\u001a\u00020\"2\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0011H\u0016¢\u0006\u0004\b:\u0010\u0019J\r\u0010;\u001a\u00020\u001d¢\u0006\u0004\b;\u0010\u001fJ\r\u0010<\u001a\u00020\u001d¢\u0006\u0004\b<\u0010\u001fJ\u000f\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020@H\u0002¢\u0006\u0004\bC\u0010BJ\u000f\u0010D\u001a\u00020\u0011H\u0002¢\u0006\u0004\bD\u0010\u0019J\u000f\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020@H\u0002¢\u0006\u0004\bH\u0010BJ\u000f\u0010I\u001a\u00020@H\u0002¢\u0006\u0004\bI\u0010BJ\u000f\u0010J\u001a\u00020@H\u0002¢\u0006\u0004\bJ\u0010BJ\u000f\u0010K\u001a\u00020\u001dH\u0002¢\u0006\u0004\bK\u0010\u001fJ\u0017\u0010M\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\u0011H\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0011H\u0003¢\u0006\u0004\bO\u0010\u0019J\u000f\u0010P\u001a\u00020\u0011H\u0002¢\u0006\u0004\bP\u0010\u0019J\u000f\u0010Q\u001a\u00020\u0011H\u0003¢\u0006\u0004\bQ\u0010\u0019J\u000f\u0010R\u001a\u00020\u0011H\u0002¢\u0006\u0004\bR\u0010\u0019J\u000f\u0010S\u001a\u00020\"H\u0002¢\u0006\u0004\bS\u0010$J\u000f\u0010T\u001a\u00020\"H\u0002¢\u0006\u0004\bT\u0010$J\u0015\u0010U\u001a\u0004\u0018\u00010\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\bU\u0010!J\u0015\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\bV\u00100J\u0015\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00110WH\u0003¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u0011H\u0002¢\u0006\u0004\bZ\u0010\u0019J\u000f\u0010[\u001a\u00020@H\u0002¢\u0006\u0004\b[\u0010BJ%\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\"H\u0002¢\u0006\u0004\b^\u0010$J\u000f\u0010_\u001a\u00020\u0011H\u0002¢\u0006\u0004\b_\u0010\u0019J\u000f\u0010`\u001a\u00020\u001dH\u0002¢\u0006\u0004\b`\u0010\u001fJ\u000f\u0010a\u001a\u00020\u0011H\u0002¢\u0006\u0004\ba\u0010\u0019J\u000f\u0010b\u001a\u00020\u0011H\u0002¢\u0006\u0004\bb\u0010\u0019J\u0017\u0010e\u001a\u00020\"2\u0006\u0010d\u001a\u00020cH\u0002¢\u0006\u0004\be\u0010fJ\u0019\u0010g\u001a\u00020\"2\b\u00107\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\bg\u00109J\u0015\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\bh\u00100J\u0019\u0010k\u001a\u0004\u0018\u0001062\u0006\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020\u0011H\u0002¢\u0006\u0004\bm\u0010\u0019J\u000f\u0010n\u001a\u00020\u001dH\u0002¢\u0006\u0004\bn\u0010\u001fJ\u000f\u0010o\u001a\u00020@H\u0002¢\u0006\u0004\bo\u0010BJ\u001f\u0010r\u001a\b\u0012\u0004\u0012\u00020q0\u00102\b\u0010p\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\br\u0010sJ!\u0010u\u001a\u00020\u001d2\u0006\u0010t\u001a\u00020q2\b\u0010p\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\bu\u0010vJ\u0017\u0010w\u001a\u00020\u001d2\u0006\u0010t\u001a\u00020qH\u0003¢\u0006\u0004\bw\u0010xJ!\u0010y\u001a\u00020\u001d2\u0006\u0010t\u001a\u00020q2\b\u0010p\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\by\u0010vJ\u0017\u0010z\u001a\u00020\u001d2\u0006\u0010t\u001a\u00020qH\u0003¢\u0006\u0004\bz\u0010xJ\u000f\u0010{\u001a\u00020@H\u0002¢\u0006\u0004\b{\u0010BJ\u000f\u0010|\u001a\u00020\u0011H\u0002¢\u0006\u0004\b|\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010}\u001a\u0004\b~\u0010\u007fR\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0080\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0081\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0082\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0083\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u008d\u0001"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidStaticDeviceInfoDataSource;", "Lcom/unity3d/ads/core/data/datasource/StaticDeviceInfoDataSource;", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "glInfoStore", "Lcom/unity3d/ads/core/data/datasource/AnalyticsDataSource;", "analyticsDataSource", "Lcom/unity3d/ads/core/data/datasource/StoreDataSource;", "storeDataSource", "Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;", "unityBootConfigDataSource", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/AnalyticsDataSource;Lcom/unity3d/ads/core/data/datasource/StoreDataSource;Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;Lcom/unity3d/ads/core/log/Logger;)V", "", "", "additionalStores", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "fetch", "(Ljava/util/List;Lak/f;)Ljava/lang/Object;", "fetchCached", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getOsVersion", "()Ljava/lang/String;", "getManufacturer", "getModel", "getAdvertisingTrackingId", "", "isLimitOpenAdTrackingEnabled", "()Z", "getIdfi", "(Lak/f;)Ljava/lang/Object;", "", "getSystemBootTime", "()J", "getAuid", "getUnityBuildGuid", "getBoard", "getBootloader", "getBrand", "getDisplay", "getDevice", "getHardware", "getHost", "getProduct", "getSupportedAbis", "()Ljava/util/List;", "Landroid/hardware/Sensor;", "getSensorList", "getBuildId", "getBuildVersionIncremental", "getTotalMemory", "Ljava/io/File;", X3.i.f27782b, "getTotalSpace", "(Ljava/io/File;)J", "getAppName", "hasX264Decoder", "hasX265Decoder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "fetchAndroidStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "", "getApiLevel", "()I", "getScreenLayout", "getOpenAdvertisingTrackingId", "", "getDisplayMetricDensity", "()F", "getScreenDensity", "getScreenWidth", "getScreenHeight", "isRooted", "binary", "searchPathForBinary", "(Ljava/lang/String;)Z", "getCertificateFingerprint", "getFingerprint", "getInstallerPackageName", "getCPUModel", "getCPUCount", "getJvmMaxMemory", "getGPUModel", "getOldAbiList", "Ljava/util/ArrayList;", "getNewAbiList", "()Ljava/util/ArrayList;", "getWebViewUserAgent", "getVersionCode", "getStores", "(Ljava/util/List;)Ljava/util/List;", "getAppStartTime", "getVersionName", "isTestMode", "getPlatform", "getGameId", "Lcom/unity3d/services/core/device/Device$MemoryInfoType;", "infoType", "getMemoryInfo", "(Lcom/unity3d/services/core/device/Device$MemoryInfoType;)J", "getTotalSpaceBytes", "getKeyboardLanguages", "Lcom/unity3d/ads/core/data/model/StorageType;", "storageType", "getFileForStorageType", "(Lcom/unity3d/ads/core/data/model/StorageType;)Ljava/io/File;", "getAppVersion", "isAppDebuggable", "getExtensionVersion", "mimeType", "Landroid/media/MediaCodecInfo;", "selectAllDecodeCodecs", "(Ljava/lang/String;)Ljava/util/List;", "codecInfo", "isHardwareAccelerated", "(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z", "isHardwareAcceleratedV29", "(Landroid/media/MediaCodecInfo;)Z", "isSoftwareOnly", "isSoftwareOnlyV29", "getPhoneType", "getSimOperator", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "Lcom/unity3d/ads/core/data/datasource/AnalyticsDataSource;", "Lcom/unity3d/ads/core/data/datasource/StoreDataSource;", "Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;", "Lcom/unity3d/ads/core/log/Logger;", "Ljavax/security/auth/x500/X500Principal;", "DEBUG_CERT", "Ljavax/security/auth/x500/X500Principal;", "staticDeviceInfo", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getAnalyticsUserId", "analyticsUserId", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidStaticDeviceInfoDataSource implements StaticDeviceInfoDataSource {
    public static final String ALGORITHM_SHA1 = "SHA-1";
    public static final String APP_VERSION_FAKE = "FakeVersionName";
    public static final String BINARY_SU = "su";
    public static final String CERTIFICATE_TYPE_X509 = "X.509";
    public static final String ENVIRONMENT_VARIABLE_PATH = "PATH";
    public static final String PLATFORM_ANDROID = "android";
    public static final String STORE_GOOGLE = "google";
    private final X500Principal DEBUG_CERT;
    private final AnalyticsDataSource analyticsDataSource;
    private final Context context;
    private final ByteStringDataSource glInfoStore;
    private final Logger logger;
    private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo;
    private final StoreDataSource storeDataSource;
    private final UnityBootConfigDataSource unityBootConfigDataSource;

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
            int[] iArr2 = new int[StorageType.values().length];
            try {
                iArr2[StorageType.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[StorageType.EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", l = {InterfaceC0435l1.d.b.f29109f}, m = "fetch")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidStaticDeviceInfoDataSource.this.fetch(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", l = {IronSourceError.ERROR_CODE_INIT_FAILED}, m = "getGPUModel")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class C07361 extends c {
        int label;
        /* synthetic */ Object result;

        public C07361(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidStaticDeviceInfoDataSource.this.getGPUModel(this);
        }
    }

    public AndroidStaticDeviceInfoDataSource(Context context, ByteStringDataSource glInfoStore, AnalyticsDataSource analyticsDataSource, StoreDataSource storeDataSource, UnityBootConfigDataSource unityBootConfigDataSource, Logger logger) {
        n.f(context, "context");
        n.f(glInfoStore, "glInfoStore");
        n.f(analyticsDataSource, "analyticsDataSource");
        n.f(storeDataSource, "storeDataSource");
        n.f(unityBootConfigDataSource, "unityBootConfigDataSource");
        n.f(logger, "logger");
        this.context = context;
        this.glInfoStore = glInfoStore;
        this.analyticsDataSource = analyticsDataSource;
        this.storeDataSource = storeDataSource;
        this.unityBootConfigDataSource = unityBootConfigDataSource;
        this.logger = logger;
        this.DEBUG_CERT = new X500Principal("CN=Android Debug,O=Android,C=US");
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builderNewBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder();
        n.e(builderNewBuilder, "newBuilder()");
        StaticDeviceInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setBundleId(getAppName());
        dsl_create.setBundleVersion(getAppVersion());
        dsl_create.setAppDebuggable(isAppDebuggable());
        dsl_create.setRooted(isRooted());
        dsl_create.setOsVersion(getOsVersion());
        dsl_create.setDeviceMake(getManufacturer());
        dsl_create.setDeviceModel(getModel());
        dsl_create.setWebviewUa(getWebViewUserAgent());
        dsl_create.setScreenDensity(getScreenDensity());
        dsl_create.setScreenWidth(getScreenWidth());
        dsl_create.setScreenHeight(getScreenHeight());
        dsl_create.setScreenSize(getScreenLayout());
        dsl_create.addAllStores(dsl_create.getStores(), getStores$default(this, null, 1, null));
        StorageType storageType = StorageType.EXTERNAL;
        dsl_create.setTotalDiskSpace(getTotalSpace(getFileForStorageType(storageType)));
        dsl_create.setTotalDiskSpaceBytes(getTotalSpaceBytes(getFileForStorageType(storageType)));
        dsl_create.addAllKeyboardLanguages(dsl_create.getKeyboardLanguages(), getKeyboardLanguages());
        dsl_create.setTotalRamMemory(getTotalMemory());
        dsl_create.setCpuModel(getCPUModel());
        dsl_create.setCpuCount(getCPUCount());
        dsl_create.setAndroid(fetchAndroidStaticDeviceInfo());
        dsl_create.setMadeWithUnity(MadeWithUnityDetector.isMadeWithUnity());
        this.staticDeviceInfo = dsl_create._build();
    }

    private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android fetchAndroidStaticDeviceInfo() {
        StaticDeviceInfoKt staticDeviceInfoKt = StaticDeviceInfoKt.INSTANCE;
        StaticDeviceInfoKt.AndroidKt.Dsl.Companion companion = StaticDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builderNewBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder();
        n.e(builderNewBuilder, "newBuilder()");
        StaticDeviceInfoKt.AndroidKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setApiLevel(getApiLevel());
        dsl_create.setVersionCode(getVersionCode());
        dsl_create.setAndroidFingerprint(getFingerprint());
        dsl_create.setAppInstaller(getInstallerPackageName());
        dsl_create.setApkDeveloperSigningCertificateHash(getCertificateFingerprint());
        dsl_create.setBuildBoard(getBoard());
        dsl_create.setBuildBrand(getBrand());
        dsl_create.setBuildDevice(getDevice());
        dsl_create.setBuildDisplay(getDisplay());
        dsl_create.setBuildFingerprint(getFingerprint());
        dsl_create.setBuildHardware(getHardware());
        dsl_create.setBuildHost(getHost());
        dsl_create.setBuildBootloader(getBootloader());
        dsl_create.setBuildProduct(getProduct());
        dsl_create.setExtensionVersion(getExtensionVersion());
        String buildId = getBuildId();
        if (buildId != null) {
            dsl_create.setBuildId(buildId);
        }
        dsl_create.setPhoneType(getPhoneType());
        dsl_create.setSimOperator(getSimOperator());
        dsl_create.setJvmMaxMemory(getJvmMaxMemory());
        return dsl_create._build();
    }

    private final int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    private final long getAppStartTime() {
        return SdkProperties.getInitializationTimeEpoch();
    }

    private final String getAppVersion() {
        String packageName = this.context.getPackageName();
        PackageManager packageManager = this.context.getPackageManager();
        try {
            String str = packageManager.getPackageInfo(packageName, 0).versionName == null ? APP_VERSION_FAKE : packageManager.getPackageInfo(packageName, 0).versionName;
            n.e(str, "{\n            if (pm.get…e\n            }\n        }");
            return str;
        } catch (PackageManager.NameNotFoundException e10) {
            this.logger.error("Error getting package info", e10);
            return "";
        }
    }

    private final long getCPUCount() {
        return Runtime.getRuntime().availableProcessors();
    }

    private final String getCPUModel() throws IOException {
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.SOC_MODEL;
            n.e(str, "{\n            Build.SOC_MODEL\n        }");
            return str;
        }
        try {
            File file = new File("/proc/cpuinfo");
            Charset charset = an.a.f3768a;
            n.f(charset, "charset");
            ArrayList arrayList = new ArrayList();
            t9.e.j(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), new y(arrayList, 4));
            return (String) xj.n.w0(arrayList);
        } catch (FileNotFoundException e10) {
            this.logger.error("Error reading CPU model", e10);
            return "";
        }
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final String getCertificateFingerprint() {
        try {
            Signature[] signatureArr = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 64).signatures;
            if (signatureArr == null) {
                return "";
            }
            if (signatureArr.length == 0) {
                return "";
            }
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
            n.d(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            String hexString = Utilities.toHexString(MessageDigest.getInstance(ALGORITHM_SHA1).digest(((X509Certificate) certificateGenerateCertificate).getEncoded()));
            n.e(hexString, "toHexString(publicKey)");
            return hexString;
        } catch (Exception e10) {
            this.logger.error("Exception when signing certificate fingerprint", e10);
            return "";
        }
    }

    private final float getDisplayMetricDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        return (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : displayMetrics.density;
    }

    private final int getExtensionVersion() {
        return SdkExtensions.getExtensionVersion(30);
    }

    private final File getFileForStorageType(StorageType storageType) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[storageType.ordinal()];
        if (i10 == 1) {
            return this.context.getCacheDir();
        }
        if (i10 == 2) {
            return this.context.getExternalCacheDir();
        }
        Logger.DefaultImpls.error$default(this.logger, "Unhandled storagetype: " + storageType, null, 2, null);
        return null;
    }

    private final String getFingerprint() {
        String str = Build.FINGERPRINT;
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getGPUModel(f fVar) {
        C07361 c07361;
        if (fVar instanceof C07361) {
            c07361 = (C07361) fVar;
            int i10 = c07361.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07361.label = i10 - Integer.MIN_VALUE;
            } else {
                c07361 = new C07361(fVar);
            }
        } else {
            c07361 = new C07361(fVar);
        }
        Object obj = c07361.result;
        int i11 = c07361.label;
        if (i11 == 0) {
            t9.e.z(obj);
            ByteStringDataSource byteStringDataSource = this.glInfoStore;
            c07361.label = 1;
            obj = byteStringDataSource.get(c07361);
            bk.a aVar = bk.a.f5708a;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
        }
        return ((ByteStringStoreOuterClass.ByteStringStore) obj).getData().toString(an.a.f3768a);
    }

    private final String getGameId() {
        String gameId = ClientProperties.getGameId();
        return gameId == null ? "" : gameId;
    }

    private final String getInstallerPackageName() {
        String installerPackageName = this.context.getPackageManager().getInstallerPackageName(this.context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    private final long getJvmMaxMemory() {
        return Runtime.getRuntime().maxMemory();
    }

    private final List<String> getKeyboardLanguages() {
        v vVar = v.f53866a;
        try {
            Object systemService = this.context.getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager == null) {
                return vVar;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            List<InputMethodInfo> inputMethodList = inputMethodManager.getInputMethodList();
            n.e(inputMethodList, "imm.inputMethodList");
            Iterator<T> it = inputMethodList.iterator();
            while (it.hasNext()) {
                List<InputMethodSubtype> subtypes = inputMethodManager.getEnabledInputMethodSubtypeList((InputMethodInfo) it.next(), true);
                n.e(subtypes, "subtypes");
                Iterator<T> it2 = subtypes.iterator();
                while (it2.hasNext()) {
                    String locale = ((InputMethodSubtype) it2.next()).getLocale();
                    n.e(locale, "subtype.locale");
                    if (locale.length() > 0) {
                        linkedHashSet.add(locale);
                    }
                }
            }
            return xj.n.N0(linkedHashSet);
        } catch (Exception e10) {
            this.logger.error("Error getting keyboard languages", e10);
            return vVar;
        }
    }

    private final long getMemoryInfo(Device.MemoryInfoType infoType) throws IOException {
        int i10 = WhenMappings.$EnumSwitchMapping$0[infoType.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                throw new b((byte) 0, 20);
            }
        }
        String line = null;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO, "r");
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
        } catch (FileNotFoundException e10) {
            this.logger.error("Error reading memory info", e10);
        }
        return GetMemoryValueFromStringKt.getMemoryValueFromString(line);
    }

    @TargetApi(21)
    private final ArrayList<String> getNewAbiList() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        n.e(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        arrayList.addAll(o.Q(Arrays.copyOf(SUPPORTED_ABIS, SUPPORTED_ABIS.length)));
        return arrayList;
    }

    private final List<String> getOldAbiList() {
        ArrayList arrayList = new ArrayList();
        String CPU_ABI = Build.CPU_ABI;
        n.e(CPU_ABI, "CPU_ABI");
        arrayList.add(CPU_ABI);
        String CPU_ABI2 = Build.CPU_ABI2;
        n.e(CPU_ABI2, "CPU_ABI2");
        arrayList.add(CPU_ABI2);
        return arrayList;
    }

    private final String getOpenAdvertisingTrackingId() {
        String openAdvertisingTrackingId = OpenAdvertisingId.getOpenAdvertisingTrackingId();
        return openAdvertisingTrackingId == null ? "" : openAdvertisingTrackingId;
    }

    private final int getPhoneType() {
        Object systemService = this.context.getSystemService("phone");
        n.d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return ((TelephonyManager) systemService).getPhoneType();
    }

    private final String getPlatform() {
        return "android";
    }

    private final int getScreenDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.densityDpi;
    }

    private final int getScreenHeight() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.heightPixels;
    }

    private final int getScreenLayout() {
        return this.context.getResources().getConfiguration().screenLayout;
    }

    private final int getScreenWidth() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.widthPixels;
    }

    private final String getSimOperator() {
        Object systemService = this.context.getSystemService("phone");
        n.d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String simOperator = ((TelephonyManager) systemService).getSimOperator();
        n.e(simOperator, "telephonyManager.simOperator");
        return simOperator;
    }

    private final List<String> getStores(List<String> additionalStores) {
        return this.storeDataSource.fetchStores(additionalStores);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List getStores$default(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = v.f53866a;
        }
        return androidStaticDeviceInfoDataSource.getStores(list);
    }

    private final long getTotalSpaceBytes(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return file.getTotalSpace();
    }

    private final int getVersionCode() {
        return 41801;
    }

    private final String getVersionName() {
        return "4.18.1";
    }

    private final String getWebViewUserAgent() {
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.context);
            n.e(defaultUserAgent, "{\n        WebSettings.ge…tUserAgent(context)\n    }");
            return defaultUserAgent;
        } catch (Exception e10) {
            this.logger.error("Exception getting webview user agent", e10);
            return "";
        }
    }

    private final boolean isAppDebuggable() {
        boolean zA;
        PackageManager packageManager = this.context.getPackageManager();
        n.e(packageManager, "context.packageManager");
        String packageName = this.context.getPackageName();
        n.e(packageName, "context.packageName");
        boolean z10 = true;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            n.e(applicationInfo, "pm.getApplicationInfo(pkgName, 0)");
            int i10 = applicationInfo.flags & 2;
            applicationInfo.flags = i10;
            if (i10 != 0) {
                zA = true;
                z10 = false;
            } else {
                z10 = false;
                zA = false;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            this.logger.error("Could not find name", e10);
            zA = false;
        }
        if (z10) {
            try {
                Signature[] signatures = packageManager.getPackageInfo(packageName, 64).signatures;
                n.e(signatures, "signatures");
                for (Signature signature : signatures) {
                    Certificate certificateGenerateCertificate = CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                    n.d(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    zA = n.a(((X509Certificate) certificateGenerateCertificate).getSubjectX500Principal(), this.DEBUG_CERT);
                    if (zA) {
                        break;
                    }
                }
            } catch (PackageManager.NameNotFoundException e11) {
                this.logger.error("Could not find name", e11);
            } catch (CertificateException e12) {
                this.logger.error("Certificate exception", e12);
            }
        }
        return zA;
    }

    private final boolean isHardwareAccelerated(MediaCodecInfo codecInfo, String mimeType) {
        if (getApiLevel() >= 29) {
            return isHardwareAcceleratedV29(codecInfo);
        }
        return !isSoftwareOnly(codecInfo, mimeType);
    }

    @TargetApi(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE)
    private final boolean isHardwareAcceleratedV29(MediaCodecInfo codecInfo) {
        return codecInfo.isHardwareAccelerated();
    }

    private final boolean isRooted() {
        try {
            return searchPathForBinary("su");
        } catch (Exception e10) {
            this.logger.error("Rooted check failed", e10);
            return false;
        }
    }

    private final boolean isSoftwareOnly(MediaCodecInfo codecInfo, String mimeType) {
        if (getApiLevel() >= 29) {
            return isSoftwareOnlyV29(codecInfo);
        }
        String name = codecInfo.getName();
        n.e(name, "codecInfo.name");
        Locale ROOT = Locale.ROOT;
        n.e(ROOT, "ROOT");
        String lowerCase = name.toLowerCase(ROOT);
        n.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (!p.p0(lowerCase, "arc.", false)) {
            if (p.p0(lowerCase, "omx.google.", false) || p.p0(lowerCase, "omx.ffmpeg.", false)) {
                return true;
            }
            if ((p.p0(lowerCase, "omx.sec.", false) && h.q0(lowerCase, ".sw.", false)) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || p.p0(lowerCase, "c2.android.", false) || p.p0(lowerCase, "c2.google.", false)) {
                return true;
            }
            if (!p.p0(lowerCase, "omx.", false) && !p.p0(lowerCase, "c2.", false)) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE)
    private final boolean isSoftwareOnlyV29(MediaCodecInfo codecInfo) {
        return codecInfo.isSoftwareOnly();
    }

    private final boolean isTestMode() {
        return SdkProperties.isTestMode();
    }

    private final boolean searchPathForBinary(String binary) {
        List listC;
        Collection collectionK0;
        File[] fileArrListFiles;
        String str = System.getenv(ENVIRONMENT_VARIABLE_PATH);
        if (str != null) {
            Pattern patternCompile = Pattern.compile(":");
            n.e(patternCompile, "compile(...)");
            h.G0(0);
            Matcher matcher = patternCompile.matcher(str);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iEnd = 0;
                do {
                    arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                    iEnd = matcher.end();
                } while (matcher.find());
                arrayList.add(str.subSequence(iEnd, str.length()).toString());
                listC = arrayList;
            } else {
                listC = j1.f.C(str.toString());
            }
            if (listC.isEmpty()) {
                collectionK0 = v.f53866a;
                break;
            }
            ListIterator listIterator = listC.listIterator(listC.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    collectionK0 = v.f53866a;
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    collectionK0 = xj.n.K0(listC, listIterator.nextIndex() + 1);
                    break;
                }
            }
            String[] strArr = (String[]) collectionK0.toArray(new String[0]);
            if (strArr != null) {
                for (String str2 : strArr) {
                    File file = new File(str2);
                    if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                        for (File file2 : fileArrListFiles) {
                            if (n.a(file2.getName(), binary)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final List<MediaCodecInfo> selectAllDecodeCodecs(String mimeType) {
        ArrayList arrayList = new ArrayList();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i10 = 0; i10 < codecCount; i10++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
            if (!codecInfoAt.isEncoder()) {
                for (String str : codecInfoAt.getSupportedTypes()) {
                    if (p.i0(str, mimeType) && isHardwareAccelerated(codecInfoAt, mimeType)) {
                        arrayList.add(codecInfoAt);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public Object fetch(List<String> list, f fVar) {
        AnonymousClass1 anonymousClass1;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        Object gPUModel = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            t9.e.z(gPUModel);
            String gpuModel = this.staticDeviceInfo.getGpuModel();
            if (gpuModel != null && gpuModel.length() != 0) {
                return this.staticDeviceInfo;
            }
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = list;
            anonymousClass1.label = 1;
            gPUModel = getGPUModel(anonymousClass1);
            bk.a aVar = bk.a.f5708a;
            if (gPUModel == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) anonymousClass1.L$1;
            this = (AndroidStaticDeviceInfoDataSource) anonymousClass1.L$0;
            t9.e.z(gPUModel);
        }
        String str = (String) gPUModel;
        if (str == null || str.length() == 0) {
            return this.staticDeviceInfo;
        }
        StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo;
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder = staticDeviceInfo.toBuilder();
        n.e(builder, "this.toBuilder()");
        StaticDeviceInfoKt.Dsl dsl_create = companion._create(builder);
        dsl_create.setGpuModel(str);
        dsl_create.clearStores(dsl_create.getStores());
        dsl_create.addAllStores(dsl_create.getStores(), this.getStores(list));
        StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_build = dsl_create._build();
        this.staticDeviceInfo = staticDeviceInfo_build;
        return staticDeviceInfo_build;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    /* JADX INFO: renamed from: fetchCached, reason: from getter */
    public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
        return this.staticDeviceInfo;
    }

    public final String getAdvertisingTrackingId() {
        String advertisingTrackingId = AdvertisingId.getAdvertisingTrackingId();
        return advertisingTrackingId == null ? "" : advertisingTrackingId;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getAnalyticsUserId() {
        return this.analyticsDataSource.getUserId();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getAppName() {
        String packageName = this.context.getPackageName();
        n.e(packageName, "context.packageName");
        return packageName;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public Object getAuid(f fVar) {
        String string = AndroidPreferences.getString("supersonic_shared_preferen", "auid");
        if (string == null) {
            return null;
        }
        return string;
    }

    public final String getBoard() {
        String str = Build.BOARD;
        return str == null ? "" : str;
    }

    public final String getBootloader() {
        String str = Build.BOOTLOADER;
        return str == null ? "" : str;
    }

    public final String getBrand() {
        String str = Build.BRAND;
        return str == null ? "" : str;
    }

    public final String getBuildId() {
        return Build.ID;
    }

    public final String getBuildVersionIncremental() {
        return Build.VERSION.INCREMENTAL;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getDevice() {
        String str = Build.DEVICE;
        return str == null ? "" : str;
    }

    public final String getDisplay() {
        String str = Build.DISPLAY;
        return str == null ? "" : str;
    }

    public final String getHardware() {
        String str = Build.HARDWARE;
        return str == null ? "" : str;
    }

    public final String getHost() {
        String str = Build.HOST;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public Object getIdfi(f fVar) {
        String string = AndroidPreferences.getString("unityads-installinfo", UnityAdsConstants.Preferences.PREF_KEY_IDFI);
        if (string == null) {
            string = null;
        }
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        AndroidPreferences.setString("unityads-installinfo", UnityAdsConstants.Preferences.PREF_KEY_IDFI, string2);
        return string2;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getManufacturer() {
        String str = Build.MANUFACTURER;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getModel() {
        String str = Build.MODEL;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getOsVersion() {
        String str = Build.VERSION.RELEASE;
        return str == null ? "" : str;
    }

    public final String getProduct() {
        String str = Build.PRODUCT;
        return str == null ? "" : str;
    }

    public final List<Sensor> getSensorList() {
        Object systemService = this.context.getSystemService("sensor");
        n.d(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        List<Sensor> sensorList = ((SensorManager) systemService).getSensorList(-1);
        n.e(sensorList, "sensorManager.getSensorList(Sensor.TYPE_ALL)");
        return sensorList;
    }

    public final List<String> getSupportedAbis() {
        return getApiLevel() < 21 ? getOldAbiList() : getNewAbiList();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public long getSystemBootTime() {
        return (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / ((long) 1000);
    }

    public final long getTotalMemory() {
        return getMemoryInfo(Device.MemoryInfoType.TOTAL_MEMORY);
    }

    public final long getTotalSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return a.a.H(file.getTotalSpace() / ((long) 1024));
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public Object getUnityBuildGuid(f fVar) {
        return this.unityBootConfigDataSource.getValue("build-guid");
    }

    public final boolean hasX264Decoder() {
        return !selectAllDecodeCodecs("video/avc").isEmpty();
    }

    public final boolean hasX265Decoder() {
        return !selectAllDecodeCodecs("video/hevc").isEmpty();
    }

    public final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }
}
