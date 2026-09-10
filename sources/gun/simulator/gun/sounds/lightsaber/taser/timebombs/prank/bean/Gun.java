package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.badlogic.gdx.Input;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;

/* JADX INFO: loaded from: classes4.dex */
public class Gun extends Weapon {
    public static final CREATOR CREATOR = new CREATOR(null);

    public static final class CREATOR implements Parcelable.Creator<Gun> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Gun createFromParcel(Parcel parcel) {
            AbstractC2995aW.q(parcel, "parcel");
            return new Gun(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Gun[] newArray(int i) {
            return new Gun[i];
        }
    }

    public /* synthetic */ Gun(int i, int i2, int i3, int i4, int i5, long j, String str, int i6, AbstractC2471Hm abstractC2471Hm) {
        this(i, i2, i3, i4, i5, (i6 & 32) != 0 ? Weapon.CREATOR.getDefaultConsecutiveInterval() : j, str);
    }

    public final float getShootFireAniConstraintPercentWidth() {
        float f;
        float shootFireLbConstraintPercentWidth = getShootFireLbConstraintPercentWidth();
        if (this instanceof MechanicalGun) {
            f = 3.0f;
        } else {
            int nameId = getNameId();
            f = (nameId == R.string.weapon_name_laser_gun || nameId == R.string.weapon_name_science_arc || nameId == R.string.weapon_name_science_arc2 || nameId == R.string.weapon_name_science_arc3) ? 2.0f : 1.0f;
        }
        return shootFireLbConstraintPercentWidth * f;
    }

    public final float getShootFireLbConstraintPercentWidth() {
        int nameId = getNameId();
        if (nameId == R.string.taser_one) {
            return 0.49444443f;
        }
        if (nameId != R.string.stun_gun) {
            if (nameId == R.string.weapon_name_ak47 || nameId == R.string.weapon_name_ump45 || nameId == R.string.weapon_name_p90 || nameId == R.string.weapon_name_m4a4 || nameId == R.string.weapon_name_m762 || nameId == R.string.weapon_name_hk416 || nameId == R.string.weapon_name_negev || nameId == R.string.weapon_name_m4a4_p || nameId == R.string.weapon_name_ak47_r || nameId == R.string.weapon_name_gatling || nameId == R.string.weapon_name_ak47_y || nameId == R.string.weapon_name_mp5 || nameId == R.string.weapon_name_m1014) {
                return 0.22222f;
            }
            if (nameId == R.string.weapon_name_awp || nameId == R.string.weapon_name_awm || nameId == R.string.weapon_name_kar98k || nameId == R.string.weapon_name_scar_20s) {
                return 0.15833333f;
            }
            if (nameId == R.string.weapon_name_usp || nameId == R.string.weapon_name_desert_eagle || nameId == R.string.weapon_name_de_gold || nameId == R.string.weapon_name_colt_python) {
                return 0.23888889f;
            }
            if (nameId != R.string.weapon_name_science_arc && nameId != R.string.weapon_name_science_arc2 && nameId != R.string.weapon_name_science_arc3 && nameId != R.string.weapon_name_science_energy_cannon && nameId != R.string.weapon_name_science_auto9 && nameId != R.string.weapon_name_science_energy_cannon2) {
                return 0.0f;
            }
        }
        return 0.5f;
    }

    public final String getShootFireLbDimensionRatio() {
        if (this instanceof MechanicalGun) {
            return "240:141";
        }
        if (this instanceof TechnologyGun) {
            int nameId = getNameId();
            if (nameId == R.string.taser_one) {
                return "178:198";
            }
            if (nameId == R.string.stun_gun) {
                return "177:199";
            }
            if (nameId == R.string.weapon_name_science_arc || nameId == R.string.weapon_name_science_arc2 || nameId == R.string.weapon_name_science_arc3) {
                return "180:107";
            }
            if (nameId == R.string.weapon_name_science_energy_cannon || nameId == R.string.weapon_name_science_auto9 || nameId == R.string.weapon_name_science_energy_cannon2) {
                return "180:140";
            }
        }
        return "1";
    }

