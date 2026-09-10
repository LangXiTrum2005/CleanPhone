package jb;

import java.io.ByteArrayInputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final n0 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.i encryptedKeyset_ = com.google.crypto.tink.shaded.protobuf.i.f24569b;
    private j1 keysetInfo_;

    static {
        n0 n0Var = new n0();
        DEFAULT_INSTANCE = n0Var;
        com.google.crypto.tink.shaded.protobuf.x.v(n0.class, n0Var);
    }

    public static m0 B() {
        return (m0) DEFAULT_INSTANCE.h();
    }

    public static n0 C(ByteArrayInputStream byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.p pVar) throws com.google.crypto.tink.shaded.protobuf.d0 {
        com.google.crypto.tink.shaded.protobuf.x xVarU = com.google.crypto.tink.shaded.protobuf.x.u(DEFAULT_INSTANCE, new com.google.crypto.tink.shaded.protobuf.k(byteArrayInputStream), pVar);
        com.google.crypto.tink.shaded.protobuf.x.g(xVarU);
        return (n0) xVarU;
    }

    public static void y(n0 n0Var, com.google.crypto.tink.shaded.protobuf.h hVar) {
        n0Var.getClass();
        n0Var.encryptedKeyset_ = hVar;
    }

    public static void z(n0 n0Var, j1 j1Var) {
        n0Var.getClass();
        n0Var.keysetInfo_ = j1Var;
        n0Var.bitField0_ |= 1;
    }

    public final com.google.crypto.tink.shaded.protobuf.i A() {
        return this.encryptedKeyset_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x
    public final Object i(int i10) {
        com.google.crypto.tink.shaded.protobuf.v0 wVar;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new com.google.crypto.tink.shaded.protobuf.y0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "encryptedKeyset_", "keysetInfo_"});
        }
        if (iC == 3) {
            return new n0();
        }
        if (iC == 4) {
            return new m0(DEFAULT_INSTANCE);
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
        synchronized (n0.class) {
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
