package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2869Wv extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2895Xv f3946a;
    public /* synthetic */ Object b;
    public int c;
    public final /* synthetic */ C2895Xv d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2869Wv(C2895Xv c2895Xv, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.d = c2895Xv;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