    public final Point getSpaceWeightMuzzleLT() {
        Point point = new Point(1, 1);
        int nameId = getNameId();
        if (nameId == R.string.stun_gun) {
            point.set(180, 70);
        } else if (nameId == R.string.taser_one) {
            point.set(198, 75);
        } else if (nameId == R.string.weapon_name_ak47) {
            point.set(594, 174);
        } else if (nameId == R.string.weapon_name_ump45) {
            point.set(203, 85);
        } else if (nameId == R.string.weapon_name_awp) {
            point.set(Input.Keys.F18, 60);
        } else if (nameId == R.string.weapon_name_usp) {
            point.set(235, Input.Keys.NUMPAD_ENTER);
        } else if (nameId == R.string.weapon_name_p90) {
            point.set(180, 75);
        } else if (nameId == R.string.weapon_name_m4a4) {
            point.set(203, 70);
        } else if (nameId == R.string.weapon_name_m762) {
            point.set(EnumC4719u30.AD_RESPONSE_TIMED_OUT_VALUE, 65);
        } else if (nameId == R.string.weapon_name_desert_eagle) {
            point.set(EnumC4719u30.AD_RESPONSE_RETRY_AFTER_VALUE, Input.Keys.F10);
        } else if (nameId == R.string.weapon_name_hk416) {
            point.set(197, 57);
        } else if (nameId == R.string.weapon_name_negev) {
            point.set(EnumC4719u30.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 55);
        } else if (nameId == R.string.weapon_name_laser_gun) {
            point.set(Input.Keys.F23, Input.Keys.NUMPAD_6);
        } else if (nameId == R.string.weapon_name_science_arc) {
            point.set(200, Input.Keys.NUMPAD_ENTER);
        } else if (nameId == R.string.weapon_name_science_energy_cannon) {
            point.set(Input.Keys.F20, 94);
        } else if (nameId == R.string.weapon_name_science_energy_cannon2) {
            point.set(195, 99);
        } else if (nameId == R.string.weapon_name_science_arc2) {
            point.set(Input.Keys.F18, 100);
        } else if (nameId == R.string.weapon_name_science_arc3) {
            point.set(202, 198);
        } else if (nameId == R.string.weapon_name_science_auto9) {
            point.set(207, Input.Keys.NUMPAD_DOT);
        } else if (nameId == R.string.weapon_name_colt_python) {
            point.set(EnumC4719u30.STALE_CACHED_RESPONSE_VALUE, Input.Keys.NUMPAD_MULTIPLY);
        } else if (nameId == R.string.weapon_name_ak47_r) {
            point.set(205, 57);
        } else if (nameId == R.string.weapon_name_m4a4_p) {
            point.set(195, 81);
        } else if (nameId == R.string.weapon_name_de_gold) {
            point.set(EnumC4719u30.AD_RESPONSE_EMPTY_VALUE, Input.Keys.NUMPAD_DOT);
        } else if (nameId == R.string.weapon_name_awm || nameId == R.string.weapon_name_gatling) {
            point.set(Input.Keys.F20, 53);
        } else if (nameId == R.string.weapon_name_ak47_y) {
            point.set(Input.Keys.F23, 59);
        } else if (nameId == R.string.weapon_name_mp5) {
            point.set(195, 54);
        } else if (nameId == R.string.weapon_name_kar98k) {
            point.set(199, 47);
        } else if (nameId == R.string.weapon_name_scar_20s) {
            point.set(182, 44);
        } else if (nameId == R.string.weapon_name_m1014) {
            point.set(207, 50);
        }
        return point;
    }

    public final Point getSpaceWeightMuzzleRB() {
        Point point = new Point(1, 1);
        int nameId = getNameId();
        if (nameId == R.string.stun_gun) {
            point.set(180, 480);
        } else if (nameId == R.string.taser_one) {
            point.set(Input.Keys.NUMPAD_LEFT_PAREN, 475);
        } else if (nameId == R.string.weapon_name_ak47) {
            point.set(486, 1475);
        } else if (nameId == R.string.weapon_name_ump45) {
            point.set(Input.Keys.NUMPAD_ADD, 465);
        } else if (nameId == R.string.weapon_name_awp) {
            point.set(172, 490);
        } else if (nameId == R.string.weapon_name_usp) {
            point.set(EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE, 390);
        } else if (nameId == R.string.weapon_name_p90) {
            point.set(180, 475);
        } else if (nameId == R.string.weapon_name_m4a4) {
            point.set(Input.Keys.NUMPAD_ADD, 480);
        } else if (nameId == R.string.weapon_name_m762) {
            point.set(Input.Keys.NUM_LOCK, 485);
        } else if (nameId == R.string.weapon_name_desert_eagle) {
            point.set(Input.Keys.F10, 410);
        } else if (nameId == R.string.weapon_name_hk416) {
            point.set(Input.Keys.NUMPAD_RIGHT_PAREN, 493);
        } else if (nameId == R.string.weapon_name_negev) {
            point.set(Input.Keys.NUMPAD_3, 495);
        } else if (nameId == R.string.weapon_name_laser_gun) {
            point.set(167, 400);
        } else if (nameId == R.string.weapon_name_science_arc) {
            point.set(Input.Keys.NUMPAD_ENTER, 390);
        } else if (nameId == R.string.weapon_name_science_energy_cannon) {
            point.set(170, 456);
        } else if (nameId == R.string.weapon_name_science_energy_cannon2) {
            point.set(165, 451);
        } else if (nameId == R.string.weapon_name_science_arc2) {
            point.set(172, 450);
        } else if (nameId == R.string.weapon_name_science_arc3) {
            point.set(Input.Keys.NUMPAD_DOT, 352);
        } else if (nameId == R.string.weapon_name_science_auto9) {
            point.set(Input.Keys.NUMPAD_9, 392);
        } else if (nameId == R.string.weapon_name_colt_python) {
            point.set(137, 395);
        } else if (nameId == R.string.weapon_name_ak47_r) {
            point.set(Input.Keys.NUMPAD_MULTIPLY, 493);
        } else if (nameId == R.string.weapon_name_m4a4_p) {
            point.set(165, 469);
        } else if (nameId == R.string.weapon_name_de_gold) {
            point.set(Input.Keys.NUMPAD_1, 392);
        } else if (nameId == R.string.weapon_name_awm || nameId == R.string.weapon_name_gatling) {
            point.set(170, 497);
        } else if (nameId == R.string.weapon_name_ak47_y) {
            point.set(167, 491);
        } else if (nameId == R.string.weapon_name_mp5) {
            point.set(165, 496);
        } else if (nameId == R.string.weapon_name_kar98k) {
            point.set(Input.Keys.NUMPAD_EQUALS, 503);
        } else if (nameId == R.string.weapon_name_scar_20s) {
            point.set(178, 506);
        } else if (nameId == R.string.weapon_name_m1014) {
            point.set(Input.Keys.NUMPAD_9, 500);
        }
        return point;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gun(Parcel parcel) {
        super(parcel);
        AbstractC2995aW.q(parcel, "parcel");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gun(int i, int i2, int i3, int i4, int i5, long j, String str) {
        super(i, i2, i3, i4, i5, j, str);
        AbstractC2995aW.q(str, "analyticsName");
    }
}
