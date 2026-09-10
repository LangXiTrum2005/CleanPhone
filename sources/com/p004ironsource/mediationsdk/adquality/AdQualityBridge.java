package com.p004ironsource.mediationsdk.adquality;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.p004ironsource.a4;
import com.p004ironsource.ac;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.p004ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.p004ironsource.g1;
import com.p004ironsource.ke;
import com.p004ironsource.le;
import com.p004ironsource.mediationsdk.IronSourceSegment;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.on;
import com.p004ironsource.q9;
import com.p004ironsource.zb;
import com.thinkup.core.common.n.mo;
import com.vungle.ads.internal.model.Cookie;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B1\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¨\u0006\u0019"}, d2 = {"Lcom/ironsource/mediationsdk/adquality/AdQualityBridge;", "", "", "logLevel", "Lcom/ironsource/adqualitysdk/sdk/ISAdQualityLogLevel;", "convertToAdQualityLogLevel", "Lcom/ironsource/adqualitysdk/sdk/ISAdQualityDeviceIdType;", "getDeviceIdType", "", "getCoppaValue", "", "userId", "", "changeUserId", "Lcom/ironsource/mediationsdk/IronSourceSegment;", a4.f24258i, "setSegment", "Landroid/content/Context;", "context", "appKey", "Lcom/ironsource/g1;", "adQualityDataProvider", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/g1;I)V", "Companion", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class AdQualityBridge {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static Boolean isGetVersionMethodExist;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0003J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0007J\b\u0010\u0011\u001a\u00020\u0004H\u0007R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/ironsource/mediationsdk/adquality/AdQualityBridge$Companion;", "", "", "isGetVersionMethodExist", "", "ver1", "ver2", "", "versionCompare", "Lcom/ironsource/ac;", "event", "errorCode", "errorReason", "", "logEvent", "(Lcom/ironsource/ac;Ljava/lang/Integer;Ljava/lang/String;)V", "adQualityAvailable", "getAdQualitySdkVersion", "Ljava/lang/Boolean;", "isGetVersionMethodExist$annotations", "()V", "<init>", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final boolean isGetVersionMethodExist() throws JSONException {
            try {
                if (AdQualityBridge.isGetVersionMethodExist != null) {
                    return Intrinsics.a(AdQualityBridge.isGetVersionMethodExist, Boolean.TRUE);
                }
                boolean z2 = IronSourceAdQuality.class.getDeclaredMethods().length >= 10;
                AdQualityBridge.isGetVersionMethodExist = Boolean.valueOf(z2);
                return z2;
            } catch (Throwable th) {
                q9.d().a(th);
                logEvent$default(this, ac.TROUBLESHOOTING_AD_QUALITY_SDK_NOT_EXIST, null, null, 6, null);
                return false;
            }
        }

        @JvmStatic
        private static /* synthetic */ void isGetVersionMethodExist$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final void logEvent(ac event, Integer errorCode, String errorReason) throws JSONException {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
            if (errorCode != null) {
                mediationAdditionalData.put("errorCode", errorCode.intValue());
            }
            if (errorReason != null) {
                mediationAdditionalData.put("reason", errorReason);
            }
            mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, a.INSTANCE.a().getValue());
            on.INSTANCE.d().z().a(new zb(event, mediationAdditionalData));
        }

        public static /* synthetic */ void logEvent$default(Companion companion, ac acVar, Integer num, String str, int i2, Object obj) throws JSONException {
            if ((i2 & 2) != 0) {
                num = null;
            }
            if ((i2 & 4) != 0) {
                str = null;
            }
            companion.logEvent(acVar, num, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final int versionCompare(String ver1, String ver2) {
            int length;
            if (TextUtils.isEmpty(ver1) || TextUtils.isEmpty(ver2)) {
                return -1;
            }
            int i2 = 0;
            String[] strArr = (String[]) StringsKt.J(new Regex("[^0-9.]").c("", ver1), 0, 6, new String[]{mo.ono}).toArray(new String[0]);
            String[] strArr2 = (String[]) StringsKt.J(new Regex("[^0-9.]").c("", ver2), 0, 6, new String[]{mo.ono}).toArray(new String[0]);
            while (i2 < strArr.length && i2 < strArr2.length && Intrinsics.a(strArr[i2], strArr2[i2])) {
                i2++;
            }
            if (i2 >= strArr.length || i2 >= strArr2.length) {
                length = strArr.length - strArr2.length;
            } else {
                int iIntValue = Integer.valueOf(strArr[i2]).intValue();
                Integer numValueOf = Integer.valueOf(strArr2[i2]);
                Intrinsics.e(numValueOf, "valueOf(vals2[i])");
                length = Intrinsics.h(iIntValue, numValueOf.intValue());
            }
            return Integer.signum(length);
        }

        @JvmStatic
        public final boolean adQualityAvailable() {
            return versionCompare(getAdQualitySdkVersion(), "7.9.0") >= 0;
        }

        @JvmStatic
        public final String getAdQualitySdkVersion() {
            if (!isGetVersionMethodExist()) {
                return new String();
            }
            String sDKVersion = IronSourceAdQuality.getSDKVersion();
            Intrinsics.e(sDKVersion, "getSDKVersion()");
            return sDKVersion;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AdQualityBridge(Context context, String appKey, String str, g1 adQualityDataProvider, int i2) throws JSONException {
        Intrinsics.f(context, "context");
        Intrinsics.f(appKey, "appKey");
        Intrinsics.f(adQualityDataProvider, "adQualityDataProvider");
        ISAdQualityConfig.Builder deviceIdType = new ISAdQualityConfig.Builder().setInitializationSource("LevelPlay").setLogLevel(convertToAdQualityLogLevel(i2)).setAdQualityInitListener(new ISAdQualityInitListener() { // from class: com.ironsource.mediationsdk.adquality.AdQualityBridge$configBuilder$1
            @Override // com.p004ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitFailed(ISAdQualityInitError isAdQualityInitError, String message) throws JSONException {
                Intrinsics.f(isAdQualityInitError, "isAdQualityInitError");
                Intrinsics.f(message, "message");
                ac acVar = ac.TROUBLESHOOTING_AD_QUALITY_SDK_FAILED_TO_INITIALIZE_EVENT;
                if (isAdQualityInitError == ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED) {
                    acVar = ac.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT;
                }
                AdQualityBridge.INSTANCE.logEvent(acVar, Integer.valueOf(isAdQualityInitError.getValue()), message);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Ad Quality failed to initialize: ".concat(message), 3);
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitSuccess() throws JSONException {
                AdQualityBridge.Companion.logEvent$default(AdQualityBridge.INSTANCE, ac.TROUBLESHOOTING_AD_QUALITY_SDK_INITIALIZED_SUCCESSFULLY_EVENT, null, null, 6, null);
            }
        }).setCoppa(getCoppaValue()).setDeviceIdType(getDeviceIdType());
        if (!TextUtils.isEmpty(str)) {
            deviceIdType.setUserId(str);
        }
        Companion companion = INSTANCE;
        if (companion.versionCompare(companion.getAdQualitySdkVersion(), "7.14.1") >= 0) {
            JSONObject jSONObjectA = adQualityDataProvider.a();
            if (jSONObjectA.length() > 0) {
                deviceIdType.setMetaData(jSONObjectA);
            }
        }
        Companion.logEvent$default(companion, ac.TROUBLESHOOTING_INITIALIZING_AD_QUALITY_SDK_EVENT, null, null, 6, null);
        IronSourceAdQuality.getInstance().initialize(context, appKey, deviceIdType.build());
    }

    @JvmStatic
    public static final boolean adQualityAvailable() {
        return INSTANCE.adQualityAvailable();
    }

    private final ISAdQualityLogLevel convertToAdQualityLogLevel(int logLevel) {
        if (logLevel == 0) {
            return ISAdQualityLogLevel.VERBOSE;
        }
        if (logLevel != 2) {
            return logLevel != 3 ? ISAdQualityLogLevel.INFO : ISAdQualityLogLevel.ERROR;
        }
        return ISAdQualityLogLevel.WARNING;
    }

    @JvmStatic
    public static final String getAdQualitySdkVersion() {
        return INSTANCE.getAdQualitySdkVersion();
    }

    private final boolean getCoppaValue() {
        String strA = ke.a().a(Cookie.COPPA_STATUS_KEY);
        return strA != null && Boolean.parseBoolean(strA);
    }

    private final ISAdQualityDeviceIdType getDeviceIdType() {
        return !TextUtils.isEmpty(ke.a().a(le.f25580N)) ? ISAdQualityDeviceIdType.NONE : ISAdQualityDeviceIdType.GAID;
    }

    @JvmStatic
    private static final boolean isGetVersionMethodExist() {
        return INSTANCE.isGetVersionMethodExist();
    }

    @JvmStatic
    private static final void logEvent(ac acVar, Integer num, String str) throws JSONException {
        INSTANCE.logEvent(acVar, num, str);
    }

    @JvmStatic
    private static final int versionCompare(String str, String str2) {
        return INSTANCE.versionCompare(str, str2);
    }

    public final void changeUserId(String userId) {
        Intrinsics.f(userId, "userId");
        IronSourceAdQuality.getInstance().changeUserId(userId);
    }

    public final void setSegment(IronSourceSegment segment) {
        Intrinsics.f(segment, "segment");
        ISAdQualitySegment.Builder builder = new ISAdQualitySegment.Builder();
        if (segment.getSegmentName() != null) {
            builder.setSegmentName(segment.getSegmentName());
        }
        if (segment.getAge() > -1) {
            builder.setAge(segment.getAge());
        }
        if (segment.getGender() != null) {
            builder.setGender(segment.getGender());
        }
        if (segment.getLevel() > -1) {
            builder.setLevel(segment.getLevel());
        }
        if (segment.getIsPaying() != null) {
            builder.setIsPaying(segment.getIsPaying().get());
        }
        if (segment.getIapt() > -1.0d) {
            builder.setInAppPurchasesTotal(segment.getIapt());
        }
        if (segment.getUcd() > 0) {
            builder.setUserCreationDate(segment.getUcd());
        }
        for (Pair<String, String> pair : segment.getSegmentData()) {
            String key = (String) pair.first;
            String str = (String) pair.second;
            Intrinsics.e(key, "key");
            if (StringsKt.M(key, "custom_", false)) {
                builder.setCustomData(StringsKt.D(key, "custom_"), str);
            }
        }
        IronSourceAdQuality.getInstance().setSegment(builder.build());
    }
}
