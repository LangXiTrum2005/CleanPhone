package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4316pX extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4755uX f4837a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C4755uX d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4316pX(C4755uX c4755uX, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.d = c4755uX;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
