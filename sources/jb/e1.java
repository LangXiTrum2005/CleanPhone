package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final e1 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private x0 keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        e1 e1Var = new e1();
        DEFAULT_INSTANCE = e1Var;
        com.google.crypto.tink.shaded.protobuf.x.v(e1.class, e1Var);
    }

    public static void A(e1 e1Var, y0 y0Var) {
        e1Var.getClass();
        e1Var.status_ = y0Var.getNumber();
    }

    public static void B(e1 e1Var, int i10) {
        e1Var.keyId_ = i10;
    }

    public static d1 H() {
        return (d1) DEFAULT_INSTANCE.h();
    }

    public static void y(e1 e1Var, x0 x0Var) {
        e1Var.getClass();
        e1Var.keyData_ = x0Var;
        e1Var.bitField0_ |= 1;
    }

    public static void z(e1 e1Var, s1 s1Var) {
        e1Var.getClass();
        e1Var.outputPrefixType_ = s1Var.getNumber();
    }

    public final x0 C() {
        x0 x0Var = this.keyData_;
        return x0Var == null ? x0.B() : x0Var;
    }

    public final int D() {
        return this.keyId_;
    }

    public final s1 E() {
        s1 s1VarA = s1.a(this.outputPrefixType_);
        return s1VarA == null ? s1.UNRECOGNIZED : s1VarA;
    }

    public final y0 F() {
        y0 y0Var;
        int i10 = this.status_;
        if (i10 == 0) {
            y0Var = y0.UNKNOWN_STATUS;
        } else if (i10 == 1) {
            y0Var = y0.ENABLED;
        } else if (i10 != 2) {
            y0Var = i10 != 3 ? null : y0.DESTROYED;
        } else {
            y0Var = y0.DISABLED;
        }
        return y0Var == null ? y0.UNRECOGNIZED : y0Var;
    }

    public final boolean G() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x
    public final Object i(int i10) {
        com.google.crypto.tink.shaded.protobuf.v0 wVar;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new com.google.crypto.tink.shaded.protobuf.y0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"bitField0_", "keyData_", "status_", "keyId_", "outputPrefixType_"});
        }
        if (iC == 3) {
            return new e1();
        }
        if (iC == 4) {
            return new d1(DEFAULT_INSTANCE);
        }
        if (iC == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iC != 6) {
            throw null;
        }
        com.google.crypto.tink.shaded.protobuf.v0 v0Var = PARSER;
        if (v0Var != null) {
            return v0Var;
        }
        synchronized (e1.class) {
            try {
                wVar = PARSER;
                if (wVar == null) {
                    wVar = new com.google.crypto.tink.shaded.protobuf.w();
                    PARSER = wVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }
}
