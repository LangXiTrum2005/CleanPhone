package ads_mobile_sdk;

import java.io.InputStream;
import saneness.hel;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class b11 extends xm0 {
    private static final b11 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    private int gesture_;
    private boolean isLinkedDevice_;
    private boolean isTestMode_;
    private long networkExtrasExpirationSecs_;
    private String networkExtras_ = "";
    private String deviceIdForDebugging_ = "";
    private String debugAdUnitId_ = "";
    private String uiStorage_ = "";

    static {
        b11 b11Var = new b11();
        DEFAULT_INSTANCE = b11Var;
        xm0.a(b11.class, b11Var);
    }

    public static b11 p() {
        return DEFAULT_INSTANCE;
    }

    public static saneness.dern x() {
        return (saneness.dern) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\f\u0004Ȉ\u0005\u0002\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"isTestMode_", "isLinkedDevice_", "gesture_", "networkExtras_", "networkExtrasExpirationSecs_", "deviceIdForDebugging_", "debugAdUnitId_", "uiStorage_"});
        }
        if (iAttabal == 3) {
            return new b11();
        }
        if (iAttabal == 4) {
            return new saneness.dern();
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
        synchronized (b11.class) {
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

    public final String o() {
        return this.debugAdUnitId_;
    }

    public final String q() {
        return this.deviceIdForDebugging_;
    }

    public final ny0 r() {
        ny0 ny0Var;
        int i2 = this.gesture_;
        if (i2 == 0) {
            ny0Var = ny0.NONE;
        } else if (i2 != 1) {
            ny0Var = i2 != 2 ? null : ny0.FLICK;
        } else {
            ny0Var = ny0.SHAKE;
        }
        return ny0Var == null ? ny0.UNRECOGNIZED : ny0Var;
    }

    public final boolean s() {
        return this.isLinkedDevice_;
    }

    public final boolean t() {
        return this.isTestMode_;
    }

    public final String u() {
        return this.networkExtras_;
    }

    public final long v() {
        return this.networkExtrasExpirationSecs_;
    }

    public final String w() {
        return this.uiStorage_;
    }

    public static b11 a(InputStream inputStream) {
        return (b11) xm0.a(xm0.a(DEFAULT_INSTANCE, hr.a(inputStream), vf0.a()));
    }
}
