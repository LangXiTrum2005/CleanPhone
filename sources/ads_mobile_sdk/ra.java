package ads_mobile_sdk;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import saneness.bochum;
import saneness.cyrtometer;
import saneness.hel;
import saneness.prescient;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class ra extends xm0 {
    public static final int A = 29;
    public static final int A0 = 96;
    public static final int B = 31;
    public static final int B0 = 82;
    public static final int C = 32;
    public static final int C0 = 83;
    public static final int D = 33;
    public static final int D0 = 84;
    private static final ra DEFAULT_INSTANCE;
    public static final int E = 34;
    public static final int E0 = 85;
    public static final int F = 35;
    public static final int F0 = 86;
    public static final int G = 36;
    public static final int G0 = 87;
    public static final int H = 37;
    public static final int H0 = 97;
    public static final int I = 38;
    public static final int I0 = 88;
    public static final int J = 39;
    public static final int J0 = 89;
    public static final int K = 40;
    public static final int K0 = 103;
    public static final int L = 41;
    public static final int L0 = 90;
    public static final int M = 42;
    public static final int M0 = 91;
    public static final int N = 44;
    public static final int N0 = 92;
    public static final int O = 45;
    public static final int O0 = 93;
    public static final int P = 46;
    public static final int P0 = 94;
    private static volatile hel PARSER = null;
    public static final int Q = 47;
    public static final int Q0 = 98;
    public static final int R = 74;
    public static final int R0 = 99;
    public static final int S = 48;
    public static final int S0 = 100;
    public static final int T = 49;
    public static final int T0 = 101;
    public static final int U = 51;
    public static final int U0 = 102;
    public static final int V = 52;
    public static final int V0 = 104;
    public static final int W = 53;
    public static final int W0 = 105;
    public static final int X = 54;
    public static final int X0 = 21;
    public static final int Y = 55;
    public static final int Y0 = 24;
    public static final int Z = 56;
    public static final int Z0 = 26;
    public static final int a0 = 50;
    public static final int a1 = 28;
    public static final int b0 = 43;
    public static final int b1 = 30;
    public static final int c = 1;
    public static final int c0 = 57;
    public static final int c1 = 25;
    public static final int d = 2;
    public static final int d0 = 58;
    public static final int d1 = 201;
    public static final int e = 3;
    public static final int e0 = 59;
    public static final int e1 = 301;
    public static final int f = 4;
    public static final int f0 = 60;
    public static final int f1 = 302;
    public static final int g = 5;
    public static final int g0 = 61;
    public static final int g1 = 106;
    public static final int h = 6;
    public static final int h0 = 71;
    public static final int h1 = 107;
    public static final int i = 7;
    public static final int i0 = 72;
    public static final int j = 8;
    public static final int j0 = 62;
    public static final int k = 9;
    public static final int k0 = 63;
    public static final int l = 10;
    public static final int l0 = 67;
    public static final int m = 11;
    public static final int m0 = 64;
    public static final int n = 12;
    public static final int n0 = 65;
    public static final int o = 13;
    public static final int o0 = 66;
    public static final int p = 14;
    public static final int p0 = 95;
    public static final int q = 15;
    public static final int q0 = 68;
    public static final int r = 16;
    public static final int r0 = 69;
    public static final int s = 17;
    public static final int s0 = 70;
    public static final int t = 18;
    public static final int t0 = 73;
    public static final int u = 19;
    public static final int u0 = 76;
    public static final int v = 20;
    public static final int v0 = 77;
    public static final int w = 22;
    public static final int w0 = 78;
    public static final int x = 23;
    public static final int x0 = 79;
    public static final int y = 27;
    public static final int y0 = 80;
    public static final int z = 75;
    public static final int z0 = 81;
    private long actSignal_;
    private long acxSignal_;
    private long acySignal_;
    private long aczSignal_;
    private ta adAttestationSignal_;
    private long attSignal_;
    private long atvSignal_;
    private int bitField0_;
    private int bitField1_;
    private int bitField2_;
    private int bitField3_;
    private long btlSignal_;
    private long btsSignal_;
    private int debuggerStateSignal_;
    private boolean didOptOut_;
    private int encryptionMethod_;
    private long evtTime_;
    private int fallbackSignalsType_;
    private x9 hwInfo_;
    private z9 inputEvent_;
    private boolean iomSignal_;
    private long jbkSignal_;
    private ba keyEvent_;
    private long keyId_;
    private long lastKnownDeviceTrustworthiness_;
    private long lastKnownHumannessScore_;
    private int navigationTriggerType_;
    private long netSignal_;
    private int niSignal_;
    private long ornSignal_;
    private int protoName_;
    private long psnSignal_;
    private jb rawAdAttestationSignal_;
    private long reqType_;
    private lb requestData_;
    private ka screenInfo_;
    private ma soundInfoSignal_;
    private long swzSignal_;
    private long tctSignal_;
    private long tcxSignal_;
    private long tcySignal_;
    private oa touch_;
    private long uhSignal_;
    private long uptSignal_;
    private long usgSignal_;
    private long utzSignal_;
    private long uwSignal_;
    private long vcdSignal_;
    private long visSignal_;
    private qa visibilitySignal_;
    private int activeExperimentIdsMemoizedSerializedSize = -1;
    private String osVersion_ = "";
    private String afmaVersion_ = "";
    private String stkSignal_ = "";
    private String intSignal_ = "";
    private String midSignal_ = "D";
    private String cerSignal_ = "";
    private String vnmSignal_ = "";
    private long tcpSignal_ = -1;
    private long tcdSignal_ = -1;
    private long tcuSignal_ = -1;
    private long tcmSignal_ = -1;
    private long tcdnSignal_ = -1;
    private long tccSignal_ = -1;
    private long cpuSignal_ = -1;
    private long stkDepthSignal_ = -1;
    private String appIdSignal_ = "D";
    private String installerSignal_ = "D";
    private long timeSinceInstallMinutes_ = -1;
    private int usbConnectedSignal_ = 1000;
    private int adbEnabledSignal_ = 1000;
    private long deviceElapsedRealTimeSignal_ = -1;
    private long deviceUptimeSignal_ = -1;
    private long timeOnScreenMs_ = -1;
    private long percentAdOnScreen_ = -1;
    private long percentScreenCoveredByAd_ = -1;
    private int isNativeViewPerformclickMissing_ = 1000;
    private prescient previousTouches_ = xm0.h();
    private long gmscoreVersionSignal_ = -1;
    private long batteryTemperatureSignal_ = -1;
    private long processImportanceSignal_ = -1;
    private long screenStateSignal_ = -1;
    private long recentForegroundTimeSignal_ = -1;
    private long totalForegroundTimeSignal_ = -1;
    private long activityIntentSignal_ = -1;
    private long activityStackSizeSignal_ = -1;
    private String activityNameSignal_ = "D";
    private long pkgNameDetailSignal_ = -1;
    private long attitudeSignal_ = -1;
    private int proxyDetectedSignal_ = 1000;
    private int launcherActivityEnabled_ = 1000;
    private String sftnIdSignal_ = "D";
    private prescient resetCounters_ = xm0.h();
    private int vpnSignal_ = 1000;
    private prescient functionDenylistSignal_ = xm0.h();
    private String deviceModelSignal_ = "";
    private long timeSinceVpnOnMs_ = -1;
    private long adeventToVpnOffMs_ = -1;
    private long impressionDurationMs_ = -1;
    private long impressionDurationHighAttentionMs_ = -1;
    private long virtualIntegrityType_ = -1;
    private String adshieldVersion_ = "";
    private long lastKnownTrustDecisionLabel_ = -1;
    private long bootCountSignal_ = -1;
    private String lccSignal_ = "";
    private String llcSignal_ = "";
    private long ratSignal_ = -1;
    private long pmSignal_ = -1;
    private String didSignal_ = "";
    private int didSignalType_ = 2;
    private String didSignalAndroidAdId_ = "";
    private long experimentalInt64Signal_ = -1;
    private String experimentalStringSignal_ = "";
    private cyrtometer activeExperimentIds_ = xm0.f();
    private long clsSignal_ = -1;

    static {
        ra raVar = new ra();
        DEFAULT_INSTANCE = raVar;
        xm0.a(ra.class, raVar);
    }

    public static bochum t() {
        return (bochum) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            q9 q9Var = q9.a;
            cb cbVar = cb.a;
            return new mc2(DEFAULT_INSTANCE, "\u0001n\u0000\u0004\u0001Įn\u0000\u0004\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ`\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈa\u0019ဂe\u001a᠌b\u001bဈ\u0016\u001cဇc\u001dဈ\u0018\u001eဈd\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈJSဂKTဂLUဂMVဂNWဂOXဂQYဈRZဉT[ဉU\\ဂV]ဂW^᠌X_᠌@`ဉIaဂPbဈYcဈZdဂ[eဂ\\f᠌]gဂShဉ^iဇ_j'kဂiÉဉfĭဂgĮဈh", new Object[]{"bitField0_", "bitField1_", "bitField2_", "bitField3_", "osVersion_", "afmaVersion_", "atvSignal_", "attSignal_", "btsSignal_", "btlSignal_", "acxSignal_", "acySignal_", "aczSignal_", "actSignal_", "netSignal_", "ornSignal_", "stkSignal_", "tcxSignal_", "tcySignal_", "tctSignal_", "uptSignal_", "visSignal_", "swzSignal_", "psnSignal_", "reqType_", "jbkSignal_", "usgSignal_", "didSignal_", "evtTime_", "didSignalType_", q9Var, "intSignal_", "didOptOut_", "cerSignal_", "didSignalAndroidAdId_", "uwSignal_", "uhSignal_", "utzSignal_", "vnmSignal_", "vcdSignal_", "tcpSignal_", "tcdSignal_", "adAttestationSignal_", "tcuSignal_", "tcmSignal_", "tcdnSignal_", "tccSignal_", "previousTouches_", oa.class, "cpuSignal_", "stkDepthSignal_", "appIdSignal_", "installerSignal_", "usbConnectedSignal_", cbVar, "adbEnabledSignal_", cbVar, "touch_", "deviceElapsedRealTimeSignal_", "deviceUptimeSignal_", "timeOnScreenMs_", "percentAdOnScreen_", "percentScreenCoveredByAd_", "isNativeViewPerformclickMissing_", cbVar, "visibilitySignal_", "gmscoreVersionSignal_", "batteryTemperatureSignal_", "processImportanceSignal_", "screenStateSignal_", "activityIntentSignal_", "activityStackSizeSignal_", "pkgNameDetailSignal_", "encryptionMethod_", ab.a, "protoName_", gb.a, "activityNameSignal_", "debuggerStateSignal_", m9.a, "requestData_", "attitudeSignal_", "recentForegroundTimeSignal_", "totalForegroundTimeSignal_", "proxyDetectedSignal_", cbVar, "timeSinceInstallMinutes_", "midSignal_", "launcherActivityEnabled_", cbVar, "sftnIdSignal_", "resetCounters_", ia.class, "vpnSignal_", cbVar, "functionDenylistSignal_", p9.class, "soundInfoSignal_", "deviceModelSignal_", "timeSinceVpnOnMs_", "adeventToVpnOffMs_", "impressionDurationMs_", "impressionDurationHighAttentionMs_", "lastKnownDeviceTrustworthiness_", "virtualIntegrityType_", "adshieldVersion_", "inputEvent_", "keyEvent_", "lastKnownTrustDecisionLabel_", "bootCountSignal_", "navigationTriggerType_", ca.a, "fallbackSignalsType_", s9.a, "screenInfo_", "lastKnownHumannessScore_", "lccSignal_", "llcSignal_", "ratSignal_", "pmSignal_", "niSignal_", ea.a, "keyId_", "hwInfo_", "iomSignal_", "activeExperimentIds_", "clsSignal_", "rawAdAttestationSignal_", "experimentalInt64Signal_", "experimentalStringSignal_"});
        }
        if (iAttabal == 3) {
            return new ra();
        }
        if (iAttabal == 4) {
            return new bochum();
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
        synchronized (ra.class) {
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

    public final long o() {
        return this.gmscoreVersionSignal_;
    }

    public final String p() {
        return this.intSignal_;
    }

    public final jb q() {
        jb jbVar = this.rawAdAttestationSignal_;
        return jbVar == null ? jb.DEFAULT_INSTANCE : jbVar;
    }

    public final long r() {
        return this.recentForegroundTimeSignal_;
    }

    public final boolean s() {
        return (this.bitField1_ & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
    }

    public static ra a(byte[] bArr, vf0 vf0Var) {
        return (ra) xm0.a(xm0.a(DEFAULT_INSTANCE, bArr, bArr.length, vf0Var));
    }
}
