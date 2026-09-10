package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class Xd0 implements InterfaceC4968wt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3982a;
    public final InterfaceC5194zW b;
    public final InterfaceC5194zW c;
    public final InterfaceC5194zW d;
    public final InterfaceC5194zW e;
    public final InterfaceC5194zW f;

    public /* synthetic */ Xd0(InterfaceC5194zW interfaceC5194zW, InterfaceC5194zW interfaceC5194zW2, InterfaceC4968wt interfaceC4968wt, InterfaceC5194zW interfaceC5194zW3, InterfaceC5194zW interfaceC5194zW4, int i) {
        this.f3982a = i;
        this.b = interfaceC5194zW;
        this.c = interfaceC5194zW2;
        this.d = interfaceC4968wt;
        this.e = interfaceC5194zW3;
        this.f = interfaceC5194zW4;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5194zW
    public final Object get() {
        int i = this.f3982a;
        InterfaceC5194zW interfaceC5194zW = this.f;
        InterfaceC5194zW interfaceC5194zW2 = this.e;
        InterfaceC5194zW interfaceC5194zW3 = this.d;
        InterfaceC5194zW interfaceC5194zW4 = this.c;
        InterfaceC5194zW interfaceC5194zW5 = this.b;
        switch (i) {
            case 0:
                return new Wd0((InterfaceC2438Gf) interfaceC5194zW5.get(), (InterfaceC2438Gf) interfaceC5194zW4.get(), (InterfaceC3226d30) interfaceC5194zW3.get(), (C5123yg0) interfaceC5194zW2.get(), (C3290dm0) interfaceC5194zW.get());
            case 1:
                return new C2653On((Executor) interfaceC5194zW5.get(), (C4571sP) interfaceC5194zW4.get(), (InterfaceC3466fm0) interfaceC5194zW3.get(), (InterfaceC3562gs) interfaceC5194zW2.get(), (La0) interfaceC5194zW.get());
            default:
                return new E20((InterfaceC2438Gf) interfaceC5194zW5.get(), (InterfaceC2438Gf) interfaceC5194zW4.get(), (Z7) interfaceC5194zW3.get(), (C3928l30) interfaceC5194zW2.get(), this.f);
        }
    }
}
