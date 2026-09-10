package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class n1 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final n1 DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER;
    private String keyUri_ = "";

    static {
        n1 n1Var = new n1();
        DEFAULT_INSTANCE = n1Var;
        com.google.crypto.tink.shaded.protobuf.x.v(n1.class, n1Var);
    }

    public static m1 B() {
        return (m1) DEFAULT_INSTANCE.h();
    }

    public static n1 C(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (n1) com.google.crypto.tink.shaded.protobuf.x.s(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static void y(n1 n1Var, String str) {
        n1Var.getClass();
        str.getClass();
        n1Var.keyUri_ = str;
    }

    public static n1 z() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.keyUri_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x
    public final Object i(int i10) {
        com.google.crypto.tink.shaded.protobuf.v0 wVar;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new com.google.crypto.tink.shaded.protobuf.y0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
        }
        if (iC == 3) {
            return new n1();
        }
        if (iC == 4) {
            return new m1(DEFAULT_INSTANCE);
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
        synchronized (n1.class) {
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
