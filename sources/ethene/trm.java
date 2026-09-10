package ethene;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.empress;
import java.io.IOException;

/* JADX INFO: compiled from: SampleStream.java */
/* JADX INFO: loaded from: classes.dex */
public interface trm {
    int attabal(empress empressVar, DecoderInputBuffer decoderInputBuffer, int i);

    boolean isReady();

    void maybeThrowError() throws IOException;

    int skipData(long j);
}
