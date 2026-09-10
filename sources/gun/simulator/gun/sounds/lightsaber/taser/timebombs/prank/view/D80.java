package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.SplashActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivitySplashBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class D80 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2958a;
    public /* synthetic */ Object b;
    public final /* synthetic */ SplashActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D80(SplashActivity splashActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = splashActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        D80 d80 = new D80(this.c, interfaceC2857Wj);
        d80.b = obj;
        return d80;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((D80) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f2958a;
        int i2 = 1;
        SplashActivity splashActivity = this.c;
        if (i != 0) {
            if (i == 1) {
                AbstractC3375el.b0(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            int i3 = SplashActivity.b;
            if (splashActivity.getWindow().isActive()) {
                splashActivity.f2780a = new QL(splashActivity, i2);
                VQ.a().f(splashActivity, ((ActivitySplashBinding) splashActivity.getMBinding()).conNativeAdPlacement, AbstractC3485g1.f, splashActivity.f2780a);
            }
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(obj);
        C80 c80 = new C80(2, null);
        this.f2958a = 1;
        obj = WD.X(c80, AbstractC4437qp.b, this);
        if (obj == enumC4602sk) {
            return enumC4602sk;
        }
        if (((Boolean) obj).booleanValue()) {
            ((ActivitySplashBinding) splashActivity.getMBinding()).vBottomLine.setVisibility(0);
            ((ActivitySplashBinding) splashActivity.getMBinding()).conNativeAdPlacement.setVisibility(0);
            this.f2958a = 2;
            if (AbstractC2995aW.v(100L, this) == enumC4602sk) {
                return enumC4602sk;
            }
            int i4 = SplashActivity.b;
            if (splashActivity.getWindow().isActive()) {
                splashActivity.f2780a = new QL(splashActivity, i2);
                VQ.a().f(splashActivity, ((ActivitySplashBinding) splashActivity.getMBinding()).conNativeAdPlacement, AbstractC3485g1.f, splashActivity.f2780a);
            }
        } else {
            ((ActivitySplashBinding) splashActivity.getMBinding()).vBottomLine.setVisibility(8);
            ((ActivitySplashBinding) splashActivity.getMBinding()).conNativeAdPlacement.setVisibility(8);
        }
        return C5033xf0.f5238a;
    }
}
