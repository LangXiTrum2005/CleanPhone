package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final q0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.i keyValue_ = com.google.crypto.tink.shaded.protobuf.i.f24569b;
    private u0 params_;
    private int version_;

    static {
        q0 q0Var = new q0();
        DEFAULT_INSTANCE = q0Var;
        com.google.crypto.tink.shaded.protobuf.x.v(q0.class, q0Var);
    }

    public static q0 A() {
        return DEFAULT_INSTANCE;
    }

    public static p0 E() {
        return (p0) DEFAULT_INSTANCE.h();
    }

    public static q0 F(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (q0) com.google.crypto.tink.shaded.protobuf.x.s(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.v0 G() {
        return DEFAULT_INSTANCE.l();
    }

    public static void y(q0 q0Var, u0 u0Var) {
        q0Var.getClass();
        q0Var.params_ = u0Var;
        q0Var.bitField0_ |= 1;
    }

    public static void z(q0 q0Var, com.google.crypto.tink.shaded.protobuf.h hVar) {
        q0Var.getClass();
        q0Var.keyValue_ = hVar;
    }

    public final com.google.crypto.tink.shaded.protobuf.i B() {
        return this.keyValue_;
    }

    public final u0 C() {
        u0 u0Var = this.params_;
        return u0Var == null ? u0.A() : u0Var;
    }

    public final int D() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x
    public final Object i(int i10) {
        com.google.crypto.tink.shaded.protobuf.v0 wVar;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new com.google.crypto.tink.shaded.protobuf.y0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
        }
        if (iC == 3) {
            return new q0();
        }
        if (iC == 4) {
            return new p0(DEFAULT_INSTANCE);
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
        synchronized (q0.class) {
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
