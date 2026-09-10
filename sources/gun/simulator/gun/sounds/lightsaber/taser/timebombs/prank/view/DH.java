package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: loaded from: classes4.dex */
public final class DH extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2964a;
    public final /* synthetic */ C4213oI b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DH(C4213oI c4213oI, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = c4213oI;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new DH(this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((DH) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        String name;
        SpineController spineController;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f2964a;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            C4213oI c4213oI = this.b;
            Weapon weaponN = c4213oI.f4847a.n();
            if (weaponN != null && (name = weaponN.getName()) != null && (spineController = c4213oI.N) != null) {
                this.f2964a = 1;
                Object objX = WD.X(new EH(c4213oI, spineController, name, null), AbstractC4437qp.b, this);
                if (objX != enumC4602sk) {
                    objX = c5033xf0;
                }
                if (objX == enumC4602sk) {
                    return enumC4602sk;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return c5033xf0;
    }
}
