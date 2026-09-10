package androidx.media3.extractor.ogg;

import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.SeekMap;

/* JADX INFO: loaded from: classes.dex */
interface OggSeeker {
    long a(DefaultExtractorInput defaultExtractorInput);

    SeekMap createSeekMap();

    void startSeek(long j);
}
