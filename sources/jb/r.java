package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends com.google.crypto.tink.shaded.protobuf.x {
    private static final r DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.i keyValue_ = com.google.crypto.tink.shaded.protobuf.i.f24569b;
    private v params_;
    private int version_;

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        com.google.crypto.tink.shaded.protobuf.x.v(r.class, rVar);
    }

    public static q D() {
        return (q) DEFAULT_INSTANCE.h();
    }

    public static r E(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (r) com.google.crypto.tink.shaded.protobuf.x.s(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.v0 F() {
        return DEFAULT_INSTANCE.l();
    }

    public static void y(r rVar, v vVar) {
        rVar.getClass();
        rVar.params_ = vVar;
        rVar.bitField0_ |= 1;
    }

    public static void z(r rVar, com.google.crypto.tink.shaded.protobuf.h hVar) {
        rVar.getClass();
        rVar.keyValue_ = hVar;
    }

    public final com.google.crypto.tink.shaded.protobuf.i A() {
        return this.keyValue_;
    }

    public final v B() {
        v vVar = this.params_;
        return vVar == null ? v.z() : vVar;
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
            return new r();
        }
        if (iC == 4) {
            return new q(DEFAULT_INSTANCE);
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
        synchronized (r.class) {
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
