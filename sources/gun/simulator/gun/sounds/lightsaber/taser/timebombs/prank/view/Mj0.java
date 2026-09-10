package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: loaded from: classes4.dex */
public final class Mj0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3417a;
    public final /* synthetic */ C3109bk0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mj0(C3109bk0 c3109bk0, String str, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3417a = str;
        this.b = c3109bk0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new Mj0(this.b, this.f3417a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        Mj0 mj0 = (Mj0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        mj0.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:43:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a1  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        WeaponUseActivity weaponUseActivity;
        SpineController spineController;
        AbstractC3375el.b0(obj);
        if (AbstractC2995aW.i(this.f3417a, "xunhuan_huoxing")) {
            C3109bk0 c3109bk0 = this.b;
            Weapon weapon = c3109bk0.e;
            String name = weapon != null ? weapon.getName() : null;
            if (name != null) {
                switch (name) {
                    case "LightSaber-B":
                        WeaponUseActivity weaponUseActivity2 = c3109bk0.f;
                        SpineController spineController2 = weaponUseActivity2.g;
                        if (spineController2 != null) {
                            spineController2.updateSpine(weaponUseActivity2, "HUO_XING", C3109bk0.g(c3109bk0));
                        }
                        WeaponUseActivity weaponUseActivity3 = c3109bk0.f;
                        SpineController spineController3 = weaponUseActivity3.g;
                        if (spineController3 != null) {
                            spineController3.updateSpine(weaponUseActivity3, "HUO_XING1", C3109bk0.g(c3109bk0));
                        }
                        WeaponUseActivity weaponUseActivity4 = c3109bk0.f;
                        SpineController spineController4 = weaponUseActivity4.g;
                        if (spineController4 != null) {
                            spineController4.updateSpine(weaponUseActivity4, "HUO_XING2", C3109bk0.g(c3109bk0));
                        }
                        break;
                    case "LightSaber-D":
                        WeaponUseActivity weaponUseActivity5 = c3109bk0.f;
                        SpineController spineController5 = weaponUseActivity5.g;
                        if (spineController5 != null) {
                            spineController5.updateSpine(weaponUseActivity5, "HUO_XING", C3109bk0.g(c3109bk0));
                        }
                        WeaponUseActivity weaponUseActivity6 = c3109bk0.f;
                        SpineController spineController6 = weaponUseActivity6.g;
                        if (spineController6 != null) {
                            spineController6.updateSpine(weaponUseActivity6, "HUO_XING1", C3109bk0.g(c3109bk0));
                        }
                        break;
                    case "LightSaber-G":
                        WeaponUseActivity weaponUseActivity7 = c3109bk0.f;
                        SpineController spineController7 = weaponUseActivity7.g;
                        if (spineController7 != null) {
                            spineController7.updateSpine(weaponUseActivity7, "HUO_XING", C3109bk0.g(c3109bk0));
                        }
                        WeaponUseActivity weaponUseActivity8 = c3109bk0.f;
                        SpineController spineController8 = weaponUseActivity8.g;
                        if (spineController8 != null) {
                            spineController8.updateSpine(weaponUseActivity8, "HUO_XING1", C3109bk0.g(c3109bk0));
                        }
                        WeaponUseActivity weaponUseActivity9 = c3109bk0.f;
                        SpineController spineController9 = weaponUseActivity9.g;
                        if (spineController9 != null) {
                            spineController9.updateSpine(weaponUseActivity9, "HUO_XING2", C3109bk0.g(c3109bk0));
                        }
                        break;
                    case "LightSaber-I":
                    case "LightSaber-K":
                        WeaponUseActivity weaponUseActivity10 = c3109bk0.f;
                        SpineController spineController10 = weaponUseActivity10.g;
                        if (spineController10 != null) {
                            spineController10.updateSpine(weaponUseActivity10, "HUO_XING", C3109bk0.g(c3109bk0));
                        }
                        WeaponUseActivity weaponUseActivity11 = c3109bk0.f;
                        SpineController spineController11 = weaponUseActivity11.g;
                        if (spineController11 != null) {
                            spineController11.updateSpine(weaponUseActivity11, "HUO_XING1", C3109bk0.g(c3109bk0));
                        }
                        break;
                    default:
                        weaponUseActivity = c3109bk0.f;
                        spineController = weaponUseActivity.g;
                        if (spineController != null) {
                            spineController.updateSpine(weaponUseActivity, "HUO_XING", C3109bk0.g(c3109bk0));
                        }
                        break;
                }
            } else {
                weaponUseActivity = c3109bk0.f;
                spineController = weaponUseActivity.g;
                if (spineController != null) {
                    spineController.updateSpine(weaponUseActivity, "HUO_XING", C3109bk0.g(c3109bk0));
                }
            }
        }
        return C5033xf0.f5238a;
    }
}
