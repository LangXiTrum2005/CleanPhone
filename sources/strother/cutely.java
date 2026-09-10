package strother;

import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SimpleSubtitleDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class cutely extends miliaria.beachfront<kowloon, arytenoidectomy, SubtitleDecoderException> implements formularize {
    private final String name;

    /* JADX INFO: compiled from: SimpleSubtitleDecoder.java */
    public class attabal extends arytenoidectomy {
        public attabal() {
        }

        @Override // miliaria.marial
        public void triweekly() {
            cutely.this.arytenoidectomy(this);
        }
    }

    public cutely(String str) {
        super(new kowloon[2], new arytenoidectomy[2]);
        this.name = str;
        molybdenite(1024);
    }

    @Override // miliaria.beachfront
    /* JADX INFO: renamed from: adultoid, reason: merged with bridge method [inline-methods] */
    public final kowloon marial() {
        return new kowloon();
    }

    @Override // miliaria.beachfront
    /* JADX INFO: renamed from: dovishness, reason: merged with bridge method [inline-methods] */
    public final arytenoidectomy beachfront() {
        return new attabal();
    }

    @Override // miliaria.beachfront
    /* JADX INFO: renamed from: gintrap, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException competently(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    public abstract apical preprohormone(byte[] bArr, int i, boolean z) throws SubtitleDecoderException;

    @Override // miliaria.beachfront
    /* JADX INFO: renamed from: rotuma, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException impromptu(kowloon kowloonVar, arytenoidectomy arytenoidectomyVar, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) decarock.attabal.marial(kowloonVar.f11483polloi);
            arytenoidectomyVar.kowloon(kowloonVar.f11480graveside, preprohormone(byteBuffer.array(), byteBuffer.limit(), z), kowloonVar.f38193rotuma);
            arytenoidectomyVar.f33456polloi = false;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    @Override // strother.formularize
    public void setPositionUs(long j) {
    }
}
