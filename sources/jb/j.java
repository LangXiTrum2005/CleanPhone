package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends com.google.crypto.tink.shaded.protobuf.x {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final j DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER;
    private n aesCtrKeyFormat_;
    private int bitField0_;
    private s0 hmacKeyFormat_;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        com.google.crypto.tink.shaded.protobuf.x.v(j.class, jVar);
    }

    public static i C() {
        return (i) DEFAULT_INSTANCE.h();
    }

    public static j D(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (j) com.google.crypto.tink.shaded.protobuf.x.s(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static void y(j jVar, n nVar) {
        jVar.getClass();
        jVar.aesCtrKeyFormat_ = nVar;
        jVar.bitField0_ |= 1;
    }

    public static void z(j jVar, s0 s0Var) {
        jVar.getClass();
        jVar.hmacKeyFormat_ = s0Var;
        jVar.bitField0_ |= 2;
    }

    public final n A() {
        n nVar = this.aesCtrKeyFormat_;
        return nVar == null ? n.A() : nVar;
    }

    public final s0 B() {
        s0 s0Var = this.hmacKeyFormat_;
        return s0Var == null ? s0.A() : s0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x
    public final Object i(int i10) {
        com.google.crypto.tink.shaded.protobuf.v0 wVar;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new com.google.crypto.tink.shaded.protobuf.y0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "aesCtrKeyFormat_", "hmacKeyFormat_"});
        }
        if (iC == 3) {
            return new j();
        }
        if (iC == 4) {
            return new i(DEFAULT_INSTANCE);
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
        synchronized (j.class) {
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
