package ads_mobile_sdk;

import saneness.cyrtometer;
import saneness.hel;
import saneness.prescient;
import saneness.tdb;
import saneness.tsarism;

/* JADX INFO: loaded from: classes.dex */
public final class a20 extends xm0 {
    private static final a20 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private int bitField0_;
    private int id_;
    private int resourceId_;
    private String tag_ = "";
    private cyrtometer childIds_ = xm0.f();
    private prescient attribute_ = xm0.h();
    private kn innerHtml_ = kn.b;

    static {
        a20 a20Var = new a20();
        DEFAULT_INSTANCE = a20Var;
        xm0.a(a20.class, a20Var);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"bitField0_", "id_", "tag_", "childIds_", "resourceId_", "attribute_", y10.class, "innerHtml_"});
        }
        if (iAttabal == 3) {
            return new a20();
        }
        if (iAttabal == 4) {
            return new tsarism();
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
        synchronized (a20.class) {
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
