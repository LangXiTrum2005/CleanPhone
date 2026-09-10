package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final au f631a;

    public cc(au auVar) {
        AbstractC2995aW.q(auVar, "graph");
        this.f631a = auVar;
    }

    public final Map<Long, Integer> a() {
        at atVarB;
        aw awVar;
        Long lC;
        aw awVar2;
        aw awVar3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        av.b bVarA = this.f631a.a("sun.misc.Cleaner");
        if (bVarA != null) {
            for (av.c cVar : bVarA.l()) {
                at atVarB2 = cVar.b("sun.misc.Cleaner", "thunk");
                Long lD = null;
                Long lD2 = (atVarB2 == null || (awVar3 = atVarB2.c) == null) ? null : awVar3.d();
                at atVarB3 = cVar.b("java.lang.ref.Reference", "referent");
                if (atVarB3 != null && (awVar2 = atVarB3.c) != null) {
                    lD = awVar2.d();
                }
                if (lD2 != null && lD != null) {
                    av avVarF = atVarB2.c.f();
                    if (avVarF instanceof av.c) {
                        av.c cVar2 = (av.c) avVarF;
                        if (cVar2.a("libcore.util.NativeAllocationRegistry$CleanerThunk") && (atVarB = cVar2.b("libcore.util.NativeAllocationRegistry$CleanerThunk", "this$0")) != null && atVarB.c.e()) {
                            av avVarF2 = atVarB.c.f();
                            if (avVarF2 instanceof av.c) {
                                av.c cVar3 = (av.c) avVarF2;
                                if (cVar3.a("libcore.util.NativeAllocationRegistry")) {
                                    Integer num = (Integer) linkedHashMap.get(lD);
                                    int iLongValue = 0;
                                    int iIntValue = num != null ? num.intValue() : 0;
                                    at atVarB4 = cVar3.b("libcore.util.NativeAllocationRegistry", "size");
                                    if (atVarB4 != null && (awVar = atVarB4.c) != null && (lC = awVar.c()) != null) {
                                        iLongValue = (int) lC.longValue();
                                    }
                                    linkedHashMap.put(lD, Integer.valueOf(iIntValue + iLongValue));
                                }
                            }
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }
}
