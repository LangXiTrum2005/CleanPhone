package ads_mobile_sdk;

import saneness.complexometry;
import saneness.hel;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class lm extends xm0 {
    private static final lm DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 7;
    public static final int g = 8;
    public static final int h = 4;
    public static final int i = 5;
    public static final int j = 6;
    public static final int k = 9;
    public static final int l = 11;
    public static final int m = 10;
    private int backoffStep_;
    private int bitField0_;
    private long cacheTimestamp_;
    private km error_;
    private float executionCredit_;
    private int failedExecutions_;
    private boolean isFromPrebid_;
    private boolean isPublisherCreated_;
    private long lastExecutionTimestamp_;
    private int skippedExecutions_;
    private String javascriptLibraryName_ = "";
    private String buyerGeneratedRequestData_ = "";

    static {
        lm lmVar = new lm();
        DEFAULT_INSTANCE = lmVar;
        xm0.a(lm.class, lmVar);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004င\u0005\u0005င\u0006\u0006င\u0007\u0007ဂ\u0003\bခ\u0004\tဇ\b\nဉ\n\u000bဇ\t", new Object[]{"bitField0_", "javascriptLibraryName_", "buyerGeneratedRequestData_", "cacheTimestamp_", "failedExecutions_", "skippedExecutions_", "backoffStep_", "lastExecutionTimestamp_", "executionCredit_", "isPublisherCreated_", "error_", "isFromPrebid_"});
        }
        if (iAttabal == 3) {
            return new lm();
        }
        if (iAttabal == 4) {
            return new complexometry();
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
        synchronized (lm.class) {
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
