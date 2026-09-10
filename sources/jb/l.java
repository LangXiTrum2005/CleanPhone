package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends com.google.crypto.tink.shaded.protobuf.x {
    private static final l DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.i keyValue_ = com.google.crypto.tink.shaded.protobuf.i.f24569b;
    private p params_;
    private int version_;

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        com.google.crypto.tink.shaded.protobuf.x.v(l.class, lVar);
    }

    public static l A() {
        return DEFAULT_INSTANCE;
    }

    public static k E() {
        return (k) DEFAULT_INSTANCE.h();
    }

    public static void y(l lVar, p pVar) {
        lVar.getClass();
        lVar.params_ = pVar;
        lVar.bitField0_ |= 1;
    }

    public static void z(l lVar, com.google.crypto.tink.shaded.protobuf.h hVar) {
        lVar.getClass();
        lVar.keyValue_ = hVar;
    }

    public final com.google.crypto.tink.shaded.protobuf.i B() {
        return this.keyValue_;
    }

    public final p C() {
        p pVar = this.params_;
        return pVar == null ? p.z() : pVar;
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
            return new l();
        }
        if (iC == 4) {
            return new k(DEFAULT_INSTANCE);
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
        synchronized (l.class) {
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
