package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends com.google.crypto.tink.shaded.protobuf.x {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final h DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private l aesCtrKey_;
    private int bitField0_;
    private q0 hmacKey_;
    private int version_;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        com.google.crypto.tink.shaded.protobuf.x.v(h.class, hVar);
    }

    public static g D() {
        return (g) DEFAULT_INSTANCE.h();
    }

    public static h E(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (h) com.google.crypto.tink.shaded.protobuf.x.s(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.v0 F() {
        return DEFAULT_INSTANCE.l();
    }

    public static void y(h hVar, l lVar) {
        hVar.getClass();
        hVar.aesCtrKey_ = lVar;
        hVar.bitField0_ |= 1;
    }

    public static void z(h hVar, q0 q0Var) {
        hVar.getClass();
        hVar.hmacKey_ = q0Var;
        hVar.bitField0_ |= 2;
    }

    public final l A() {
        l lVar = this.aesCtrKey_;
        return lVar == null ? l.A() : lVar;
    }

    public final q0 B() {
        q0 q0Var = this.hmacKey_;
        return q0Var == null ? q0.A() : q0Var;
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
            return new com.google.crypto.tink.shaded.protobuf.y0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "version_", "aesCtrKey_", "hmacKey_"});
        }
        if (iC == 3) {
            return new h();
        }
        if (iC == 4) {
            return new g(DEFAULT_INSTANCE);
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
        synchronized (h.class) {
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
