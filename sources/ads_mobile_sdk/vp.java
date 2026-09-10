package ads_mobile_sdk;

import saneness.acatalasia;
import saneness.cyrtometer;
import saneness.hel;
import saneness.prescient;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class vp extends xm0 {
    private static final vp DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 13;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 10;
    public static final int h = 7;
    public static final int i = 4;
    public static final int j = 5;
    public static final int k = 9;
    public static final int l = 15;
    private int bitField0_;
    private long configTimeUsec_;
    private zp deviceProperties_;
    private qf0 externalClientExperimentIds_;
    private xp versionInfo_;
    private int experimentIdMemoizedSerializedSize = -1;
    private int triggerExperimentIdMemoizedSerializedSize = -1;
    private kn gzipCompressed_ = kn.b;
    private cyrtometer experimentId_ = xm0.f();
    private cyrtometer triggerExperimentId_ = xm0.f();
    private prescient serverToken_ = xm0.h();
    private String overrideZwiebackNid_ = "";
    private prescient downloadedBlob_ = xm0.h();

    static {
        vp vpVar = new vp();
        DEFAULT_INSTANCE = vpVar;
        xm0.a(vp.class, vpVar);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"bitField0_", "experimentId_", "configTimeUsec_", "triggerExperimentId_", "downloadedBlob_", hp.class, "versionInfo_", "overrideZwiebackNid_", "deviceProperties_", "serverToken_", "gzipCompressed_", "externalClientExperimentIds_"});
        }
        if (iAttabal == 3) {
            return new vp();
        }
        if (iAttabal == 4) {
            return new acatalasia();
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
        synchronized (vp.class) {
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

    public static vp a(byte[] bArr, vf0 vf0Var) {
        return (vp) xm0.a(xm0.a(DEFAULT_INSTANCE, bArr, bArr.length, vf0Var));
    }
}
