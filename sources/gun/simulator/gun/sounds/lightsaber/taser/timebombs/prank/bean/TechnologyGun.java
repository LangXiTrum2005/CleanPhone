package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean;

import android.os.Parcel;
import android.os.Parcelable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class TechnologyGun extends Gun {
    public static final CREATOR CREATOR = new CREATOR(null);
    private final int iconCartridge;
    private final int iconReloadCartridge;
    private final int iconReloadCartridgeClip;

    public static final class CREATOR implements Parcelable.Creator<TechnologyGun> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TechnologyGun createFromParcel(Parcel parcel) {
            AbstractC2995aW.q(parcel, "parcel");
            return new TechnologyGun(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TechnologyGun[] newArray(int i) {
            return new TechnologyGun[i];
        }
    }

    public /* synthetic */ TechnologyGun(int i, int i2, int i3, int i4, int i5, long j, String str, int i6, AbstractC2471Hm abstractC2471Hm) {
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
    public TechnologyGun(Parcel parcel) {
        super(parcel);
        AbstractC2995aW.q(parcel, "parcel");
        this.iconReloadCartridgeClip = R.drawable.icon_reload_cartridge_clip_technology;
        this.iconReloadCartridge = R.drawable.icon_cartridge_technology_gun;
        this.iconCartridge = R.drawable.icon_reload_cartridge_clip_technology;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TechnologyGun(int i, int i2, int i3, int i4, int i5, long j, String str) {
        super(i, i2, i3, i4, i5, j, str);
        AbstractC2995aW.q(str, "analyticsName");
        this.iconReloadCartridgeClip = R.drawable.icon_reload_cartridge_clip_technology;
        this.iconReloadCartridge = R.drawable.icon_cartridge_technology_gun;
        this.iconCartridge = R.drawable.icon_reload_cartridge_clip_technology;
    }
}
