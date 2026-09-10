package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.IControl;
import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3464fl0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeaponUseActivity f4383a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3464fl0(WeaponUseActivity weaponUseActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4383a = weaponUseActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3464fl0(this.f4383a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3464fl0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        String name;
        AbstractC3375el.b0(obj);
        WeaponUseActivity weaponUseActivity = this.f4383a;
        SpineController spineController = weaponUseActivity.g;
        if (spineController != null) {
            IControl.DefaultImpls.setAnimation$default(spineController, "LIGHT_RECTANGLE", 5, "guangyun_chuxian", false, 0.0f, null, 56, null);
        }
        SpineController spineController2 = weaponUseActivity.g;
        if (spineController2 != null) {
            IControl.DefaultImpls.setAnimation$default(spineController2, "LIGHT_RECTANGLE", 6, "guangzhu_chuxian", false, 0.0f, null, 56, null);
        }
        Weapon weaponN = weaponUseActivity.n();
        if (weaponN == null || (name = weaponN.getName()) == null) {
            return null;
        }
        AbstractC4340pk0 abstractC4340pk0 = weaponUseActivity.d;
        AbstractC2995aW.o(abstractC4340pk0, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.LightSaberFireHelper");
        ((C4213oI) abstractC4340pk0).N(name);
        return C5033xf0.f5238a;
    }
}
