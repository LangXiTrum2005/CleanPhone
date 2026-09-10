package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends com.google.crypto.tink.shaded.protobuf.x {
    private static final b DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.i keyValue_ = com.google.crypto.tink.shaded.protobuf.i.f24569b;
    private f params_;
    private int version_;

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        com.google.crypto.tink.shaded.protobuf.x.v(b.class, bVar);
    }

    public static a D() {
        return (a) DEFAULT_INSTANCE.h();
    }

    public static b E(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (b) com.google.crypto.tink.shaded.protobuf.x.s(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.v0 F() {
        return DEFAULT_INSTANCE.l();
    }

    public static void y(b bVar, com.google.crypto.tink.shaded.protobuf.h hVar) {
        bVar.getClass();
        bVar.keyValue_ = hVar;
    }

    public static void z(b bVar, f fVar) {
        bVar.getClass();
        bVar.params_ = fVar;
        bVar.bitField0_ |= 1;
    }

    public final com.google.crypto.tink.shaded.protobuf.i A() {
        return this.keyValue_;
    }

    public final f B() {
        f fVar = this.params_;
        return fVar == null ? f.z() : fVar;
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
            return new com.google.crypto.tink.shaded.protobuf.y0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "keyValue_", "params_"});
        }
        if (iC == 3) {
            return new b();
        }
        if (iC == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (b.class) {
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
