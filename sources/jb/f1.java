package jb;

import java.io.ByteArrayInputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final f1 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.a0 key_ = com.google.crypto.tink.shaded.protobuf.x0.f24650e;
    private int primaryKeyId_;

    static {
        f1 f1Var = new f1();
        DEFAULT_INSTANCE = f1Var;
        com.google.crypto.tink.shaded.protobuf.x.v(f1.class, f1Var);
    }

    public static c1 E() {
        return (c1) DEFAULT_INSTANCE.h();
    }

    public static f1 F(ByteArrayInputStream byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.p pVar) throws com.google.crypto.tink.shaded.protobuf.d0 {
        com.google.crypto.tink.shaded.protobuf.x xVarU = com.google.crypto.tink.shaded.protobuf.x.u(DEFAULT_INSTANCE, new com.google.crypto.tink.shaded.protobuf.k(byteArrayInputStream), pVar);
        com.google.crypto.tink.shaded.protobuf.x.g(xVarU);
        return (f1) xVarU;
    }

    public static f1 G(byte[] bArr, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (f1) com.google.crypto.tink.shaded.protobuf.x.t(DEFAULT_INSTANCE, bArr, pVar);
    }

    public static void y(f1 f1Var, int i10) {
        f1Var.primaryKeyId_ = i10;
    }

    public static void z(f1 f1Var, e1 e1Var) {
        f1Var.getClass();
        com.google.crypto.tink.shaded.protobuf.a0 a0Var = f1Var.key_;
        if (!((com.google.crypto.tink.shaded.protobuf.b) a0Var).f24538a) {
            f1Var.key_ = a0Var.mutableCopyWithCapacity(a0Var.size() * 2);
        }
        f1Var.key_.add(e1Var);
    }

    public final e1 A(int i10) {
        return (e1) this.key_.get(i10);
    }

    public final int B() {
        return this.key_.size();
    }

    public final com.google.crypto.tink.shaded.protobuf.a0 C() {
        return this.key_;
    }

    public final int D() {
        return this.primaryKeyId_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x
    public final Object i(int i10) {
        com.google.crypto.tink.shaded.protobuf.v0 wVar;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new com.google.crypto.tink.shaded.protobuf.y0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", e1.class});
        }
        if (iC == 3) {
            return new f1();
        }
        if (iC == 4) {
            return new c1(DEFAULT_INSTANCE);
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
        synchronized (f1.class) {
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
