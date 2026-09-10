package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.apical;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: ImageReader.java */
/* JADX INFO: loaded from: classes2.dex */
public interface saneness {

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ImageReader.java */
    public static final class C0179saneness implements saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final apical f17854attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final List<ImageHeaderParser> f17855dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final trawler.saneness f17856saneness;

        public C0179saneness(InputStream inputStream, List<ImageHeaderParser> list, trawler.saneness sanenessVar) {
            this.f17856saneness = (trawler.saneness) com.bumptech.glide.util.apical.wireman(sanenessVar);
            this.f17855dern = (List) com.bumptech.glide.util.apical.wireman(list);
            this.f17854attabal = new apical(inputStream, sanenessVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.saneness
        public Bitmap attabal(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f17854attabal.attabal(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.saneness
        public int dern() throws IOException {
            return com.bumptech.glide.load.attabal.saneness(this.f17855dern, this.f17854attabal.attabal(), this.f17856saneness);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.saneness
        public void saneness() {
            this.f17854attabal.dern();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.saneness
        public ImageHeaderParser.ImageType wireman() throws IOException {
            return com.bumptech.glide.load.attabal.beachfront(this.f17855dern, this.f17854attabal.attabal(), this.f17856saneness);
        }
    }

    Bitmap attabal(BitmapFactory.Options options) throws IOException;

    int dern() throws IOException;

    void saneness();

    ImageHeaderParser.ImageType wireman() throws IOException;

    /* JADX INFO: compiled from: ImageReader.java */
    public static final class attabal implements saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ByteBuffer f17848attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final trawler.saneness f17849dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final List<ImageHeaderParser> f17850saneness;

        public attabal(ByteBuffer byteBuffer, List<ImageHeaderParser> list, trawler.saneness sanenessVar) {
            this.f17848attabal = byteBuffer;
            this.f17850saneness = list;
            this.f17849dern = sanenessVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.saneness
        public Bitmap attabal(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(marial(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.saneness
        public int dern() throws IOException {
            return com.bumptech.glide.load.attabal.dern(this.f17850saneness, com.bumptech.glide.util.attabal.wireman(this.f17848attabal), this.f17849dern);
        }

        public final InputStream marial() {
            return com.bumptech.glide.util.attabal.competently(com.bumptech.glide.util.attabal.wireman(this.f17848attabal));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.saneness
        public ImageHeaderParser.ImageType wireman() throws IOException {
            return com.bumptech.glide.load.attabal.competently(this.f17850saneness, com.bumptech.glide.util.attabal.wireman(this.f17848attabal));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.saneness
        public void saneness() {
        }
    }

    /* JADX INFO: compiled from: ImageReader.java */
    public static final class dern implements saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final trawler.saneness f17851attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f17852dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final List<ImageHeaderParser> f17853saneness;

        public dern(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, trawler.saneness sanenessVar) {
            this.f17851attabal = (trawler.saneness) com.bumptech.glide.util.apical.wireman(sanenessVar);
            this.f17853saneness = (List) com.bumptech.glide.util.apical.wireman(list);
            this.f17852dern = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.saneness
        public Bitmap attabal(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f17852dern.attabal().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.saneness
        public int dern() throws IOException {
            return com.bumptech.glide.load.attabal.attabal(this.f17853saneness, this.f17852dern, this.f17851attabal);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.saneness
        public ImageHeaderParser.ImageType wireman() throws IOException {
            return com.bumptech.glide.load.attabal.marial(this.f17853saneness, this.f17852dern, this.f17851attabal);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.saneness
        public void saneness() {
        }
    }
}
