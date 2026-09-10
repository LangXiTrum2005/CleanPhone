package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.up, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4788up extends GE {
    public final /* synthetic */ int e;
    public final Object f;

    public C4788up(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        switch (this.e) {
            case 0:
                j((Throwable) obj);
                break;
            case 1:
                j((Throwable) obj);
                break;
            case 2:
                j((Throwable) obj);
                break;
            default:
                j((Throwable) obj);
                break;
        }
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GE
    public final void j(Throwable th) throws IllegalAccessException, InvocationTargetException {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                ((InterfaceC4612sp) obj).c();
                break;
            case 1:
                ((InterfaceC2766Sw) obj).invoke(th);
                break;
            case 2:
                Object objN = i().N();
                if (!(objN instanceof C3013ah)) {
                    ((C2798Uc) obj).resumeWith(QE.a(objN));
                } else {
                    ((C2798Uc) obj).resumeWith(AbstractC3375el.v(((C3013ah) objN).f4134a));
                }
                break;
            default:
                ((InterfaceC2857Wj) obj).resumeWith(C5033xf0.f5238a);
                break;
        }
    }
}
