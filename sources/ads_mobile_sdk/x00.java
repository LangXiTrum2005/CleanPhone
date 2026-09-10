package ads_mobile_sdk;

import saneness.checkless;
import saneness.hel;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class x00 extends xm0 {
    private static final x00 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private kn imageDigest_;
    private kn image_;
    private String mimeType_ = "";
    private int type_;

    static {
        x00 x00Var = new x00();
        DEFAULT_INSTANCE = x00Var;
        xm0.a(x00.class, x00Var);
    }

    public x00() {
        in inVar = kn.b;
        this.image_ = inVar;
        this.imageDigest_ = inVar;
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"bitField0_", "type_", v00.a, "mimeType_", "image_", "imageDigest_"});
        }
        if (iAttabal == 3) {
            return new x00();
        }
        if (iAttabal == 4) {
            return new checkless();
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
        synchronized (x00.class) {
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
