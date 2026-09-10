package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final x0 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.i value_ = com.google.crypto.tink.shaded.protobuf.i.f24569b;

    static {
        x0 x0Var = new x0();
        DEFAULT_INSTANCE = x0Var;
        com.google.crypto.tink.shaded.protobuf.x.v(x0.class, x0Var);
    }

    public static void A(x0 x0Var, w0 w0Var) {
        x0Var.getClass();
        if (w0Var == w0.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        x0Var.keyMaterialType_ = w0Var.f43798a;
    }

    public static x0 B() {
        return DEFAULT_INSTANCE;
    }

    public static v0 F() {
        return (v0) DEFAULT_INSTANCE.h();
    }

    public static void y(x0 x0Var, String str) {
        x0Var.getClass();
        str.getClass();
        x0Var.typeUrl_ = str;
    }

    public static void z(x0 x0Var, com.google.crypto.tink.shaded.protobuf.i iVar) {
        x0Var.getClass();
        iVar.getClass();
        x0Var.value_ = iVar;
    }

    public final w0 C() {
        w0 w0Var;
        int i10 = this.keyMaterialType_;
        if (i10 == 0) {
            w0Var = w0.UNKNOWN_KEYMATERIAL;
        } else if (i10 == 1) {
            w0Var = w0.SYMMETRIC;
        } else if (i10 == 2) {
            w0Var = w0.ASYMMETRIC_PRIVATE;
        } else if (i10 != 3) {
            w0Var = i10 != 4 ? null : w0.REMOTE;
        } else {
            w0Var = w0.ASYMMETRIC_PUBLIC;
        }
        return w0Var == null ? w0.UNRECOGNIZED : w0Var;
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
            return new com.google.crypto.tink.shaded.protobuf.y0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
        }
        if (iC == 3) {
            return new x0();
        }
        if (iC == 4) {
            return new v0(DEFAULT_INSTANCE);
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
        synchronized (x0.class) {
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
