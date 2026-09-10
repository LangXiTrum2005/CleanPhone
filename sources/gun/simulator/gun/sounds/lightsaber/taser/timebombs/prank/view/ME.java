package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class ME extends GE {
    public final PE e;
    public final NE f;
    public final C2515Je g;
    public final Object h;

    public ME(PE pe, NE ne, C2515Je c2515Je, Object obj) {
        this.e = pe;
        this.f = ne;
        this.g = c2515Je;
        this.h = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return C5033xf0.f5238a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GE
    public final void j(Throwable th) {
        PE pe = this.e;
        pe.getClass();
        C2515Je c2515JeV = PE.V(this.g);
        NE ne = this.f;
        Object obj = this.h;
        if (c2515JeV != null) {
            while (AbstractC3375el.J(c2515JeV.e, false, new ME(pe, ne, c2515JeV, obj), 1) == NR.f3457a) {
                c2515JeV = PE.V(c2515JeV);
                if (c2515JeV == null) {
                }
            }
            return;
        }
        pe.x(pe.H(ne, obj));
    }
}
