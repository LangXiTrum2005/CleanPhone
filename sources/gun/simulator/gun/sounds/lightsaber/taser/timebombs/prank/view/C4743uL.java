package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4743uL extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f5074a;
    public Object b;
    public Object c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ MainActivity f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4743uL(MainActivity mainActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.f = mainActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return MainActivity.h(this.f, this);
    }
}
