package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes3.dex */
public final class Ap0 extends vp0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ Ap0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vp0
    public final void a() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                Cp0 cp0 = (Cp0) obj;
                if (cp0.m != null) {
                    cp0.b.c("Unbind from service.", new Object[0]);
                    cp0.f2944a.unbindService(cp0.l);
                    cp0.g = false;
                    cp0.m = null;
                    cp0.l = null;
                }
                cp0.b();
                break;
            default:
                ServiceConnectionC3340eN serviceConnectionC3340eN = (ServiceConnectionC3340eN) obj;
                Cp0 cp1 = (Cp0) serviceConnectionC3340eN.b;
                cp1.b.c("unlinkToDeath", new Object[0]);
                cp1.m.asBinder().unlinkToDeath(cp1.j, 0);
                Cp0 cp2 = (Cp0) serviceConnectionC3340eN.b;
                cp2.m = null;
                cp2.g = false;
                break;
        }
    }
}
