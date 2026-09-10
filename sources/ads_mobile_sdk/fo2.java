package ads_mobile_sdk;

import saneness.hel;
import saneness.interweave;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class fo2 extends xm0 {
    private static final fo2 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int valueCase_ = 0;
    private Object value_;

    static {
        fo2 fo2Var = new fo2();
        DEFAULT_INSTANCE = fo2Var;
        xm0.a(fo2.class, fo2Var);
    }

    public static fo2 p() {
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
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȼ\u0000\u0002:\u0000\u00035\u0000\u00043\u0000", new Object[]{"value_", "valueCase_"});
        }
        if (iAttabal == 3) {
            return new fo2();
        }
        if (iAttabal == 4) {
            return new interweave();
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
        synchronized (fo2.class) {
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

    public final boolean o() {
        if (this.valueCase_ == 2) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double q() {
        if (this.valueCase_ == 4) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final long r() {
        if (this.valueCase_ == 3) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String s() {
        return this.valueCase_ == 1 ? (String) this.value_ : "";
    }

    public final boolean t() {
        return this.valueCase_ == 2;
    }

    public final boolean u() {
        return this.valueCase_ == 4;
    }

    public final boolean v() {
        return this.valueCase_ == 3;
    }

    public final boolean w() {
        return this.valueCase_ == 1;
    }
}
