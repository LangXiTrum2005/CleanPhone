package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final s0 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private int keySize_;
    private u0 params_;
    private int version_;

    static {
        s0 s0Var = new s0();
        DEFAULT_INSTANCE = s0Var;
        com.google.crypto.tink.shaded.protobuf.x.v(s0.class, s0Var);
    }

    public static s0 A() {
        return DEFAULT_INSTANCE;
    }

    public static r0 E() {
        return (r0) DEFAULT_INSTANCE.h();
    }

    public static s0 F(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (s0) com.google.crypto.tink.shaded.protobuf.x.s(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static void y(s0 s0Var, u0 u0Var) {
        s0Var.getClass();
        s0Var.params_ = u0Var;
        s0Var.bitField0_ |= 1;
    }

    public static void z(s0 s0Var, int i10) {
        s0Var.keySize_ = i10;
    }

    public final int B() {
        return this.keySize_;
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
            return new com.google.crypto.tink.shaded.protobuf.y0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"bitField0_", "params_", "keySize_", "version_"});
        }
        if (iC == 3) {
            return new s0();
        }
        if (iC == 4) {
            return new r0(DEFAULT_INSTANCE);
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
        synchronized (s0.class) {
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
