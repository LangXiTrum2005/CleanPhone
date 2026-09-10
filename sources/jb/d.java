package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends com.google.crypto.tink.shaded.protobuf.x {
    private static final d DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER;
    private int bitField0_;
    private int keySize_;
    private f params_;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        com.google.crypto.tink.shaded.protobuf.x.v(d.class, dVar);
    }

    public static c C() {
        return (c) DEFAULT_INSTANCE.h();
    }

    public static d D(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (d) com.google.crypto.tink.shaded.protobuf.x.s(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static void y(d dVar, int i10) {
        dVar.keySize_ = i10;
    }

    public static void z(d dVar, f fVar) {
        dVar.getClass();
        dVar.params_ = fVar;
        dVar.bitField0_ |= 1;
    }

    public final int A() {
        return this.keySize_;
    }

    public final f B() {
        f fVar = this.params_;
        return fVar == null ? f.z() : fVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x
    public final Object i(int i10) {
        com.google.crypto.tink.shaded.protobuf.v0 wVar;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new com.google.crypto.tink.shaded.protobuf.y0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "keySize_", "params_"});
        }
        if (iC == 3) {
            return new d();
        }
        if (iC == 4) {
            return new c(DEFAULT_INSTANCE);
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
        synchronized (d.class) {
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
