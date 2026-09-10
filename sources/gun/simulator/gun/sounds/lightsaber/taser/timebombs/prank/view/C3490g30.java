package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.g30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3490g30 implements InterfaceC4968wt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4399a;
    public final InterfaceC5194zW b;
    public final InterfaceC5194zW c;
    public final InterfaceC5194zW d;
    public final InterfaceC5194zW e;

    public /* synthetic */ C3490g30(InterfaceC5194zW interfaceC5194zW, InterfaceC5194zW interfaceC5194zW2, InterfaceC4968wt interfaceC4968wt, InterfaceC5194zW interfaceC5194zW3, int i) {
        this.f4399a = i;
        this.b = interfaceC5194zW;
        this.c = interfaceC5194zW2;
        this.d = interfaceC4968wt;
        this.e = interfaceC5194zW3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5194zW
    public final Object get() {
        int i = this.f4399a;
        InterfaceC5194zW interfaceC5194zW = this.e;
        InterfaceC5194zW interfaceC5194zW2 = this.d;
        InterfaceC5194zW interfaceC5194zW3 = this.c;
        InterfaceC5194zW interfaceC5194zW4 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) interfaceC5194zW4.get();
                InterfaceC3562gs interfaceC3562gs = (InterfaceC3562gs) interfaceC5194zW3.get();
                C3849k8 c3849k8 = (C3849k8) interfaceC5194zW2.get();
                return new FE(context, interfaceC3562gs, c3849k8);
            default:
                return new C3290dm0((Executor) interfaceC5194zW4.get(), (InterfaceC3562gs) interfaceC5194zW3.get(), (InterfaceC3466fm0) interfaceC5194zW2.get(), (La0) interfaceC5194zW.get());
        }
    }
}
