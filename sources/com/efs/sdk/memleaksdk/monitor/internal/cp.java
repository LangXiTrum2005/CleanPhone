package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2749Sf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3263dY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3156cG;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class cp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f657a;

    static {
        Set setQ0 = AbstractC2995aW.q0(AbstractC3263dY.a(Boolean.TYPE), AbstractC3263dY.a(Character.TYPE), AbstractC3263dY.a(Float.TYPE), AbstractC3263dY.a(Double.TYPE), AbstractC3263dY.a(Byte.TYPE), AbstractC3263dY.a(Short.TYPE), AbstractC3263dY.a(Integer.TYPE), AbstractC3263dY.a(Long.TYPE));
        ArrayList arrayList = new ArrayList(AbstractC2749Sf.Y(10, setQ0));
        Iterator it = setQ0.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC2995aW.L((InterfaceC3156cG) it.next()).getName().concat("[]"));
        }
        f657a = arrayList;
    }

    public static final boolean a(av.d dVar) {
        AbstractC2995aW.q(dVar, "$this$isSkippablePrimitiveWrapperArray");
        return f657a.contains(dVar.f());
    }
}
