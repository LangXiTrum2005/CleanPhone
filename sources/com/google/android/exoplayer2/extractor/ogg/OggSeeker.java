package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;

/* JADX INFO: loaded from: classes3.dex */
interface OggSeeker {
    long a(DefaultExtractorInput defaultExtractorInput);

    SeekMap createSeekMap();

    void startSeek(long j);
}
