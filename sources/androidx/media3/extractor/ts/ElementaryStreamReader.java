package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorOutput;

/* JADX INFO: loaded from: classes.dex */
public interface ElementaryStreamReader {
    void a(ParsableByteArray parsableByteArray);

    void c(int i2, long j);

    void d(boolean z2);

    void e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator);

    void seek();
}
