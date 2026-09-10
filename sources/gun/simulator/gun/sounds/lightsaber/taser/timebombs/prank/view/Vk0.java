package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: loaded from: classes4.dex */
public final class Vk0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3890a;
    public /* synthetic */ Object b;
    public final /* synthetic */ WeaponUseActivity c;
    public final /* synthetic */ SpineController d;
    public final /* synthetic */ View e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vk0(WeaponUseActivity weaponUseActivity, SpineController spineController, View view, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = weaponUseActivity;
        this.d = spineController;
        this.e = view;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        Vk0 vk0 = new Vk0(this.c, this.d, this.e, interfaceC2857Wj);
        vk0.b = obj;
        return vk0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Vk0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        String name;
        AbstractC4340pk0 abstractC4340pk0;
        View view;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3890a;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        SpineController spineController = this.d;
        WeaponUseActivity weaponUseActivity = this.c;
        if (i != 0) {
            if (i == 1) {
                AbstractC3375el.b0(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            abstractC4340pk0 = weaponUseActivity.d;
            if (abstractC4340pk0 != null && (abstractC4340pk0 instanceof C3794jb0) && (view = this.e) != null) {
                view.setOnTouchListener(new Dk0(abstractC4340pk0, 3));
            }
            return c5033xf0;
        }
        AbstractC3375el.b0(obj);
        InterfaceC4514rk interfaceC4514rk = (InterfaceC4514rk) this.b;
        Tk0 tk0 = new Tk0(spineController, null);
        this.b = interfaceC4514rk;
        this.f3890a = 1;
        if (WD.X(tk0, AbstractC4437qp.b, this) == enumC4602sk) {
            return enumC4602sk;
        }
        Weapon weaponN = weaponUseActivity.n();
        if (weaponN != null && (name = weaponN.getName()) != null) {
            Uk0 uk0 = new Uk0(spineController, weaponUseActivity, name, null);
            this.b = null;
            this.f3890a = 2;
            if (WD.X(uk0, AbstractC4437qp.b, this) == enumC4602sk) {
                return enumC4602sk;
            }
            abstractC4340pk0 = weaponUseActivity.d;
            if (abstractC4340pk0 != null) {
                view.setOnTouchListener(new Dk0(abstractC4340pk0, 3));
            }
        }
        return c5033xf0;
    }
}
