package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Intent;
import com.efs.sdk.base.core.util.NetworkUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponSortActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.LightSaber;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.MechanicalGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Taser;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TechnologyGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TimeBomb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4867vk0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5149a;
    public /* synthetic */ Object b;
    public final /* synthetic */ WeaponSortActivity c;
    public final /* synthetic */ Weapon d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4867vk0(WeaponSortActivity weaponSortActivity, Weapon weapon, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = weaponSortActivity;
        this.d = weapon;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C4867vk0 c4867vk0 = new C4867vk0(this.c, this.d, interfaceC2857Wj);
        c4867vk0.b = obj;
        return c4867vk0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4867vk0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        String str;
        DialogC2411Fe dialogC2411Fe;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f5149a;
        Weapon weapon = this.d;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            C4779uk0 c4779uk0 = new C4779uk0(weapon, null);
            this.f5149a = 1;
            obj = WD.X(c4779uk0, AbstractC4437qp.b, this);
            if (obj == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        WeaponSortActivity weaponSortActivity = this.c;
        if (zBooleanValue) {
            S3.a("unlock_weapon_click");
            if (NetworkUtil.isConnected(weaponSortActivity)) {
                if (!weaponSortActivity.isFinishing() && !weaponSortActivity.isDestroyed()) {
                    if (weapon instanceof MechanicalGun) {
                        str = "Reward_MachineGun";
                    } else if (weapon instanceof LightSaber) {
                        str = "Reward_Lightsaber";
                    } else if (weapon instanceof Taser) {
                        str = "Reward_Taser";
                    } else if (weapon instanceof TimeBomb) {
                        str = "Reward_TimeBomb";
                    } else {
                        str = weapon instanceof TechnologyGun ? "Reward_SciFiGun" : "";
                    }
                    SI si = new SI(weaponSortActivity, str, weapon);
                    SI.e(si, new C4691tk0(0, weaponSortActivity, weapon));
                    si.show();
                }
            } else if (!weaponSortActivity.isFinishing() && !weaponSortActivity.isDestroyed() && (dialogC2411Fe = weaponSortActivity.c) != null) {
                dialogC2411Fe.b = true;
                dialogC2411Fe.show();
            }
        } else {
            Intent intent = new Intent(weaponSortActivity, (Class<?>) WeaponUseActivity.class);
            intent.putExtra("weapon", weapon);
            weaponSortActivity.startActivityForResult(intent, 1111);
        }
        return C5033xf0.f5238a;
    }
}
