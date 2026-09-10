package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final u0 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        u0 u0Var = new u0();
        DEFAULT_INSTANCE = u0Var;
        com.google.crypto.tink.shaded.protobuf.x.v(u0.class, u0Var);
    }

    public static u0 A() {
        return DEFAULT_INSTANCE;
    }

    public static t0 D() {
        return (t0) DEFAULT_INSTANCE.h();
    }

    public static void y(u0 u0Var, o0 o0Var) {
        u0Var.getClass();
        u0Var.hash_ = o0Var.getNumber();
    }

    public static void z(u0 u0Var, int i10) {
        u0Var.tagSize_ = i10;
    }

    public final o0 B() {
        o0 o0Var;
        int i10 = this.hash_;
        if (i10 == 0) {
            o0Var = o0.UNKNOWN_HASH;
        } else if (i10 == 1) {
            o0Var = o0.SHA1;
        } else if (i10 == 2) {
            o0Var = o0.SHA384;
        } else if (i10 == 3) {
            o0Var = o0.SHA256;
        } else if (i10 != 4) {
            o0Var = i10 != 5 ? null : o0.SHA224;
        } else {
            o0Var = o0.SHA512;
        }
        return o0Var == null ? o0.UNRECOGNIZED : o0Var;
    }

    public final int C() {
        return this.tagSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x
    public final Object i(int i10) {
        com.google.crypto.tink.shaded.protobuf.v0 wVar;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new com.google.crypto.tink.shaded.protobuf.y0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
        }
        if (iC == 3) {
            return new u0();
        }
        if (iC == 4) {
            return new t0(DEFAULT_INSTANCE);
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
        synchronized (u0.class) {
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
