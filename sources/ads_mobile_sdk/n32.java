package ads_mobile_sdk;

import saneness.hel;
import saneness.irredeemable;
import saneness.prescient;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class n32 extends xm0 {
    private static final n32 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    private prescient rules_ = xm0.h();

    static {
        n32 n32Var = new n32();
        DEFAULT_INSTANCE = n32Var;
        xm0.a(n32.class, n32Var);
    }

    public static n32 o() {
        return DEFAULT_INSTANCE;
    }

    public static irredeemable r() {
        return (irredeemable) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", l32.class});
        }
        if (iAttabal == 3) {
            return new n32();
        }
        if (iAttabal == 4) {
            return new irredeemable();
        }
        if (iAttabal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iAttabal != 6) {
            throw null;
        }
        hel helVar = PARSER;
        if (helVar != null) {
            return helVar;
        }
        synchronized (n32.class) {
            try {
                wm0Var = PARSER;
                if (wm0Var == null) {
                    wm0Var = new wm0(DEFAULT_INSTANCE);
                    PARSER = wm0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wm0Var;
    }

    public final int p() {
        return this.rules_.size();
    }

    public final prescient q() {
        return this.rules_;
    }

    public static n32 a(byte[] bArr) {
        return (n32) xm0.a(xm0.a(DEFAULT_INSTANCE, bArr, bArr.length, vf0.a()));
    }
}
