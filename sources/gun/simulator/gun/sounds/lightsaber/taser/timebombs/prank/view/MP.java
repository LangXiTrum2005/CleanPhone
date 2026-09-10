package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;

/* JADX INFO: loaded from: classes2.dex */
public final class MP implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new MotionPhotoMetadata(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MotionPhotoMetadata[i];
    }
}
