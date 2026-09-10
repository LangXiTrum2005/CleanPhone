package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final a1 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.i value_ = com.google.crypto.tink.shaded.protobuf.i.f24569b;

    static {
        a1 a1Var = new a1();
        DEFAULT_INSTANCE = a1Var;
        com.google.crypto.tink.shaded.protobuf.x.v(a1.class, a1Var);
    }

    public static void A(a1 a1Var, s1 s1Var) {
        a1Var.getClass();
        a1Var.outputPrefixType_ = s1Var.getNumber();
    }

    public static a1 B() {
        return DEFAULT_INSTANCE;
    }

    public static z0 F() {
        return (z0) DEFAULT_INSTANCE.h();
    }

    public static z0 G(a1 a1Var) {
        com.google.crypto.tink.shaded.protobuf.v vVarH = DEFAULT_INSTANCE.h();
        vVarH.f(a1Var);
        return (z0) vVarH;
    }

    public static a1 H(byte[] bArr, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (a1) com.google.crypto.tink.shaded.protobuf.x.t(DEFAULT_INSTANCE, bArr, pVar);
    }

    public static void y(a1 a1Var, String str) {
        a1Var.getClass();
        str.getClass();
        a1Var.typeUrl_ = str;
    }

    public static void z(a1 a1Var, com.google.crypto.tink.shaded.protobuf.i iVar) {
        a1Var.getClass();
        iVar.getClass();
        a1Var.value_ = iVar;
    }

    public final s1 C() {
        s1 s1VarA = s1.a(this.outputPrefixType_);
        return s1VarA == null ? s1.UNRECOGNIZED : s1VarA;
    }

    public final String D() {
        return this.typeUrl_;
    }

    public final com.google.crypto.tink.shaded.protobuf.i E() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x
    public final Object i(int i10) {
        com.google.crypto.tink.shaded.protobuf.v0 wVar;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new com.google.crypto.tink.shaded.protobuf.y0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
        }
        if (iC == 3) {
            return new a1();
        }
        if (iC == 4) {
            return new z0(DEFAULT_INSTANCE);
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
        synchronized (a1.class) {
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
