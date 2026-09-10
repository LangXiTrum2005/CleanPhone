package androidx.media3.extractor.jpeg;

import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
public final class JpegExtractor implements Extractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Extractor f6896a;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public JpegExtractor(int i2) {
        if ((i2 & 1) != 0) {
            this.f6896a = new SingleSampleExtractor(65496, 2, "image/jpeg");
        } else {
            this.f6896a = new JpegMotionPhotoExtractor();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) {
        return this.f6896a.c(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f6896a.d(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) {
        return this.f6896a.f(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
        this.f6896a.release();
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.f6896a.seek(j, j2);
    }
}
