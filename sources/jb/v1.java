package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class v1 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final v1 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.i keyValue_ = com.google.crypto.tink.shaded.protobuf.i.f24569b;
    private z1 params_;
    private int version_;

    static {
        v1 v1Var = new v1();
        DEFAULT_INSTANCE = v1Var;
        com.google.crypto.tink.shaded.protobuf.x.v(v1.class, v1Var);
    }

    public static u1 D() {
        return (u1) DEFAULT_INSTANCE.h();
    }

    public static v1 E(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (v1) com.google.crypto.tink.shaded.protobuf.x.s(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static void y(v1 v1Var, z1 z1Var) {
        v1Var.getClass();
        v1Var.params_ = z1Var;
        v1Var.bitField0_ |= 1;
    }

    public static void z(v1 v1Var, com.google.crypto.tink.shaded.protobuf.h hVar) {
        v1Var.getClass();
        v1Var.keyValue_ = hVar;
    }

    public final com.google.crypto.tink.shaded.protobuf.i A() {
        return this.keyValue_;
    }

    public final z1 B() {
        z1 z1Var = this.params_;
        return z1Var == null ? z1.z() : z1Var;
    }

    public final int C() {
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
            return new v1();
        }
        if (iC == 4) {
            return new u1(DEFAULT_INSTANCE);
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
        synchronized (v1.class) {
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
