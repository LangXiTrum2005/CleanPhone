package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.a80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2970a80 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new SmtaMetadataEntry(parcel, (C2970a80) null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SmtaMetadataEntry[i];
    }
}
