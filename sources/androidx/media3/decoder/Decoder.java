package androidx.media3.decoder;

import androidx.media3.decoder.DecoderException;

/* JADX INFO: loaded from: classes.dex */
public interface Decoder<I, O, E extends DecoderException> {
    void a(long j);

    Object dequeueInputBuffer();

    Object dequeueOutputBuffer();

    void flush();

    String getName();

    void queueInputBuffer(Object obj);

    void release();
}
