package ads_mobile_sdk;

import saneness.euhemerize;
import saneness.hel;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class gb1 extends xm0 {
    private static final gb1 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private kn hmacKey_;
    private int hmacSignatureLength_;
    private byte memoizedIsInitialized = 2;
    private kn symmetricKey_;
    private int type_;

    static {
        gb1 gb1Var = new gb1();
        DEFAULT_INSTANCE = gb1Var;
        xm0.a(gb1.class, gb1Var);
    }

    public gb1() {
        in inVar = kn.b;
        this.symmetricKey_ = inVar;
        this.hmacKey_ = inVar;
    }

    public static euhemerize o() {
        return (euhemerize) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        switch (tdb.attabal(i)) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = (byte) (xm0Var == null ? 0 : 1);
                return null;
            case 2:
                return new mc2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔊ\u0002\u0004င\u0003", new Object[]{"bitField0_", "type_", db1.a, "symmetricKey_", "hmacKey_", "hmacSignatureLength_"});
            case 3:
                return new gb1();
            case 4:
                return new euhemerize();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hel helVar = PARSER;
                if (helVar != null) {
                    return helVar;
                }
                synchronized (gb1.class) {
                    try {
                        wm0Var = PARSER;
                        if (wm0Var == null) {
                            wm0Var = new wm0(DEFAULT_INSTANCE);
                            PARSER = wm0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return wm0Var;
            default:
                throw null;
        }
    }
}
