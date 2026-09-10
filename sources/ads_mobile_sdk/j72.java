package ads_mobile_sdk;

import saneness.hel;
import saneness.nsa;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class j72 extends xm0 {
    private static final j72 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    private int bitField0_;
    private long downloadTimestampSecs_;
    private long expiredTimestampSecs_;
    private long expiryPeriodSecs_;
    private String vmChecksum_ = "";
    private String bytecodeChecksum_ = "";

    static {
        j72 j72Var = new j72();
        DEFAULT_INSTANCE = j72Var;
        xm0.a(j72.class, j72Var);
    }

    public static j72 p() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"bitField0_", "vmChecksum_", "bytecodeChecksum_", "expiredTimestampSecs_", "downloadTimestampSecs_", "expiryPeriodSecs_"});
        }
        if (iAttabal == 3) {
            return new j72();
        }
        if (iAttabal == 4) {
            return new nsa();
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
        synchronized (j72.class) {
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
        return this.bytecodeChecksum_;
    }

    public final long q() {
        return this.expiredTimestampSecs_;
    }

    public final String r() {
        return this.vmChecksum_;
    }
}
