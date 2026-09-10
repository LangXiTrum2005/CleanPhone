package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroup;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class RandomTrackSelection extends BaseTrackSelection {
    private final Random random;
    private int selectedIndex;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Factory implements TrackSelection.Factory {
        private final Random random;

        public Factory() {
            this.random = new Random();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection.Factory
        public RandomTrackSelection createTrackSelection(TrackGroup trackGroup, int... iArr) {
            return new RandomTrackSelection(trackGroup, iArr, this.random);
        }

        public Factory(int i10) {
            this.random = new Random(i10);
        }
    }

    public RandomTrackSelection(TrackGroup trackGroup, int... iArr) {
        super(trackGroup, iArr);
        Random random = new Random();
        this.random = random;
        this.selectedIndex = random.nextInt(this.length);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    @Nullable
    public Object getSelectionData() {
        return null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public int getSelectionReason() {
        return 3;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public void updateSelectedTrack(long j10, long j11, long j12) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = 0;
        for (int i11 = 0; i11 < this.length; i11++) {
            if (!isBlacklisted(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        this.selectedIndex = this.random.nextInt(i10);
        if (i10 != this.length) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.length; i13++) {
                if (!isBlacklisted(i13, jElapsedRealtime)) {
                    int i14 = i12 + 1;
                    if (this.selectedIndex == i12) {
                        this.selectedIndex = i13;
                        return;
                    }
                    i12 = i14;
                }
            }
        }
    }

    public RandomTrackSelection(TrackGroup trackGroup, int[] iArr, long j10) {
        this(trackGroup, iArr, new Random(j10));
    }

    public RandomTrackSelection(TrackGroup trackGroup, int[] iArr, Random random) {
        super(trackGroup, iArr);
        this.random = random;
        this.selectedIndex = random.nextInt(this.length);
    }
}
