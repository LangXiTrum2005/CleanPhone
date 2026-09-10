package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4954wk implements InterfaceC4968wt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5194a;
    public final InterfaceC5194zW b;
    public final InterfaceC5194zW c;
    public final InterfaceC5194zW d;

    public /* synthetic */ C4954wk(InterfaceC5194zW interfaceC5194zW, InterfaceC5194zW interfaceC5194zW2, InterfaceC5194zW interfaceC5194zW3, int i) {
        this.f5194a = i;
        this.b = interfaceC5194zW;
        this.c = interfaceC5194zW2;
        this.d = interfaceC5194zW3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5194zW
    public final Object get() {
        int i = this.f5194a;
        InterfaceC5194zW interfaceC5194zW = this.d;
        InterfaceC5194zW interfaceC5194zW2 = this.c;
        InterfaceC5194zW interfaceC5194zW3 = this.b;
        switch (i) {
            case 0:
                return new C4866vk((Context) interfaceC5194zW3.get(), (InterfaceC2438Gf) interfaceC5194zW2.get(), (InterfaceC2438Gf) interfaceC5194zW.get());
            default:
                return new C3928l30((Context) interfaceC5194zW3.get(), (String) interfaceC5194zW2.get(), ((Integer) interfaceC5194zW.get()).intValue());
        }
    }
}
