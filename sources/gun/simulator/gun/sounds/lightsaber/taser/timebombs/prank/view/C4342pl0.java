package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4342pl0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4848a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4342pl0(String str, String str2, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4848a = str;
        this.b = str2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4342pl0(this.f4848a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C4342pl0 c4342pl0 = (C4342pl0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c4342pl0.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC3375el.b0(obj);
        String str = this.f4848a;
        int iHashCode = str.hashCode();
        String str2 = this.b;
        switch (iHashCode) {
            case -1012121825:
                if (str.equals("LightSaber-A")) {
                    ((C2856Wi) AbstractC3194cj.p.getValue()).b(str2);
                }
                break;
            case -1012121824:
                if (str.equals("LightSaber-B")) {
                    ((C2856Wi) AbstractC3194cj.q.getValue()).b(str2);
                }
                break;
            case -1012121823:
                if (str.equals("LightSaber-C")) {
                    ((C2856Wi) AbstractC3194cj.r.getValue()).b(str2);
                }
                break;
            case -1012121822:
                if (str.equals("LightSaber-D")) {
                    ((C2856Wi) AbstractC3194cj.s.getValue()).b(str2);
                }
                break;
            case -1012121821:
                if (str.equals("LightSaber-E")) {
                    ((C2856Wi) AbstractC3194cj.t.getValue()).b(str2);
                }
                break;
            case -1012121820:
                if (str.equals("LightSaber-F")) {
                    ((C2856Wi) AbstractC3194cj.u.getValue()).b(str2);
                }
                break;
            case -1012121819:
                if (str.equals("LightSaber-G")) {
                    ((C2856Wi) AbstractC3194cj.v.getValue()).b(str2);
                }
                break;
            case -1012121818:
                if (str.equals("LightSaber-H")) {
                    ((C2856Wi) AbstractC3194cj.w.getValue()).b(str2);
                }
                break;
            case -1012121817:
                if (str.equals("LightSaber-I")) {
                    ((C2856Wi) AbstractC3194cj.x.getValue()).b(str2);
                }
                break;
            case -1012121816:
                if (str.equals("LightSaber-J")) {
                    ((C2856Wi) AbstractC3194cj.y.getValue()).b(str2);
                }
                break;
            case -1012121815:
                if (str.equals("LightSaber-K")) {
                    ((C2856Wi) AbstractC3194cj.z.getValue()).b(str2);
                }
                break;
            case -1012121814:
                if (str.equals("LightSaber-L")) {
                    ((C2856Wi) AbstractC3194cj.A.getValue()).b(str2);
                }
                break;
        }
        return C5033xf0.f5238a;
    }
}
