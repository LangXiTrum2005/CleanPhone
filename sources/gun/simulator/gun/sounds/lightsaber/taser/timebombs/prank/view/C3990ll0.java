package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.LightSaber;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.MechanicalGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Taser;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TechnologyGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TimeBomb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ll0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3990ll0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeaponUseActivity f4663a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3990ll0(WeaponUseActivity weaponUseActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4663a = weaponUseActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3990ll0(this.f4663a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3990ll0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        Weapon weaponN = this.f4663a.n();
        Object obj2 = null;
        if (weaponN instanceof MechanicalGun) {
            int i = App.t + 1;
            App.t = i;
            if (i != 2) {
                return null;
            }
            for (Object obj3 : AbstractC3862kJ.a()) {
                Weapon weapon = (Weapon) obj3;
                if (weapon != null && (weapon instanceof MechanicalGun)) {
                    obj2 = obj3;
                    break;
                }
            }
            return (Weapon) obj2;
        }
        if (weaponN instanceof LightSaber) {
            int i2 = App.u + 1;
            App.u = i2;
            if (i2 != 2) {
                return null;
            }
            for (Object obj4 : AbstractC3862kJ.a()) {
                Weapon weapon2 = (Weapon) obj4;
                if (weapon2 != null && (weapon2 instanceof LightSaber)) {
                    obj2 = obj4;
                    break;
                }
            }
            return (Weapon) obj2;
        }
        if (weaponN instanceof Taser) {
            int i3 = App.v + 1;
            App.v = i3;
            if (i3 != 2) {
                return null;
            }
            for (Object obj5 : AbstractC3862kJ.a()) {
                Weapon weapon3 = (Weapon) obj5;
                if (weapon3 != null && (weapon3 instanceof Taser)) {
                    obj2 = obj5;
                    break;
                }
            }
            return (Weapon) obj2;
        }
        if (weaponN instanceof TimeBomb) {
            int i4 = App.w + 1;
            App.w = i4;
            if (i4 != 2) {
                return null;
            }
            for (Object obj6 : AbstractC3862kJ.a()) {
                Weapon weapon4 = (Weapon) obj6;
                if (weapon4 != null && (weapon4 instanceof TimeBomb)) {
                    obj2 = obj6;
                    break;
                }
            }
            return (Weapon) obj2;
        }
        if (!(weaponN instanceof TechnologyGun)) {
            return null;
        }
        int i5 = App.x + 1;
        App.x = i5;
        if (i5 != 2) {
            return null;
        }
        for (Object obj7 : AbstractC3862kJ.a()) {
            Weapon weapon5 = (Weapon) obj7;
            if (weapon5 != null && (weapon5 instanceof TechnologyGun)) {
                obj2 = obj7;
                break;
            }
        }
        return (Weapon) obj2;
    }
}
