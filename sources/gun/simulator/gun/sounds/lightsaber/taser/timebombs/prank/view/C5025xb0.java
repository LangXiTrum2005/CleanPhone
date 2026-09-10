package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5025xb0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5230a;
    public final /* synthetic */ Gb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5025xb0(Gb0 gb0, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = gb0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C5025xb0(this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C5025xb0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        SpineController spineController;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f5230a;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            Gb0 gb0 = this.b;
            Weapon weaponN = gb0.f4847a.n();
            String name = weaponN != null ? weaponN.getName() : null;
            if (name != null && name.length() != 0 && (spineController = gb0.N) != null) {
                Weapon weaponN2 = gb0.f4847a.n();
                AbstractC2995aW.n(weaponN2);
                String name2 = weaponN2.getName();
                AbstractC2995aW.n(name2);
                this.f5230a = 1;
                if (WD.X(new C5113yb0(gb0, spineController, name2, null), AbstractC4437qp.b, this) == enumC4602sk) {
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
