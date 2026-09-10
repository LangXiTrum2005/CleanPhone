package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3862kJ {
    public static ArrayList a() {
        ArrayList arrayListH = AbstractC2340Cl.h(new C4839vT(Integer.valueOf(R.string.weapon_name_gatling), ((C2856Wi) AbstractC2908Yi.f4035a.getValue()).a()), new C4839vT(Integer.valueOf(R.string.weapon_name_awm), ((C2856Wi) AbstractC2908Yi.d.getValue()).a()), new C4839vT(Integer.valueOf(R.string.weapon_name_f1_gold), ((C2856Wi) AbstractC2908Yi.e.getValue()).a()), new C4839vT(Integer.valueOf(R.string.weapon_name_ak47_r), ((C2856Wi) AbstractC2908Yi.b.getValue()).a()), new C4839vT(Integer.valueOf(R.string.weapon_name_m4a4_p), ((C2856Wi) AbstractC2908Yi.c.getValue()).a()), new C4839vT(Integer.valueOf(R.string.weapon_name_svd), ((C2856Wi) AbstractC2908Yi.g.getValue()).a()), new C4839vT(Integer.valueOf(R.string.weapon_name_m1014), ((C2856Wi) AbstractC2908Yi.f.getValue()).a()), new C4839vT(Integer.valueOf(R.string.weapon_name_f2000), ((C2856Wi) AbstractC2908Yi.h.getValue()).a()), new C4839vT(Integer.valueOf(R.string.lightsaber_ten), ((C2856Wi) AbstractC2908Yi.q.getValue()).a()), new C4839vT(Integer.valueOf(R.string.lightsaber_eleven), ((C2856Wi) AbstractC2908Yi.r.getValue()).a()), new C4839vT(Integer.valueOf(R.string.lightsaber_twelve), ((C2856Wi) AbstractC2908Yi.s.getValue()).a()), new C4839vT(Integer.valueOf(R.string.taser_seven), ((C2856Wi) AbstractC2908Yi.m.getValue()).a()), new C4839vT(Integer.valueOf(R.string.taser_eight), ((C2856Wi) AbstractC2908Yi.n.getValue()).a()), new C4839vT(Integer.valueOf(R.string.weapon_name_time_bomb_drone), ((C2856Wi) AbstractC2908Yi.o.getValue()).a()), new C4839vT(Integer.valueOf(R.string.weapon_name_time_bomb_s), ((C2856Wi) AbstractC2908Yi.p.getValue()).a()), new C4839vT(Integer.valueOf(R.string.weapon_name_science_laser_gun2), ((C2856Wi) AbstractC2908Yi.i.getValue()).a()), new C4839vT(Integer.valueOf(R.string.weapon_name_science_energy_cannon2), ((C2856Wi) AbstractC2908Yi.j.getValue()).a()), new C4839vT(Integer.valueOf(R.string.weapon_name_science_energy_cannon3), ((C2856Wi) AbstractC2908Yi.l.getValue()).a()), new C4839vT(Integer.valueOf(R.string.weapon_name_science_arc), ((C2856Wi) AbstractC2908Yi.k.getValue()).a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListH) {
            if (((Boolean) ((C4839vT) obj).b).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2749Sf.Y(10, arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Weapon.CREATOR.getWeaponByNameResId(((Number) ((C4839vT) it.next()).f5132a).intValue()));
        }
        return arrayList2;
    }

    public static void b(Weapon weapon) throws Throwable {
        int nameId = weapon.getNameId();
        if (nameId == R.string.taser_seven) {
            ((C2856Wi) AbstractC2908Yi.m.getValue()).b(Boolean.FALSE);
            return;
        }
        if (nameId == R.string.taser_eight) {
            ((C2856Wi) AbstractC2908Yi.n.getValue()).b(Boolean.FALSE);
            return;
        }
        if (nameId == R.string.weapon_name_ak47_r) {
            ((C2856Wi) AbstractC2908Yi.b.getValue()).b(Boolean.FALSE);
            return;
        }
        if (nameId == R.string.weapon_name_m4a4_p) {
            ((C2856Wi) AbstractC2908Yi.c.getValue()).b(Boolean.FALSE);
            return;
        }
        if (nameId == R.string.weapon_name_f1_gold) {
            ((C2856Wi) AbstractC2908Yi.e.getValue()).b(Boolean.FALSE);
            return;
        }
        if (nameId == R.string.weapon_name_awm) {
            ((C2856Wi) AbstractC2908Yi.d.getValue()).b(Boolean.FALSE);
            return;
        }
        if (nameId == R.string.weapon_name_gatling) {
            ((C2856Wi) AbstractC2908Yi.f4035a.getValue()).b(Boolean.FALSE);
            return;
        }
        if (nameId == R.string.weapon_name_m1014) {
            ((C2856Wi) AbstractC2908Yi.f.getValue()).b(Boolean.FALSE);
            return;
        }
        if (nameId == R.string.weapon_name_f2000) {
            ((C2856Wi) AbstractC2908Yi.h.getValue()).b(Boolean.FALSE);
            return;
        }
        if (nameId == R.string.weapon_name_svd) {
            ((C2856Wi) AbstractC2908Yi.g.getValue()).b(Boolean.FALSE);
            return;
        }
        if (nameId == R.string.weapon_name_science_laser_gun2) {
            ((C2856Wi) AbstractC2908Yi.i.getValue()).b(Boolean.FALSE);
            return;
        }
        if (nameId == R.string.weapon_name_science_energy_cannon2) {
            ((C2856Wi) AbstractC2908Yi.j.getValue()).b(Boolean.FALSE);
            return;
        }
        if (nameId == R.string.weapon_name_science_energy_cannon3) {
            ((C2856Wi) AbstractC2908Yi.l.getValue()).b(Boolean.FALSE);
            return;
        }
        if (nameId == R.string.weapon_name_science_arc) {
            ((C2856Wi) AbstractC2908Yi.k.getValue()).b(Boolean.FALSE);
            return;
        }
        if (nameId == R.string.weapon_name_time_bomb_drone) {
            ((C2856Wi) AbstractC2908Yi.o.getValue()).b(Boolean.FALSE);
            return;
        }
        if (nameId == R.string.weapon_name_time_bomb_s) {
            ((C2856Wi) AbstractC2908Yi.p.getValue()).b(Boolean.FALSE);
            return;
        }
        if (nameId == R.string.lightsaber_ten) {
            ((C2856Wi) AbstractC2908Yi.q.getValue()).b(Boolean.FALSE);
        } else if (nameId == R.string.lightsaber_eleven) {
            ((C2856Wi) AbstractC2908Yi.r.getValue()).b(Boolean.FALSE);
        } else if (nameId == R.string.lightsaber_twelve) {
            ((C2856Wi) AbstractC2908Yi.s.getValue()).b(Boolean.FALSE);
        }
    }
}
