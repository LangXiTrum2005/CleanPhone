package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4095mz extends AbstractC3865kM {
    public final /* synthetic */ int c;
    public final C4007lz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4095mz(InterfaceC4123nG interfaceC4123nG, InterfaceC4123nG interfaceC4123nG2, int i) {
        super(interfaceC4123nG, interfaceC4123nG2);
        this.c = i;
        if (i != 1) {
            AbstractC2995aW.q(interfaceC4123nG, "kSerializer");
            AbstractC2995aW.q(interfaceC4123nG2, "vSerializer");
            this.d = new C4007lz(interfaceC4123nG.getDescriptor(), interfaceC4123nG2.getDescriptor(), 0);
            return;
        }
        AbstractC2995aW.q(interfaceC4123nG, "kSerializer");
        AbstractC2995aW.q(interfaceC4123nG2, "vSerializer");
        super(interfaceC4123nG, interfaceC4123nG2);
        this.d = new C4007lz(interfaceC4123nG.getDescriptor(), interfaceC4123nG2.getDescriptor(), 1);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object a() {
        switch (this.c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final int b(Object obj) {
        switch (this.c) {
            case 0:
                HashMap map = (HashMap) obj;
                AbstractC2995aW.q(map, "<this>");
                return map.size() * 2;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                AbstractC2995aW.q(linkedHashMap, "<this>");
                return linkedHashMap.size() * 2;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Iterator c(Object obj) {
        int i = this.c;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                switch (i) {
                    case 0:
                        AbstractC2995aW.q(map, "<this>");
                        return map.entrySet().iterator();
                    default:
                        AbstractC2995aW.q(map, "<this>");
                        return map.entrySet().iterator();
                }
            default:
                Map map2 = (Map) obj;
                switch (i) {
                    case 0:
                        AbstractC2995aW.q(map2, "<this>");
                        return map2.entrySet().iterator();
                    default:
                        AbstractC2995aW.q(map2, "<this>");
                        return map2.entrySet().iterator();
                }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final int d(Object obj) {
        int i = this.c;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                switch (i) {
                    case 0:
                        AbstractC2995aW.q(map, "<this>");
                        return map.size();
                    default:
                        AbstractC2995aW.q(map, "<this>");
                        return map.size();
                }
            default:
                Map map2 = (Map) obj;
                switch (i) {
                    case 0:
                        AbstractC2995aW.q(map2, "<this>");
                        return map2.size();
                    default:
                        AbstractC2995aW.q(map2, "<this>");
                        return map2.size();
                }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object g(Object obj) {
        switch (this.c) {
            case 0:
                AbstractC2995aW.q(null, "<this>");
                return new HashMap((Map) null);
            default:
                AbstractC2995aW.q(null, "<this>");
                return new LinkedHashMap((Map) null);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return this.d;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object h(Object obj) {
        switch (this.c) {
            case 0:
                HashMap map = (HashMap) obj;
                AbstractC2995aW.q(map, "<this>");
                return map;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                AbstractC2995aW.q(linkedHashMap, "<this>");
                return linkedHashMap;
        }
    }
}
