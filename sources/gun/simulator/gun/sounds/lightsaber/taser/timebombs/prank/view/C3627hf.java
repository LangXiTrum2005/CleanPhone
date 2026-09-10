package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3627hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4461a;
    public final InterfaceC3567gx b;
    public final Object c;

    public C3627hf(Q40 q40, int i) {
        this.f4461a = i;
        if (i != 1) {
            this.b = q40;
            this.c = new C3539gf(1);
        } else {
            this.b = q40;
            this.c = new ConcurrentHashMap();
        }
    }

    public final Object a(InterfaceC3156cG interfaceC3156cG, ArrayList arrayList) {
        Object objV;
        Object objV2;
        Object objPutIfAbsent;
        int i = this.f4461a;
        InterfaceC3567gx interfaceC3567gx = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ConcurrentHashMap concurrentHashMap = ((HT) ((C3539gf) obj).get(AbstractC2995aW.K(interfaceC3156cG))).f3172a;
                Object obj2 = concurrentHashMap.get(arrayList);
                if (obj2 == null) {
                    try {
                        objV = (InterfaceC4123nG) interfaceC3567gx.invoke(interfaceC3156cG, arrayList);
                    } catch (Throwable th) {
                        objV = AbstractC3375el.v(th);
                    }
                    IZ iz = new IZ(objV);
                    Object objPutIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList, iz);
                    obj2 = objPutIfAbsent2 == null ? iz : objPutIfAbsent2;
                    break;
                }
                return ((IZ) obj2).f3222a;
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) obj;
                Class clsK = AbstractC2995aW.K(interfaceC3156cG);
                Object ht = concurrentHashMap2.get(clsK);
                if (ht == null && (objPutIfAbsent = concurrentHashMap2.putIfAbsent(clsK, (ht = new HT()))) != null) {
                    ht = objPutIfAbsent;
                }
                ConcurrentHashMap concurrentHashMap3 = ((HT) ht).f3172a;
                Object obj3 = concurrentHashMap3.get(arrayList);
                if (obj3 == null) {
                    try {
                        objV2 = (InterfaceC4123nG) interfaceC3567gx.invoke(interfaceC3156cG, arrayList);
                    } catch (Throwable th2) {
                        objV2 = AbstractC3375el.v(th2);
                    }
                    IZ iz2 = new IZ(objV2);
                    Object objPutIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList, iz2);
                    obj3 = objPutIfAbsent3 == null ? iz2 : objPutIfAbsent3;
                    break;
                }
                return ((IZ) obj3).f3222a;
        }
    }
}
