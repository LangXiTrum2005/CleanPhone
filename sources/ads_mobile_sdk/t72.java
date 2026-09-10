package ads_mobile_sdk;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import saneness.hel;
import saneness.improviser;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class t72 extends xm0 {
    private static final t72 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    public static final int l = 10;
    private long appStartProgramUpdateDelayMs_;
    private int bitField0_;
    private boolean enableRetryDownload_;
    private boolean reinitializeAfterUpdate_;
    private boolean updateBeforeInitialization_;
    private boolean updateOnInitializationOnly_ = true;
    private long minUpdateIntervalMs_ = TTAdConstant.AD_MAX_EVENT_TIME;
    private long programAlmostExpiredMs_ = 3600000;
    private String programRequestUrl_ = "https://pagead2.googlesyndication.com/mads/asp";
    private long maxRetryCount_ = 5;
    private long retryBaseIntervalMs_ = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;

    static {
        t72 t72Var = new t72();
        DEFAULT_INSTANCE = t72Var;
        xm0.a(t72.class, t72Var);
    }

    public static t72 p() {
        return DEFAULT_INSTANCE;
    }

    public static improviser w() {
        return (improviser) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"bitField0_", "updateOnInitializationOnly_", "reinitializeAfterUpdate_", "updateBeforeInitialization_", "minUpdateIntervalMs_", "programAlmostExpiredMs_", "programRequestUrl_", "appStartProgramUpdateDelayMs_", "enableRetryDownload_", "maxRetryCount_", "retryBaseIntervalMs_"});
        }
        if (iAttabal == 3) {
            return new t72();
        }
        if (iAttabal == 4) {
            return new improviser();
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
        synchronized (t72.class) {
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
        return this.appStartProgramUpdateDelayMs_;
    }

    public final boolean q() {
        return this.enableRetryDownload_;
    }

    public final long r() {
        return this.maxRetryCount_;
    }

    public final long s() {
        return this.programAlmostExpiredMs_;
    }

    public final String t() {
        return this.programRequestUrl_;
    }

    public final long u() {
        return this.retryBaseIntervalMs_;
    }

    public final boolean v() {
        return this.updateBeforeInitialization_;
    }
}
