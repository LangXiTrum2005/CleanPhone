package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends com.google.crypto.tink.shaded.protobuf.x {
    private static final t DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER;
    private int bitField0_;
    private int keySize_;
    private v params_;

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        com.google.crypto.tink.shaded.protobuf.x.v(t.class, tVar);
    }

    public static s C() {
        return (s) DEFAULT_INSTANCE.h();
    }

    public static t D(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (t) com.google.crypto.tink.shaded.protobuf.x.s(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static void y(t tVar, v vVar) {
        tVar.getClass();
        tVar.params_ = vVar;
        tVar.bitField0_ |= 1;
    }

    public static void z(t tVar, int i10) {
        tVar.keySize_ = i10;
    }

    public final int A() {
        return this.keySize_;
    }

    public final v B() {
        v vVar = this.params_;
        return vVar == null ? v.z() : vVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x
    public final Object i(int i10) {
        com.google.crypto.tink.shaded.protobuf.v0 wVar;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new com.google.crypto.tink.shaded.protobuf.y0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
        }
        if (iC == 3) {
            return new t();
        }
        if (iC == 4) {
            return new s(DEFAULT_INSTANCE);
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
        synchronized (t.class) {
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
