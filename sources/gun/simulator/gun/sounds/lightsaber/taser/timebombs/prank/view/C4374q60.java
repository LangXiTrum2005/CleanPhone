package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.q60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4374q60 implements InterfaceC4612sp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4549s60 f4869a;
    public final long b;
    public final Object c;
    public final InterfaceC2857Wj d;

    public C4374q60(C4549s60 c4549s60, long j, Object obj, C2798Uc c2798Uc) {
        this.f4869a = c4549s60;
        this.b = j;
        this.c = obj;
        this.d = c2798Uc;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4612sp
    public final void c() {
        C4549s60 c4549s60 = this.f4869a;
        synchronized (c4549s60) {
            if (this.b < c4549s60.n()) {
                return;
            }
            Object[] objArr = c4549s60.h;
            AbstractC2995aW.n(objArr);
            long j = this.b;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            AbstractC4637t60.c(objArr, j, AbstractC4637t60.f5016a);
            c4549s60.i();
        }
    }
}
