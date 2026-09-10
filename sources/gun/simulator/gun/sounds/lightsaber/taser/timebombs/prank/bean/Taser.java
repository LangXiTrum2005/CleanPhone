package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean;

import android.os.Parcel;
import android.os.Parcelable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class Taser extends Gun {
    public static final CREATOR CREATOR = new CREATOR(null);
    private final int iconCartridge;
    private final int iconReloadCartridge;
    private final int iconReloadCartridgeClip;

    public static final class CREATOR implements Parcelable.Creator<Taser> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        public final Weapon getWeaponByNameResId(int i) {
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
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Taser createFromParcel(Parcel parcel) {
            AbstractC2995aW.q(parcel, "parcel");
            return new Taser(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Taser[] newArray(int i) {
            return new Taser[i];
        }
    }

    public /* synthetic */ Taser(int i, int i2, int i3, int i4, int i5, long j, String str, int i6, AbstractC2471Hm abstractC2471Hm) {
        this(i, i2, i3, i4, i5, (i6 & 32) != 0 ? Weapon.CREATOR.getDefaultConsecutiveInterval() : j, str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon
    public int getIconCartridge() {
        return this.iconCartridge;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon
    public int getIconReloadCartridge() {
        return this.iconReloadCartridge;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon
    public int getIconReloadCartridgeClip() {
        return this.iconReloadCartridgeClip;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Taser(Parcel parcel) {
        super(parcel);
        AbstractC2995aW.q(parcel, "parcel");
        this.iconReloadCartridgeClip = R.drawable.icon_reload_cartridge_clip_technology;
        this.iconReloadCartridge = R.drawable.icon_cartridge_technology_gun;
        this.iconCartridge = R.drawable.icon_reload_cartridge_clip_technology;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Taser(int i, int i2, int i3, int i4, int i5, long j, String str) {
        super(i, i2, i3, i4, i5, j, str);
        AbstractC2995aW.q(str, "analyticsName");
        this.iconReloadCartridgeClip = R.drawable.icon_reload_cartridge_clip_technology;
        this.iconReloadCartridge = R.drawable.icon_cartridge_technology_gun;
        this.iconCartridge = R.drawable.icon_reload_cartridge_clip_technology;
    }
}
