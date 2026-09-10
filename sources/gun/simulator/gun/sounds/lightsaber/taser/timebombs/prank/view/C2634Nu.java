package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Nu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2634Nu {
    public static final C2608Mu Companion = new C2608Mu(null);
    private Map<String, String> _customData;
    private volatile C5138yo _demographic;
    private volatile WI _location;
    private volatile PZ _revenue;
    private volatile C4108n50 _sessionContext;

    public C2634Nu() {
    }

    public static final void write$Self(C2634Nu c2634Nu, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c2634Nu, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || c2634Nu._sessionContext != null) {
            interfaceC4596sh.r(d40, 0, C3932l50.INSTANCE, c2634Nu._sessionContext);
        }
        if (interfaceC4596sh.j(d40) || c2634Nu._demographic != null) {
            interfaceC4596sh.r(d40, 1, C4962wo.INSTANCE, c2634Nu._demographic);
        }
        if (interfaceC4596sh.j(d40) || c2634Nu._location != null) {
            interfaceC4596sh.r(d40, 2, UI.INSTANCE, c2634Nu._location);
        }
        if (interfaceC4596sh.j(d40) || c2634Nu._revenue != null) {
            interfaceC4596sh.r(d40, 3, NZ.INSTANCE, c2634Nu._revenue);
        }
        if (!interfaceC4596sh.j(d40) && c2634Nu._customData == null) {
            return;
        }
        W90 w90 = W90.f3912a;
        interfaceC4596sh.r(d40, 4, new C4095mz(w90, w90, 1), c2634Nu._customData);
    }

    public final synchronized void clearAll() {
        try {
            this._sessionContext = null;
            this._demographic = null;
            this._location = null;
            this._revenue = null;
            Map<String, String> map = this._customData;
            if (map != null) {
                map.clear();
            }
            this._customData = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map<String, String> getCustomData() {
        Map<String, String> concurrentHashMap;
        concurrentHashMap = this._customData;
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            this._customData = concurrentHashMap;
        }
        return concurrentHashMap;
    }

    public final synchronized C5138yo getDemographic() {
        C5138yo c5138yo;
        c5138yo = this._demographic;
        if (c5138yo == null) {
            c5138yo = new C5138yo();
            this._demographic = c5138yo;
        }
        return c5138yo;
    }

    public final synchronized WI getLocation() {
        WI wi;
        wi = this._location;
        if (wi == null) {
            wi = new WI();
            this._location = wi;
        }
        return wi;
    }

    public final synchronized PZ getRevenue() {
        PZ pz;
        pz = this._revenue;
        if (pz == null) {
            pz = new PZ();
            this._revenue = pz;
        }
        return pz;
    }

    public final synchronized C4108n50 getSessionContext() {
        C4108n50 c4108n50;
        c4108n50 = this._sessionContext;
        if (c4108n50 == null) {
            c4108n50 = new C4108n50();
            this._sessionContext = c4108n50;
        }
        return c4108n50;
    }

    public /* synthetic */ C2634Nu(int i, C4108n50 c4108n50, C5138yo c5138yo, WI wi, PZ pz, Map map, O40 o40) {
        if ((i & 1) == 0) {
            this._sessionContext = null;
        } else {
            this._sessionContext = c4108n50;
        }
        if ((i & 2) == 0) {
            this._demographic = null;
        } else {
            this._demographic = c5138yo;
        }
        if ((i & 4) == 0) {
            this._location = null;
        } else {
            this._location = wi;
        }
        if ((i & 8) == 0) {
            this._revenue = null;
        } else {
            this._revenue = pz;
        }
        if ((i & 16) == 0) {
            this._customData = null;
        } else {
            this._customData = map;
        }
    }

    private static /* synthetic */ void get_customData$annotations() {
    }

    private static /* synthetic */ void get_demographic$annotations() {
    }

    private static /* synthetic */ void get_location$annotations() {
    }

    private static /* synthetic */ void get_revenue$annotations() {
    }

    private static /* synthetic */ void get_sessionContext$annotations() {
    }
}
