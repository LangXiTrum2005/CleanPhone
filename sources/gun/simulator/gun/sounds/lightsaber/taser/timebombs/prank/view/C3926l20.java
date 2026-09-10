package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.l20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3926l20 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4627a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4629t20 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3926l20(C4629t20 c4629t20, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = c4629t20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C3926l20 c3926l20 = new C3926l20(this.c, interfaceC2857Wj);
        c3926l20.b = obj;
        return c3926l20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3926l20) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        InterfaceC2857Wj interfaceC2857Wj;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4627a;
        C4629t20 c4629t20 = this.c;
        if (i != 0) {
            if (i == 1) {
                AbstractC3375el.b0(obj);
                interfaceC2857Wj = null;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(obj);
        InterfaceC4514rk interfaceC4514rk = (InterfaceC4514rk) this.b;
        c4629t20.Y = false;
        c4629t20.Z = false;
        c4629t20.a0 = false;
        List listK = AbstractC2340Cl.K(new C4839vT("banji.MP3", new C3838k20(c4629t20, 0)), new C4839vT("empty_shoot.MP3", new C3838k20(c4629t20, 1)), new C4839vT("shoot.MP3", new C3838k20(c4629t20, 2)), new C4839vT("open_cartridge.mp3", new C3838k20(c4629t20, 3)), new C4839vT("fold_cartridge.MP3", new C3838k20(c4629t20, 4)), new C4839vT("fold_cartridge2.mp3", new C3838k20(c4629t20, 5)), new C4839vT("load_bullet.MP3", new C3838k20(c4629t20, 6)), new C4839vT("unload_bullet.mp3", new C3838k20(c4629t20, 7)), new C4839vT("sliding_cylinder.MP3", new C3838k20(c4629t20, 8)));
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c4629t20.b);
        ExecutorC4433qn executorC4433qn = AbstractC4437qp.b;
        interfaceC2857Wj = null;
        WD.D(lifecycleScope, executorC4433qn, 0, new C3576h20(listK, c4629t20, null), 2);
        C3819jo c3819joG = WD.g(interfaceC4514rk, executorC4433qn, new C3750j20(c4629t20, null), 2);
        this.b = interfaceC4514rk;
        this.f4627a = 1;
        if (c3819joG.z(this) == enumC4602sk) {
            return enumC4602sk;
        }
        C3664i20 c3664i20 = new C3664i20(c4629t20, interfaceC2857Wj);
        this.b = interfaceC2857Wj;
        this.f4627a = 2;
        if (WD.X(c3664i20, AbstractC4437qp.b, this) == enumC4602sk) {
            return enumC4602sk;
        }
        return C5033xf0.f5238a;
    }
}
