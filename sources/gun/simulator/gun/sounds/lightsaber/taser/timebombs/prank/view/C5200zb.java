package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5200zb extends WG implements InterfaceC2766Sw {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5200zb(InterfaceC2766Sw interfaceC2766Sw, Object obj, InterfaceC3549gk interfaceC3549gk) {
        super(1);
        this.h = interfaceC2766Sw;
        this.g = obj;
        this.i = interfaceC3549gk;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        switch (this.f) {
            case 0:
                invoke((Throwable) obj);
                break;
            default:
                invoke((Throwable) obj);
                break;
        }
        return c5033xf0;
    }

    public final void invoke(Throwable th) throws IllegalAccessException, InvocationTargetException {
        int i = this.f;
        Object obj = this.g;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                if (obj == AbstractC2382Eb.l) {
                    return;
                }
                InterfaceC2766Sw interfaceC2766Sw = ((C2330Cb) obj3).b;
                AbstractC3950lJ.z(obj2);
                throw null;
            default:
                InterfaceC3549gk interfaceC3549gk = (InterfaceC3549gk) obj2;
                C3770jF c3770jFJ = AbstractC3375el.j((InterfaceC2766Sw) obj3, obj, null);
                if (c3770jFJ != null) {
                    AbstractC2995aW.Q(interfaceC3549gk, c3770jFJ);
                    return;
                }
                return;
        }
    }
}
