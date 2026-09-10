package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3774jJ extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Weapon f4548a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3774jJ(Weapon weapon, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4548a = weapon;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3774jJ(this.f4548a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3774jJ) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        AbstractC3375el.b0(obj);
        int nameId = this.f4548a.getNameId();
        if (nameId == R.string.weapon_name_ak47_r) {
            zBooleanValue = ((Boolean) ((C2856Wi) AbstractC2908Yi.b.getValue()).a()).booleanValue();
        } else if (nameId == R.string.weapon_name_m4a4_p) {
            zBooleanValue = ((Boolean) ((C2856Wi) AbstractC2908Yi.c.getValue()).a()).booleanValue();
        } else if (nameId == R.string.weapon_name_f1_gold) {
            zBooleanValue = ((Boolean) ((C2856Wi) AbstractC2908Yi.e.getValue()).a()).booleanValue();
        } else if (nameId == R.string.weapon_name_awm) {
            zBooleanValue = ((Boolean) ((C2856Wi) AbstractC2908Yi.d.getValue()).a()).booleanValue();
        } else if (nameId == R.string.weapon_name_gatling) {
            zBooleanValue = ((Boolean) ((C2856Wi) AbstractC2908Yi.f4035a.getValue()).a()).booleanValue();
        } else if (nameId == R.string.weapon_name_svd) {
            zBooleanValue = ((Boolean) ((C2856Wi) AbstractC2908Yi.g.getValue()).a()).booleanValue();
        } else if (nameId == R.string.weapon_name_m1014) {
            zBooleanValue = ((Boolean) ((C2856Wi) AbstractC2908Yi.f.getValue()).a()).booleanValue();
        } else if (nameId == R.string.weapon_name_f2000) {
            zBooleanValue = ((Boolean) ((C2856Wi) AbstractC2908Yi.h.getValue()).a()).booleanValue();
        } else if (nameId == R.string.weapon_name_science_laser_gun2) {
            zBooleanValue = ((Boolean) ((C2856Wi) AbstractC2908Yi.i.getValue()).a()).booleanValue();
        } else if (nameId == R.string.weapon_name_science_energy_cannon2) {
            zBooleanValue = ((Boolean) ((C2856Wi) AbstractC2908Yi.j.getValue()).a()).booleanValue();
        } else if (nameId == R.string.weapon_name_science_arc) {
            zBooleanValue = ((Boolean) ((C2856Wi) AbstractC2908Yi.k.getValue()).a()).booleanValue();
        } else if (nameId == R.string.weapon_name_science_energy_cannon3) {
            zBooleanValue = ((Boolean) ((C2856Wi) AbstractC2908Yi.l.getValue()).a()).booleanValue();
        } else if (nameId == R.string.taser_seven) {
            zBooleanValue = ((Boolean) ((C2856Wi) AbstractC2908Yi.m.getValue()).a()).booleanValue();
        } else if (nameId == R.string.taser_eight) {
            zBooleanValue = ((Boolean) ((C2856Wi) AbstractC2908Yi.n.getValue()).a()).booleanValue();
        } else if (nameId == R.string.weapon_name_time_bomb_drone) {
            zBooleanValue = ((Boolean) ((C2856Wi) AbstractC2908Yi.o.getValue()).a()).booleanValue();
        } else if (nameId == R.string.weapon_name_time_bomb_s) {
            zBooleanValue = ((Boolean) ((C2856Wi) AbstractC2908Yi.p.getValue()).a()).booleanValue();
        } else if (nameId == R.string.lightsaber_ten) {
            zBooleanValue = ((Boolean) ((C2856Wi) AbstractC2908Yi.q.getValue()).a()).booleanValue();
        } else if (nameId == R.string.lightsaber_eleven) {
            zBooleanValue = ((Boolean) ((C2856Wi) AbstractC2908Yi.r.getValue()).a()).booleanValue();
        } else {
            zBooleanValue = nameId == R.string.lightsaber_twelve ? ((Boolean) ((C2856Wi) AbstractC2908Yi.s.getValue()).a()).booleanValue() : false;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
