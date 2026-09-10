package ads_mobile_sdk;

import saneness.hel;
import saneness.leafed;
import saneness.prescient;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class hd1 extends xm0 {
    private static final hd1 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 5;
    public static final int g = 4;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    private int bitField0_;
    private Object comparisonOperator_;
    private boolean equalsTo_;
    private Object matchValue_;
    private int matchValueCase_ = 0;
    private int comparisonOperatorCase_ = 0;
    private prescient path_ = xm0.h();

    static {
        hd1 hd1Var = new hd1();
        DEFAULT_INSTANCE = hd1Var;
        xm0.a(hd1.class, hd1Var);
    }

    public static hd1 q() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return this.matchValueCase_ == 5;
    }

    public final boolean B() {
        return this.matchValueCase_ == 2;
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\t\u0002\u0001\u0001\t\t\u0000\u0001\u0000\u0001Ț\u0002Ȼ\u0000\u0003:\u0000\u0004<\u0000\u00053\u0000\u0006:\u0001\u0007:\u0001\b:\u0001\tဇ\u0000", new Object[]{"matchValue_", "matchValueCase_", "comparisonOperator_", "comparisonOperatorCase_", "bitField0_", "path_", hd1.class, "equalsTo_"});
        }
        if (iAttabal == 3) {
            return new hd1();
        }
        if (iAttabal == 4) {
            return new leafed();
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
        synchronized (hd1.class) {
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

    public final hd1 o() {
        return this.matchValueCase_ == 4 ? (hd1) this.matchValue_ : DEFAULT_INSTANCE;
    }

    public final boolean p() {
        if (this.matchValueCase_ == 3) {
            return ((Boolean) this.matchValue_).booleanValue();
        }
        return false;
    }

    public final boolean r() {
        return this.equalsTo_;
    }

    public final double s() {
        if (this.matchValueCase_ == 5) {
            return ((Double) this.matchValue_).doubleValue();
        }
        return 0.0d;
    }

    public final prescient t() {
        return this.path_;
    }

    public final String u() {
        return this.matchValueCase_ == 2 ? (String) this.matchValue_ : "";
    }

    public final boolean v() {
        return this.matchValueCase_ == 4;
    }

    public final boolean w() {
        return this.comparisonOperatorCase_ == 8;
    }

    public final boolean x() {
        return this.matchValueCase_ == 3;
    }

    public final boolean y() {
        return this.comparisonOperatorCase_ == 6;
    }

    public final boolean z() {
        return this.comparisonOperatorCase_ == 7;
    }
}
