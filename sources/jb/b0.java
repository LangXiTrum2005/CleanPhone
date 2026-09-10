package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final b0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.i keyValue_ = com.google.crypto.tink.shaded.protobuf.i.f24569b;
    private int version_;

    static {
        b0 b0Var = new b0();
        DEFAULT_INSTANCE = b0Var;
        com.google.crypto.tink.shaded.protobuf.x.v(b0.class, b0Var);
    }

    public static a0 B() {
        return (a0) DEFAULT_INSTANCE.h();
    }

    public static b0 C(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (b0) com.google.crypto.tink.shaded.protobuf.x.s(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.v0 D() {
        return DEFAULT_INSTANCE.l();
    }

    public static void y(b0 b0Var, com.google.crypto.tink.shaded.protobuf.h hVar) {
        b0Var.getClass();
        b0Var.keyValue_ = hVar;
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
            return new com.google.crypto.tink.shaded.protobuf.y0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
        }
        if (iC == 3) {
            return new b0();
        }
        if (iC == 4) {
            return new a0(DEFAULT_INSTANCE);
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
        synchronized (b0.class) {
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

    public final com.google.crypto.tink.shaded.protobuf.i z() {
        return this.keyValue_;
    }
}
