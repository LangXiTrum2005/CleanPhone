package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;

/* JADX INFO: loaded from: classes2.dex */
public final class Ac0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new TimeSignalCommand[i];
    }
}
