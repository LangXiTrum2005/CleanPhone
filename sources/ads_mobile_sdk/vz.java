package ads_mobile_sdk;

import saneness.dudder;
import saneness.hel;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class vz extends xm0 {
    private static final vz DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private kn name_;
    private kn value_;

    static {
        vz vzVar = new vz();
        DEFAULT_INSTANCE = vzVar;
        xm0.a(vz.class, vzVar);
    }

    public vz() {
        in inVar = kn.b;
        this.name_ = inVar;
        this.value_ = inVar;
    }

    public static dudder o() {
        return (dudder) DEFAULT_INSTANCE.e();
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
                return new mc2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"bitField0_", "name_", "value_"});
            case 3:
                return new vz();
            case 4:
                return new dudder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hel helVar = PARSER;
                if (helVar != null) {
                    return helVar;
                }
                synchronized (vz.class) {
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
