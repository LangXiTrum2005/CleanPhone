package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.offline.DownloadRequest;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2422Fp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new DownloadRequest(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DownloadRequest[i];
    }
}
