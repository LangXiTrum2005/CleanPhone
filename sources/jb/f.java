package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends com.google.crypto.tink.shaded.protobuf.x {
    private static final f DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        com.google.crypto.tink.shaded.protobuf.x.v(f.class, fVar);
    }

    public static e B() {
        return (e) DEFAULT_INSTANCE.h();
    }

    public static void y(f fVar, int i10) {
        fVar.tagSize_ = i10;
    }

    public static f z() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
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
            return new com.google.crypto.tink.shaded.protobuf.y0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
        }
        if (iC == 3) {
            return new f();
        }
        if (iC == 4) {
            return new e(DEFAULT_INSTANCE);
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
        synchronized (f.class) {
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
