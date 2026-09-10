package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.ShootEffect;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2695Qd extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3610a;
    public /* synthetic */ Object b;
    public final /* synthetic */ DialogC2799Ud c;
    public final /* synthetic */ ShootEffect d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2695Qd(DialogC2799Ud dialogC2799Ud, ShootEffect shootEffect, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = dialogC2799Ud;
        this.d = shootEffect;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C2695Qd c2695Qd = new C2695Qd(this.c, this.d, interfaceC2857Wj);
        c2695Qd.b = obj;
        return c2695Qd;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C2695Qd) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        LifecycleCoroutineScope lifecycleScope;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3610a;
        ShootEffect shootEffect = this.d;
        DialogC2799Ud dialogC2799Ud = this.c;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            C2669Pd c2669Pd = new C2669Pd(dialogC2799Ud, shootEffect, null);
            this.f3610a = 1;
            if (WD.X(c2669Pd, AbstractC4437qp.b, this) == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        InterfaceC2591Md interfaceC2591Md = dialogC2799Ud.c;
        String strValueOf = String.valueOf(shootEffect.getEffectName());
        PL pl = (PL) interfaceC2591Md;
        int i2 = pl.f3547a;
        Object obj2 = pl.b;
        switch (i2) {
            case 0:
                if (!AbstractC2995aW.i(strValueOf, AbstractC3197ck0.c)) {
                    RussianRouletteActivity russianRouletteActivity = (RussianRouletteActivity) obj2;
                    WD.D(LifecycleOwnerKt.getLifecycleScope(russianRouletteActivity), null, 0, new C4188o10(russianRouletteActivity, strValueOf, null), 3);
                }
                break;
            default:
                C3109bk0 c3109bk0 = (C3109bk0) obj2;
                LifecycleOwner lifecycleOwner = c3109bk0.g;
                if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                    WD.D(lifecycleScope, null, 0, new Jj0(c3109bk0, strValueOf, null), 3);
                }
                break;
        }
        AbstractC3651ht.b(dialogC2799Ud);
        return C5033xf0.f5238a;
    }
}
