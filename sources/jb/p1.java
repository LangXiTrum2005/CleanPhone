package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class p1 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final p1 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private r1 params_;
    private int version_;

    static {
        p1 p1Var = new p1();
        DEFAULT_INSTANCE = p1Var;
        com.google.crypto.tink.shaded.protobuf.x.v(p1.class, p1Var);
    }

    public static o1 B() {
        return (o1) DEFAULT_INSTANCE.h();
    }

    public static p1 C(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (p1) com.google.crypto.tink.shaded.protobuf.x.s(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.v0 D() {
        return DEFAULT_INSTANCE.l();
    }

    public static void y(p1 p1Var, r1 r1Var) {
        p1Var.getClass();
        p1Var.params_ = r1Var;
        p1Var.bitField0_ |= 1;
    }

    public final int A() {
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
            return new com.google.crypto.tink.shaded.protobuf.y0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
        }
        if (iC == 3) {
            return new p1();
        }
        if (iC == 4) {
            return new o1(DEFAULT_INSTANCE);
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
        synchronized (p1.class) {
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

    public final r1 z() {
        r1 r1Var = this.params_;
        return r1Var == null ? r1.A() : r1Var;
    }
}
