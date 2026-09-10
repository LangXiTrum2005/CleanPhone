package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2532Jv extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2558Kv f3289a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C2558Kv d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2532Jv(C2558Kv c2558Kv, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.d = c2558Kv;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
