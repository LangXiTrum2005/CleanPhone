package ctenidium;

import android.graphics.Bitmap;
import androidx.media3.common.ParserException;
import androidx.media3.common.polloi;
import androidx.media3.common.rotuma;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.lampshade;
import decarock.grimness;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: BitmapFactoryImageDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal extends miliaria.beachfront<DecoderInputBuffer, marial, ImageDecoderException> implements ctenidium.dern {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final saneness f24212kowloon;

    /* JADX INFO: renamed from: ctenidium.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BitmapFactoryImageDecoder.java */
    public class C0576attabal extends marial {
        public C0576attabal() {
        }

        @Override // miliaria.marial
        public void triweekly() {
            attabal.this.arytenoidectomy(this);
        }
    }

    /* JADX INFO: compiled from: BitmapFactoryImageDecoder.java */
    public static final class dern implements ctenidium.dern.attabal {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final saneness f24214saneness = new saneness() { // from class: ctenidium.saneness
            @Override // ctenidium.attabal.saneness
            public final Bitmap attabal(byte[] bArr, int i) {
                return attabal.rotuma(bArr, i);
            }
        };

        @Override // ctenidium.dern.attabal
        public int attabal(polloi polloiVar) {
            String str = polloiVar.f11218triweekly;
            if (str == null || !rotuma.taiyuan(str)) {
                return lampshade.formularize(0);
            }
            return grimness.picketboat(polloiVar.f11218triweekly) ? lampshade.formularize(4) : lampshade.formularize(1);
        }

        @Override // ctenidium.dern.attabal
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public attabal saneness() {
            return new attabal(this.f24214saneness, null);
        }
    }

    /* JADX INFO: compiled from: BitmapFactoryImageDecoder.java */
    public interface saneness {
        Bitmap attabal(byte[] bArr, int i) throws ImageDecoderException;
    }

    public /* synthetic */ attabal(saneness sanenessVar, C0576attabal c0576attabal) {
        this(sanenessVar);
    }

    public static Bitmap rotuma(byte[] bArr, int i) throws ImageDecoderException {
        try {
            return vir.saneness.attabal(bArr, i, null);
        } catch (ParserException e) {
            throw new ImageDecoderException("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i + ")", e);
        } catch (IOException e2) {
            throw new ImageDecoderException(e2);
        }
    }

    @Override // miliaria.beachfront, miliaria.wireman, ctenidium.dern
    public /* bridge */ /* synthetic */ marial dequeueOutputBuffer() throws ImageDecoderException {
        return (marial) super.dequeueOutputBuffer();
    }

    @Override // miliaria.beachfront
    /* JADX INFO: renamed from: dovishness, reason: merged with bridge method [inline-methods] */
    public marial beachfront() {
        return new C0576attabal();
    }

    @Override // miliaria.beachfront
    /* JADX INFO: renamed from: gintrap, reason: merged with bridge method [inline-methods] */
    public ImageDecoderException competently(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    @Override // miliaria.beachfront
    public DecoderInputBuffer marial() {
        return new DecoderInputBuffer(1);
    }

    @Override // miliaria.beachfront
    /* JADX INFO: renamed from: preprohormone, reason: merged with bridge method [inline-methods] */
    public ImageDecoderException impromptu(DecoderInputBuffer decoderInputBuffer, marial marialVar, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) decarock.attabal.marial(decoderInputBuffer.f11483polloi);
            decarock.attabal.competently(byteBuffer.hasArray());
            decarock.attabal.attabal(byteBuffer.arrayOffset() == 0);
            marialVar.f24241molybdenite = this.f24212kowloon.attabal(byteBuffer.array(), byteBuffer.remaining());
            marialVar.f33454arytenoidectomy = decoderInputBuffer.f11480graveside;
            return null;
        } catch (ImageDecoderException e) {
            return e;
        }
    }

    public attabal(saneness sanenessVar) {
        super(new DecoderInputBuffer[1], new marial[1]);
        this.f24212kowloon = sanenessVar;
    }
}
