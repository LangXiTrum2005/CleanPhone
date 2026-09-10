package ads_mobile_sdk;

import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import saneness.earstone;
import saneness.hel;
import saneness.tdb;
import saneness.tractor;

/* JADX INFO: loaded from: classes.dex */
public final class gj0 extends xm0 {
    private static final gj0 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 8;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private int bitField0_;
    private mv consentState_;
    private boolean hasSdkInitializedPreviously_;
    private int sessionsSinceUpdate_;
    private cd1 storedSdkCoreData_ = cd1.a();
    private String flagJson_ = "";
    private String cachedUserAgent_ = "";

    static {
        gj0 gj0Var = new gj0();
        DEFAULT_INSTANCE = gj0Var;
        xm0.a(gj0.class, gj0Var);
    }

    public static gj0 q() {
        return DEFAULT_INSTANCE;
    }

    public static earstone w() {
        return (earstone) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0001\u0000\u0000\u0001ለ\u0000\u0002င\u0001\u00052\u0006ဉ\u0003\u0007ለ\u0004\bဇ\u0002", new Object[]{"bitField0_", "flagJson_", "sessionsSinceUpdate_", "storedSdkCoreData_", tractor.f37344attabal, "consentState_", "cachedUserAgent_", "hasSdkInitializedPreviously_"});
        }
        if (iAttabal == 3) {
            return new gj0();
        }
        if (iAttabal == 4) {
            return new earstone();
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
        synchronized (gj0.class) {
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

    public final String o() {
        return this.cachedUserAgent_;
    }

    public final mv p() {
        mv mvVar = this.consentState_;
        return mvVar == null ? mv.s() : mvVar;
    }

    public final String r() {
        return this.flagJson_;
    }

    public final boolean s() {
        return this.hasSdkInitializedPreviously_;
    }

    public final cd1 t() {
        cd1 cd1Var = this.storedSdkCoreData_;
        if (!cd1Var.a) {
            this.storedSdkCoreData_ = cd1Var.b();
        }
        return this.storedSdkCoreData_;
    }

    public final int u() {
        return this.sessionsSinceUpdate_;
    }

    public final Map v() {
        return Collections.unmodifiableMap(this.storedSdkCoreData_);
    }

    public static gj0 a(InputStream inputStream) {
        return (gj0) xm0.a(xm0.a(DEFAULT_INSTANCE, hr.a(inputStream), vf0.a()));
    }
}
