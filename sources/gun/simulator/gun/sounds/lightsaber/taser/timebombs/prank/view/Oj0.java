package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class Oj0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3109bk0 f3518a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oj0(C3109bk0 c3109bk0, String str, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3518a = c3109bk0;
        this.b = str;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new Oj0(this.f3518a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Oj0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        C3109bk0 c3109bk0 = this.f3518a;
        AbstractC4340pk0 abstractC4340pk0 = c3109bk0.f.d;
        AbstractC2995aW.o(abstractC4340pk0, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.GunFireHelper");
        String str = this.b;
        ((C2612My) abstractC4340pk0).C(str);
        WeaponUseActivity weaponUseActivity = c3109bk0.f;
        SpineController spineController = weaponUseActivity.g;
        if (spineController != null) {
            spineController.updateSpine(weaponUseActivity, "GUN_EFFECT", C3109bk0.f(c3109bk0, str));
        }
        SpineController spineController2 = weaponUseActivity.g;
        if (spineController2 != null) {
            spineController2.updateSpine(weaponUseActivity, "GUN_EFFECT1", C3109bk0.f(c3109bk0, str));
        }
        SpineController spineController3 = weaponUseActivity.g;
        if (spineController3 != null) {
            spineController3.updateSpine(weaponUseActivity, "GUN_EFFECT2", C3109bk0.f(c3109bk0, str));
        }
        SpineController spineController4 = weaponUseActivity.g;
        if (spineController4 != null) {
            spineController4.updateSpine(weaponUseActivity, "GUN_EFFECT3", C3109bk0.f(c3109bk0, str));
        }
        SpineController spineController5 = weaponUseActivity.g;
        if (spineController5 == null) {
            return null;
        }
        spineController5.updateSpine(weaponUseActivity, "GUN_SMOKE", C3109bk0.f(c3109bk0, str.concat("_smoke")));
        return C5033xf0.f5238a;
    }
}
