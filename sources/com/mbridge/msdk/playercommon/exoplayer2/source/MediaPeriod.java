package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.SeekParameters;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface MediaPeriod extends SequenceableLoader {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface Callback extends SequenceableLoader.Callback<MediaPeriod> {
        void onPrepared(MediaPeriod mediaPeriod);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    boolean continueLoading(long j10);

    void discardBuffer(long j10, boolean z10);

    long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters);

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    long getBufferedPositionUs();

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    long getNextLoadPositionUs();

    TrackGroupArray getTrackGroups();

    void maybeThrowPrepareError() throws IOException;

    void prepare(Callback callback, long j10);

    long readDiscontinuity();

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    void reevaluateBuffer(long j10);

    long seekToUs(long j10);

    long selectTracks(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10);
}
