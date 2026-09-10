package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: loaded from: classes4.dex */
public final class Xj0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Weapon f3990a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xj0(Weapon weapon, int i, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3990a = weapon;
        this.b = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new Xj0(this.f3990a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Xj0 xj0 = (Xj0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        xj0.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC3375el.b0(obj);
        String name = this.f3990a.getName();
        int iHashCode = name.hashCode();
        int i = this.b;
        switch (iHashCode) {
            case -1012121825:
                if (name.equals("LightSaber-A")) {
                    ((C2856Wi) AbstractC3194cj.B.getValue()).b(AbstractC4496rb.r(i));
                }
                break;
            case -1012121824:
                if (name.equals("LightSaber-B")) {
                    ((C2856Wi) AbstractC3194cj.C.getValue()).b(AbstractC4496rb.r(i));
                }
                break;
            case -1012121823:
                if (name.equals("LightSaber-C")) {
                    ((C2856Wi) AbstractC3194cj.D.getValue()).b(AbstractC4496rb.r(i));
                }
                break;
            case -1012121822:
                if (name.equals("LightSaber-D")) {
                    ((C2856Wi) AbstractC3194cj.E.getValue()).b(AbstractC4496rb.r(i));
                }
                break;
            case -1012121821:
                if (name.equals("LightSaber-E")) {
                    ((C2856Wi) AbstractC3194cj.F.getValue()).b(AbstractC4496rb.r(i));
                }
                break;
            case -1012121820:
                if (name.equals("LightSaber-F")) {
                    ((C2856Wi) AbstractC3194cj.G.getValue()).b(AbstractC4496rb.r(i));
                }
                break;
            case -1012121819:
                if (name.equals("LightSaber-G")) {
                    ((C2856Wi) AbstractC3194cj.H.getValue()).b(AbstractC4496rb.r(i));
                }
                break;
            case -1012121818:
                if (name.equals("LightSaber-H")) {
                    ((C2856Wi) AbstractC3194cj.I.getValue()).b(AbstractC4496rb.r(i));
                }
                break;
            case -1012121817:
                if (name.equals("LightSaber-I")) {
                    ((C2856Wi) AbstractC3194cj.J.getValue()).b(AbstractC4496rb.r(i));
                }
                break;
            case -1012121816:
                if (name.equals("LightSaber-J")) {
                    ((C2856Wi) AbstractC3194cj.K.getValue()).b(AbstractC4496rb.r(i));
                }
                break;
            case -1012121815:
                if (name.equals("LightSaber-K")) {
                    ((C2856Wi) AbstractC3194cj.L.getValue()).b(AbstractC4496rb.r(i));
                }
                break;
            case -1012121814:
                if (name.equals("LightSaber-L")) {
                    ((C2856Wi) AbstractC3194cj.M.getValue()).b(AbstractC4496rb.r(i));
                }
                break;
        }
        return C5033xf0.f5238a;
    }
}
