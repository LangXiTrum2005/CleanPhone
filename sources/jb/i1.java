package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final i1 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        i1 i1Var = new i1();
        DEFAULT_INSTANCE = i1Var;
        com.google.crypto.tink.shaded.protobuf.x.v(i1.class, i1Var);
    }

    public static void A(i1 i1Var, y0 y0Var) {
        i1Var.getClass();
        i1Var.status_ = y0Var.getNumber();
    }

    public static void B(i1 i1Var, int i10) {
        i1Var.keyId_ = i10;
    }

    public static h1 C() {
        return (h1) DEFAULT_INSTANCE.h();
    }

    public static void y(i1 i1Var, String str) {
        i1Var.getClass();
        str.getClass();
        i1Var.typeUrl_ = str;
    }

    public static void z(i1 i1Var, s1 s1Var) {
        i1Var.getClass();
        i1Var.outputPrefixType_ = s1Var.getNumber();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x
    public final Object i(int i10) {
        com.google.crypto.tink.shaded.protobuf.v0 wVar;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new com.google.crypto.tink.shaded.protobuf.y0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
        }
        if (iC == 3) {
            return new i1();
        }
        if (iC == 4) {
            return new h1(DEFAULT_INSTANCE);
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
        synchronized (i1.class) {
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
