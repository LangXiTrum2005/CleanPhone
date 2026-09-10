package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;

/* JADX INFO: loaded from: classes2.dex */
public final class QM implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new MdtaMetadataEntry(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MdtaMetadataEntry[i];
    }
}
