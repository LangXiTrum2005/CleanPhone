package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4224oT implements InterfaceC2647Oh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4791a;
    public final Object b;
    public Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C4224oT(Object obj, Object obj2, Object obj3, int i) {
        this.f4791a = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2647Oh
    public final void a() {
        int i = this.f4791a;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((C4312pT) obj).getClass();
                C3044b1.b.d().getClass();
                String str = AbstractC4969wu.f5203a;
                synchronized (AbstractC4969wu.class) {
                    AbstractC4969wu.f.remove(this);
                }
                C4981x20.u().t(new RunnableC4048mT(this, 1));
                return;
            default:
                ((C4332pg0) obj).getClass();
                C4981x20.u().q(new RunnableC4156ng0((AbstractC2995aW) this.c, 0));
                return;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2647Oh
    public final void b() {
        switch (this.f4791a) {
            case 0:
                String str = AbstractC4969wu.f5203a;
                synchronized (AbstractC4969wu.class) {
                    AbstractC4969wu.f.remove(this);
                }
                C4981x20.u().t(new RunnableC4048mT(this, 0));
                return;
            default:
                C4332pg0 c4332pg0 = (C4332pg0) this.d;
                String strC = C2375Du.a().c((String) this.b);
                c4332pg0.getClass();
                AbstractC2995aW abstractC2995aW = (AbstractC2995aW) this.c;
                if (!strC.isEmpty()) {
                    C4981x20.u().t(new RunnableC4746uO(c4332pg0, strC, abstractC2995aW, 24));
                    return;
                } else {
                    c4332pg0.f4844a = null;
                    C4981x20.u().q(new RunnableC4156ng0(abstractC2995aW, 1));
                    return;
                }
        }
    }
}
