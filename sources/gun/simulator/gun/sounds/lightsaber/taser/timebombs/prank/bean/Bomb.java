package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean;

import android.os.Parcel;
import android.os.Parcelable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public class Bomb extends Weapon {
    public static final CREATOR CREATOR = new CREATOR(null);
    private final int iconCartridge;
    private final int iconReloadCartridgeClip;

    public static final class CREATOR implements Parcelable.Creator<Bomb> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Bomb createFromParcel(Parcel parcel) {
            AbstractC2995aW.q(parcel, "parcel");
            return new Bomb(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Bomb[] newArray(int i) {
            return new Bomb[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bomb(Parcel parcel) {
        super(parcel);
        AbstractC2995aW.q(parcel, "parcel");
        this.iconReloadCartridgeClip = R.drawable.icon_reload_cartridge_clip_boom;
        this.iconCartridge = R.drawable.icon_cartridge_bomb;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon
    public int getIconCartridge() {
        return this.iconCartridge;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon
    public int getIconReloadCartridgeClip() {
        return this.iconReloadCartridgeClip;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bomb(int i, int i2, int i3, int i4, int i5, String str) {
        super(i, i2, i3, i4, i5, 0L, str);
        AbstractC2995aW.q(str, "analyticsName");
        this.iconReloadCartridgeClip = R.drawable.icon_reload_cartridge_clip_boom;
        this.iconCartridge = R.drawable.icon_cartridge_bomb;
    }
}
