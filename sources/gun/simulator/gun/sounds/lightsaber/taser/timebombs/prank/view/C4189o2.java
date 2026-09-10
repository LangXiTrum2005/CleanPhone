package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4189o2 {
    public static final C4101n2 Companion = new C4101n2(null);
    private final Map<String, C3575h2> cacheableReplacements;
    private final Map<String, String> normalReplacements;

    public C4189o2() {
        this((Map) null, (Map) (0 == true ? 1 : 0), 3, (AbstractC2471Hm) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4189o2 copy$default(C4189o2 c4189o2, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = c4189o2.normalReplacements;
        }
        if ((i & 2) != 0) {
            map2 = c4189o2.cacheableReplacements;
        }
        return c4189o2.copy(map, map2);
    }

    public static final void write$Self(C4189o2 c4189o2, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c4189o2, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || c4189o2.normalReplacements != null) {
            W90 w90 = W90.f3912a;
            interfaceC4596sh.r(d40, 0, new C4095mz(w90, w90, 1), c4189o2.normalReplacements);
        }
        if (!interfaceC4596sh.j(d40) && c4189o2.cacheableReplacements == null) {
            return;
        }
        interfaceC4596sh.r(d40, 1, new C4095mz(W90.f3912a, C3399f2.INSTANCE, 1), c4189o2.cacheableReplacements);
    }

    public final Map<String, String> component1() {
        return this.normalReplacements;
    }

    public final Map<String, C3575h2> component2() {
        return this.cacheableReplacements;
    }

    public final C4189o2 copy(Map<String, String> map, Map<String, C3575h2> map2) {
        return new C4189o2(map, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4189o2)) {
            return false;
        }
        C4189o2 c4189o2 = (C4189o2) obj;
        return AbstractC2995aW.i(this.normalReplacements, c4189o2.normalReplacements) && AbstractC2995aW.i(this.cacheableReplacements, c4189o2.cacheableReplacements);
    }

    public final Map<String, C3575h2> getCacheableReplacements() {
        return this.cacheableReplacements;
    }

    public final Map<String, String> getNormalReplacements() {
        return this.normalReplacements;
    }

    public int hashCode() {
        Map<String, String> map = this.normalReplacements;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, C3575h2> map2 = this.cacheableReplacements;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        return "TemplateSettings(normalReplacements=" + this.normalReplacements + ", cacheableReplacements=" + this.cacheableReplacements + ')';
    }

    public /* synthetic */ C4189o2(Map map, Map map2, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2);
    }

    public /* synthetic */ C4189o2(int i, Map map, Map map2, O40 o40) {
        if ((i & 1) == 0) {
            this.normalReplacements = null;
        } else {
            this.normalReplacements = map;
        }
        if ((i & 2) == 0) {
            this.cacheableReplacements = null;
        } else {
            this.cacheableReplacements = map2;
        }
    }

    public C4189o2(Map<String, String> map, Map<String, C3575h2> map2) {
        this.normalReplacements = map;
        this.cacheableReplacements = map2;
    }

    public static /* synthetic */ void getCacheableReplacements$annotations() {
    }

    public static /* synthetic */ void getNormalReplacements$annotations() {
    }
}
