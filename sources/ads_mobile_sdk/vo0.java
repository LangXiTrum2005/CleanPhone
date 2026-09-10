package ads_mobile_sdk;

import saneness.artsy;
import saneness.cyrtometer;
import saneness.dessertspoon;
import saneness.hel;
import saneness.interior;
import saneness.spissatus;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class vo0 extends xm0 {
    public static final int A = 23;
    public static final int A0 = 73;
    public static final int B = 77;
    public static final int B0 = 74;
    public static final int C = 78;
    public static final int D = 24;
    private static final vo0 DEFAULT_INSTANCE;
    public static final int E = 25;
    public static final int F = 9;
    public static final int G = 53;
    public static final int H = 10;
    public static final int I = 72;
    public static final int J = 11;
    public static final int K = 66;
    public static final int L = 67;
    public static final int M = 68;
    public static final int N = 12;
    public static final int O = 13;
    public static final int P = 14;
    private static volatile hel PARSER = null;
    public static final int Q = 26;
    public static final int R = 27;
    public static final int S = 46;
    public static final int T = 45;
    public static final int U = 43;
    public static final int V = 48;
    public static final int W = 44;
    public static final int X = 49;
    public static final int Y = 50;
    public static final int Z = 28;
    public static final int a0 = 60;
    public static final int b0 = 15;
    public static final int c = 1;
    public static final int c0 = 16;
    public static final int d = 40;
    public static final int d0 = 17;
    public static final int e = 30;
    public static final int e0 = 18;
    public static final int f = 31;
    public static final int f0 = 19;
    public static final int g = 32;
    public static final int g0 = 20;
    public static final int h = 33;
    public static final int h0 = 29;
    public static final int i = 37;
    public static final int i0 = 55;
    public static final int j = 2;
    public static final int j0 = 56;
    public static final int k = 3;
    public static final int k0 = 38;
    public static final int l = 34;
    public static final int l0 = 39;
    public static final int m = 75;
    public static final int m0 = 57;
    public static final int n = 76;
    public static final int n0 = 47;
    public static final int o = 35;
    public static final int o0 = 41;
    public static final int p = 36;
    public static final int p0 = 42;
    public static final int q = 4;
    public static final int q0 = 52;
    public static final int r = 5;
    public static final int r0 = 54;
    public static final int s = 21;
    public static final int s0 = 58;
    public static final int t = 70;
    public static final int t0 = 59;
    private static final artsy tag_converter_ = new spissatus();
    public static final int u = 22;
    public static final int u0 = 61;
    public static final int v = 64;
    public static final int v0 = 62;
    public static final int w = 6;
    public static final int w0 = 63;
    public static final int x = 51;
    public static final int x0 = 65;
    public static final int y = 7;
    public static final int y0 = 69;
    public static final int z = 8;
    public static final int z0 = 71;
    private int adConfigurationIndex_;
    private int bitField0_;
    private int cachedSignalState_;
    private long childCpuTimeMillis_;
    private mo chromeVariations_;
    private long cpuTimeMillis_;
    private int customTabsNavigationEvent_;
    private int deviceAdvertisedMemTier_;
    private int deviceAvailableProcessorTier_;
    private int format_;
    private long gmsCoreVersion_;
    private int gmsgName_;
    private xr0 h5Data_;
    private boolean hadCachedFlags_;
    private w11 installReferrerDetails_;
    private boolean isFirstSessionAfterInstall_;
    private bb1 jsEngineData_;
    private long latencyMillis_;
    private int mediationChainLength_;
    private hg1 mraidData_;
    private int name_;
    private int networkTypeCoarse_;
    private int networkType_;
    private vt1 offlineData_;
    private int orientation_;
    private int os_;
    private long parentTraceId_;
    private u22 postClickLifecycleMonitoringData_;
    private d42 preloadData_;
    private int previousAppExitReason_;
    private int previousAppExitSignal_;
    private int processState_;
    private long samplingDenominator_;
    private qk2 scarCacheEvictionData_;
    private int scarRequestType_;
    private int sequenceNumber_;
    private ro2 signalCacheData_;
    private wo2 signalData_;
    private int signalId_;
    private long startTimeMillis_;
    private boolean success_;
    private int tagMemoizedSerializedSize;
    private int targetVersion_;
    private long timeSinceSdkInitCompleteMillis_;
    private long timeSinceSdkInitStartMillis_;
    private long traceDepth_;
    private long traceId_;
    private f83 webviewData_;
    private boolean wereCachedFlagsReset_;
    private int experimentIdMemoizedSerializedSize = -1;
    private String rootTraceId_ = "";
    private cyrtometer tag_ = xm0.f();
    private String sdkVersion_ = "";
    private String canonicalSdkVersion_ = "";
    private String webViewVersion_ = "";
    private String appName_ = "";
    private String appVersionName_ = "";
    private String appId_ = "";
    private String adUnitId_ = "";
    private String osVersion_ = "";
    private String deviceModel_ = "";
    private String country_ = "";
    private dessertspoon experimentId_ = xm0.g();
    private String backendQueryId_ = "";
    private String gwsQueryId_ = "";
    private String sessionId_ = "";
    private String requestId_ = "";
    private String signalGenerationRequestId_ = "";
    private String internalRequestId_ = "";
    private String renderId_ = "";
    private String renderer_ = "";
    private String adId_ = "";
    private String preloadId_ = "";
    private String mediationAdapter_ = "";
    private String mediationAdapterVersion_ = "";
    private String plugin_ = "";
    private String topException_ = "";
    private String stackTraceHash_ = "";
    private String cause_ = "";
    private String cronetProvider_ = "";
    private String rawChromeVariations_ = "";

    static {
        vo0 vo0Var = new vo0();
        DEFAULT_INSTANCE = vo0Var;
        xm0.a(vo0.class, vo0Var);
    }

    public static interior o() {
        return (interior) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004N\u0000\u0001\u0001NN\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000:ဉ\u0005;ဉ\u0006<Ȉ=ဉ\u0007>ဉ\b?Ȉ@ȈAဉ\tB\u0007C\u0007D\u0007Eဉ\nFȈGဉ\u000bH\u0004I\u0004J\u0004K\u0002L\u0002M\fN\f", new Object[]{"bitField0_", "name_", "success_", "latencyMillis_", "os_", "sdkVersion_", "appId_", "osVersion_", "targetVersion_", "orientation_", "networkType_", "gmsCoreVersion_", "format_", "backendQueryId_", "gwsQueryId_", "mediationAdapter_", "mediationAdapterVersion_", "plugin_", "topException_", "stackTraceHash_", "cause_", "canonicalSdkVersion_", "appName_", "deviceModel_", "country_", "experimentId_", "sessionId_", "requestId_", "adId_", "samplingDenominator_", "rootTraceId_", "traceId_", "parentTraceId_", "traceDepth_", "startTimeMillis_", "cpuTimeMillis_", "childCpuTimeMillis_", "tag_", "signalId_", "cachedSignalState_", "gmsgName_", "scarCacheEvictionData_", "h5Data_", "sequenceNumber_", "renderId_", "internalRequestId_", "signalGenerationRequestId_", "scarRequestType_", "mediationChainLength_", "adConfigurationIndex_", "renderer_", "adUnitId_", "mraidData_", "processState_", "jsEngineData_", "cronetProvider_", "customTabsNavigationEvent_", "signalData_", "signalCacheData_", "preloadData_", "preloadId_", "offlineData_", "chromeVariations_", "rawChromeVariations_", "appVersionName_", "webviewData_", "isFirstSessionAfterInstall_", "hadCachedFlags_", "wereCachedFlagsReset_", "postClickLifecycleMonitoringData_", "webViewVersion_", "installReferrerDetails_", "networkTypeCoarse_", "previousAppExitReason_", "previousAppExitSignal_", "timeSinceSdkInitStartMillis_", "timeSinceSdkInitCompleteMillis_", "deviceAdvertisedMemTier_", "deviceAvailableProcessorTier_"});
        }
        if (iAttabal == 3) {
            return new vo0();
        }
        if (iAttabal == 4) {
            return new interior();
        }
        if (iAttabal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iAttabal != 6) {
            throw null;
        }
        hel helVar = PARSER;
        if (helVar != null) {
            return helVar;
        }
        synchronized (vo0.class) {
            try {
                wm0Var = PARSER;
                if (wm0Var == null) {
                    wm0Var = new wm0(DEFAULT_INSTANCE);
                    PARSER = wm0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wm0Var;
    }
}
