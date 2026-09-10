package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.SparseArray;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityGunBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4076mk0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4711a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AbstractC4340pk0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4076mk0(AbstractC4340pk0 abstractC4340pk0, int i, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = abstractC4340pk0;
        this.d = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C4076mk0 c4076mk0 = new C4076mk0(this.c, this.d, interfaceC2857Wj);
        c4076mk0.b = obj;
        return c4076mk0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4076mk0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        final int i = 1;
        final int i2 = 0;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i3 = this.f4711a;
        final AbstractC4340pk0 abstractC4340pk0 = this.c;
        if (i3 == 0) {
            AbstractC3375el.b0(obj);
            C3109bk0 c3109bk0M = abstractC4340pk0.f4847a.m();
            int i4 = this.d;
            if (c3109bk0M != null && (lifecycleOwner = c3109bk0M.g) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                WD.D(lifecycleScope, null, 0, new C3020ak0(c3109bk0M, i4, null), 3);
            }
            Weapon weapon = abstractC4340pk0.b;
            if (i4 < weapon.getMagazineCapacity() && i4 < 1) {
                if (abstractC4340pk0.k < 1) {
                    if (AbstractC2340Cl.K(new Integer(R.string.weapon_name_f1_grenade), new Integer(R.string.weapon_name_f1_gold), new Integer(R.string.weapon_name_m84), new Integer(R.string.weapon_name_he_grenade)).contains(new Integer(weapon.getNameId()))) {
                        abstractC4340pk0.b().postDelayed(new Runnable() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kk0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5 = i2;
                                AbstractC4340pk0 abstractC4340pk1 = abstractC4340pk0;
                                switch (i5) {
                                    case 0:
                                        abstractC4340pk1.f4847a.p();
                                        break;
                                    default:
                                        abstractC4340pk1.f4847a.p();
                                        break;
                                }
                            }
                        }, 2300L);
                    } else {
                        abstractC4340pk0.b().postDelayed(new Runnable() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kk0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5 = i;
                                AbstractC4340pk0 abstractC4340pk1 = abstractC4340pk0;
                                switch (i5) {
                                    case 0:
                                        abstractC4340pk1.f4847a.p();
                                        break;
                                    default:
                                        abstractC4340pk1.f4847a.p();
                                        break;
                                }
                            }
                        }, weapon.getConsecutiveInterval());
                    }
                } else if (weapon.getMagazineCapacity() == 1) {
                    C3988lk0 c3988lk0 = new C3988lk0(abstractC4340pk0, null);
                    this.f4711a = 1;
                    if (WD.X(c3988lk0, AbstractC4437qp.b, this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                }
            }
            return C5033xf0.f5238a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC3375el.b0(obj);
        WeaponUseActivity weaponUseActivity = abstractC4340pk0.f4847a;
        Group group = ((ActivityGunBinding) weaponUseActivity.getMBinding()).groupReloadBullets;
        AbstractC2995aW.p(group, "groupReloadBullets");
        SparseArray sparseArray = Oh0.f3515a;
        if (group.getVisibility() != 0) {
            ((ActivityGunBinding) weaponUseActivity.getMBinding()).lavReloadBulletsCircle.e.b.removeListener(weaponUseActivity.m);
            ((ActivityGunBinding) weaponUseActivity.getMBinding()).lavReloadBulletsCircle.b();
            Weapon weaponN = weaponUseActivity.n();
            if (weaponN != null) {
                ((ActivityGunBinding) weaponUseActivity.getMBinding()).ivReloadBullets.setImageResource(weaponN.getIconReloadCartridge());
            }
            Group group2 = ((ActivityGunBinding) weaponUseActivity.getMBinding()).groupReloadBullets;
            AbstractC2995aW.p(group2, "groupReloadBullets");
            if (group2.getVisibility() != 0) {
                group2.setVisibility(0);
            }
            ((ActivityGunBinding) weaponUseActivity.getMBinding()).lavReloadBulletsHand.e();
        }
        return C5033xf0.f5238a;
    }
}
