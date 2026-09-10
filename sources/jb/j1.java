package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final j1 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.a0 keyInfo_ = com.google.crypto.tink.shaded.protobuf.x0.f24650e;
    private int primaryKeyId_;

    static {
        j1 j1Var = new j1();
        DEFAULT_INSTANCE = j1Var;
        com.google.crypto.tink.shaded.protobuf.x.v(j1.class, j1Var);
    }

    public static g1 A() {
        return (g1) DEFAULT_INSTANCE.h();
    }

    public static void y(j1 j1Var, int i10) {
        j1Var.primaryKeyId_ = i10;
    }

    public static void z(j1 j1Var, i1 i1Var) {
        j1Var.getClass();
        com.google.crypto.tink.shaded.protobuf.a0 a0Var = j1Var.keyInfo_;
        if (!((com.google.crypto.tink.shaded.protobuf.b) a0Var).f24538a) {
            j1Var.keyInfo_ = a0Var.mutableCopyWithCapacity(a0Var.size() * 2);
        }
        j1Var.keyInfo_.add(i1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x
    public final Object i(int i10) {
        com.google.crypto.tink.shaded.protobuf.v0 wVar;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new com.google.crypto.tink.shaded.protobuf.y0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", i1.class});
        }
        if (iC == 3) {
            return new j1();
        }
        if (iC == 4) {
            return new g1(DEFAULT_INSTANCE);
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
        synchronized (j1.class) {
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
