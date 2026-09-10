package com.bumptech.glide.load;

import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: ImageHeaderParserUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal {

    /* JADX INFO: renamed from: com.bumptech.glide.load.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public class C0174attabal implements impromptu {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ InputStream f17577attabal;

        public C0174attabal(InputStream inputStream) {
            this.f17577attabal = inputStream;
        }

        @Override // com.bumptech.glide.load.attabal.impromptu
        public ImageHeaderParser.ImageType attabal(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.dern(this.f17577attabal);
            } finally {
                this.f17577attabal.reset();
            }
        }
    }

    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public class beachfront implements competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptorRewinder f17578attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ trawler.saneness f17579saneness;

        public beachfront(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, trawler.saneness sanenessVar) {
            this.f17578attabal = parcelFileDescriptorRewinder;
            this.f17579saneness = sanenessVar;
        }

        @Override // com.bumptech.glide.load.attabal.competently
        public int attabal(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f17578attabal.attabal().getFileDescriptor()), this.f17579saneness);
                try {
                    int iAttabal = imageHeaderParser.attabal(recyclableBufferedInputStream2, this.f17579saneness);
                    recyclableBufferedInputStream2.release();
                    this.f17578attabal.attabal();
                    return iAttabal;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.release();
                    }
                    this.f17578attabal.attabal();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public interface competently {
        int attabal(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public class dern implements impromptu {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptorRewinder f17580attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ trawler.saneness f17581saneness;

        public dern(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, trawler.saneness sanenessVar) {
            this.f17580attabal = parcelFileDescriptorRewinder;
            this.f17581saneness = sanenessVar;
        }

        @Override // com.bumptech.glide.load.attabal.impromptu
        public ImageHeaderParser.ImageType attabal(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f17580attabal.attabal().getFileDescriptor()), this.f17581saneness);
                try {
                    ImageHeaderParser.ImageType imageTypeDern = imageHeaderParser.dern(recyclableBufferedInputStream2);
                    recyclableBufferedInputStream2.release();
                    this.f17580attabal.attabal();
                    return imageTypeDern;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.release();
                    }
                    this.f17580attabal.attabal();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public interface impromptu {
        ImageHeaderParser.ImageType attabal(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public class marial implements competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ InputStream f17582attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ trawler.saneness f17583saneness;

        public marial(InputStream inputStream, trawler.saneness sanenessVar) {
            this.f17582attabal = inputStream;
            this.f17583saneness = sanenessVar;
        }

        @Override // com.bumptech.glide.load.attabal.competently
        public int attabal(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.attabal(this.f17582attabal, this.f17583saneness);
            } finally {
                this.f17582attabal.reset();
            }
        }
    }

    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public class saneness implements impromptu {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f17584attabal;

        public saneness(ByteBuffer byteBuffer) {
            this.f17584attabal = byteBuffer;
        }

        @Override // com.bumptech.glide.load.attabal.impromptu
        public ImageHeaderParser.ImageType attabal(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.saneness(this.f17584attabal);
            } finally {
                com.bumptech.glide.util.attabal.wireman(this.f17584attabal);
            }
        }
    }

    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public class wireman implements competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f17585attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ trawler.saneness f17586saneness;

        public wireman(ByteBuffer byteBuffer, trawler.saneness sanenessVar) {
            this.f17585attabal = byteBuffer;
            this.f17586saneness = sanenessVar;
        }

        @Override // com.bumptech.glide.load.attabal.competently
        public int attabal(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.wireman(this.f17585attabal, this.f17586saneness);
            } finally {
                com.bumptech.glide.util.attabal.wireman(this.f17585attabal);
            }
        }
    }

    public static int attabal(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, trawler.saneness sanenessVar) throws IOException {
        return wireman(list, new beachfront(parcelFileDescriptorRewinder, sanenessVar));
    }

    public static ImageHeaderParser.ImageType beachfront(List<ImageHeaderParser> list, InputStream inputStream, trawler.saneness sanenessVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, sanenessVar);
        }
        inputStream.mark(5242880);
        return impromptu(list, new C0174attabal(inputStream));
    }

    public static ImageHeaderParser.ImageType competently(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : impromptu(list, new saneness(byteBuffer));
    }

    public static int dern(List<ImageHeaderParser> list, ByteBuffer byteBuffer, trawler.saneness sanenessVar) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return wireman(list, new wireman(byteBuffer, sanenessVar));
    }

    public static ImageHeaderParser.ImageType impromptu(List<ImageHeaderParser> list, impromptu impromptuVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType imageTypeAttabal = impromptuVar.attabal(list.get(i));
            if (imageTypeAttabal != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeAttabal;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static ImageHeaderParser.ImageType marial(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, trawler.saneness sanenessVar) throws IOException {
        return impromptu(list, new dern(parcelFileDescriptorRewinder, sanenessVar));
    }

    public static int saneness(List<ImageHeaderParser> list, InputStream inputStream, trawler.saneness sanenessVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, sanenessVar);
        }
        inputStream.mark(5242880);
        return wireman(list, new marial(inputStream, sanenessVar));
    }

    public static int wireman(List<ImageHeaderParser> list, competently competentlyVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iAttabal = competentlyVar.attabal(list.get(i));
            if (iAttabal != -1) {
                return iAttabal;
            }
        }
        return -1;
    }
}
