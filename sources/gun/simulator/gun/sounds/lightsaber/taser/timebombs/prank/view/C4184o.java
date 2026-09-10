package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4184o extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public G20 f4770a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4706tv c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4184o(C4706tv c4706tv, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.c = c4706tv;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
