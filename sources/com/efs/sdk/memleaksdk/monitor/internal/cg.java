package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class cg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final da f634a;

    public static final class a implements da.a {
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC2766Sw c;

        public a(Map map, InterfaceC2766Sw interfaceC2766Sw) {
            this.b = map;
            this.c = interfaceC2766Sw;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.da.a
        public void a(long j, long j2) {
            int iIntValue;
            C4839vT c4839vT = (C4839vT) this.b.get(Long.valueOf(j));
            if (c4839vT != null) {
                int iIntValue2 = ((Number) c4839vT.f5132a).intValue();
                int iIntValue3 = ((Number) c4839vT.b).intValue();
                iIntValue = ((Number) this.c.invoke(Long.valueOf(j))).intValue();
                this.b.put(Long.valueOf(j), new C4839vT(Integer.valueOf(iIntValue2 + iIntValue), Integer.valueOf(iIntValue3 + 1)));
            } else {
                iIntValue = -1;
            }
            if (j2 != 0) {
                ArrayList arrayListL = AbstractC2340Cl.L(Long.valueOf(j));
                while (j2 != 0) {
                    if (this.b.containsKey(Long.valueOf(j2))) {
                        Iterator it = arrayListL.iterator();
                        while (it.hasNext()) {
                            cg.this.f634a.a(((Number) it.next()).longValue(), j2);
                        }
                        if (iIntValue == -1) {
                            iIntValue = ((Number) this.c.invoke(Long.valueOf(j))).intValue();
                        }
                        C4839vT c4839vT2 = (C4839vT) U5.q0(this.b, Long.valueOf(j2));
                        this.b.put(Long.valueOf(j2), new C4839vT(Integer.valueOf(((Number) c4839vT2.f5132a).intValue() + iIntValue), Integer.valueOf(((Number) c4839vT2.b).intValue() + 1)));
                        arrayListL.clear();
                    } else {
                        arrayListL.add(Long.valueOf(j2));
                    }
                    j2 = cg.this.f634a.b(j2);
                }
                Iterator it2 = arrayListL.iterator();
                while (it2.hasNext()) {
                    cg.this.f634a.a(((Number) it2.next()).longValue(), 0L);
                }
            }
        }
    }

    public cg() {
        this(0, 1);
    }

    public final Map<Long, C4839vT> a(Set<Long> set, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(set, "retainedObjectIds");
        AbstractC2995aW.q(interfaceC2766Sw, "computeSize");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(Long.valueOf(((Number) it.next()).longValue()), new C4839vT(0, 0));
        }
        this.f634a.a(new a(linkedHashMap, interfaceC2766Sw));
        this.f634a.c();
        return linkedHashMap;
    }

    public cg(int i) {
        this.f634a = new da(i);
    }

    public /* synthetic */ cg(int i, int i2) {
        this((i2 & 1) != 0 ? 4 : i);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    public final boolean a(long j, long j2) {
        int iA = this.f634a.a(j);
        boolean z = iA != -1;
        if (z) {
            long j3 = 0;
            if (j2 != 0) {
                long j4 = this.f634a.b[iA];
                if (j4 != 0) {
                    dd ddVar = new dd(0, 1);
                    long j5 = j4;
                    while (j5 != j3) {
                        ddVar.a(j5);
                        int iA2 = this.f634a.a(j5);
                        if (iA2 != -1) {
                            j5 = this.f634a.b[iA2];
                            j3 = 0;
                        } else {
                            StringBuilder sbP = DM.p("Did not find dominator for ", j5, " when going through the dominator chain for ");
                            sbP.append(j4);
                            sbP.append(": ");
                            sbP.append(ddVar);
                            throw new IllegalStateException(sbP.toString());
                        }
                    }
                    long j6 = j3;
                    long j7 = j2;
                    while (j7 != j6 && !ddVar.b(j7)) {
                        int iA3 = this.f634a.a(j7);
                        if (iA3 != -1) {
                            j7 = this.f634a.b[iA3];
                        } else {
                            StringBuilder sbP2 = DM.p("Did not find dominator for ", j7, " when going through the dominator chain for ");
                            sbP2.append(j2);
                            throw new IllegalStateException(sbP2.toString());
                        }
                    }
                    this.f634a.a(j, j7);
                }
            } else {
                this.f634a.a(j, j2);
            }
        } else {
            this.f634a.a(j, j2);
        }
        return z;
    }
}
