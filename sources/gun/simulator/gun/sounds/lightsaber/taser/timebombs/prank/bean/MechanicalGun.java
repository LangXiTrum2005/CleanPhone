package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean;

import android.os.Parcel;
import android.os.Parcelable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class MechanicalGun extends Gun {
    public static final CREATOR CREATOR = new CREATOR(null);

    public static final class CREATOR implements Parcelable.Creator<MechanicalGun> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MechanicalGun createFromParcel(Parcel parcel) {
            AbstractC2995aW.q(parcel, "parcel");
            return new MechanicalGun(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MechanicalGun[] newArray(int i) {
            return new MechanicalGun[i];
        }
    }

    public /* synthetic */ MechanicalGun(int i, int i2, int i3, int i4, int i5, long j, String str, int i6, AbstractC2471Hm abstractC2471Hm) {
        this(i, i2, i3, i4, i5, (i6 & 32) != 0 ? Weapon.CREATOR.getDefaultConsecutiveInterval() : j, str);
    }

    public final float getShootBulletCenterHorizontalBias() {
        int nameId = getNameId();
        if (nameId == R.string.weapon_name_ak47) {
            return 0.6555556f;
        }
        if (nameId == R.string.weapon_name_ump45) {
            return 0.7361111f;
        }
        if (nameId == R.string.weapon_name_awp) {
            return 0.625f;
        }
        if (nameId == R.string.weapon_name_usp) {
            return 0.7416667f;
        }
        if (nameId == R.string.weapon_name_p90) {
            return 0.7638889f;
        }
        if (nameId == R.string.weapon_name_m4a4) {
            return 0.6527778f;
        }
        if (nameId == R.string.weapon_name_m762) {
            return 0.6722222f;
        }
        if (nameId == R.string.weapon_name_desert_eagle) {
            return 0.70555556f;
        }
        if (nameId == R.string.weapon_name_hk416) {
            return 0.61758333f;
        }
        if (nameId == R.string.weapon_name_negev) {
            return 0.69536114f;
        }
        if (nameId != R.string.weapon_name_colt_python) {
            if (nameId != R.string.weapon_name_ak47_r) {
                if (nameId == R.string.weapon_name_m4a4_p) {
                    return 0.6861111f;
                }
                if (nameId == R.string.weapon_name_de_gold) {
                    return 0.69166666f;
                }
                if (nameId == R.string.weapon_name_awm || nameId == R.string.weapon_name_gatling) {
                    return 0.68333334f;
                }
                if (nameId == R.string.weapon_name_ak47_y) {
                    return 0.6166667f;
                }
                if (nameId == R.string.weapon_name_mp5) {
                    return 0.61944443f;
                }
                if (nameId == R.string.weapon_name_kar98k) {
                    return 0.5888889f;
                }
                if (nameId != R.string.weapon_name_scar_20s) {
                    if (nameId != R.string.weapon_name_m1014) {
                        return 0.5f;
                    }
                }
            }
            return 0.60833335f;
        }
        return 0.6666667f;
    }

    public final float getShootBulletCenterVerticalBias() {
        int nameId = getNameId();
        if (nameId == R.string.weapon_name_ak47) {
            return 0.4921875f;
        }
        if (nameId == R.string.weapon_name_ump45) {
            return 0.4654545f;
        }
        if (nameId == R.string.weapon_name_awp) {
            return 0.627273f;
        }
        if (nameId == R.string.weapon_name_usp) {
            return 0.629091f;
        }
        if (nameId == R.string.weapon_name_p90) {
            return 0.3181818f;
        }
        if (nameId != R.string.weapon_name_m4a4) {
            if (nameId == R.string.weapon_name_m762) {
                return 0.62363636f;
            }
            if (nameId == R.string.weapon_name_desert_eagle) {
                return 0.6545455f;
            }
            if (nameId == R.string.weapon_name_hk416) {
                return 0.5148276f;
            }
            if (nameId == R.string.weapon_name_negev) {
                return 0.51965517f;
            }
            if (nameId == R.string.weapon_name_colt_python) {
                return 0.5945455f;
            }
            if (nameId == R.string.weapon_name_ak47_r) {
                return 0.66f;
            }
            if (nameId == R.string.weapon_name_m4a4_p) {
                return 0.6636364f;
            }
            if (nameId == R.string.weapon_name_de_gold) {
                return 0.6818182f;
            }
            if (nameId == R.string.weapon_name_awm) {
                return 0.7418182f;
            }
            if (nameId == R.string.weapon_name_gatling) {
                return 0.7181818f;
            }
            if (nameId == R.string.weapon_name_ak47_y) {
                return 0.6472727f;
            }
            if (nameId == R.string.weapon_name_mp5) {
                return 0.5327273f;
            }
            if (nameId == R.string.weapon_name_kar98k) {
                return 0.61212724f;
            }
            if (nameId == R.string.weapon_name_scar_20s) {
                return 0.5806f;
            }
            if (nameId == R.string.weapon_name_m1014) {
                return 0.50545454f;
            }
        }
        return 0.5f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MechanicalGun(Parcel parcel) {
        super(parcel);
        AbstractC2995aW.q(parcel, "parcel");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MechanicalGun(int i, int i2, int i3, int i4, int i5, long j, String str) {
        super(i, i2, i3, i4, i5, j, str);
        AbstractC2995aW.q(str, "analyticsName");
    }
}
