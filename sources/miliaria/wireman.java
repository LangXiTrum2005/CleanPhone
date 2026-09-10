package miliaria;

import androidx.media3.decoder.DecoderException;

/* JADX INFO: compiled from: Decoder.java */
/* JADX INFO: loaded from: classes.dex */
public interface wireman<I, O, E extends DecoderException> {
    void attabal(long j);

    I dequeueInputBuffer() throws DecoderException;

    O dequeueOutputBuffer() throws DecoderException;

    void flush();

    void queueInputBuffer(I i) throws DecoderException;

    void release();
}
