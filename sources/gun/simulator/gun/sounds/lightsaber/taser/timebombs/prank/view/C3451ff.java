package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3451ff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4376a;
    public final InterfaceC2766Sw b;
    public final Object c;

    public C3451ff(int i, R40 r40) {
        this.f4376a = i;
        if (i != 1) {
            this.b = r40;
            this.c = new C3363ef(this);
        } else {
            this.b = r40;
            this.c = new ConcurrentHashMap();
        }
    }

    public final InterfaceC4123nG a(InterfaceC3156cG interfaceC3156cG) {
        Object objPutIfAbsent;
        int i = this.f4376a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((C5026xc) ((C3363ef) obj).get(AbstractC2995aW.K(interfaceC3156cG))).f5231a;
            default:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj;
                Class clsK = AbstractC2995aW.K(interfaceC3156cG);
                Object c5026xc = concurrentHashMap.get(clsK);
                if (c5026xc == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsK, (c5026xc = new C5026xc((InterfaceC4123nG) this.b.invoke(interfaceC3156cG))))) != null) {
                    c5026xc = objPutIfAbsent;
                }
                return ((C5026xc) c5026xc).f5231a;
        }
    }
}
