package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTrackSelection implements ExoTrackSelection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrackGroup f6506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f6508c;
    public final Format[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6509e;

    public BaseTrackSelection(TrackGroup trackGroup, int[] iArr) {
        Format[] formatArr;
        Assertions.e(iArr.length > 0);
        trackGroup.getClass();
        this.f6506a = trackGroup;
        int length = iArr.length;
        this.f6507b = length;
        this.d = new Format[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            formatArr = trackGroup.d;
            if (i2 >= length2) {
                break;
            }
            this.d[i2] = formatArr[iArr[i2]];
            i2++;
        }
        Arrays.sort(this.d, new b(6));
        this.f6508c = new int[this.f6507b];
        int i3 = 0;
        while (true) {
            int i4 = this.f6507b;
            if (i3 >= i4) {
                long[] jArr = new long[i4];
                return;
            }
            int[] iArr2 = this.f6508c;
            Format format = this.d[i3];
            int i5 = 0;
            while (true) {
                if (i5 >= formatArr.length) {
                    i5 = -1;
                    break;
                } else if (format == formatArr[i5]) {
                    break;
                } else {
                    i5++;
                }
            }
            iArr2[i3] = i5;
            i3++;
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void disable() {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void enable() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BaseTrackSelection baseTrackSelection = (BaseTrackSelection) obj;
            if (this.f6506a.equals(baseTrackSelection.f6506a) && Arrays.equals(this.f6508c, baseTrackSelection.f6508c)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final Format getFormat(int i2) {
        return this.d[i2];
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int i2) {
        return this.f6508c[i2];
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final Format getSelectedFormat() {
        return this.d[getSelectedIndex()];
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final int getSelectedIndexInTrackGroup() {
        return this.f6508c[getSelectedIndex()];
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final TrackGroup getTrackGroup() {
        return this.f6506a;
    }

    public final int hashCode() {
        if (this.f6509e == 0) {
            this.f6509e = Arrays.hashCode(this.f6508c) + (System.identityHashCode(this.f6506a) * 31);
        }
        return this.f6509e;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int indexOf(int i2) {
        for (int i3 = 0; i3 < this.f6507b; i3++) {
            if (this.f6508c[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int length() {
        return this.f6508c.length;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f) {
    }
}
