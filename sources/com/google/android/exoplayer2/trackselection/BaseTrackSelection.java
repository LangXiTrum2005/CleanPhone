package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseTrackSelection implements ExoTrackSelection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrackGroup f18664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f18666c;
    public final Format[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18667e;

    public BaseTrackSelection(TrackGroup trackGroup, int[] iArr) {
        Format[] formatArr;
        Assertions.d(iArr.length > 0);
        trackGroup.getClass();
        this.f18664a = trackGroup;
        int length = iArr.length;
        this.f18665b = length;
        this.d = new Format[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            formatArr = trackGroup.e0;
            if (i2 >= length2) {
                break;
            }
            this.d[i2] = formatArr[iArr[i2]];
            i2++;
        }
        Arrays.sort(this.d, new b(5));
        this.f18666c = new int[this.f18665b];
        int i3 = 0;
        while (true) {
            int i4 = this.f18665b;
            if (i3 >= i4) {
                long[] jArr = new long[i4];
                return;
            }
            int[] iArr2 = this.f18666c;
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

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void disable() {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void enable() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BaseTrackSelection baseTrackSelection = (BaseTrackSelection) obj;
            if (this.f18664a == baseTrackSelection.f18664a && Arrays.equals(this.f18666c, baseTrackSelection.f18666c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final Format getFormat(int i2) {
        return this.d[i2];
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int i2) {
        return this.f18666c[i2];
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final Format getSelectedFormat() {
        return this.d[getSelectedIndex()];
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final TrackGroup getTrackGroup() {
        return this.f18664a;
    }

    public final int hashCode() {
        if (this.f18667e == 0) {
            this.f18667e = Arrays.hashCode(this.f18666c) + (System.identityHashCode(this.f18664a) * 31);
        }
        return this.f18667e;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int indexOf(int i2) {
        for (int i3 = 0; i3 < this.f18665b; i3++) {
            if (this.f18666c[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int length() {
        return this.f18666c.length;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f) {
    }
}
