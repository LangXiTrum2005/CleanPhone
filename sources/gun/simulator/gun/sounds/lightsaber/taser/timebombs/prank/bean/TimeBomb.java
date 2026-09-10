package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean;

import android.os.Parcel;
import android.os.Parcelable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class TimeBomb extends Bomb {
    public static final CREATOR CREATOR = new CREATOR(null);

    public static final class CREATOR implements Parcelable.Creator<TimeBomb> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TimeBomb createFromParcel(Parcel parcel) {
            AbstractC2995aW.q(parcel, "parcel");
            return new TimeBomb(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TimeBomb[] newArray(int i) {
            return new TimeBomb[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeBomb(Parcel parcel) {
        super(parcel);
        AbstractC2995aW.q(parcel, "parcel");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeBomb(int i, int i2, int i3, int i4, int i5, String str) {
        super(i, i2, i3, i4, i5, str);
        AbstractC2995aW.q(str, "analyticsName");
    }
}
