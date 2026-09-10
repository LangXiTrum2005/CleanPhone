package com.bumptech.glide.load;

import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ImageHeaderParserUtils {

    public interface OrientationReader {
        int a(ImageHeaderParser imageHeaderParser);
    }

    public interface TypeReader {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(final LruArrayPool lruArrayPool, final ByteBuffer byteBuffer, ArrayList arrayList) {
        if (byteBuffer == null) {
            return -1;
        }
        return d(arrayList, new OrientationReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.4
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.OrientationReader
            public final int a(ImageHeaderParser imageHeaderParser) {
                ByteBuffer byteBuffer2 = byteBuffer;
                try {
                    return imageHeaderParser.c(byteBuffer2, lruArrayPool);
                } finally {
                    ByteBufferUtil.c(byteBuffer2);
                }
            }
        });
    }

    public static int b(ArrayList arrayList, final ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, final LruArrayPool lruArrayPool) {
        return d(arrayList, new OrientationReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.6
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.OrientationReader
            public final int a(ImageHeaderParser imageHeaderParser) throws Throwable {
                LruArrayPool lruArrayPool2 = lruArrayPool;
                ParcelFileDescriptorRewinder parcelFileDescriptorRewinder2 = parcelFileDescriptorRewinder;
                RecyclableBufferedInputStream recyclableBufferedInputStream = null;
                try {
                    RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder2.c().getFileDescriptor()), lruArrayPool2);
                    try {
                        int iA = imageHeaderParser.a(recyclableBufferedInputStream2, lruArrayPool2);
                        recyclableBufferedInputStream2.release();
                        parcelFileDescriptorRewinder2.c();
                        return iA;
                    } catch (Throwable th) {
                        th = th;
                        recyclableBufferedInputStream = recyclableBufferedInputStream2;
                        if (recyclableBufferedInputStream != null) {
                            recyclableBufferedInputStream.release();
                        }
                        parcelFileDescriptorRewinder2.c();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        });
    }

    public static int c(ArrayList arrayList, final InputStream inputStream, final LruArrayPool lruArrayPool) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, lruArrayPool);
        }
        inputStream.mark(5242880);
        return d(arrayList, new OrientationReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.5
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.OrientationReader
            public final int a(ImageHeaderParser imageHeaderParser) throws IOException {
                InputStream inputStream2 = inputStream;
                try {
                    return imageHeaderParser.a(inputStream2, lruArrayPool);
                } finally {
                    inputStream2.reset();
                }
            }
        });
    }

    public static int d(ArrayList arrayList, OrientationReader orientationReader) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iA = orientationReader.a((ImageHeaderParser) arrayList.get(i2));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType e(ArrayList arrayList, final ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, final LruArrayPool lruArrayPool) {
        return h(arrayList, new TypeReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.3
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader
            public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
                ParcelFileDescriptorRewinder parcelFileDescriptorRewinder2 = parcelFileDescriptorRewinder;
                RecyclableBufferedInputStream recyclableBufferedInputStream = null;
                try {
                    RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder2.c().getFileDescriptor()), lruArrayPool);
                    try {
                        ImageHeaderParser.ImageType imageTypeD = imageHeaderParser.d(recyclableBufferedInputStream2);
                        recyclableBufferedInputStream2.release();
                        parcelFileDescriptorRewinder2.c();
                        return imageTypeD;
                    } catch (Throwable th) {
                        th = th;
                        recyclableBufferedInputStream = recyclableBufferedInputStream2;
                        if (recyclableBufferedInputStream != null) {
                            recyclableBufferedInputStream.release();
                        }
                        parcelFileDescriptorRewinder2.c();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        });
    }

    public static ImageHeaderParser.ImageType f(ArrayList arrayList, final InputStream inputStream, LruArrayPool lruArrayPool) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, lruArrayPool);
        }
        inputStream.mark(5242880);
        return h(arrayList, new TypeReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.1
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader
            public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
                InputStream inputStream2 = inputStream;
                try {
                    return imageHeaderParser.d(inputStream2);
                } finally {
                    inputStream2.reset();
                }
            }
        });
    }

    public static ImageHeaderParser.ImageType g(ArrayList arrayList, final ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(arrayList, new TypeReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.2
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader
            public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
                ByteBuffer byteBuffer2 = byteBuffer;
                try {
                    return imageHeaderParser.b(byteBuffer2);
                } finally {
                    ByteBufferUtil.c(byteBuffer2);
                }
            }
        });
    }

    public static ImageHeaderParser.ImageType h(ArrayList arrayList, TypeReader typeReader) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ImageHeaderParser.ImageType imageTypeA = typeReader.a((ImageHeaderParser) arrayList.get(i2));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
