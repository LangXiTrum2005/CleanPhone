package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r1 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final r1 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER;
    private int bitField0_;
    private a1 dekTemplate_;
    private String kekUri_ = "";

    static {
        r1 r1Var = new r1();
        DEFAULT_INSTANCE = r1Var;
        com.google.crypto.tink.shaded.protobuf.x.v(r1.class, r1Var);
    }

    public static r1 A() {
        return DEFAULT_INSTANCE;
    }

    public static q1 D() {
        return (q1) DEFAULT_INSTANCE.h();
    }

    public static r1 E(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (r1) com.google.crypto.tink.shaded.protobuf.x.s(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static void y(r1 r1Var, String str) {
        r1Var.getClass();
        str.getClass();
        r1Var.kekUri_ = str;
    }

    public static void z(r1 r1Var, a1 a1Var) {
        r1Var.getClass();
        a1Var.getClass();
        r1Var.dekTemplate_ = a1Var;
        r1Var.bitField0_ |= 1;
    }

    public final a1 B() {
        a1 a1Var = this.dekTemplate_;
        return a1Var == null ? a1.B() : a1Var;
    }

    public final String C() {
        return this.kekUri_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x
    public final Object i(int i10) {
        com.google.crypto.tink.shaded.protobuf.v0 wVar;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new com.google.crypto.tink.shaded.protobuf.y0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "kekUri_", "dekTemplate_"});
        }
        if (iC == 3) {
            return new r1();
        }
        if (iC == 4) {
            return new q1(DEFAULT_INSTANCE);
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
        synchronized (r1.class) {
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
