package dumb;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: AnimatedImageDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<ImageHeaderParser> f25378attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final trawler.saneness f25379saneness;

    /* JADX INFO: compiled from: AnimatedImageDecoder.java */
    public static final class attabal implements endosteum.cutely<Drawable> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final AnimatedImageDrawable f25380kowloon;

        public attabal(AnimatedImageDrawable animatedImageDrawable) {
            this.f25380kowloon = animatedImageDrawable;
        }

        @Override // endosteum.cutely
        public void attabal() {
            this.f25380kowloon.stop();
            this.f25380kowloon.clearAnimationCallbacks();
        }

        @Override // endosteum.cutely
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f25380kowloon;
        }

        @Override // endosteum.cutely
        public int getSize() {
            return this.f25380kowloon.getIntrinsicWidth() * this.f25380kowloon.getIntrinsicHeight() * com.bumptech.glide.util.formularize.cutely(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // endosteum.cutely
        public Class<Drawable> saneness() {
            return Drawable.class;
        }
    }

    /* JADX INFO: compiled from: AnimatedImageDecoder.java */
    public static final class dern implements maggot.marial<InputStream, Drawable> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final impromptu f25381attabal;

        public dern(impromptu impromptuVar) {
            this.f25381attabal = impromptuVar;
        }

        @Override // maggot.marial
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public endosteum.cutely<Drawable> attabal(InputStream inputStream, int i, int i2, maggot.wireman wiremanVar) throws IOException {
            return this.f25381attabal.saneness(ImageDecoder.createSource(com.bumptech.glide.util.attabal.saneness(inputStream)), i, i2, wiremanVar);
        }

        @Override // maggot.marial
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public boolean saneness(InputStream inputStream, maggot.wireman wiremanVar) throws IOException {
            return this.f25381attabal.dern(inputStream);
        }
    }

    /* JADX INFO: compiled from: AnimatedImageDecoder.java */
    public static final class saneness implements maggot.marial<ByteBuffer, Drawable> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final impromptu f25382attabal;

        public saneness(impromptu impromptuVar) {
            this.f25382attabal = impromptuVar;
        }

        @Override // maggot.marial
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public endosteum.cutely<Drawable> attabal(ByteBuffer byteBuffer, int i, int i2, maggot.wireman wiremanVar) throws IOException {
            return this.f25382attabal.saneness(ImageDecoder.createSource(byteBuffer), i, i2, wiremanVar);
        }

        @Override // maggot.marial
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public boolean saneness(ByteBuffer byteBuffer, maggot.wireman wiremanVar) throws IOException {
            return this.f25382attabal.wireman(byteBuffer);
        }
    }

    public impromptu(List<ImageHeaderParser> list, trawler.saneness sanenessVar) {
        this.f25378attabal = list;
        this.f25379saneness = sanenessVar;
    }

    public static maggot.marial<ByteBuffer, Drawable> attabal(List<ImageHeaderParser> list, trawler.saneness sanenessVar) {
        return new saneness(new impromptu(list, sanenessVar));
    }

    public static maggot.marial<InputStream, Drawable> beachfront(List<ImageHeaderParser> list, trawler.saneness sanenessVar) {
        return new dern(new impromptu(list, sanenessVar));
    }

    public boolean dern(InputStream inputStream) throws IOException {
        return marial(com.bumptech.glide.load.attabal.beachfront(this.f25378attabal, inputStream, this.f25379saneness));
    }

    public final boolean marial(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }

    public endosteum.cutely<Drawable> saneness(ImageDecoder.Source source, int i, int i2, maggot.wireman wiremanVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new speck.formularize(i, i2, wiremanVar));
        if (dumb.saneness.attabal(drawableDecodeDrawable)) {
            return new attabal(dumb.dern.attabal(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    public boolean wireman(ByteBuffer byteBuffer) throws IOException {
        return marial(com.bumptech.glide.load.attabal.competently(this.f25378attabal, byteBuffer));
    }
}
