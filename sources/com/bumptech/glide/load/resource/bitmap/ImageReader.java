package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.data.InputStreamRewinder;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.util.ByteBufferUtil;
import com.bumptech.glide.util.MarkEnforcingInputStream;
import com.bumptech.glide.util.Preconditions;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
interface ImageReader {

    public static final class ByteArrayReader implements ImageReader {
        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final Bitmap a(BitmapFactory.Options options) {
            throw null;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final int c() {
            return ImageHeaderParserUtils.a(null, ByteBuffer.wrap(null), null);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final ImageHeaderParser.ImageType d() {
            return ImageHeaderParserUtils.g(null, ByteBuffer.wrap(null));
        }
    }

    public static final class ByteBufferReader implements ImageReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f12672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f12673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LruArrayPool f12674c;

        public ByteBufferReader(LruArrayPool lruArrayPool, ByteBuffer byteBuffer, ArrayList arrayList) {
            this.f12672a = byteBuffer;
            this.f12673b = arrayList;
            this.f12674c = lruArrayPool;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(ByteBufferUtil.f(ByteBufferUtil.c(this.f12672a)), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final int c() {
            return ImageHeaderParserUtils.a(this.f12674c, ByteBufferUtil.c(this.f12672a), this.f12673b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final ImageHeaderParser.ImageType d() {
            return ImageHeaderParserUtils.g(this.f12673b, ByteBufferUtil.c(this.f12672a));
        }
    }

    public static final class FileReader implements ImageReader {
        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final Bitmap a(BitmapFactory.Options options) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream((File) null), null);
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(recyclableBufferedInputStream2, null, options);
                    try {
                        recyclableBufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return bitmapDecodeStream;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final int c() throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            Throwable th;
            try {
                recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream((File) null), null);
                try {
                    int iC = ImageHeaderParserUtils.c(null, recyclableBufferedInputStream, null);
                    try {
                        recyclableBufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    return iC;
                } catch (Throwable th2) {
                    th = th2;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                recyclableBufferedInputStream = null;
                th = th3;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final ImageHeaderParser.ImageType d() throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            Throwable th;
            try {
                recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream((File) null), null);
                try {
                    ImageHeaderParser.ImageType imageTypeF = ImageHeaderParserUtils.f(null, recyclableBufferedInputStream, null);
                    try {
                        recyclableBufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    return imageTypeF;
                } catch (Throwable th2) {
                    th = th2;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                recyclableBufferedInputStream = null;
                th = th3;
            }
        }
    }

    public static final class InputStreamImageReader implements ImageReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStreamRewinder f12675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LruArrayPool f12676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f12677c;

        public InputStreamImageReader(MarkEnforcingInputStream markEnforcingInputStream, ArrayList arrayList, LruArrayPool lruArrayPool) {
            Preconditions.c(lruArrayPool, "Argument must not be null");
            this.f12676b = lruArrayPool;
            Preconditions.c(arrayList, "Argument must not be null");
            this.f12677c = arrayList;
            this.f12675a = new InputStreamRewinder(markEnforcingInputStream, lruArrayPool);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final Bitmap a(BitmapFactory.Options options) {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f12675a.f12378a;
            recyclableBufferedInputStream.reset();
            return BitmapFactory.decodeStream(recyclableBufferedInputStream, null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final void b() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f12675a.f12378a;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.Z = recyclableBufferedInputStream.X.length;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final int c() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f12675a.f12378a;
            recyclableBufferedInputStream.reset();
            return ImageHeaderParserUtils.c(this.f12677c, recyclableBufferedInputStream, this.f12676b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final ImageHeaderParser.ImageType d() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f12675a.f12378a;
            recyclableBufferedInputStream.reset();
            return ImageHeaderParserUtils.f(this.f12677c, recyclableBufferedInputStream, this.f12676b);
        }
    }

    public static final class ParcelFileDescriptorImageReader implements ImageReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LruArrayPool f12678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f12679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f12680c;

        public ParcelFileDescriptorImageReader(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, LruArrayPool lruArrayPool) {
            Preconditions.c(lruArrayPool, "Argument must not be null");
            this.f12678a = lruArrayPool;
            Preconditions.c(arrayList, "Argument must not be null");
            this.f12679b = arrayList;
            this.f12680c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f12680c.c().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final int c() {
            return ImageHeaderParserUtils.b(this.f12679b, this.f12680c, this.f12678a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final ImageHeaderParser.ImageType d() {
            return ImageHeaderParserUtils.e(this.f12679b, this.f12680c, this.f12678a);
        }
    }

    Bitmap a(BitmapFactory.Options options);

    void b();

    int c();

    ImageHeaderParser.ImageType d();
}
