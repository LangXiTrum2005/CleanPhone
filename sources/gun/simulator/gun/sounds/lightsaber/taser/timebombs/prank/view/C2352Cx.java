package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Cx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2352Cx {
    public static final C2326Bx Companion = new C2326Bx(null);
    private int attempt;
    private final String body;
    private final Map<String, String> headers;
    private final XA method;

    public C2352Cx() {
        this((XA) null, (Map) null, (String) null, 0, 15, (AbstractC2471Hm) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2352Cx copy$default(C2352Cx c2352Cx, XA xa, Map map, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            xa = c2352Cx.method;
        }
        if ((i2 & 2) != 0) {
            map = c2352Cx.headers;
        }
        if ((i2 & 4) != 0) {
            str = c2352Cx.body;
        }
        if ((i2 & 8) != 0) {
            i = c2352Cx.attempt;
        }
        return c2352Cx.copy(xa, map, str, i);
    }

    public static final void write$Self(C2352Cx c2352Cx, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c2352Cx, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || c2352Cx.method != XA.GET) {
            interfaceC4596sh.B(d40, 0, VA.INSTANCE, c2352Cx.method);
        }
        if (interfaceC4596sh.j(d40) || c2352Cx.headers != null) {
            W90 w90 = W90.f3912a;
            interfaceC4596sh.r(d40, 1, new C4095mz(w90, w90, 1), c2352Cx.headers);
        }
        if (interfaceC4596sh.j(d40) || c2352Cx.body != null) {
            interfaceC4596sh.r(d40, 2, W90.f3912a, c2352Cx.body);
        }
        if (!interfaceC4596sh.j(d40) && c2352Cx.attempt == 0) {
            return;
        }
        interfaceC4596sh.g(3, c2352Cx.attempt, d40);
    }

    public final XA component1() {
        return this.method;
    }

    public final Map<String, String> component2() {
        return this.headers;
    }

    public final String component3() {
        return this.body;
    }

    public final int component4() {
        return this.attempt;
    }

    public final C2352Cx copy(XA xa, Map<String, String> map, String str, int i) {
        AbstractC2995aW.q(xa, "method");
        return new C2352Cx(xa, map, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2352Cx)) {
            return false;
        }
        C2352Cx c2352Cx = (C2352Cx) obj;
        return this.method == c2352Cx.method && AbstractC2995aW.i(this.headers, c2352Cx.headers) && AbstractC2995aW.i(this.body, c2352Cx.body) && this.attempt == c2352Cx.attempt;
    }

    public final int getAttempt() {
        return this.attempt;
    }

    public final String getBody() {
        return this.body;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final XA getMethod() {
        return this.method;
    }

    public int hashCode() {
        int iHashCode = this.method.hashCode() * 31;
        Map<String, String> map = this.headers;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.body;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.attempt;
    }

    public final void setAttempt(int i) {
        this.attempt = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GenericTpatRequest(method=");
        sb.append(this.method);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", attempt=");
        return DM.k(sb, this.attempt, ')');
    }

    public C2352Cx(XA xa, Map<String, String> map, String str, int i) {
        AbstractC2995aW.q(xa, "method");
        this.method = xa;
        this.headers = map;
        this.body = str;
        this.attempt = i;
    }

    public /* synthetic */ C2352Cx(XA xa, Map map, String str, int i, int i2, AbstractC2471Hm abstractC2471Hm) {
        this((i2 & 1) != 0 ? XA.GET : xa, (i2 & 2) != 0 ? null : map, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? 0 : i);
    }

    public /* synthetic */ C2352Cx(int i, XA xa, Map map, String str, int i2, O40 o40) {
        this.method = (i & 1) == 0 ? XA.GET : xa;
        if ((i & 2) == 0) {
            this.headers = null;
        } else {
            this.headers = map;
        }
        if ((i & 4) == 0) {
            this.body = null;
        } else {
            this.body = str;
        }
        if ((i & 8) == 0) {
            this.attempt = 0;
        } else {
            this.attempt = i2;
        }
    }
}
