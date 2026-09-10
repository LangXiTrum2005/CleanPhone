package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.StringRes;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.badlogic.gdx.Input;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractApplicationC2673Ph;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3194cj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2498In;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2856Wi;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;

/* JADX INFO: loaded from: classes4.dex */
public class Weapon implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);
    private static final long DefaultConsecutiveInterval = 150;
    private final String analyticsName;
    private final String aniParentPathReloadCartridge;

    @IntRange(from = 1)
    private final int cartridgeClip;
    private final long consecutiveInterval;
    private final int iconCartridge;
    private final int iconReloadCartridge;
    private final int iconReloadCartridgeClip;

    @IntRange(from = 1)
    private final int magazineCapacity;
    private final InterfaceC3069bH name$delegate;

    @StringRes
    private final int nameId;
    private final InterfaceC3069bH nameRes$delegate;

    @DrawableRes
    private final int showPicId;

    @DrawableRes
    private final int thumbnailId;

    public static final class CREATOR implements Parcelable.Creator<Weapon> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        public final long getDefaultConsecutiveInterval() {
            return Weapon.DefaultConsecutiveInterval;
        }

        public final Weapon getWeaponByNameResId(int i) {
            TimeBomb timeBomb;
            if (i == R.string.weapon_name_ak47) {
                return new MechanicalGun(R.string.weapon_name_ak47, R.drawable.pic_weapon_show_ak47, R.drawable.gun_machine_ak47, 30, 2, 110L, "AK_47");
            }
            if (i == R.string.weapon_name_ump45) {
                return new MechanicalGun(R.string.weapon_name_ump45, R.drawable.pic_weapon_show_ump45, R.drawable.gun_machine_ump45, 25, 2, 98L, "UMP_45");
            }
            if (i == R.string.weapon_name_awp) {
                return new MechanicalGun(R.string.weapon_name_awp, R.drawable.pic_weapon_show_awp, R.drawable.gun_machine_awp, 1, 5, 500L, "AWP");
            }
            if (i == R.string.weapon_name_desert_eagle) {
                return new MechanicalGun(R.string.weapon_name_desert_eagle, R.drawable.pic_weapon_show_desert_eagle, R.drawable.gun_machine_desert_eagle, 7, 2, 350L, "Desert_Eagle");
            }
            if (i == R.string.weapon_name_usp) {
                return new MechanicalGun(R.string.weapon_name_usp, R.drawable.pic_weapon_show_usp, R.drawable.gun_machine_usp, 12, 2, 280L, "USP");
            }
            if (i == R.string.weapon_name_f1_grenade) {
                return new MechanicalGun(R.string.weapon_name_f1_grenade, R.drawable.pic_weapon_show_f1_grenade, R.drawable.gun_machine_f1_grenada, 3, 0, 3000L, "F1 Grenada");
            }
            if (i == R.string.weapon_name_f1_gold) {
                return new MechanicalGun(R.string.weapon_name_f1_gold, R.drawable.pic_weapon_show_f1_gold, R.drawable.gun_machine_f1_gold, 3, 0, 3000L, "F1 GOLD");
            }
            if (i == R.string.weapon_name_m84) {
                return new MechanicalGun(R.string.weapon_name_m84, R.drawable.pic_weapon_show_m84, R.drawable.gun_machine_m84, 3, 0, 3000L, "M84");
            }
            if (i == R.string.weapon_name_he_grenade) {
                return new MechanicalGun(R.string.weapon_name_he_grenade, R.drawable.pic_weapon_show_he_grenade, R.drawable.gun_machine_he_grenade, 6, 0, 3000L, "HE_Grenade");
            }
            if (i == R.string.weapon_name_m4a4) {
                return new MechanicalGun(R.string.weapon_name_m4a4, R.drawable.pic_weapon_show_m4a4, R.drawable.gun_machine_m4a4, 30, 2, 95L, "M4A4");
            }
            if (i == R.string.weapon_name_p90) {
                return new MechanicalGun(R.string.weapon_name_p90, R.drawable.pic_weapon_show_p90, R.drawable.gun_machine_p90, 50, 2, 85L, "P90");
            }
            if (i == R.string.weapon_name_negev) {
                return new MechanicalGun(R.string.weapon_name_negev, R.drawable.pic_weapon_show_negev, R.drawable.gun_machine_negev, Input.Keys.NUMPAD_6, 1, 80L, "Negev");
            }
            if (i == R.string.weapon_name_m762) {
                return new MechanicalGun(R.string.weapon_name_m762, R.drawable.pic_weapon_show_m762, R.drawable.gun_machine_m762, 30, 2, 95L, "M762");
            }
            if (i == R.string.weapon_name_hk416) {
                return new MechanicalGun(R.string.weapon_name_hk416, R.drawable.pic_weapon_show_hk416, R.drawable.gun_machine_hk416, 30, 2, 95L, "HK416");
            }
            if (i == R.string.weapon_name_colt_python) {
                return new MechanicalGun(R.string.weapon_name_colt_python, R.drawable.pic_weapon_show_colt_python, R.drawable.gun_machine_colt_python, 6, 2, 380L, "Colt_Python");
            }
            if (i == R.string.weapon_name_ak47_r) {
                return new MechanicalGun(R.string.weapon_name_ak47_r, R.drawable.pic_weapon_show_ak47_r, R.drawable.gun_machine_ak47_r, 30, 2, 110L, "AK47_R");
            }
            if (i == R.string.weapon_name_m4a4_p) {
                return new MechanicalGun(R.string.weapon_name_m4a4_p, R.drawable.pic_weapon_show_m4a4_p, R.drawable.gun_machine_m4a4_p, 30, 2, 95L, "M4A4_P");
            }
            if (i == R.string.weapon_name_de_gold) {
                return new MechanicalGun(R.string.weapon_name_de_gold, R.drawable.pic_weapon_show_de_gold, R.drawable.gun_machine_de_gold, 7, 2, 350L, "D_E_GOLD");
            }
            if (i == R.string.weapon_name_awm) {
                return new MechanicalGun(R.string.weapon_name_awm, R.drawable.pic_weapon_show_awm, R.drawable.gun_machine_awm, 1, 5, 500L, "AWM");
            }
            if (i == R.string.weapon_name_gatling) {
                return new MechanicalGun(R.string.weapon_name_gatling, R.drawable.pic_weapon_show_gatling, R.drawable.gun_machine_gatling, 500, 1, 65L, "Gatling");
            }
            if (i == R.string.weapon_name_ak47_y) {
                return new MechanicalGun(R.string.weapon_name_ak47_y, R.drawable.pic_weapon_show_ak47_y, R.drawable.gun_machine_ak47_y, 30, 2, 110L, "AK_47_Y");
            }
            if (i == R.string.weapon_name_mp5) {
                return new MechanicalGun(R.string.weapon_name_mp5, R.drawable.pic_weapon_show_mp5_1, R.drawable.gun_machine_mp5, 30, 2, 90L, "MP5");
            }
            if (i == R.string.weapon_name_kar98k) {
                return new MechanicalGun(R.string.weapon_name_kar98k, R.drawable.pic_weapon_show_kar98k, R.drawable.gun_machine_kar98k, 1, 5, 500L, "Kar98k");
            }
            if (i == R.string.weapon_name_scar_20s) {
                return new MechanicalGun(R.string.weapon_name_scar_20s, R.drawable.pic_weapon_show_scar_20s, R.drawable.gun_machine_scar_20s, 20, 2, 105L, "SCAR_20S");
            }
            if (i == R.string.weapon_name_m1014) {
                return new MechanicalGun(R.string.weapon_name_m1014, R.drawable.pic_weapon_show_m1014_1, R.drawable.gun_machine_m1014, 7, 2, 300L, "M1014");
            }
            if (i == R.string.weapon_name_aug) {
                return new MechanicalGun(R.string.weapon_name_aug, R.drawable.pic_weapon_show_aug, R.drawable.gun_machine_aug, 30, 3, 92L, "AUG");
            }
            if (i == R.string.weapon_name_f2000) {
                return new MechanicalGun(R.string.weapon_name_f2000, R.drawable.pic_weapon_show_f2000, R.drawable.gun_machine_f2000, 30, 3, 88L, "F2000");
            }
            if (i == R.string.weapon_name_glock_17) {
                return new MechanicalGun(R.string.weapon_name_glock_17, R.drawable.pic_weapon_show_glock_17, R.drawable.gun_machine_glock_17, 17, 3, 250L, "Glock_17");
            }
            if (i == R.string.weapon_name_m2_flamethrower) {
                return new MechanicalGun(R.string.weapon_name_m2_flamethrower, R.drawable.pic_weapon_show_m2_flamethrower, R.drawable.gun_machine_m2_flamethrower, 300, 0, 80L, "M2_Flamethrower");
            }
            if (i == R.string.weapon_name_mp7) {
                return new MechanicalGun(R.string.weapon_name_mp7, R.drawable.pic_weapon_show_mp7, R.drawable.gun_machine_mp7, 30, 3, 80L, "MP7");
            }
            if (i == R.string.weapon_name_rpg_7) {
                return new MechanicalGun(R.string.weapon_name_rpg_7, R.drawable.pic_weapon_show_rpg_7, R.drawable.gun_machine_rpg_7, 1, 4, 1100L, "RPG-7");
            }
            if (i == R.string.weapon_name_svd) {
                return new MechanicalGun(R.string.weapon_name_svd, R.drawable.pic_weapon_show_svd, R.drawable.gun_machine_svd, 10, 3, 150L, "SVD");
            }
            if (i == R.string.lightsaber_one) {
                return new LightSaber(R.string.lightsaber_one, R.drawable.pic_weapon_lightsaber_one, R.drawable.gun_lightsaber_one, 100, 0, 150L, "LightSaber_A", 1);
            }
            if (i == R.string.lightsaber_two) {
                return new LightSaber(R.string.lightsaber_two, R.drawable.pic_weapon_lightsaber_two, R.drawable.gun_lightsaber_two, 100, 0, 150L, "LightSaber_B", 3);
            }
            if (i == R.string.lightsaber_three) {
                return new LightSaber(R.string.lightsaber_three, R.drawable.pic_weapon_lightsaber_three, R.drawable.gun_lightsaber_three, 100, 0, 150L, "LightSaber_C", 1);
            }
            if (i == R.string.lightsaber_four) {
                return new LightSaber(R.string.lightsaber_four, R.drawable.pic_weapon_lightsaber_four, R.drawable.gun_lightsaber_four, 100, 0, 150L, "LightSaber_D", 2);
            }
            if (i == R.string.lightsaber_five) {
                return new LightSaber(R.string.lightsaber_five, R.drawable.pic_weapon_lightsaber_five, R.drawable.gun_lightsaber_five, 100, 0, 150L, "LightSaber_E", 1);
            }
            if (i == R.string.lightsaber_six) {
                return new LightSaber(R.string.lightsaber_six, R.drawable.pic_weapon_lightsaber_six, R.drawable.gun_lightsaber_six, 100, 0, 150L, "LightSaber_F", 1);
            }
            if (i == R.string.lightsaber_seven) {
                return new LightSaber(R.string.lightsaber_seven, R.drawable.pic_weapon_lightsaber_seven, R.drawable.gun_lightsaber_seven, 100, 0, 150L, "LightSaber_G", 3);
            }
            if (i == R.string.lightsaber_eight) {
                return new LightSaber(R.string.lightsaber_eight, R.drawable.pic_weapon_lightsaber_eight, R.drawable.gun_lightsaber_eight, 100, 0, 150L, "LightSaber_H", 1);
            }
            if (i == R.string.lightsaber_nine) {
                return new LightSaber(R.string.lightsaber_nine, R.drawable.pic_weapon_lightsaber_nine, R.drawable.gun_lightsaber_nine, 100, 0, 150L, "LightSaber_I", 2);
            }
            if (i == R.string.lightsaber_ten) {
                return new LightSaber(R.string.lightsaber_ten, R.drawable.pic_weapon_lightsaber_ten, R.drawable.gun_lightsaber_ten, 100, 0, 150L, "LightSaber_J", 1);
            }
            if (i == R.string.lightsaber_eleven) {
                return new LightSaber(R.string.lightsaber_eleven, R.drawable.pic_weapon_lightsaber_eleven, R.drawable.gun_lightsaber_eleven, 100, 0, 150L, "LightSaber_K", 2);
            }
            if (i == R.string.lightsaber_twelve) {
                return new LightSaber(R.string.lightsaber_twelve, R.drawable.pic_weapon_lightsaber_twelve, R.drawable.gun_lightsaber_twelve, 100, 0, 150L, "LightSaber_L", 1);
            }
            if (i == R.string.taser_one) {
                return new Taser(R.string.taser_one, R.drawable.pic_weapon_taser_one, R.drawable.gun_taser_one, 120, 0, 100L, "Taser_A");
            }
            if (i == R.string.taser_two) {
                return new Taser(R.string.taser_two, R.drawable.pic_weapon_taser_two, R.drawable.gun_taser_two, 120, 0, 100L, "Taser_B");
            }
            if (i == R.string.taser_three) {
                return new Taser(R.string.taser_three, R.drawable.pic_weapon_taser_three, R.drawable.gun_taser_three, 120, 0, 100L, "Taser_C");
            }
            if (i == R.string.taser_four) {
                return new Taser(R.string.taser_four, R.drawable.pic_weapon_taser_four, R.drawable.gun_taser_four, 120, 0, 100L, "Taser_D");
            }
            if (i == R.string.taser_five) {
                return new Taser(R.string.taser_five, R.drawable.pic_weapon_taser_five, R.drawable.gun_taser_five, 120, 0, 100L, "Taser_E");
            }
            if (i == R.string.taser_six) {
                return new Taser(R.string.taser_six, R.drawable.pic_weapon_taser_six, R.drawable.gun_taser_six, 120, 0, 100L, "Taser_F");
            }
            if (i == R.string.taser_seven) {
                return new Taser(R.string.taser_seven, R.drawable.pic_weapon_taser_seven, R.drawable.gun_taser_seven, 120, 0, 100L, "Taser_G");
            }
            if (i == R.string.taser_eight) {
                return new Taser(R.string.taser_eight, R.drawable.pic_weapon_taser_eight, R.drawable.gun_taser_eight, 120, 0, 100L, "Taser_H");
            }
            if (i == R.string.weapon_name_time_bomb_c4) {
                timeBomb = new TimeBomb(i, R.drawable.pic_weapon_show_time_bomb_c4, R.drawable.gun_science_time_bomb_c4, 3, 0, "C4");
            } else if (i == R.string.weapon_name_time_bomb_stone_age) {
                timeBomb = new TimeBomb(i, R.drawable.pic_weapon_show_time_bomb_stone_age, R.drawable.gun_science_time_bomb_stone_age, 3, 0, "Stone_Age");
            } else if (i == R.string.weapon_name_time_bomb_frostbite) {
                timeBomb = new TimeBomb(i, R.drawable.pic_weapon_show_time_bomb_frostbite, R.drawable.gun_science_time_bomb_frostbite, 3, 0, "Frostbite");
            } else if (i == R.string.weapon_name_time_bomb_n) {
                timeBomb = new TimeBomb(i, R.drawable.pic_weapon_show_time_bomb_n, R.drawable.gun_science_time_bomb_n, 3, 0, "High_Explosive_N");
            } else if (i == R.string.weapon_name_time_bomb_gas) {
                timeBomb = new TimeBomb(i, R.drawable.pic_weapon_show_time_bomb_gas, R.drawable.gun_science_time_bomb_gas, 3, 0, "Gas");
            } else if (i == R.string.weapon_name_time_bomb_skibidi) {
                timeBomb = new TimeBomb(i, R.drawable.pic_weapon_show_time_bomb_skibidi, R.drawable.gun_science_time_bomb_skibidi, 3, 0, "Skibidi");
            } else if (i == R.string.weapon_name_time_bomb_tomahawk) {
                timeBomb = new TimeBomb(i, R.drawable.pic_weapon_show_time_bomb_tomahawk, R.drawable.gun_science_time_bomb_tomahawk, 3, 0, "Tomahawk");
            } else if (i == R.string.weapon_name_time_bomb_nuclear) {
                timeBomb = new TimeBomb(i, R.drawable.pic_weapon_show_time_bomb_nuclear, R.drawable.gun_science_time_bomb_nuclear, 3, 0, "Nuclear");
            } else if (i == R.string.weapon_name_time_bomb_drone) {
                timeBomb = new TimeBomb(i, R.drawable.pic_weapon_show_time_bomb_drone, R.drawable.gun_science_time_bomb_drone, 3, 0, "Drone");
            } else {
                if (i != R.string.weapon_name_time_bomb_s) {
                    if (i == R.string.weapon_name_science_arc) {
                        return new TechnologyGun(R.string.weapon_name_science_arc, R.drawable.pic_weapon_show_science_arc, R.drawable.gun_science_arc, 60, 1, 150L, "Arc_A");
                    }
                    if (i == R.string.weapon_name_science_arc2) {
                        return new TechnologyGun(R.string.weapon_name_science_arc2, R.drawable.pic_weapon_show_arc2, R.drawable.gun_science_arc2, 60, 1, 150L, "Arc_Gun");
                    }
                    if (i == R.string.weapon_name_science_arc3) {
                        return new TechnologyGun(R.string.weapon_name_science_arc3, R.drawable.pic_weapon_show_arc3, R.drawable.gun_science_arc3, 60, 1, 150L, "Arc_B");
                    }
                    if (i == R.string.weapon_name_science_energy_cannon) {
                        return new TechnologyGun(R.string.weapon_name_science_energy_cannon, R.drawable.pic_weapon_show_science_energy_cannon, R.drawable.gun_science_energy_cannon, 20, 1, 270L, "Energy_A");
                    }
                    if (i == R.string.weapon_name_science_energy_cannon2) {
                        return new TechnologyGun(R.string.weapon_name_science_energy_cannon2, R.drawable.pic_weapon_show_auto9, R.drawable.gun_science_auto9, 20, 1, 270L, "Auto_9");
                    }
                    if (i == R.string.weapon_name_laser_gun) {
                        return new TechnologyGun(R.string.weapon_name_laser_gun, R.drawable.pic_weapon_show_laser_gun, R.drawable.gun_science_laser, 60, 1, 150L, "Laser_A");
                    }
                    if (i == R.string.weapon_name_science_laser_gun2) {
                        return new TechnologyGun(R.string.weapon_name_science_laser_gun2, R.drawable.pic_weapon_show_laser2, R.drawable.gun_science_laser2, 60, 1, 150L, "M41A");
                    }
                    if (i == R.string.weapon_name_science_energy_cannon3) {
                        return new TechnologyGun(R.string.weapon_name_science_energy_cannon3, R.drawable.pic_weapon_show_ec3, R.drawable.gun_science_ec3, 20, 1, 270L, "Energy_C");
                    }
                    if (i == R.string.weapon_name_science_energy_cannon4) {
                        return new TechnologyGun(R.string.weapon_name_science_energy_cannon4, R.drawable.pic_weapon_show_ec2, R.drawable.gun_science_ec2, 20, 1, 270L, "Energy_B");
                    }
                    if (i == R.string.weapon_name_science_laser_gun5) {
                        return new TechnologyGun(R.string.weapon_name_science_laser_gun5, R.drawable.pic_weapon_show_laser3, R.drawable.gun_science_laser3, 60, 1, 150L, "Laser_C");
                    }
                    if (i == R.string.weapon_name_russian_roulette) {
                        return new MechanicalGun(R.string.weapon_name_russian_roulette, R.drawable.pic_weapon_show_ak47, R.drawable.gun_machine_ak47, 30, 3, 110L, "none_gun");
                    }
                    return null;
                }
                timeBomb = new TimeBomb(i, R.drawable.pic_weapon_show_time_bomb_s, R.drawable.gun_science_time_bomb_s, 3, 0, "High_Explosive_S");
            }
            return timeBomb;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final Integer getWeaponNameResIdFromName(String str) {
            AbstractC2995aW.q(str, "strResName");
            switch (str.hashCode()) {
                case -2025560277:
                    if (str.equals("weapon_name_desert_eagle")) {
                        return Integer.valueOf(R.string.weapon_name_desert_eagle);
                    }
                    break;
                case -1733036538:
                    if (str.equals("weapon_name_awm")) {
                        return Integer.valueOf(R.string.weapon_name_awm);
                    }
                    break;
                case -1733036535:
                    if (str.equals("weapon_name_awp")) {
                        return Integer.valueOf(R.string.weapon_name_awp);
                    }
                    break;
                case -1733025279:
                    if (str.equals("weapon_name_mp5")) {
                        return Integer.valueOf(R.string.weapon_name_mp5);
                    }
                    break;
                case -1733024106:
                    if (str.equals("weapon_name_p90")) {
                        return Integer.valueOf(R.string.weapon_name_p90);
                    }
                    break;
                case -1733017439:
                    if (str.equals("weapon_name_usp")) {
                        return Integer.valueOf(R.string.weapon_name_usp);
                    }
                    break;
                case -1433559713:
                    if (str.equals("weapon_name_gatling")) {
                        return Integer.valueOf(R.string.weapon_name_gatling);
                    }
                    break;
                case -939680440:
                    if (str.equals("weapon_name_science_energy_cannon")) {
                        return Integer.valueOf(R.string.weapon_name_science_energy_cannon);
                    }
                    break;
                case -815553144:
                    if (str.equals("weapon_name_scar_20s")) {
                        return Integer.valueOf(R.string.weapon_name_scar_20s);
                    }
                    break;
                case -731069405:
                    if (str.equals("taser_eight")) {
                        return Integer.valueOf(R.string.taser_eight);
                    }
                    break;
                case -718244959:
                    if (str.equals("taser_seven")) {
                        return Integer.valueOf(R.string.taser_seven);
                    }
                    break;
                case -717235918:
                    if (str.equals("taser_three")) {
                        return Integer.valueOf(R.string.taser_three);
                    }
                    break;
                case -559382378:
                    if (str.equals("weapon_name_colt_python")) {
                        return Integer.valueOf(R.string.weapon_name_colt_python);
                    }
                    break;
                case -493759077:
                    if (str.equals("weapon_name_laser_gun")) {
                        return Integer.valueOf(R.string.weapon_name_laser_gun);
                    }
                    break;
                case -391221754:
                    if (str.equals("weapon_name_science_arc")) {
                        return Integer.valueOf(R.string.weapon_name_science_arc);
                    }
                    break;
                case 26064634:
                    if (str.equals("taser_one")) {
                        return Integer.valueOf(R.string.taser_one);
                    }
                    break;
                case 26068342:
                    if (str.equals("taser_six")) {
                        return Integer.valueOf(R.string.taser_six);
                    }
                    break;
                case 26069728:
                    if (str.equals("taser_two")) {
                        return Integer.valueOf(R.string.taser_two);
                    }
                    break;
                case 293875949:
                    if (str.equals("weapon_name_de_gold")) {
                        return Integer.valueOf(R.string.weapon_name_de_gold);
                    }
                    break;
                case 580167459:
                    if (str.equals("weapon_name_f1_gold")) {
                        return Integer.valueOf(R.string.weapon_name_f1_gold);
                    }
                    break;
                case 757027564:
                    if (str.equals("weapon_name_science_arc2")) {
                        return Integer.valueOf(R.string.weapon_name_science_arc2);
                    }
                    break;
                case 757027565:
                    if (str.equals("weapon_name_science_arc3")) {
                        return Integer.valueOf(R.string.weapon_name_science_arc3);
                    }
                    break;
                case 807731358:
                    if (str.equals("taser_five")) {
                        return Integer.valueOf(R.string.taser_five);
                    }
                    break;
                case 807737106:
                    if (str.equals("taser_four")) {
                        return Integer.valueOf(R.string.taser_four);
                    }
                    break;
                case 897637233:
                    if (str.equals("weapon_name_ak47_r")) {
                        return Integer.valueOf(R.string.weapon_name_ak47_r);
                    }
                    break;
                case 897637240:
                    if (str.equals("weapon_name_ak47_y")) {
                        return Integer.valueOf(R.string.weapon_name_ak47_y);
                    }
                    break;
                case 900189099:
                    if (str.equals("weapon_name_f1_grenade")) {
                        return Integer.valueOf(R.string.weapon_name_f1_grenade);
                    }
                    break;
                case 934677482:
                    if (str.equals("weapon_name_science_energy_cannon2")) {
                        return Integer.valueOf(R.string.weapon_name_science_energy_cannon2);
                    }
                    break;
                case 1005251781:
                    if (str.equals("weapon_name_hk416")) {
                        return Integer.valueOf(R.string.weapon_name_hk416);
                    }
                    break;
                case 1008137662:
                    if (str.equals("weapon_name_m1014")) {
                        return Integer.valueOf(R.string.weapon_name_m1014);
                    }
                    break;
                case 1008810525:
                    if (str.equals("weapon_name_he_grenade")) {
                        return Integer.valueOf(R.string.weapon_name_he_grenade);
                    }
                    break;
                case 1010664848:
                    if (str.equals("weapon_name_negev")) {
                        return Integer.valueOf(R.string.weapon_name_negev);
                    }
                    break;
                case 1017374888:
                    if (str.equals("weapon_name_ump45")) {
                        return Integer.valueOf(R.string.weapon_name_ump45);
                    }
                    break;
                case 1176541281:
                    if (str.equals("weapon_name_kar98k")) {
                        return Integer.valueOf(R.string.weapon_name_kar98k);
                    }
                    break;
                case 1191731100:
                    if (str.equals("weapon_name_m4a4_p")) {
                        return Integer.valueOf(R.string.weapon_name_m4a4_p);
                    }
                    break;
                case 1841200082:
                    if (str.equals("weapon_name_time_bomb_n")) {
                        return Integer.valueOf(R.string.weapon_name_time_bomb_n);
                    }
                    break;
                case 1841200087:
                    if (str.equals("weapon_name_time_bomb_s")) {
                        return Integer.valueOf(R.string.weapon_name_time_bomb_s);
                    }
                    break;
                case 1885068347:
                    if (str.equals("stun_gun")) {
                        return Integer.valueOf(R.string.stun_gun);
                    }
                    break;
                case 1993125662:
                    if (str.equals("weapon_name_science_auto9")) {
                        return Integer.valueOf(R.string.weapon_name_science_auto9);
                    }
                    break;
                case 2110428926:
                    if (str.equals("weapon_name_ak47")) {
                        return Integer.valueOf(R.string.weapon_name_ak47);
                    }
                    break;
                case 2110734955:
                    if (str.equals("weapon_name_m4a4")) {
                        return Integer.valueOf(R.string.weapon_name_m4a4);
                    }
                    break;
                case 2110736503:
                    if (str.equals("weapon_name_m762")) {
                        return Integer.valueOf(R.string.weapon_name_m762);
                    }
                    break;
            }
            int identifier = App.n.f().getResources().getIdentifier(str, TypedValues.Custom.S_STRING, C2498In.i().getPackageName());
            if (identifier > 0) {
                return Integer.valueOf(identifier);
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Weapon createFromParcel(Parcel parcel) {
            AbstractC2995aW.q(parcel, "parcel");
            return new Weapon(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Weapon[] newArray(int i) {
            return new Weapon[i];
        }
    }

    public /* synthetic */ Weapon(int i, int i2, int i3, int i4, int i5, long j, String str, int i6, AbstractC2471Hm abstractC2471Hm) {
        this(i, i2, i3, i4, i5, (i6 & 32) != 0 ? DefaultConsecutiveInterval : j, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String initName() {
        String string = AbstractApplicationC2673Ph.m.getString(this.nameId);
        AbstractC2995aW.p(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String initNameRes() {
        return AbstractApplicationC2673Ph.m.getResources().getResourceName(this.nameId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC2995aW.i(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC2995aW.o(obj, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon");
        return this.nameId == ((Weapon) obj).nameId;
    }

    public final String getActiveSoundPath() {
        int i = this.nameId;
        if (i == R.string.weapon_name_he_grenade || i == R.string.weapon_name_f1_grenade || i == R.string.weapon_name_time_bomb_n || i == R.string.weapon_name_time_bomb_s || i == R.string.weapon_name_f1_gold) {
            return "weaponsound/machine/bomb_blast.MP3";
        }
        if (i == R.string.weapon_name_awp || i == R.string.weapon_name_awm) {
            return "weaponsound/machine/gun_awp_shoot.MP3";
        }
        if (i == R.string.weapon_name_desert_eagle || i == R.string.weapon_name_de_gold) {
            return "weaponsound/machine/gun_desert_eagle_shoot.MP3";
        }
        if (i == R.string.weapon_name_m4a4 || i == R.string.weapon_name_m4a4_p) {
            return "weaponsound/machine/gun_m4a4_shoot.MP3";
        }
        if (i == R.string.weapon_name_p90) {
            return "weaponsound/machine/gun_p90_shoot.MP3";
        }
        if (i == R.string.weapon_name_ump45) {
            return "weaponsound/machine/gun_ump_shoot.MP3";
        }
        if (i == R.string.weapon_name_usp) {
            return "weaponsound/machine/gun_usp_shoot.MP3";
        }
        if (i == R.string.weapon_name_science_arc || i == R.string.weapon_name_science_arc2 || i == R.string.weapon_name_science_arc3) {
            return "weaponsound/sci/arc.MP3";
        }
        if (i == R.string.weapon_name_laser_gun || i == R.string.weapon_name_science_laser_gun2 || i == R.string.weapon_name_science_laser_gun5) {
            return "weaponsound/sci/laser_head.MP3";
        }
        if (i == R.string.weapon_name_science_energy_cannon || i == R.string.weapon_name_science_energy_cannon2 || i == R.string.weapon_name_science_energy_cannon3 || i == R.string.weapon_name_science_energy_cannon4) {
            return "weaponsound/sci/energy_cannon.MP3";
        }
        if (i == R.string.weapon_name_ak47_r || i == R.string.weapon_name_ak47_y || i == R.string.weapon_name_ak47) {
            return "weaponsound/machine/gun_ak47_shoot.MP3";
        }
        if (i == R.string.weapon_name_colt_python) {
            return "weaponsound/machine/gun_colt_shoot.MP3";
        }
        if (i == R.string.weapon_name_hk416) {
            return "weaponsound/machine/gun_hk416_shoot.MP3";
        }
        if (i == R.string.weapon_name_kar98k) {
            return "weaponsound/machine/gun_kr98k_shoot.MP3";
        }
        if (i == R.string.weapon_name_m762) {
            return "weaponsound/machine/gun_m762_shoot.ogg";
        }
        if (i == R.string.weapon_name_mp5) {
            return "weaponsound/machine/gun_mp5_shoot.ogg";
        }
        if (i == R.string.weapon_name_negev) {
            return "weaponsound/machine/gun_negev_shoot.ogg";
        }
        if (i == R.string.weapon_name_scar_20s) {
            return "weaponsound/machine/gun_scar20_shoot.ogg";
        }
        if (i == R.string.weapon_name_m1014) {
            return "weaponsound/machine/gun_xm1014_shoot.ogg";
        }
        if (i == R.string.lightsaber_one || i == R.string.lightsaber_two || i == R.string.lightsaber_three || i == R.string.lightsaber_four || i == R.string.lightsaber_five || i == R.string.lightsaber_seven || i == R.string.lightsaber_eight || i == R.string.lightsaber_nine || i == R.string.lightsaber_eleven || i == R.string.lightsaber_twelve) {
            return "weaponsound/lightsaber/light_saber_circle_default.ogg";
        }
        if (i == R.string.lightsaber_six || i == R.string.lightsaber_ten) {
            return "weaponsound/lightsaber/light_saber_circle_shensheng.ogg";
        }
        if (i == R.string.weapon_name_rpg_7) {
            return "weaponsound/machine/rpg.MP3";
        }
        if (i == R.string.weapon_name_m84) {
            return "weaponsound/bomb/bomb_m84_shoot.MP3";
        }
        return i == R.string.weapon_name_m2_flamethrower ? "weaponsound/machine/fire.mp3" : "weaponsound/machine/gun_shoot.MP3";
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public String getAniParentPathReloadCartridge() {
        return this.aniParentPathReloadCartridge;
    }

    public final String getBombScreenSoundPath() {
        return "weaponsound/bomb/broken_screen.ogg";
    }

    public final String getBombSoundPath() {
        int i = this.nameId;
        if (i == R.string.weapon_name_time_bomb_c4 || i == R.string.weapon_name_time_bomb_n || i == R.string.weapon_name_time_bomb_s) {
            return "weaponsound/bomb/boom_1.ogg";
        }
        if (i == R.string.weapon_name_time_bomb_stone_age || i == R.string.weapon_name_time_bomb_nuclear) {
            return "weaponsound/bomb/boom_nuclear.ogg";
        }
        if (i == R.string.weapon_name_time_bomb_frostbite) {
            return "weaponsound/bomb/boom_frostbite.ogg";
        }
        if (i == R.string.weapon_name_time_bomb_gas) {
            return "weaponsound/bomb/boom_gas.ogg";
        }
        if (i == R.string.weapon_name_time_bomb_skibidi) {
            return "weaponsound/bomb/boom_skibidi.ogg";
        }
        return (i == R.string.weapon_name_time_bomb_tomahawk || i == R.string.weapon_name_time_bomb_drone) ? "weaponsound/bomb/boom_2.ogg" : "weaponsound/bomb/boom_1.ogg";
    }

    public final String getBulletClearSoundPath() {
        return "weaponsound/empty_magazine_gun.mp3";
    }

    public boolean getCanConsecutive() {
        return this.magazineCapacity > 1 && this.consecutiveInterval > 0;
    }

    public final int getCartridgeClip() {
        return this.cartridgeClip;
    }

    public final long getConsecutiveInterval() {
        return this.consecutiveInterval;
    }

    public int getIconCartridge() {
        return this.iconCartridge;
    }

    public int getIconReloadCartridge() {
        return this.iconReloadCartridge;
    }

    public int getIconReloadCartridgeClip() {
        return this.iconReloadCartridgeClip;
    }

    public final String getLightSaberRepeatSoundPath() {
        int i = this.nameId;
        if (i == R.string.lightsaber_one || i == R.string.lightsaber_two || i == R.string.lightsaber_three || i == R.string.lightsaber_four || i == R.string.lightsaber_five || i == R.string.lightsaber_seven || i == R.string.lightsaber_eight || i == R.string.lightsaber_nine || i == R.string.lightsaber_eleven || i == R.string.lightsaber_twelve) {
            return "weaponsound/lightsaber/light_saber_circle_default.ogg";
        }
        return (i == R.string.lightsaber_six || i == R.string.lightsaber_ten) ? "weaponsound/lightsaber/light_saber_circle_shensheng.ogg" : "weaponsound/lightsaber/light_saber_circle_default.ogg";
    }

    public final int getMagazineCapacity() {
        return this.magazineCapacity;
    }

    public final String getName() {
        return (String) this.name$delegate.getValue();
    }

    public final int getNameId() {
        return this.nameId;
    }

    public final String getNameRes() {
        return (String) this.nameRes$delegate.getValue();
    }

    public final String getReloadSoundPath() {
        int i = this.nameId;
        if (i == R.string.weapon_name_awp || i == R.string.weapon_name_awm) {
            return "weaponsound/machine/gun_awp_reload.MP3";
        }
        if (i == R.string.weapon_name_desert_eagle || i == R.string.weapon_name_de_gold || i == R.string.weapon_name_colt_python) {
            return "weaponsound/machine/gun_desert_eagle_reload.MP3";
        }
        if (i == R.string.weapon_name_p90) {
            return "weaponsound/machine/gun_p90_reload.MP3";
        }
        if (i == R.string.weapon_name_mp5) {
            return "weaponsound/machine/gun_mp5_reload.MP3";
        }
        if (i == R.string.weapon_name_ak47_r || i == R.string.weapon_name_ak47_y || i == R.string.weapon_name_ak47) {
            return "weaponsound/machine/gun_ak47_reload.MP3";
        }
        if (i == R.string.weapon_name_kar98k) {
            return "weaponsound/machine/gun_kr98k_reload.MP3";
        }
        if (i == R.string.weapon_name_m4a4 || i == R.string.weapon_name_m4a4_p) {
            return "weaponsound/machine/gun_m4a4_reload.MP3";
        }
        if (i == R.string.weapon_name_scar_20s) {
            return "weaponsound/machine/gun_scar20_reload.ogg";
        }
        if (i == R.string.weapon_name_m1014) {
            return "weaponsound/machine/gun_xm1014_reload.ogg";
        }
        return (i == R.string.weapon_name_science_arc2 || i == R.string.weapon_name_laser_gun || i == R.string.weapon_name_science_energy_cannon2 || i == R.string.weapon_name_science_laser_gun2 || i == R.string.weapon_name_science_arc3 || i == R.string.weapon_name_science_energy_cannon3 || i == R.string.weapon_name_science_energy_cannon4 || i == R.string.weapon_name_science_arc || i == R.string.weapon_name_science_energy_cannon || i == R.string.weapon_name_science_laser_gun5) ? "weaponsound/sci/reload.ogg" : "weaponsound/machine/reload_bullets.mp3";
    }

    public final int getShowPicId() {
        return this.showPicId;
    }

    public boolean getSwitchBoomBrokenScreen() {
        if (this instanceof Bomb) {
            return ((Boolean) ((C2856Wi) AbstractC3194cj.W.getValue()).a()).booleanValue();
        }
        return false;
    }

    public boolean getSwitchBulletDrop() {
        int i;
        if (this instanceof MechanicalGun) {
            return ((Boolean) ((C2856Wi) AbstractC3194cj.S.getValue()).a()).booleanValue();
        }
        if ((this instanceof TechnologyGun) && ((i = this.nameId) == R.string.taser_one || i == R.string.stun_gun)) {
            return ((Boolean) ((C2856Wi) AbstractC3194cj.S.getValue()).a()).booleanValue();
        }
        return false;
    }

    public boolean getSwitchFlash() {
        return ((Boolean) ((C2856Wi) AbstractC3194cj.O.getValue()).a()).booleanValue();
    }

    public boolean getSwitchHaptic() {
        return ((Boolean) ((C2856Wi) AbstractC3194cj.Q.getValue()).a()).booleanValue();
    }

    public boolean getSwitchScreenFlash() {
        int i;
        if (this instanceof MechanicalGun) {
            return ((Boolean) AbstractC3194cj.b().a()).booleanValue();
        }
        if (this instanceof Taser) {
            return ((Boolean) AbstractC3194cj.b().a()).booleanValue();
        }
        if ((this instanceof TechnologyGun) && ((i = this.nameId) == R.string.weapon_name_science_energy_cannon || i == R.string.weapon_name_science_energy_cannon2)) {
            return ((Boolean) AbstractC3194cj.b().a()).booleanValue();
        }
        return false;
    }

    public boolean getSwitchSound() {
        return ((Boolean) ((C2856Wi) AbstractC3194cj.R.getValue()).a()).booleanValue();
    }

    public final String getTaserRepeatSoundPath() {
        int i = this.nameId;
        return (i == R.string.taser_three || i == R.string.taser_five || i == R.string.taser_seven) ? "weaponsound/taser/taser gun2.mp3" : "weaponsound/taser/stun gun.mp3";
    }

    public final int getThumbnailId() {
        return this.thumbnailId;
    }

    public int hashCode() {
        return this.nameId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        AbstractC2995aW.q(parcel, "parcel");
        parcel.writeInt(this.nameId);
        parcel.writeInt(this.showPicId);
        parcel.writeInt(this.thumbnailId);
        parcel.writeInt(this.magazineCapacity);
        parcel.writeInt(this.cartridgeClip);
        parcel.writeLong(this.consecutiveInterval);
        parcel.writeString(this.analyticsName);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Weapon(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString());
        AbstractC2995aW.q(parcel, "parcel");
    }

    public Weapon(@StringRes int i, @DrawableRes int i2, @DrawableRes int i3, @IntRange(from = 1) int i4, @IntRange(from = 1) int i5, long j, String str) {
        this.iconReloadCartridge = R.drawable.icon_reload_bullets_machine;
        this.iconCartridge = R.drawable.icon_cartridge_mechanical_gun;
        this.aniParentPathReloadCartridge = "ani/reload_cartridge_yellow";
        this.iconReloadCartridgeClip = R.drawable.icon_reload_cartridge_clip_mechanical_gun;
        this.name$delegate = AbstractC3375el.L(new Weapon$name$2(this));
        this.nameRes$delegate = AbstractC3375el.L(new Weapon$nameRes$2(this));
        this.nameId = i;
        this.showPicId = i2;
        this.thumbnailId = i3;
        this.magazineCapacity = i4;
        this.cartridgeClip = i5;
        this.consecutiveInterval = j;
        this.analyticsName = str == null ? "none_gun" : str;
    }
}
