package ads_mobile_sdk;

import com.ironsource.X3;
import saneness.hel;
import saneness.outage;
import saneness.prescient;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class qv0 extends xm0 {
    private static final qv0 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 13;
    public static final int g = 4;
    public static final int h = 5;
    public static final int i = 6;
    public static final int j = 12;
    public static final int k = 15;
    public static final int l = 7;
    public static final int m = 8;
    public static final int n = 14;
    public static final int o = 9;
    public static final int p = 10;
    public static final int q = 11;
    private int bitField0_;
    private int bucketSize_;
    private int elementMaxLength_;
    private boolean excludeFalse_;
    private boolean excludeTrue_;
    private int maxLength_;
    private int maxSize_;
    private double multiplyingFactor_;
    private int round_;
    private int type_;
    private prescient path_ = xm0.h();
    private String urlKey_ = "";
    private String arraySeparator_ = ",";
    private String keyValueSeparator_ = X3.j.b;
    private String itemSeparator_ = X3.j.c;
    private String captureGroup_ = "";

    static {
        qv0 qv0Var = new qv0();
        DEFAULT_INSTANCE = qv0Var;
        xm0.a(qv0.class, qv0Var);
    }

    public final int A() {
        return this.round_;
    }

    public final at2 B() {
        at2 at2Var;
        int i2 = this.type_;
        if (i2 == 0) {
            at2Var = at2.SIGNAL_TYPE_UNKNOWN;
        } else if (i2 == 1) {
            at2Var = at2.STRING;
        } else if (i2 != 2) {
            at2Var = i2 != 3 ? null : at2.NUMBER;
        } else {
            at2Var = at2.BOOLEAN;
        }
        return at2Var == null ? at2.UNRECOGNIZED : at2Var;
    }

    public final String C() {
        return this.urlKey_;
    }

    public final boolean D() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean E() {
        return (this.bitField0_ & 8192) != 0;
    }

    public final boolean F() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean G() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean H() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean I() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\u0000\u0001Ț\u0002ለ\u0000\u0003ဌ\u0001\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဋ\u0005\u0007ဋ\b\bለ\t\tለ\u000b\nለ\f\u000bለ\r\fဋ\u0006\rဋ\u0002\u000eဋ\n\u000fက\u0007", new Object[]{"bitField0_", "path_", "urlKey_", "type_", "excludeTrue_", "excludeFalse_", "round_", "maxSize_", "arraySeparator_", "keyValueSeparator_", "itemSeparator_", "captureGroup_", "bucketSize_", "maxLength_", "elementMaxLength_", "multiplyingFactor_"});
        }
        if (iAttabal == 3) {
            return new qv0();
        }
        if (iAttabal == 4) {
            return new outage();
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
        synchronized (qv0.class) {
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
        return this.arraySeparator_;
    }

    public final int p() {
        return this.bucketSize_;
    }

    public final String q() {
        return this.captureGroup_;
    }

    public final int r() {
        return this.elementMaxLength_;
    }

    public final boolean s() {
        return this.excludeFalse_;
    }

    public final boolean t() {
        return this.excludeTrue_;
    }

    public final String u() {
        return this.itemSeparator_;
    }

    public final String v() {
        return this.keyValueSeparator_;
    }

    public final int w() {
        return this.maxLength_;
    }

    public final int x() {
        return this.maxSize_;
    }

    public final double y() {
        return this.multiplyingFactor_;
    }

    public final prescient z() {
        return this.path_;
    }
}
