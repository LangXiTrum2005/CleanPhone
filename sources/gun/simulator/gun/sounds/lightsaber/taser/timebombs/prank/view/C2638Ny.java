package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ny, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2638Ny extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3484a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2638Ny(String str, String str2, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3484a = str;
        this.b = str2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C2638Ny(this.f3484a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C2638Ny c2638Ny = (C2638Ny) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c2638Ny.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC3375el.b0(obj);
        String str = this.f3484a;
        int iHashCode = str.hashCode();
        String str2 = this.b;
        switch (iHashCode) {
            case -2054746672:
                if (str.equals("Kar98K")) {
                    ((C2856Wi) AbstractC3371ej.t.getValue()).b(str2);
                }
                break;
            case -2040511715:
                if (str.equals("M4A4-P")) {
                    ((C2856Wi) AbstractC3371ej.q.getValue()).b(str2);
                }
                break;
            case -1853321774:
                if (str.equals("D.E-GOLD")) {
                    ((C2856Wi) AbstractC3371ej.e.getValue()).b(str2);
                }
                break;
            case -1787950154:
                if (str.equals("UMP-45")) {
                    ((C2856Wi) AbstractC3371ej.d.getValue()).b(str2);
                }
                break;
            case -1362852984:
                if (str.equals("Colt Python")) {
                    ((C2856Wi) AbstractC3371ej.j.getValue()).b(str2);
                }
                break;
            case -104799306:
                if (str.equals("SCAR 20S")) {
                    ((C2856Wi) AbstractC3371ej.l.getValue()).b(str2);
                }
                break;
            case 65239:
                if (str.equals("AWM")) {
                    ((C2856Wi) AbstractC3371ej.m.getValue()).b(str2);
                }
                break;
            case 65242:
                if (str.equals("AWP")) {
                    ((C2856Wi) AbstractC3371ej.c.getValue()).b(str2);
                }
                break;
            case 76530:
                if (str.equals("MP5")) {
                    ((C2856Wi) AbstractC3371ej.k.getValue()).b(str2);
                }
                break;
            case 78695:
                if (str.equals("P90")) {
                    ((C2856Wi) AbstractC3371ej.b.getValue()).b(str2);
                }
                break;
            case 84338:
                if (str.equals("USP")) {
                    ((C2856Wi) AbstractC3371ej.n.getValue()).b(str2);
                }
                break;
            case 2345946:
                if (str.equals("M4A4")) {
                    ((C2856Wi) AbstractC3371ej.g.getValue()).b(str2);
                }
                break;
            case 2348486:
                if (str.equals("M762")) {
                    ((C2856Wi) AbstractC3371ej.u.getValue()).b(str2);
                }
                break;
            case 62308102:
                if (str.equals("AK-47")) {
                    ((C2856Wi) AbstractC3371ej.s.getValue()).b(str2);
                }
                break;
            case 64737569:
                if (str.equals("Russian Roulette")) {
                    ((C2856Wi) AbstractC2934Zi.f4086a.getValue()).b(str2);
                }
                break;
            case 68779382:
                if (str.equals("HK416")) {
                    ((C2856Wi) AbstractC3371ej.o.getValue()).b(str2);
                }
                break;
            case 72618575:
                if (str.equals("M1014")) {
                    ((C2856Wi) AbstractC3371ej.i.getValue()).b(str2);
                }
                break;
            case 75145761:
                if (str.equals("Negev")) {
                    ((C2856Wi) AbstractC3371ej.f4332a.getValue()).b(str2);
                }
                break;
            case 1475729840:
                if (str.equals("Gatling")) {
                    ((C2856Wi) AbstractC3371ej.f.getValue()).b(str2);
                }
                break;
            case 1931762354:
                if (str.equals("AK47-R")) {
                    ((C2856Wi) AbstractC3371ej.p.getValue()).b(str2);
                }
                break;
            case 1931762361:
                if (str.equals("AK47-Y")) {
                    ((C2856Wi) AbstractC3371ej.h.getValue()).b(str2);
                }
                break;
            case 2056648249:
                if (str.equals("Desert Eagle")) {
                    ((C2856Wi) AbstractC3371ej.r.getValue()).b(str2);
                }
                break;
        }
        return C5033xf0.f5238a;
    }
}
