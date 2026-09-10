package com.ironsource.mediationsdk.adquality;

import an.h;
import an.p;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C0265ba;
import com.ironsource.C0398j0;
import com.ironsource.C0474n4;
import com.ironsource.C0654x5;
import com.ironsource.EnumC0672y5;
import com.ironsource.Kb;
import com.ironsource.L6;
import com.ironsource.M6;
import com.ironsource.Wa;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.regex.Pattern;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class AdQualityBridge {
    public static final Companion Companion = new Companion(null);
    private static Boolean isGetVersionMethodExist;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isGetVersionMethodExist() throws JSONException {
            try {
                if (AdQualityBridge.isGetVersionMethodExist != null) {
                    return n.a(AdQualityBridge.isGetVersionMethodExist, Boolean.TRUE);
                }
                boolean z10 = IronSourceAdQuality.class.getDeclaredMethods().length >= 10;
                AdQualityBridge.isGetVersionMethodExist = Boolean.valueOf(z10);
                return z10;
            } catch (Throwable th2) {
                C0474n4.d().a(th2);
                logEvent$default(this, EnumC0672y5.TROUBLESHOOTING_AD_QUALITY_SDK_NOT_EXIST, null, null, 6, null);
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logEvent(EnumC0672y5 enumC0672y5, Integer num, String str) throws JSONException {
            JSONObject jSONObjectB = IronSourceUtils.b(false);
            if (num != null) {
                jSONObjectB.put(IronSourceConstants.EVENTS_ERROR_CODE, num.intValue());
            }
            if (str != null) {
                jSONObjectB.put("reason", str);
            }
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, a.f29285a.a().b());
            Kb.f26413u.d().q().a(new C0654x5(enumC0672y5, jSONObjectB));
        }

        public static /* synthetic */ void logEvent$default(Companion companion, EnumC0672y5 enumC0672y5, Integer num, String str, int i10, Object obj) throws JSONException {
            if ((i10 & 2) != 0) {
                num = null;
            }
            if ((i10 & 4) != 0) {
                str = null;
            }
            companion.logEvent(enumC0672y5, num, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int versionCompare(String input, String input2) {
            if (TextUtils.isEmpty(input) || TextUtils.isEmpty(input2)) {
                return -1;
            }
            Pattern patternCompile = Pattern.compile("[^0-9.]");
            n.e(patternCompile, "compile(...)");
            n.f(input, "input");
            String strReplaceAll = patternCompile.matcher(input).replaceAll("");
            n.e(strReplaceAll, "replaceAll(...)");
            int i10 = 0;
            String[] strArr = (String[]) h.I0(strReplaceAll, new String[]{"."}, 0, 6).toArray(new String[0]);
            Pattern patternCompile2 = Pattern.compile("[^0-9.]");
            n.e(patternCompile2, "compile(...)");
            n.f(input2, "input");
            String strReplaceAll2 = patternCompile2.matcher(input2).replaceAll("");
            n.e(strReplaceAll2, "replaceAll(...)");
            String[] strArr2 = (String[]) h.I0(strReplaceAll2, new String[]{"."}, 0, 6).toArray(new String[0]);
            while (i10 < strArr.length && i10 < strArr2.length && n.a(strArr[i10], strArr2[i10])) {
                i10++;
            }
            if (i10 >= strArr.length || i10 >= strArr2.length) {
                return Integer.signum(strArr.length - strArr2.length);
            }
            int iIntValue = Integer.valueOf(strArr[i10]).intValue();
            Integer numValueOf = Integer.valueOf(strArr2[i10]);
            n.e(numValueOf, "valueOf(vals2[i])");
            return Integer.signum(n.h(iIntValue, numValueOf.intValue()));
        }

        public final boolean adQualityAvailable() {
            return versionCompare(getAdQualitySdkVersion(), "7.9.0") >= 0;
        }

        public final String getAdQualitySdkVersion() {
            if (!isGetVersionMethodExist()) {
                return new String();
            }
            String sDKVersion = IronSourceAdQuality.getSDKVersion();
            n.e(sDKVersion, "getSDKVersion()");
            return sDKVersion;
        }

        private Companion() {
        }

        private static /* synthetic */ void isGetVersionMethodExist$annotations() {
        }
    }

    public AdQualityBridge(Context context, String appKey, String str, C0398j0 adQualityDataProvider, int i10) throws JSONException {
        n.f(context, "context");
        n.f(appKey, "appKey");
        n.f(adQualityDataProvider, "adQualityDataProvider");
        ISAdQualityConfig.Builder deviceIdType = new ISAdQualityConfig.Builder().setInitializationSource("LevelPlay").setLogLevel(convertToAdQualityLogLevel(i10)).setAdQualityInitListener(new ISAdQualityInitListener() { // from class: com.ironsource.mediationsdk.adquality.AdQualityBridge$configBuilder$1
            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitFailed(ISAdQualityInitError isAdQualityInitError, String message) throws JSONException {
                n.f(isAdQualityInitError, "isAdQualityInitError");
                n.f(message, "message");
                EnumC0672y5 enumC0672y5 = EnumC0672y5.TROUBLESHOOTING_AD_QUALITY_SDK_FAILED_TO_INITIALIZE_EVENT;
                if (isAdQualityInitError == ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED) {
                    enumC0672y5 = EnumC0672y5.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT;
                }
                AdQualityBridge.Companion.logEvent(enumC0672y5, Integer.valueOf(isAdQualityInitError.getValue()), message);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Ad Quality failed to initialize: ".concat(message), 3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitSuccess() throws JSONException {
                AdQualityBridge.Companion.logEvent$default(AdQualityBridge.Companion, EnumC0672y5.TROUBLESHOOTING_AD_QUALITY_SDK_INITIALIZED_SUCCESSFULLY_EVENT, null, null, 6, null);
            }
        }).setCoppa(getCoppaValue()).setDeviceIdType(getDeviceIdType());
        if (!TextUtils.isEmpty(str)) {
            deviceIdType.setUserId(str);
        }
        Companion companion = Companion;
        if (companion.versionCompare(companion.getAdQualitySdkVersion(), "7.14.1") >= 0) {
            JSONObject jSONObjectA = adQualityDataProvider.a();
            if (jSONObjectA.length() > 0) {
                deviceIdType.setMetaData(jSONObjectA);
            }
        }
        Companion.logEvent$default(companion, EnumC0672y5.TROUBLESHOOTING_INITIALIZING_AD_QUALITY_SDK_EVENT, null, null, 6, null);
        IronSourceAdQuality.getInstance().initialize(context, appKey, deviceIdType.build());
    }

    public static final boolean adQualityAvailable() {
        return Companion.adQualityAvailable();
    }

    private final ISAdQualityLogLevel convertToAdQualityLogLevel(int i10) {
        if (i10 == 0) {
            return ISAdQualityLogLevel.VERBOSE;
        }
        if (i10 == 1) {
            return ISAdQualityLogLevel.INFO;
        }
        if (i10 != 2) {
            return i10 != 3 ? ISAdQualityLogLevel.INFO : ISAdQualityLogLevel.ERROR;
        }
        return ISAdQualityLogLevel.WARNING;
    }

    public static final String getAdQualitySdkVersion() {
        return Companion.getAdQualitySdkVersion();
    }

    private final boolean getCoppaValue() {
        String strA = L6.a().a(Wa.G);
        return strA != null && Boolean.parseBoolean(strA);
    }

    private final ISAdQualityDeviceIdType getDeviceIdType() {
        return !TextUtils.isEmpty(L6.a().a(M6.N)) ? ISAdQualityDeviceIdType.NONE : ISAdQualityDeviceIdType.GAID;
    }

    private static final boolean isGetVersionMethodExist() {
        return Companion.isGetVersionMethodExist();
    }

    private static final void logEvent(EnumC0672y5 enumC0672y5, Integer num, String str) throws JSONException {
        Companion.logEvent(enumC0672y5, num, str);
    }

    private static final int versionCompare(String str, String str2) {
        return Companion.versionCompare(str, str2);
    }

    public final void changeUserId(String userId) {
        n.f(userId, "userId");
        IronSourceAdQuality.getInstance().changeUserId(userId);
    }

    public final void setSegment(C0265ba segment) {
        n.f(segment, "segment");
        ISAdQualitySegment.Builder builder = new ISAdQualitySegment.Builder();
        if (segment.g() != null) {
            builder.setSegmentName(segment.g());
        }
        if (segment.a() > -1) {
            builder.setAge(segment.a());
        }
        if (segment.b() != null) {
            builder.setGender(segment.b());
        }
        if (segment.e() > -1) {
            builder.setLevel(segment.e());
        }
        if (segment.d() != null) {
            builder.setIsPaying(segment.d().get());
        }
        if (segment.c() > -1.0d) {
            builder.setInAppPurchasesTotal(segment.c());
        }
        if (segment.h() > 0) {
            builder.setUserCreationDate(segment.h());
        }
        for (Pair<String, String> pair : segment.f()) {
            String key = (String) pair.first;
            String str = (String) pair.second;
            n.e(key, "key");
            if (p.p0(key, "custom_", false)) {
                builder.setCustomData(h.E0(key, "custom_"), str);
            }
        }
        IronSourceAdQuality.getInstance().setSegment(builder.build());
    }
}
