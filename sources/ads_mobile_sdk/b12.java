package ads_mobile_sdk;

import saneness.hel;
import saneness.prescient;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class b12 extends xm0 {
    private static final b12 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    private prescient rules_ = xm0.h();

    static {
        b12 b12Var = new b12();
        DEFAULT_INSTANCE = b12Var;
        xm0.a(b12.class, b12Var);
    }

    public static b12 o() {
        return DEFAULT_INSTANCE;
    }

    public static saneness.wireman r() {
        return (saneness.wireman) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", z02.class});
        }
        if (iAttabal == 3) {
            return new b12();
        }
        if (iAttabal == 4) {
            return new saneness.wireman();
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
        synchronized (b12.class) {
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

    public static b12 a(byte[] bArr) {
        return (b12) xm0.a(xm0.a(DEFAULT_INSTANCE, bArr, bArr.length, vf0.a()));
    }
}
