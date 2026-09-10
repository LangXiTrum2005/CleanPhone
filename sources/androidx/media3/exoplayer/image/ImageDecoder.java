package androidx.media3.exoplayer.image;

import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface ImageDecoder extends Decoder<DecoderInputBuffer, ImageOutputBuffer, ImageDecoderException> {

    public interface Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BitmapFactoryImageDecoder.Factory f6253a = new BitmapFactoryImageDecoder.Factory();
    }

    @Override // androidx.media3.decoder.Decoder
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    void queueInputBuffer(DecoderInputBuffer decoderInputBuffer);

    @Override // androidx.media3.decoder.Decoder
    ImageOutputBuffer dequeueOutputBuffer();
}
