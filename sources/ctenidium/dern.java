package ctenidium;

import androidx.media3.common.polloi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.image.ImageDecoderException;

/* JADX INFO: compiled from: ImageDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public interface dern extends miliaria.wireman<DecoderInputBuffer, marial, ImageDecoderException> {

    /* JADX INFO: compiled from: ImageDecoder.java */
    public interface attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f24240attabal = new ctenidium.attabal.dern();

        int attabal(polloi polloiVar);

        dern saneness();
    }

    @Override // 
    marial dequeueOutputBuffer() throws ImageDecoderException;

    void saneness(DecoderInputBuffer decoderInputBuffer) throws ImageDecoderException;
}
