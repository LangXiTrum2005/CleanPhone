package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.scenes.scene2d.Stage;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Taser;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ck0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3197ck0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Stage f4241a = null;
    public static boolean b = false;
    public static String c = "Standard";
    public static final ArrayList d;
    public static final ArrayList e;
    public static final ArrayList f;
    public static final ArrayList g;
    public static final ArrayList h;
    public static final ArrayList i;
    public static final ArrayList j;
    public static final ArrayList k;
    public static final ArrayList l;

    static {
        Weapon.CREATOR creator = Weapon.CREATOR;
        d = AbstractC2340Cl.h(creator.getWeaponByNameResId(R.string.weapon_name_negev), creator.getWeaponByNameResId(R.string.weapon_name_p90), creator.getWeaponByNameResId(R.string.weapon_name_awp), creator.getWeaponByNameResId(R.string.weapon_name_ump45), creator.getWeaponByNameResId(R.string.weapon_name_de_gold), creator.getWeaponByNameResId(R.string.weapon_name_f1_grenade), creator.getWeaponByNameResId(R.string.weapon_name_gatling), creator.getWeaponByNameResId(R.string.weapon_name_m4a4), creator.getWeaponByNameResId(R.string.weapon_name_ak47_y), creator.getWeaponByNameResId(R.string.weapon_name_he_grenade), creator.getWeaponByNameResId(R.string.weapon_name_colt_python), creator.getWeaponByNameResId(R.string.weapon_name_awm), creator.getWeaponByNameResId(R.string.weapon_name_hk416), creator.getWeaponByNameResId(R.string.weapon_name_f1_gold), creator.getWeaponByNameResId(R.string.weapon_name_ak47_r), creator.getWeaponByNameResId(R.string.weapon_name_m4a4_p), creator.getWeaponByNameResId(R.string.weapon_name_desert_eagle), creator.getWeaponByNameResId(R.string.weapon_name_ak47), creator.getWeaponByNameResId(R.string.weapon_name_usp), creator.getWeaponByNameResId(R.string.weapon_name_mp5), creator.getWeaponByNameResId(R.string.weapon_name_m762), creator.getWeaponByNameResId(R.string.weapon_name_kar98k), creator.getWeaponByNameResId(R.string.weapon_name_scar_20s), creator.getWeaponByNameResId(R.string.weapon_name_m1014), creator.getWeaponByNameResId(R.string.weapon_name_rpg_7), creator.getWeaponByNameResId(R.string.weapon_name_m2_flamethrower), creator.getWeaponByNameResId(R.string.weapon_name_mp7), creator.getWeaponByNameResId(R.string.weapon_name_m84), creator.getWeaponByNameResId(R.string.weapon_name_glock_17), creator.getWeaponByNameResId(R.string.weapon_name_aug), creator.getWeaponByNameResId(R.string.weapon_name_svd), creator.getWeaponByNameResId(R.string.weapon_name_f2000));
        e = AbstractC2340Cl.h(creator.getWeaponByNameResId(R.string.weapon_name_science_arc2), creator.getWeaponByNameResId(R.string.weapon_name_laser_gun), creator.getWeaponByNameResId(R.string.weapon_name_science_energy_cannon4), creator.getWeaponByNameResId(R.string.weapon_name_science_laser_gun2), creator.getWeaponByNameResId(R.string.weapon_name_science_arc3), creator.getWeaponByNameResId(R.string.weapon_name_science_laser_gun5), creator.getWeaponByNameResId(R.string.weapon_name_science_energy_cannon2), creator.getWeaponByNameResId(R.string.weapon_name_science_arc), creator.getWeaponByNameResId(R.string.weapon_name_science_energy_cannon), creator.getWeaponByNameResId(R.string.weapon_name_science_energy_cannon3));
        f = AbstractC2340Cl.h(creator.getWeaponByNameResId(R.string.lightsaber_one), creator.getWeaponByNameResId(R.string.lightsaber_two), creator.getWeaponByNameResId(R.string.lightsaber_three), creator.getWeaponByNameResId(R.string.lightsaber_four), creator.getWeaponByNameResId(R.string.lightsaber_five), creator.getWeaponByNameResId(R.string.lightsaber_six), creator.getWeaponByNameResId(R.string.lightsaber_seven), creator.getWeaponByNameResId(R.string.lightsaber_eight), creator.getWeaponByNameResId(R.string.lightsaber_nine), creator.getWeaponByNameResId(R.string.lightsaber_ten), creator.getWeaponByNameResId(R.string.lightsaber_eleven), creator.getWeaponByNameResId(R.string.lightsaber_twelve));
        g = AbstractC2340Cl.h(creator.getWeaponByNameResId(R.string.weapon_name_time_bomb_c4), creator.getWeaponByNameResId(R.string.weapon_name_time_bomb_stone_age), creator.getWeaponByNameResId(R.string.weapon_name_time_bomb_frostbite), creator.getWeaponByNameResId(R.string.weapon_name_time_bomb_n), creator.getWeaponByNameResId(R.string.weapon_name_time_bomb_gas), creator.getWeaponByNameResId(R.string.weapon_name_time_bomb_skibidi), creator.getWeaponByNameResId(R.string.weapon_name_time_bomb_tomahawk), creator.getWeaponByNameResId(R.string.weapon_name_time_bomb_nuclear), creator.getWeaponByNameResId(R.string.weapon_name_time_bomb_drone), creator.getWeaponByNameResId(R.string.weapon_name_time_bomb_s));
        Taser.CREATOR creator2 = Taser.CREATOR;
        h = AbstractC2340Cl.h(creator2.getWeaponByNameResId(R.string.taser_one), creator2.getWeaponByNameResId(R.string.taser_two), creator2.getWeaponByNameResId(R.string.taser_three), creator2.getWeaponByNameResId(R.string.taser_four), creator2.getWeaponByNameResId(R.string.taser_five), creator2.getWeaponByNameResId(R.string.taser_six), creator2.getWeaponByNameResId(R.string.taser_seven), creator2.getWeaponByNameResId(R.string.taser_eight));
        i = AbstractC2340Cl.h(Integer.valueOf(R.string.weapon_name_science_arc), Integer.valueOf(R.string.weapon_name_science_arc2), Integer.valueOf(R.string.weapon_name_laser_gun), Integer.valueOf(R.string.weapon_name_science_laser_gun2), Integer.valueOf(R.string.weapon_name_science_arc3));
        j = AbstractC2340Cl.h(Integer.valueOf(R.drawable.bg_scene_machine_gun), Integer.valueOf(R.drawable.bg_scene_war), Integer.valueOf(R.drawable.bg_scene_rain), Integer.valueOf(R.drawable.bg_scene_universe), Integer.valueOf(R.drawable.bg_scene_sebo), Integer.valueOf(R.drawable.bg_scene_city_war));
        k = AbstractC2340Cl.h(Integer.valueOf(R.raw.bg_home_machine), Integer.valueOf(R.raw.bg_home_lightsaber), Integer.valueOf(R.raw.bg_home_taser), Integer.valueOf(R.raw.bg_home_timebomb), Integer.valueOf(R.raw.bg_home_technology));
        l = AbstractC2340Cl.h(Integer.valueOf(R.drawable.bg_thumbnail_scene_machine_gun), Integer.valueOf(R.drawable.bg_thumbnail_scene_light_saber), Integer.valueOf(R.drawable.bg_thumbnail_scene_taser), Integer.valueOf(R.drawable.bg_thumbnail_scene_time_bomb), Integer.valueOf(R.drawable.bg_thumbnail_scene_sci_fi_gun));
    }

    public static String a() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator it = d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Weapon weapon = (Weapon) it.next();
            Integer numValueOf = weapon != null ? Integer.valueOf(weapon.getNameId()) : null;
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            sb.append(((Number) it2.next()).intValue());
            sb.append("//");
        }
        sb.append("//||");
        ArrayList arrayList2 = new ArrayList();
        for (Weapon weapon2 : f) {
            Integer numValueOf2 = weapon2 != null ? Integer.valueOf(weapon2.getNameId()) : null;
            if (numValueOf2 != null) {
                arrayList2.add(numValueOf2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            sb.append(((Number) it3.next()).intValue());
            sb.append("//");
        }
        sb.append("//||");
        ArrayList arrayList3 = new ArrayList();
        for (Weapon weapon3 : h) {
            Integer numValueOf3 = weapon3 != null ? Integer.valueOf(weapon3.getNameId()) : null;
            if (numValueOf3 != null) {
                arrayList3.add(numValueOf3);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            sb.append(((Number) it4.next()).intValue());
            sb.append("//");
        }
        sb.append("//||");
        ArrayList arrayList4 = new ArrayList();
        for (Weapon weapon4 : g) {
            Integer numValueOf4 = weapon4 != null ? Integer.valueOf(weapon4.getNameId()) : null;
            if (numValueOf4 != null) {
                arrayList4.add(numValueOf4);
            }
        }
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            sb.append(((Number) it5.next()).intValue());
            sb.append("//");
        }
        sb.append("//||");
        ArrayList arrayList5 = new ArrayList();
        for (Weapon weapon5 : e) {
            Integer numValueOf5 = weapon5 != null ? Integer.valueOf(weapon5.getNameId()) : null;
            if (numValueOf5 != null) {
                arrayList5.add(numValueOf5);
            }
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            sb.append(((Number) it6.next()).intValue());
            sb.append("//");
        }
        sb.append("//");
        String string = sb.toString();
        AbstractC2995aW.p(string, "toString(...)");
        return string;
    }
}
