package com.mbridge.msdk.playercommon.exoplayer2.extractor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface ExtractorOutput {
    void endTracks();

    void seekMap(SeekMap seekMap);

    TrackOutput track(int i10, int i11);
}
