package v0;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.c1;
import androidx.datastore.preferences.protobuf.z;
import androidx.datastore.preferences.protobuf.z0;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends b0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final j DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile z0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        b0.j(j.class, jVar);
    }

    public static h D() {
        return (h) ((z) DEFAULT_INSTANCE.c(5));
    }

    public static void l(j jVar, long j10) {
        jVar.valueCase_ = 4;
        jVar.value_ = Long.valueOf(j10);
    }

    public static void m(j jVar, String str) {
        jVar.getClass();
        jVar.valueCase_ = 5;
        jVar.value_ = str;
    }

    public static void n(j jVar, g gVar) {
        jVar.getClass();
        jVar.value_ = gVar;
        jVar.valueCase_ = 6;
    }

    public static void o(j jVar, double d10) {
        jVar.valueCase_ = 7;
        jVar.value_ = Double.valueOf(d10);
    }

    public static void p(j jVar, androidx.datastore.preferences.protobuf.i iVar) {
        jVar.getClass();
        jVar.valueCase_ = 8;
        jVar.value_ = iVar;
    }

    public static void q(j jVar, boolean z10) {
        jVar.valueCase_ = 1;
        jVar.value_ = Boolean.valueOf(z10);
    }

    public static void r(j jVar, float f10) {
        jVar.valueCase_ = 2;
        jVar.value_ = Float.valueOf(f10);
    }

    public static void s(j jVar, int i10) {
        jVar.valueCase_ = 3;
        jVar.value_ = Integer.valueOf(i10);
    }

    public static j v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final g B() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.m();
    }

    public final int C() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public final Object c(int i10) {
        z0 a0Var;
        switch (i.c(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new c1(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case 3:
                return new j();
            case 4:
                return new h(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0 z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (j.class) {
                    try {
                        a0Var = PARSER;
                        if (a0Var == null) {
                            a0Var = new a0();
                            PARSER = a0Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return a0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final androidx.datastore.preferences.protobuf.j u() {
        return this.valueCase_ == 8 ? (androidx.datastore.preferences.protobuf.j) this.value_ : androidx.datastore.preferences.protobuf.j.f4104b;
    }

    public final double w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float x() {
        return this.valueCase_ == 2 ? ((Float) this.value_).floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final int y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
