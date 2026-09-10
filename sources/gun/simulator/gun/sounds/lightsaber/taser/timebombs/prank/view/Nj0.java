package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: loaded from: classes4.dex */
public final class Nj0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3472a;
    public final /* synthetic */ C3109bk0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nj0(C3109bk0 c3109bk0, String str, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = c3109bk0;
        this.c = str;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new Nj0(this.b, this.c, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Nj0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:40:0x009a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        SpineController spineController;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3472a;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        String str = this.c;
        C3109bk0 c3109bk0 = this.b;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            String str2 = c3109bk0.c;
            WeaponUseActivity weaponUseActivity = c3109bk0.f;
            AbstractC4340pk0 abstractC4340pk0 = weaponUseActivity.d;
            AbstractC2995aW.o(abstractC4340pk0, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.LightSaberFireHelper");
            ((C4213oI) abstractC4340pk0).a0 = true;
            AbstractC4340pk0 abstractC4340pk1 = weaponUseActivity.d;
            AbstractC2995aW.o(abstractC4340pk1, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.LightSaberFireHelper");
            ((C4213oI) abstractC4340pk1).C(str);
            this.f3472a = 1;
            Object objX = WD.X(new Mj0(c3109bk0, str, null), AbstractC4437qp.b, this);
            if (objX != enumC4602sk) {
                objX = c5033xf0;
            }
            if (objX == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        Weapon weapon = c3109bk0.e;
        String name = weapon != null ? weapon.getName() : null;
        WeaponUseActivity weaponUseActivity2 = c3109bk0.f;
        if (name != null) {
            switch (name) {
                case "LightSaber-B":
                    SpineController spineController2 = weaponUseActivity2.g;
                    if (spineController2 != null) {
                        spineController2.updateSpine(weaponUseActivity2, "LIGHT_SABER_EFFECT", C3109bk0.h(c3109bk0, str));
                    }
                    SpineController spineController3 = weaponUseActivity2.g;
                    if (spineController3 != null) {
                        spineController3.updateSpine(weaponUseActivity2, "LIGHT_SABER_EFFECT1", C3109bk0.h(c3109bk0, str));
                    }
                    SpineController spineController4 = weaponUseActivity2.g;
                    if (spineController4 != null) {
                        spineController4.updateSpine(weaponUseActivity2, "LIGHT_SABER_EFFECT2", C3109bk0.h(c3109bk0, str));
                        return c5033xf0;
                    }
                case "LightSaber-D":
                    SpineController spineController5 = weaponUseActivity2.g;
                    if (spineController5 != null) {
                        spineController5.updateSpine(weaponUseActivity2, "LIGHT_SABER_EFFECT", C3109bk0.h(c3109bk0, str));
                    }
                    SpineController spineController6 = weaponUseActivity2.g;
                    if (spineController6 != null) {
                        spineController6.updateSpine(weaponUseActivity2, "LIGHT_SABER_EFFECT1", C3109bk0.h(c3109bk0, str));
                        return c5033xf0;
                    }
                case "LightSaber-G":
                    SpineController spineController7 = weaponUseActivity2.g;
                    if (spineController7 != null) {
                        spineController7.updateSpine(weaponUseActivity2, "LIGHT_SABER_EFFECT", C3109bk0.h(c3109bk0, str));
                    }
                    SpineController spineController8 = weaponUseActivity2.g;
                    if (spineController8 != null) {
                        spineController8.updateSpine(weaponUseActivity2, "LIGHT_SABER_EFFECT1", C3109bk0.h(c3109bk0, str));
                    }
                    SpineController spineController9 = weaponUseActivity2.g;
                    if (spineController9 != null) {
                        spineController9.updateSpine(weaponUseActivity2, "LIGHT_SABER_EFFECT2", C3109bk0.h(c3109bk0, str));
                        return c5033xf0;
                    }
                case "LightSaber-I":
                case "LightSaber-K":
                    SpineController spineController10 = weaponUseActivity2.g;
                    if (spineController10 != null) {
                        spineController10.updateSpine(weaponUseActivity2, "LIGHT_SABER_EFFECT", C3109bk0.h(c3109bk0, str));
                    }
                    SpineController spineController11 = weaponUseActivity2.g;
                    if (spineController11 != null) {
                        spineController11.updateSpine(weaponUseActivity2, "LIGHT_SABER_EFFECT1", C3109bk0.h(c3109bk0, str));
                        return c5033xf0;
                    }
                default:
                    spineController = weaponUseActivity2.g;
                    if (spineController != null) {
                        spineController.updateSpine(weaponUseActivity2, "LIGHT_SABER_EFFECT", C3109bk0.h(c3109bk0, str));
                        return c5033xf0;
                    }
            }
        } else {
            spineController = weaponUseActivity2.g;
            if (spineController != null) {
                spineController.updateSpine(weaponUseActivity2, "LIGHT_SABER_EFFECT", C3109bk0.h(c3109bk0, str));
                return c5033xf0;
            }
        }
        return null;
    }
}
