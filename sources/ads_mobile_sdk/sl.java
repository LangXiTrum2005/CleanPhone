package ads_mobile_sdk;

import java.util.Collections;
import java.util.Map;
import saneness.bicho;
import saneness.cutwater;
import saneness.hel;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class sl extends xm0 {
    private static final sl DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    private int bitField0_;
    private boolean shouldCollectSignalsOnFullApp_;
    private boolean shouldGatherSignals_;
    private cd1 serverParameters_ = cd1.a();
    private String adapterClassName_ = "";
    private String platform_ = "";

    static {
        sl slVar = new sl();
        DEFAULT_INSTANCE = slVar;
        xm0.a(sl.class, slVar);
    }

    public static sl o() {
        return DEFAULT_INSTANCE;
    }

    public static cutwater r() {
        return (cutwater) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ለ\u0003\u00052", new Object[]{"bitField0_", "adapterClassName_", "shouldGatherSignals_", "shouldCollectSignalsOnFullApp_", "platform_", "serverParameters_", bicho.f37076attabal});
        }
        if (iAttabal == 3) {
            return new sl();
        }
        if (iAttabal == 4) {
            return new cutwater();
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
        synchronized (sl.class) {
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

    public final Map p() {
        return Collections.unmodifiableMap(this.serverParameters_);
    }

    public final boolean q() {
        return this.shouldCollectSignalsOnFullApp_;
    }
}
